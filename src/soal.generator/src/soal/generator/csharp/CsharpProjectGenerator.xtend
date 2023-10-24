package soal.generator.csharp


import soal.model.RootSoalModel

class CsharpProjectGenerator extends CsharpGeneratorBase {
	new (RootSoalModel model, String name, CsharpGeneratorConfiguration configuration) {
    	super(model, name, configuration)
    }
	
	def GenerateMainCsproj() {
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
    	    <ProjectReference Include="..\«parentName».client\«parentName».client.csproj" />
    	  </ItemGroup>
    	
    	</Project>
    	'''
	}
	
	def GenerateCommonCsproj() {
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
	
	def GenerateClientCsproj() {
		'''
    	<Project Sdk="Microsoft.NET.Sdk">
    	
    	  <PropertyGroup>
    	    <TargetFramework>net«configuration.csharpVersion»</TargetFramework>
    	    <ImplicitUsings>enable</ImplicitUsings>
    	    <Nullable>enable</Nullable>
    	  </PropertyGroup>
    	
    	  <ItemGroup>
    	    <ProjectReference Include="..\«parentName».common\«parentName».common.csproj" />
    	    <ProjectReference Include="..\«parentName».rest.client\«parentName».rest.client.csproj" />
    	  </ItemGroup>
    	
    	</Project>
    	'''
	}
	
	def GenerateServiceCsproj() {
		'''
    	<Project Sdk="Microsoft.NET.Sdk">
    	
    	  <PropertyGroup>
    	    <TargetFramework>net«configuration.csharpVersion»</TargetFramework>
    	    <ImplicitUsings>enable</ImplicitUsings>
    	    <Nullable>enable</Nullable>
    	  </PropertyGroup>
    	
    	  <ItemGroup>
    	    <ProjectReference Include="..\«parentName».common\«parentName».common.csproj" />
    	  </ItemGroup>
    	
    	</Project>
    	'''
	}
	
	def GenerateRestCommonCsproj() {
		'''
    	<Project Sdk="Microsoft.NET.Sdk">
    	
    	  <PropertyGroup>
    	    <TargetFramework>net«configuration.csharpVersion»</TargetFramework>
    	    <ImplicitUsings>enable</ImplicitUsings>
    	    <Nullable>enable</Nullable>
    	  </PropertyGroup>
    	
    	  <ItemGroup>
    	    <ProjectReference Include="..\«parentName».service\«parentName».service.csproj" />
    	  </ItemGroup>
    	
    	</Project>

    	'''
	}
	
	def GenerateRestServiceCsproj() {
		'''
    	<Project Sdk="Microsoft.NET.Sdk.Web">
    	
    	  <PropertyGroup>
    	    <TargetFramework>net«configuration.csharpVersion»</TargetFramework>
    	    <Nullable>enable</Nullable>
    	    <ImplicitUsings>enable</ImplicitUsings>
    	    <RootNamespace>SOAL_demo_restapi</RootNamespace>
    	  </PropertyGroup>
    	
    	  <ItemGroup>
    	    <ProjectReference Include="..\«parentName».common\«parentName».common.csproj" />
    	    <ProjectReference Include="..\«parentName».rest.common\«parentName».rest.common.csproj" />
    	    <ProjectReference Include="..\«parentName».service\«parentName».service.csproj" />
    	  </ItemGroup>
    	
    	</Project>

    	'''
	}
	
	def GenerateRestClientCsproj() {
		'''
    	<Project Sdk="Microsoft.NET.Sdk">
    	
    	  <PropertyGroup>
    	    <TargetFramework>net«configuration.csharpVersion»</TargetFramework>
    	    <ImplicitUsings>enable</ImplicitUsings>
    	    <Nullable>enable</Nullable>
    	  </PropertyGroup>
    	
    	  <ItemGroup>
    	    <ProjectReference Include="..\«parentName».common\«parentName».common.csproj" />
    	    <ProjectReference Include="..\«parentName».rest.common\«parentName».rest.common.csproj" />
    	  </ItemGroup>
    	
    	</Project>
    	'''
	}
	
}