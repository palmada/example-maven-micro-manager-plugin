# Example Micro-Manager 2.0 plugin using Maven

This repository provides an example on how to implement a Micro-Manager 2.0 plugin using Maven.

The plugin itself doesn't do much but should help get you started on creating a Micro-manager 2.0 plugin,
using Maven to manage the project.

## Getting started

To get this project running you'll need:
- Micro-Manager 2.0
- Maven
- An IDE: I personally prefer IntelliJ, and it works very well with Maven.

Once you have installed Micro-Manger and copied this repository,
run the following command from the repository folder:
```powershell
mvn install:install-file -Dfile="PATH\plugins\Micro-Manager\MMJ_.jar" -DgroupId="org.micromanager" -DartifactId="MMJ_" -Dversion="2.0" -Dpackaging="jar"
```
Where `PATH` is your local path to where you installed Micro-manager.

## Using Maven

The file Maven uses to understand your project is the `pom.xml`.
This file will describe your project and the dependencies it requires to build properly.
The `pom` provided here is very basic and only designed to get you started;
Maven has many features and other ways to manage your project beyond what is shown here.

### Compiling and packaging your plugin

To create your plugin, simple type `mvn package` on the root of the project.
Maven will check what dependencies you need (in this case Micro-Manager and SciJava), 
download them for you and compile the code.

A `jar` file will then be created under a `target` directory.
Simply copy this file to the `mmplugins` folder in your Micro-manager directory and start micro-manger: 
the plugin (named `Example plugin`) should now appear on Micro-Manager's plugin list.
