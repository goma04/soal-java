package metadslx.soal.runtime;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import metadslx.core.DiagnosticMessage;
import metadslx.languages.soal.SoalCompiler;
import metadslx.languages.soal.SoalGenerator;

public class Soal {

	public static void main(String[] args) {
        try
        {
            String fileName = null;
            String outputDirectory = null;
            boolean separateXsdWsdl = false;
            boolean singleFileWsdl = false;
            for (int i = 0; i < args.length; i++)
            {
                if (args[i].startsWith("-"))
                {
                    if (args[i] == "-separateXsdWsdl")
                    {
                        separateXsdWsdl = true;
                    }
                    else if (args[i] == "-singleFileWsdl")
                    {
                        singleFileWsdl = true;
                    }
                    else if (i + 1 < args.length)
                    {
                        if (args[i] == "-o")
                        {
                            outputDirectory = args[++i];
                        }
                        else 
                        {
                            System.out.println("Unknown option: '"+args[i]+"'");
                        }
                    }
                    else
                    {
                    	System.out.println("Unknown option: '" + args[i] + "'");
                    }
                }
                else
                {
                    fileName = args[i];
                }
            }
            if (fileName == null)
            {
                System.out.println("Usage:");
                System.out.println("  Soal.exe [options] [input.soal]");
                System.out.println("Options:");
                System.out.println("  -o [dir]: output directory");
                System.out.println("  -separateXsdWsdl: separate XSD and WSDL files into different directories");
                System.out.println("  -singleFileWsdl: include XSD code into the WSDL");
                return;
            }
            if (outputDirectory == null)
            {
                outputDirectory = new File(".").getAbsolutePath();
            }
            if (!new File(fileName).exists())
            {
                System.out.println("Could not find file: "+fileName);
                return;
            }
            if (singleFileWsdl && separateXsdWsdl)
            {
                System.out.println("Warning: conflicting options '-separateXsdWsdl' and '-singleFileWsdl'. '-singleFileWsdl' will be used.");
            }
            String source = readFile(fileName);
            SoalCompiler compiler = new SoalCompiler(source, new File(fileName).getName());
            compiler.compile();
            if (!compiler.getDiagnostics().hasErrors())
            {
                SoalGenerator generator = new SoalGenerator(compiler.getModel(), outputDirectory, compiler.getDiagnostics(), compiler.getFileName());
                generator.setSeparateXsdWsdl(separateXsdWsdl);
                generator.setSingleFileWsdl(singleFileWsdl);
                generator.generate();
                //SoalPrinter printer = new SoalPrinter(compiler.Model.Instances);
            }
            for (DiagnosticMessage msg: compiler.getDiagnostics().getMessages(true))
            {
                System.out.println(msg);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }

	}

	static String readFile(String path) throws IOException {
		return readFile(path, StandardCharsets.UTF_8);
	}

	static String readFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}

}
