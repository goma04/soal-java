package soal.generator.java

import soal.model.RootSoalModel

class EclipseProjectGenerator extends JavaGeneratorBase {
    new (RootSoalModel model, String name, JavaGeneratorConfiguration configuration) {
        super(model, name, configuration)
    }

    def generateParentProject(String projectName) {
        '''
        <?xml version="1.0" encoding="UTF-8"?>
        <projectDescription>
            <name>«projectName»</name>
            <comment></comment>
            <projects>
            </projects>
            <buildSpec>
                <buildCommand>
                    <name>org.eclipse.m2e.core.maven2Builder</name>
                    <arguments>
                    </arguments>
                </buildCommand>
            </buildSpec>
            <natures>
                <nature>org.eclipse.m2e.core.maven2Nature</nature>
            </natures>
        </projectDescription>
        '''
    }

    def generateProject(String projectName) {
        '''
        <?xml version="1.0" encoding="UTF-8"?>
        <projectDescription>
            <name>«projectName»</name>
            <comment></comment>
            <projects>
            </projects>
            <buildSpec>
                <buildCommand>
                    <name>org.eclipse.jdt.core.javabuilder</name>
                    <arguments>
                    </arguments>
                </buildCommand>
                <buildCommand>
                    <name>org.eclipse.m2e.core.maven2Builder</name>
                    <arguments>
                    </arguments>
                </buildCommand>
            </buildSpec>
            <natures>
                <nature>org.eclipse.jdt.core.javanature</nature>
                <nature>org.eclipse.m2e.core.maven2Nature</nature>
            </natures>
        </projectDescription>
        '''
    }

    def generateClassPath() {
        '''
        <?xml version="1.0" encoding="UTF-8"?>
        <classpath>
            <classpathentry kind="src" output="target/classes" path="src/main/java">
                <attributes>
                    <attribute name="optional" value="true"/>
                    <attribute name="maven.pomderived" value="true"/>
                </attributes>
            </classpathentry>
            <classpathentry excluding="**" kind="src" output="target/classes" path="src/main/resources">
                <attributes>
                    <attribute name="maven.pomderived" value="true"/>
                </attributes>
            </classpathentry>
            <classpathentry kind="src" output="target/test-classes" path="src/test/java">
                <attributes>
                    <attribute name="optional" value="true"/>
                    <attribute name="maven.pomderived" value="true"/>
                    <attribute name="test" value="true"/>
                </attributes>
            </classpathentry>
            <classpathentry excluding="**" kind="src" output="target/test-classes" path="src/test/resources">
                <attributes>
                    <attribute name="maven.pomderived" value="true"/>
                    <attribute name="test" value="true"/>
                </attributes>
            </classpathentry>
            <classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER">
                <attributes>
                    <attribute name="maven.pomderived" value="true"/>
                </attributes>
            </classpathentry>
            <classpathentry kind="con" path="org.eclipse.m2e.MAVEN2_CLASSPATH_CONTAINER">
                <attributes>
                    <attribute name="maven.pomderived" value="true"/>
                </attributes>
            </classpathentry>
            <classpathentry kind="output" path="target/classes"/>
        </classpath>
        '''
    }
}