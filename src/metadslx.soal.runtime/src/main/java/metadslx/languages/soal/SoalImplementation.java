package metadslx.languages.soal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import metadslx.core.ModelObject;

public class SoalImplementation extends SoalImplementationBase {
	@Override
    public String Namespace_FullName(Namespace _this)
    {
        if (_this.getNamespace() == null) return _this.getName();
        else return _this.getNamespace().getFullName() + "." + _this.getName();
    }

	@Override
    public void Operation(Operation _this)
    {
        super.Operation(_this);
        ((ModelObject)_this).mSet(SoalDescriptor.Operation.ResultProperty, SoalFactory.instance().createOutputParameter());
        //_this.Result = SoalFactory.instance().CreateOutputParameter();
    }

	@Override
    public String Port_Name(Port _this)
    {
        if (((ModelObject)_this).mIsValueCreated(SoalDescriptor.Port.InterfaceProperty))
        {
            if (_this.getOptionalName() != null)
            {
                return _this.getOptionalName();
            }
            else
            {
                if (_this.getInterface() != null) return _this.getInterface().getName();
                else return "";
            }
        }
        else
        {
            return _this.getOptionalName() != null ? _this.getOptionalName() : "";
        }
    }

	@Override
    public Annotation AnnotatedElement_addAnnotation(AnnotatedElement _this, String name)
    {
        Annotation result = _this.getAnnotation(name);
        if (result == null)
        {
            result = SoalFactory.instance().createAnnotation();
            result.setName(name);
            _this.getAnnotations().add(result);
        }
        return result;
    }

	@Override
    public List<Annotation> AnnotatedElement_getAnnotations(AnnotatedElement _this, String name)
    {
        ArrayList<Annotation> result = new ArrayList<>();
        if (_this == null) return result;
        for (Annotation annot: _this.getAnnotations())
        {
            if (name.equals(annot.getName()))
            {
                result.add(annot);
            }
        }
        return result;
    }

	@Override
    public Annotation AnnotatedElement_getAnnotation(AnnotatedElement _this, String name)
    {
        Optional<Annotation> annotOpt = _this.getAnnotations(name).stream().findFirst();
        if (annotOpt.isPresent()) return annotOpt.get();
        else return null;
    }

	@Override
    public boolean AnnotatedElement_hasAnnotation(AnnotatedElement _this, String name)
    {
        return _this.getAnnotation(name) != null;
    }

	@Override
    public boolean AnnotatedElement_hasAnnotationProperty(AnnotatedElement _this, String annotationName, String propertyName)
    {
        if (_this == null) return false;
        Annotation annot = _this.getAnnotation(annotationName);
        if (annot != null)
        { 
            return annot.hasProperty(propertyName);
        }
        return false;
    }

	@Override
    public Object AnnotatedElement_getAnnotationPropertyValue(AnnotatedElement _this, String annotationName, String propertyName)
    {
        if (_this == null) return null;
        Annotation annot = _this.getAnnotation(annotationName);
        if (annot != null)
        {
            return annot.getPropertyValue(propertyName);
        }
        return null;
    }

	@Override
    public AnnotationProperty AnnotatedElement_setAnnotationPropertyValue(AnnotatedElement _this, String annotationName, String propertyName, Object propertyValue)
    {
        if (_this == null) return null;
        Annotation annot = _this.addAnnotation(annotationName);
        return annot.setPropertyValue(propertyName, propertyValue);
    }

	@Override
    public AnnotationProperty Annotation_getProperty(Annotation _this, String name)
    {
        if (_this == null) return null;
        for (AnnotationProperty prop: _this.getProperties())
        {
            if (name.equals(prop.getName())) return prop;
        }
        return null;
    }

	@Override
    public boolean Annotation_hasProperty(Annotation _this, String name)
    {
        return _this.getProperty(name) != null;
    }

	@Override
    public Object Annotation_getPropertyValue(Annotation _this, String name)
    {
        if (_this == null) return null;
        AnnotationProperty prop = _this.getProperty(name);
        if (prop != null)
        {
            return prop.getValue();
        }
        return null;
    }

	@Override
    public AnnotationProperty Annotation_setPropertyValue(Annotation _this, String name, Object value)
    {
        if (_this == null) return null;
        AnnotationProperty prop = _this.getProperty(name);
        if (prop == null)
        {
            prop = SoalFactory.instance().createAnnotationProperty();
            prop.setName(name);
            _this.getProperties().add(prop);
        }
        prop.setValue(value);
        return prop;
    }


}
