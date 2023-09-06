package soal.generator.java

import soal.model.RootSoalModel

class MavenProjectGenerator extends JavaGeneratorBase {
    new (RootSoalModel model, String name, JavaGeneratorConfiguration configuration) {
    	super(model, name, configuration)
    }
	    
    def generateParentPomXml() {
    	'''
    	<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    	  <modelVersion>4.0.0</modelVersion>
    	  <groupId>«parentName»</groupId>
    	  <artifactId>«parentName»</artifactId>
    	  <version>0.0.1-SNAPSHOT</version>
    	  <packaging>pom</packaging>
    	  
    	  <properties>
    	    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    	    <maven.compiler.release>«configuration.javaVersion»</maven.compiler.release>
    	  </properties>
    	  
    	  <modules>
    	    <module>«parentName».main</module>
    	    <module>«parentName».common</module>
    	    <module>«parentName».service</module>
    	    <module>«parentName».client</module>
    	    <module>«parentName».rest.common</module>
    	    <module>«parentName».rest.service</module>
    	    <module>«parentName».rest.client</module>
    	  </modules>
    	</project>
    	'''	
    }
    
    def generateMainPomXml() {
    	'''
    	<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    	  <modelVersion>4.0.0</modelVersion>
    	  <parent>
    	    <groupId>«parentName»</groupId>
    	    <artifactId>«parentName»</artifactId>
    	    <version>0.0.1-SNAPSHOT</version>
    	  </parent>
    	  <artifactId>«parentName».main</artifactId>
    	
    	  <dependencies>
    	  	<dependency>
    	  		<groupId>«parentName»</groupId>
    	  		<artifactId>«parentName».client</artifactId>
    	  		<version>0.0.1-SNAPSHOT</version>
    	  	</dependency>
    	  </dependencies>  
    	</project>
    	'''
    }
    
    def generateCommonPomXml() {
    	'''
    	<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    	  <modelVersion>4.0.0</modelVersion>
    	  <parent>
    	    <groupId>«parentName»</groupId>
    	    <artifactId>«parentName»</artifactId>
    	    <version>0.0.1-SNAPSHOT</version>
    	  </parent>
    	  <artifactId>«parentName».common</artifactId>
    	</project>
    	'''
    }
    
    def generateServicePomXml() {
    	'''
    	<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    	  <modelVersion>4.0.0</modelVersion>
    	  <parent>
    	    <groupId>«parentName»</groupId>
    	    <artifactId>«parentName»</artifactId>
    	    <version>0.0.1-SNAPSHOT</version>
    	  </parent>
    	  <artifactId>«parentName».service</artifactId>
    	  
    	  <dependencies>
    	  	<dependency>
    	  		<groupId>«parentName»</groupId>
    	  		<artifactId>«parentName».common</artifactId>
    	  		<version>0.0.1-SNAPSHOT</version>
    	  	</dependency>
    	  </dependencies>
    	</project>
    	'''
    }
    
    def generateClientPomXml() {
    	'''
    	<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    	  <modelVersion>4.0.0</modelVersion>
    	  <parent>
    	    <groupId>«parentName»</groupId>
    	    <artifactId>«parentName»</artifactId>
    	    <version>0.0.1-SNAPSHOT</version>
    	  </parent>
    	  <artifactId>«parentName».client</artifactId>
    	  
    	  <dependencies>
    	  	<dependency>
    	  		<groupId>«parentName»</groupId>
    	  		<artifactId>«parentName».common</artifactId>
    	  		<version>0.0.1-SNAPSHOT</version>
    	  	</dependency>
    	  	<dependency>
    	  		<groupId>«parentName»</groupId>
    	  		<artifactId>«parentName».rest.client</artifactId>
    	  		<version>0.0.1-SNAPSHOT</version>
    	  	</dependency>
    	  </dependencies>
    	</project>
    	'''
    }
    
