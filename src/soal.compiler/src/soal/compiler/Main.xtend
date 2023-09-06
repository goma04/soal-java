package soal.compiler

import java.io.File
import org.apache.log4j.Logger

class Main {
    static final Logger logger = Logger.getLogger(Main)

    def static void main(String[] args) {
        if (args.length < 1) {
            printUsage()
            return
        }
        var error = false
        val String target = args.get(0)
        var String inputDir = null
        var String outputDir = null
        for (var i = 1; i < args.length; i++) {
            if (args.get(i) == "-i") {
                if (inputDir !== null) {
                    error = true
                    logger.error("Only one input directory can be specified.")
                }
                i++
                if (i < args.length) {
                    inputDir = args.get(i)
                } else {
                    error = true
                    logger.error("Input directory is missing.")
                }
            } else if (args.get(i) == "-o") {
                if (outputDir !== null) {
                    error = true
                    logger.error("Only one output directory can be specified.")
                }
                i++
                if (i < args.length) {
                    outputDir = args.get(i)
                } else {
                    error = true
                    logger.error("Output directory is missing.")
                }
            } else {
                error = true
                logger.error("Unexpected argument: '"+args.get(i)+"'")
            }
        }
        if (error || target === null) {
            printUsage()
            return
        }
        if (inputDir === null) inputDir = "."
        if (outputDir === null) outputDir = "."
        logger.info("Input directory: "+new File(inputDir).canonicalPath)
        logger.info("Output directory: "+new File(outputDir).canonicalPath)
        val compiler = new SoalCompiler(inputDir, outputDir);
        if (target == "interface") {
            compiler.generateInterface()
        } else if (target == "implementation") {
            compiler.generateImplementation()
        } else if (target == "documentation") {
            compiler.generateDocumentation()
        } else {
            error = true
            logger.error("Unknown target '"+target+"'")
        }
        if (!error) {
            logger.info("DONE.")
        }
    }

    static def printUsage() {
        println("Usage:")
        println("  soalc <target> [-i <inputdir>] [-o <outputdir>]")
        println("")
        println("Where:")
        println("  target='interface' or 'implementation' or 'documentation'")
        return
    }
}