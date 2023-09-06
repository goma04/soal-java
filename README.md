# soal-java

SOAL is a user friendly domain specific language for top-down development of distributed services. The SOAL framework generates source and configuration files for the most popular development environments, and it supports web services, REST and WebSockets for communication between the components.

## Compiling the projects

Download [Eclipse IDE for Java and DSL Developers](https://www.eclipse.org/downloads/packages/release/2023-06/r/eclipse-ide-java-and-dsl-developers)

Open the projects under the **src** folder. Eclipse will compile the projects automatically.

## Running the SOAL compiler

In Eclipse, right click on the **Main.xtend** inside the **soal.compiler** project, and select **Run as > Java application**. A new **Run configuration** will be created by Eclipse.

In this **Run configuration** open the **Arguments** tab, and fill the **Program arguments**.

Use the following arguments, to generate documentation:
```
documentation -i input/helloworld -o output
```

Use the following arguments, to generate WSDL or OpenApi descriptors:
```
interface -i input/helloworld -o output
```

Use the following arguments, to generate Spring Boot client and server skeleton:
```
implementation -i input/helloworld -o output
```

## Running the SOAL editor

In Eclipse, right click on the project **soal.dsl** and select **Run as > Eclipse application**. A new Eclipse will be opened. Create a new project (**General > Project**) called **soal.example**, add a new folder called **hello** to this project, and create a new file called **HelloWorld.soal** under this folder. (Make sure to allow Eclipse to convert the project to an Xtext project. You can also do this manually by right clicking the **soal.example** project and selecting **Configure > Convert to Xtext project**.)