    def generateRestCommonPomXml() {
    	'''
    	<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    		<modelVersion>4.0.0</modelVersion>
    		<parent>
    			<groupId>«parentName»</groupId>
    			<artifactId>«parentName»</artifactId>
    			<version>0.0.1-SNAPSHOT</version>
    		</parent>
    		<artifactId>«parentName».rest.common</artifactId>
    	
    		<dependencies>
    			<dependency>
    				<groupId>«parentName»</groupId>
    				<artifactId>«parentName».common</artifactId>
    				<version>0.0.1-SNAPSHOT</version>
    			</dependency>
    			<dependency>
    				<groupId>org.springframework.boot</groupId>
    				<artifactId>spring-boot-starter-webflux</artifactId>
    			</dependency>
    		</dependencies>
    	
    		<dependencyManagement>
    			<dependencies>
    				<dependency>
    					<groupId>org.springframework.boot</groupId>
    					<artifactId>spring-boot-dependencies</artifactId>
    					<version>«configuration.springVersion»</version>
    					<type>pom</type>
    					<scope>import</scope>
    				</dependency>
    			</dependencies>
    		</dependencyManagement>
    	</project>
    	'''
    }
    
    def generateRestServicePomXml() {
    	'''
    	<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    		<modelVersion>4.0.0</modelVersion>
    		<parent>
    			<groupId>«parentName»</groupId>
    			<artifactId>«parentName»</artifactId>
    			<version>0.0.1-SNAPSHOT</version>
    		</parent>
    		<artifactId>«parentName».rest.service</artifactId>
    	
    		<dependencies>
    			<dependency>
    				<groupId>«parentName»</groupId>
    				<artifactId>«parentName».rest.common</artifactId>
    				<version>0.0.1-SNAPSHOT</version>
    			</dependency>
    			<dependency>
    				<groupId>«parentName»</groupId>
    				<artifactId>«parentName».service</artifactId>
    				<version>0.0.1-SNAPSHOT</version>
    			</dependency>
    			<dependency>
    				<groupId>org.springframework.boot</groupId>
    				<artifactId>spring-boot-starter-web</artifactId>
    			</dependency>
    		</dependencies>
    	
    		<dependencyManagement>
    			<dependencies>
    				<dependency>
    					<groupId>org.springframework.boot</groupId>
    					<artifactId>spring-boot-dependencies</artifactId>
    					<version>«configuration.springVersion»</version>
    					<type>pom</type>
    					<scope>import</scope>
    				</dependency>
    			</dependencies>
    		</dependencyManagement>
    	</project>
    	'''
    }
    
    def generateRestClientPomXml() {
    	'''
    	<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    		<modelVersion>4.0.0</modelVersion>
    		<parent>
    			<groupId>«parentName»</groupId>
    			<artifactId>«parentName»</artifactId>
    			<version>0.0.1-SNAPSHOT</version>
    		</parent>
    		<artifactId>«parentName».rest.client</artifactId>
    	
    		<dependencies>
    			<dependency>
    				<groupId>«parentName»</groupId>
    				<artifactId>«parentName».common</artifactId>
    				<version>0.0.1-SNAPSHOT</version>
    			</dependency>
    			<dependency>
    				<groupId>«parentName»</groupId>
    				<artifactId>«parentName».rest.common</artifactId>
    				<version>0.0.1-SNAPSHOT</version>
    			</dependency>
    			<dependency>
    				<groupId>org.springframework.boot</groupId>
    				<artifactId>spring-boot-starter-webflux</artifactId>
    			</dependency>		
    		</dependencies>
    	
    		<dependencyManagement>
    			<dependencies>
    				<dependency>
    					<groupId>org.springframework.boot</groupId>
    					<artifactId>spring-boot-dependencies</artifactId>
    					<version>«configuration.springVersion»</version>
    					<type>pom</type>
    					<scope>import</scope>
    				</dependency>
    			</dependencies>
    		</dependencyManagement>	
    	</project>
    	'''
    }
}