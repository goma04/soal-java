package soal.model.doc

import java.io.BufferedReader
import java.io.StringReader
import java.util.List
import java.util.regex.Pattern
import java.util.stream.Collectors
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.nodemodel.ILeafNode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import soal.model.Documentation
import soal.model.DocumentationTag
import soal.model.DocumentationTagKind
import soal.model.EnumLiteral
import soal.model.EnumType
import soal.model.Interface
import soal.model.NamedElement
import soal.model.Operation
import soal.model.Parameter
import soal.model.Property
import soal.model.Service
import soal.model.SoalModelFactory
import soal.model.StructType

class DocumentationReader {
    static final Pattern WhitespacePattern = Pattern.compile("^[ \t]*");
    static final Pattern IdentifierPattern = Pattern.compile("^@[a-zA-Z_][a-zA-Z0-9_]*");

    def static Documentation getDocumentation(NamedElement object) {
        if (object instanceof Parameter) {
            val param = object as Parameter
            return computeParameterDocumentation(param)
        } else {
            return computeDocumentation(object)
        }
    }

    def private static Documentation computeDocumentation(NamedElement object) {
        if (object === null) return null
        val comment = getDocumentationComment(object)
        val lines = getLines(comment)
        if (lines === null) return null
        val factory = SoalModelFactory.eINSTANCE
        val result = factory.createDocumentation
        var insideCode = false
        var currentTag = factory.createDocumentationTag
        result.tags.add(currentTag)
        currentTag.kind = DocumentationTagKind.SUMMARY
        for (rawLine: lines) {
            var line = rawLine
            if (line.startsWith("```")) insideCode = !insideCode
            if (!insideCode && line.startsWith("@")) {
                val matcher = IdentifierPattern.matcher(line)
                if (matcher.find()) {
                    val tagName = matcher.group
                    currentTag = factory.createDocumentationTag
                    result.tags.add(currentTag)
                    currentTag.name = tagName
                    switch (tagName) {
                        case "@version": currentTag.kind = DocumentationTagKind.VERSION
                        case "@alpha": currentTag.kind = DocumentationTagKind.ALPHA
                        case "@beta": currentTag.kind = DocumentationTagKind.BETA
                        case "@deprecated": currentTag.kind = DocumentationTagKind.DEPRECATED
                        case "@test": currentTag.kind = DocumentationTagKind.TEST
                        case "@internal": currentTag.kind = DocumentationTagKind.INTERNAL
                        case "@summary": currentTag.kind = DocumentationTagKind.SUMMARY
                        case "@defaultValue": currentTag.kind = DocumentationTagKind.DEFAULT_VALUE
                        case "@param": currentTag.kind = DocumentationTagKind.PARAM
                        case "@returns": currentTag.kind = DocumentationTagKind.RETURNS
                        case "@throws": currentTag.kind = DocumentationTagKind.THROWS
                        case "@label": currentTag.kind = DocumentationTagKind.LABEL
                        case "@example": currentTag.kind = DocumentationTagKind.EXAMPLE
                        case "@remarks": currentTag.kind = DocumentationTagKind.REMARKS
                        default: currentTag.kind = DocumentationTagKind.UNKNOWN
                    }
                    line = line.substring(line.indexOf(tagName) + tagName.length)
                }
            }
            currentTag.lines.add(line)
        }
        cleanupDocumentation(result)
        return result
    }

    def static private List<String> getLines(ILeafNode comment) {
        val result = newArrayList
        if (comment === null) return null
        val text = comment.text
        if (text === null) return null
        val pos = NodeModelUtils.getLineAndColumn(comment, comment.totalOffset)
        val startPos = pos.column
        val lines = new BufferedReader(new StringReader(text)).lines().collect(Collectors.toList)
        var allPrefixed1 = true
        var allPrefixed2 = true
        var lastLinePrefixed = true
        for (var i = 0; i < lines.size; i++) {
            val rawLine = lines.get(i)
            var line = rawLine
            if (line.endsWith("*/")) line = line.substring(0, line.length-2)
            if (i > 0) {
                if (line.length > startPos && WhitespacePattern.matcher(line.substring(0, startPos)).matches) {
                    line = line.substring(startPos)
                    if (!line.startsWith("*")) {
                        allPrefixed2 = false
                        allPrefixed1 = false
                    } else if (line != "*" && !line.startsWith("* ")) {
                        allPrefixed2 = false
                    }
                } else {
                    if (i == lines.size-1 && line.trim == "") {
                        lastLinePrefixed = false
                    } else {
                        allPrefixed2 = false
                        allPrefixed1 = false
                    }
                }
            }
        }
        for (var i = 0; i < lines.size; i++) {
            var line = lines.get(i)
            if (i == 0 && line.startsWith("/**")) line = line.substring(3)
            if (line.endsWith("*/")) line = line.substring(0, line.length-2)
            if (i > 0) {
                if (lastLinePrefixed || i < lines.size-1) {
                    if (allPrefixed2) {
                        if (line.length >= startPos+2) line = line.substring(startPos+2)
                        else line = ""
                    } else if (allPrefixed1) {
                        if (line.length >= startPos+1) line = line.substring(startPos+1)
                        else line = ""
                    }
                }
            }
            result.add(line)
        }
        return result
    }

