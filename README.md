# Java Maven Demo

Simple Java 21 Servlet application built using Maven and deployed on Apache Tomcat.

## Technologies

- Java 21
- Maven
- Jakarta Servlet
- Apache Tomcat
- Git/GitHub

## Clone Repository

git clone <YOUR-GITHUB-REPOSITORY-URL>

cd java-maven-demo

## Check Java

java -version

## Check Maven

mvn --version

## Clean

mvn clean

## Compile

mvn compile

## Test

mvn test

## Package

mvn package

## WAR File

After successful build:

target/java-maven-demo.war

## Deploy to Tomcat

Copy WAR file to Tomcat webapps directory:

cp target/java-maven-demo.war /opt/tomcat/webapps/

Start Tomcat:

/opt/tomcat/bin/startup.sh

## Application URL

http://SERVER-IP:8080/java-maven-demo/

## Servlet URL

http://SERVER-IP:8080/java-maven-demo/hello
