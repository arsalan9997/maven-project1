# Java Maven Demo

Simple Java 25 Servlet application built using Maven and deployed on Apache Tomcat.

## Technologies

- Java 25
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

mvn install

## Install tomcat

sudo apt install tomcat10 tomcat10-admin -y

sudo systemctl start tomcat10 


sudo systemctl enable tomcat10 


sudo systemctl status tomcat10


## WAR File

After successful build:

sudo cp target/java-maven-demo.war /var/lib/tomcat10/webapps/

## Deploy to Tomcat

Copy WAR file to Tomcat webapps directory:

ls -l /var/lib/tomcat10/webapps/java-maven-demo/

## Application URL

http://SERVER-IP:8080/java-maven-demo/

## Servlet URL

http://SERVER-IP:8080/java-maven-demo/hello