    def static private cleanupDocumentation(Documentation doc) {
        for (tag: doc.tags) {
            while (tag.lines.size > 0) {
                if ("".equals(tag.lines.get(0))) tag.lines.remove(0)
                else if ("".equals(tag.lines.get(tag.lines.size-1))) tag.lines.remove(tag.lines.size-1)
                else return
            }
        }
    }

    def static private computeParameterDocumentation(Parameter param) {
        if (param === null) return null;
        val factory = SoalModelFactory.eINSTANCE
        val result = factory.createDocumentation
        var found = false
        var currentTag = factory.createDocumentationTag
        result.tags.add(currentTag)
        currentTag.kind = DocumentationTagKind.SUMMARY
        val op = EcoreUtil2.getContainerOfType(param, typeof(Operation))
        if (op !== null && op.documentation !== null) {
            var opDoc = op.documentation
            if (param.name === null) {
                val returnDoc = opDoc.tags.findFirst[it.kind == DocumentationTagKind.RETURNS]
                if (returnDoc !== null) {
                    found = true;
                    currentTag.lines.addAll(returnDoc.lines)
                }
            } else {
                for (tag: opDoc.tags) {
                    if (!found && (tag.kind == DocumentationTagKind.PARAM || tag.kind == DocumentationTagKind.RETURNS) && tag.lines.size > 0) {
                        val firstLine = tag.lines.get(0)
                        val dashIndex = firstLine.indexOf("-")
                        if (dashIndex >= 0) {
                            val paramName = firstLine.substring(0, dashIndex).trim
                            if (paramName.equals(param.name)) {
                                found = true
                                currentTag.lines.add(firstLine.substring(dashIndex+1, firstLine.length).trim)
                                for (var i = 1; i < tag.lines.size; i++) {
                                    currentTag.lines.add(tag.lines.get(i))
                                }
                            }
                        }
                    }
                }
            }
        }
        cleanupDocumentation(result)
        return found ? result : null
    }

    def static String getDocumentationCommentText(EObject object) {
        val comment = getDocumentationComment(object)
        if (comment === null) return null
        else return comment.text
    }

    def static ILeafNode getDocumentationComment(EObject object) {
        val node = NodeModelUtils.getNode(object);
        if (node === null) return null;
        for (leaf: node.leafNodes) {
            val text = leaf.text
            if (leaf.hidden && text.startsWith("/**")) {
                return leaf
            }
            if (!leaf.hidden) {
                return null;
            }
        }
        return null;
    }

    def static String getHtml(DocumentationTag tag) {
        val sb = new StringBuilder()
        for (line: tag.lines) {
            sb.append(line)
            sb.append("\r\n")
        }
        /*val parser = Parser.builder().build()
        val document = parser.parse(sb.toString)
        val renderer = HtmlRenderer.builder().build()
        return renderer.render(document)*/
        return sb.toString();
    }

    def static getUniqueName(NamedElement elem) {
        var prefix = ""
        if (elem instanceof Service) prefix = "__service_"
        if (elem instanceof Interface) prefix = "__interface_"
        if (elem instanceof Operation) prefix = "__operation_"
        if (elem instanceof Parameter) prefix = "__parameter_"
        if (elem instanceof StructType) prefix = "__struct_"
        if (elem instanceof Property) prefix = "__property_"
        if (elem instanceof EnumType) prefix = "__enum_"
        if (elem instanceof EnumLiteral) prefix = "__enumliteral_"
        return prefix + elem.uniqueNamePart
    }

    def private static String getUniqueNamePart(NamedElement elem) {
        if (elem === null) return null
        if (elem instanceof Operation) {
            val intf = EcoreUtil2.getContainerOfType(elem, typeof(Interface))
            return getUniqueNamePart(intf)+"_"+elem.name
        }
        if (elem instanceof Parameter) {
            val op = EcoreUtil2.getContainerOfType(elem, typeof(Operation))
            return getUniqueNamePart(op)+"_"+elem.name
        }
        if (elem instanceof Property) {
            val type = EcoreUtil2.getContainerOfType(elem, typeof(StructType))
            return getUniqueNamePart(type)+"_"+elem.name
        }
        if (elem instanceof EnumLiteral) {
            val type = EcoreUtil2.getContainerOfType(elem, typeof(EnumType))
            return getUniqueNamePart(type)+"_"+elem.name
        }
        return elem.name
    }
}
