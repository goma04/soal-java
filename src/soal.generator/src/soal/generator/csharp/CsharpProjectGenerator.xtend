package soal.generator.csharp


import soal.model.RootSoalModel
import java.util.UUID;

class CsharpProjectGenerator extends CsharpGeneratorBase {
	new (RootSoalModel model, String name, CsharpGeneratorConfiguration configuration) {
    	super(model, name, configuration)
    }
	
	def generateMainCsproj() {
		'''
    	<Project Sdk="Microsoft.NET.Sdk">
    	
    	  <PropertyGroup>
    	    <OutputType>Exe</OutputType>
    	    <TargetFramework>net«configuration.csharpVersion»</TargetFramework>
    	    <RootNamespace>SOAL_demo_client</RootNamespace>
    	    <ImplicitUsings>enable</ImplicitUsings>
    	    <Nullable>enable</Nullable>
    	  </PropertyGroup>
    	
    	  <ItemGroup>
    	    <ProjectReference Include="..\«parentName».Client\«parentName».client.csproj" />
    	  </ItemGroup>
    	
    	</Project>
    	'''
	}
	
	def generateSolution() {
		val restServiceUuid = UUID.randomUUID();
		val serviceUuid = UUID.randomUUID();
		val restClientUuid = UUID.randomUUID();
		val restCommonUuid = UUID.randomUUID();
		val clientUuid = UUID.randomUUID();
		val commonUuid = UUID.randomUUID();
		val mainUuid = UUID.randomUUID();
		'''
    	Microsoft Visual Studio Solution File, Format Version 12.00
    	# Visual Studio Version 17
    	VisualStudioVersion = 17.6.33815.320
    	MinimumVisualStudioVersion = 10.0.40219.1
    	
    	Project("{FAE04EC0-301F-11D3-BF4B-00C04F79EFBC}") = "«parentName».Client", "«parentName».Client\«parentName».Client.csproj", "{«clientUuid»}"
    	EndProject
    	
    	Project("{FAE04EC0-301F-11D3-BF4B-00C04F79EFBC}") = "«parentName»Rest.Service", "«parentName»Rest.Service\«parentName»Rest.Service.csproj", "{«restServiceUuid»}"
    	EndProject
    	
    	Project("{FAE04EC0-301F-11D3-BF4B-00C04F79EFBC}") = "«parentName».Service", "«parentName».Service\«parentName».Service.csproj", "{«serviceUuid»}"
    	EndProject
    	
    	Project("{FAE04EC0-301F-11D3-BF4B-00C04F79EFBC}") = "«parentName»Rest.Client", "«parentName»Rest.Client\«parentName»Rest.Client.csproj", "{«restClientUuid»}"
    	EndProject
    	    	
    	Project("{FAE04EC0-301F-11D3-BF4B-00C04F79EFBC}") = "«parentName»Rest.Common", "«parentName»Rest.Common\«parentName»Rest.Common.csproj", "{«restCommonUuid»}"
    	EndProject
    	
    	Project("{FAE04EC0-301F-11D3-BF4B-00C04F79EFBC}") = "«parentName».Common", "«parentName».Common\«parentName».Common.csproj", "{«commonUuid»}"
    	EndProject
    	
    	Project("{FAE04EC0-301F-11D3-BF4B-00C04F79EFBC}") = "«parentName».Main", ""«parentName».Main\"«parentName».Main.csproj", "{«mainUuid»}"
    	EndProject
    	
    	Global
    	    GlobalSection(SolutionConfigurationPlatforms) = preSolution
    	        Debug|Any CPU = Debug|Any CPU
    	        Release|Any CPU = Release|Any CPU
    	    EndGlobalSection
    	    GlobalSection(ProjectConfigurationPlatforms) = postSolution
    	        {«clientUuid»}.Debug|Any CPU.ActiveCfg = Debug|Any CPU
    	        {«clientUuid»}.Debug|Any CPU.Build.0 = Debug|Any CPU
    	        {«clientUuid»}.Release|Any CPU.ActiveCfg = Release|Any CPU
    	        {«clientUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«restServiceUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«restServiceUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«restServiceUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«restServiceUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«serviceUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«serviceUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«serviceUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«serviceUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«restClientUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«restClientUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«restClientUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«restClientUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«restCommonUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«restCommonUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«restCommonUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«restCommonUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«commonUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«commonUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«commonUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«commonUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«mainUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«mainUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«mainUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	        {«mainUuid»}.Release|Any CPU.Build.0 = Release|Any CPU
    	    EndGlobalSection
    	    GlobalSection(SolutionProperties) = preSolution
    	        HideSolutionNode = FALSE
    	    EndGlobalSection
    	EndGlobal
    	'''
	}
	
	def generateCommonCsproj() {
		'''
    	<Project Sdk="Microsoft.NET.Sdk">
    	
    	  <PropertyGroup>
    	    <TargetFramework>net«configuration.csharpVersion»</TargetFramework>
    	    <ImplicitUsings>enable</ImplicitUsings>
    	    <Nullable>enable</Nullable>
    	  </PropertyGroup>
    	
    	</Project>
    	'''
	}
	
