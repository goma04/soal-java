package metadslx.languages.soal;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import metadslx.core.MetaExtensions;
import metadslx.core.Model;
import metadslx.core.ModelCompilerDiagnostics;
import metadslx.core.ModelObject;

public class SoalGenerator {
	public static final Namespace XsdNamespace;

	static {
		XsdNamespace = SoalFactory.instance().createNamespace();
		XsdNamespace.setPrefix("xs");
		XsdNamespace.setUri("http://www.w3.org/2001/XMLSchema");
	}

	public SoalGenerator(Model model, String outputDirectory, ModelCompilerDiagnostics diagnostics, String fileName) {
		this.fileName = fileName;
		this.outputDirectory = outputDirectory;
		this.model = model;
		this.diagnostics = diagnostics;
		this.separateXsdWsdl = false;
		this.singleFileWsdl = false;
	}

	private String fileName;
	private String outputDirectory;
	private ModelCompilerDiagnostics diagnostics;
	private Model model;
	private boolean separateXsdWsdl;
	private boolean singleFileWsdl;

	public boolean isSeparateXsdWsdl() {
		return separateXsdWsdl;
	}

	public void setSeparateXsdWsdl(boolean separateXsdWsdl) {
		this.separateXsdWsdl = separateXsdWsdl;
	}

	public boolean isSingleFileWsdl() {
		return singleFileWsdl;
	}

	public void setSingleFileWsdl(boolean singleFileWsdl) {
		this.singleFileWsdl = singleFileWsdl;
	}

	public String getFileName() {
		return fileName;
	}

	public String getOutputDirectory() {
		return outputDirectory;
	}

	public ModelCompilerDiagnostics getDiagnostics() {
		return diagnostics;
	}

	public Model getModel() {
		return model;
	}

	private void prepareGeneration() {
		
	}

	
    public void generate()
    {
        this.prepareGeneration();
        if (this.diagnostics.hasErrors()) return;
        if (this.singleFileWsdl)
        {
            this.separateXsdWsdl = false;
        }
        String xsdDirectory = new File(this.outputDirectory, "xsd").getAbsolutePath();
        String wsdlDirectory = new File(this.outputDirectory, "wsdl").getAbsolutePath();
        if (this.separateXsdWsdl)
        {
        	new File(xsdDirectory).mkdir();
        }
        else
        {
            xsdDirectory = wsdlDirectory;
        }
    	new File(wsdlDirectory).mkdir();

        for (ModelObject mobj: this.model.cachedInstances())
        {
        	Namespace ns = MetaExtensions.typeAs(mobj, Namespace.class);
            if (ns != null && ns.getUri() != null)
            {
                if (!this.singleFileWsdl)
                {
                    String xsdFileName = new File(xsdDirectory, ns.getFullName() + ".xsd").getAbsolutePath();
                    try (PrintWriter writer = new PrintWriter(xsdFileName))
                    {
                        XsdGenerator xsdGen = new XsdGenerator(ns);
                        writer.println(xsdGen.generate(ns));
                    } catch (IOException e) {
						e.printStackTrace();
					}
                }
                String wsdlFileName = new File(wsdlDirectory, ns.getFullName() + ".wsdl").getAbsolutePath();
                try (PrintWriter writer = new PrintWriter(wsdlFileName))
                {
                    WsdlGenerator wsdlGen = new WsdlGenerator(ns);
                    wsdlGen.getProperties().setSingleFileWsdl(this.singleFileWsdl);
                    wsdlGen.getProperties().setSeparateXsdWsdl(this.separateXsdWsdl);
                    writer.println(wsdlGen.generate(ns));
                } catch (IOException e) {
					e.printStackTrace();
                }
            }
        }
    }

}
