package metadslx.languages.soal;

import metadslx.core.ModelObject;

public class SoalCompiler extends SoalCompilerBase {

	public SoalCompiler(String source, String fileName) {
		super(source, fileName);
		
        this.getGlobalScope().getBuiltInEntries().add((ModelObject)SoalInstance.Object);
        this.getGlobalScope().getBuiltInEntries().add((ModelObject)SoalInstance.String);
        this.getGlobalScope().getBuiltInEntries().add((ModelObject)SoalInstance.Int);
        this.getGlobalScope().getBuiltInEntries().add((ModelObject)SoalInstance.Long);
        this.getGlobalScope().getBuiltInEntries().add((ModelObject)SoalInstance.Float);
        this.getGlobalScope().getBuiltInEntries().add((ModelObject)SoalInstance.Double);
        this.getGlobalScope().getBuiltInEntries().add((ModelObject)SoalInstance.Byte);
        this.getGlobalScope().getBuiltInEntries().add((ModelObject)SoalInstance.Bool);
        this.getGlobalScope().getBuiltInEntries().add((ModelObject)SoalInstance.Void);
        this.getGlobalScope().getBuiltInEntries().add((ModelObject)SoalInstance.Date);
        this.getGlobalScope().getBuiltInEntries().add((ModelObject)SoalInstance.Time);
        this.getGlobalScope().getBuiltInEntries().add((ModelObject)SoalInstance.DateTime);
        this.getGlobalScope().getBuiltInEntries().add((ModelObject)SoalInstance.TimeSpan);
	}

}