	def generateClientCsproj() {
		'''
    	<Project Sdk="Microsoft.NET.Sdk">
    	
    	  <PropertyGroup>
    	    <TargetFramework>net«configuration.csharpVersion»</TargetFramework>
    	    <ImplicitUsings>enable</ImplicitUsings>
    	    <Nullable>enable</Nullable>
    	  </PropertyGroup>
    	
    	  <ItemGroup>
    	    <ProjectReference Include="..\«parentName».Common\«parentName».Common.csproj" />
    	    <ProjectReference Include="..\«parentName»Rest.Client\«parentName»Rest.Client.csproj" />
    	  </ItemGroup>
    	
    	</Project>
    	'''
	}
	
	def generateServiceCsproj() {
		'''
    	<Project Sdk="Microsoft.NET.Sdk">
    	
    	  <PropertyGroup>
    	    <TargetFramework>net«configuration.csharpVersion»</TargetFramework>
    	    <ImplicitUsings>enable</ImplicitUsings>
    	    <Nullable>enable</Nullable>
    	  </PropertyGroup>
    	
    	  <ItemGroup>
    	    <ProjectReference Include="..\«parentName».Common\«parentName».Common.csproj" />
    	  </ItemGroup>
    	
    	</Project>
    	'''
	}
	
	def generateRestCommonCsproj() {
		'''
    	<Project Sdk="Microsoft.NET.Sdk">
    	
    	  <PropertyGroup>
    	    <TargetFramework>net«configuration.csharpVersion»</TargetFramework>
    	    <ImplicitUsings>enable</ImplicitUsings>
    	    <Nullable>enable</Nullable>
    	  </PropertyGroup>
    	
    	  <ItemGroup>
    	    <ProjectReference Include="..\«parentName».Service\«parentName».Service.csproj" />
    	  </ItemGroup>
    	
    	</Project>

    	'''
	}
	
	def generateRestServiceCsproj() {
		'''
    	<Project Sdk="Microsoft.NET.Sdk.Web">
    	
    	  <PropertyGroup>
    	    <TargetFramework>net«configuration.csharpVersion»</TargetFramework>
    	    <Nullable>enable</Nullable>
    	    <ImplicitUsings>enable</ImplicitUsings>
    	    <RootNamespace>SOAL_demo_restapi</RootNamespace>
    	  </PropertyGroup>
    	
    	  <ItemGroup>
    	    <ProjectReference Include="..\«parentName».Common\«parentName».Common.csproj" />
    	    <ProjectReference Include="..\«parentName»Rest.Common\«parentName»Rest.Common.csproj" />
    	    <ProjectReference Include="..\«parentName».Service\«parentName».Service.csproj" />
    	  </ItemGroup>
    	
    	</Project>

    	'''
	}
	
	def generateRestClientCsproj() {
		'''
    	<Project Sdk="Microsoft.NET.Sdk">
    	
    	  <PropertyGroup>
    	    <TargetFramework>net«configuration.csharpVersion»</TargetFramework>
    	    <ImplicitUsings>enable</ImplicitUsings>
    	    <Nullable>enable</Nullable>
    	  </PropertyGroup>
    	
    	  <ItemGroup>
    	    <ProjectReference Include="..\«parentName».Common\«parentName».Common.csproj" />
    	    <ProjectReference Include="..\«parentName»Rest.Common\«parentName»Rest.Common.csproj" />
    	  </ItemGroup>
    	
    	</Project>
    	'''
	}
	
	def generateAppsettingsJson(){
		'''
    	{
    	  "Logging": {
    	    "LogLevel": {
    	      "Default": "Information",
    	      "Microsoft.AspNetCore": "Warning"
    	    }
    	  },
    	  "AllowedHosts": "*"
    	}
    	'''
	}
	
	def generateAppsettingsDevelopmentJson(){
		'''
    	{
    	  "Logging": {
    	    "LogLevel": {
    	      "Default": "Information",
    	      "Microsoft.AspNetCore": "Warning"
    	    }
    	  }
    	}
    	'''
	}
	
	def generateLaunchSettingsJson(){
		'''
    	{
    	  "$schema": "https://json.schemastore.org/launchsettings.json",
    	  "iisSettings": {
    	    "windowsAuthentication": false,
    	    "anonymousAuthentication": true,
    	    "iisExpress": {
    	      "applicationUrl": "http://localhost:64855",
    	      "sslPort": 44371
    	    }
    	  },
    	  "profiles": {
    	    "http": {
    	      "commandName": "Project",
    	      "dotnetRunMessages": true,
    	      "launchBrowser": true,
    	      "launchUrl": "weatherforecast",
    	      "applicationUrl": "http://localhost:5276",
    	      "environmentVariables": {
    	        "ASPNETCORE_ENVIRONMENT": "Development"
    	      }
    	    },
    	    "https": {
    	      "commandName": "Project",
    	      "dotnetRunMessages": true,
    	      "launchBrowser": true,
    	      "launchUrl": "weatherforecast",
    	      "applicationUrl": "https://localhost:7164;http://localhost:5276",
    	      "environmentVariables": {
    	        "ASPNETCORE_ENVIRONMENT": "Development"
    	      }
    	    },
    	    "IIS Express": {
    	      "commandName": "IISExpress",
    	      "launchBrowser": true,
    	      "launchUrl": "weatherforecast",
    	      "environmentVariables": {
    	        "ASPNETCORE_ENVIRONMENT": "Development"
    	      }
    	    }
    	  }
    	}

    	'''
	}
	
}