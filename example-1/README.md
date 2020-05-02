# Microservice example 1

## Requirement
* Create student service spring boot application
* Create spring cloud config server spring boot applicaiton
* Make student service as spring cloud config client
* Get configuration properties in student service from spring cloud config client by environment

## Postman Collection
* Import postman collection json to local postman - [example-1.postman_collection.json](files/example-1.postman_collection.json)

## Student Service
* Project folder - [student-service](student-service)
* Maven Command
```
mvn archetype:generate -DgroupId=com.student.service -DartifactId=student-service -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
* Gradle command
```
gradle init --type pom
```
* Main class - [App.java](student-service/src/main/java/com/student/service/App.java)
* Add spring-boot, devtools, actuator, `spring-cloud-config-client`, `spring-boot-configuration-processor` dependencies. Refer [pom.xml](student-service/pom.xml) (or) [build.gradle](student-service/build.gradle)
* Create [bootstrap.yml](student-service/src/main/resources/bootstrap.yml) file. Configure following properties
	* server.port
	* spring.application.name
* Application is running on port - `9000`. Refer [bootstrap.yml](student-service/src/main/resources/bootstrap.yml) - `server.port` property
* Create [Student.java](student-service/src/main/java/com/student/service/model/Student.java)
* Create [StudentList.java](student-service/src/main/java/com/student/service/model/StudentList.java)
	* Declare `@ConfigurationProperties(prefix = "students")` at class level to enable to declare values for properties of this class in properties/yaml file
* Create [AppConfig.java](student-service/src/main/java/com/student/service/config/AppConfig.java). This class to enable configuring [StudentList.java](student-service/src/main/java/com/student/service/model/StudentList.java) class properties in properties/yaml file
* Create [AppController.java](student-service/src/main/java/com/student/service/controller/AppController.java)
	* Inject [StudentList.java](student-service/src/main/java/com/student/service/model/StudentList.java)
	* Write `/students` API - `findAllStudents()`

## Config Server
* Project folder - [config-server](config-server)
* Maven command
```
mvn archetype:generate -DgroupId=com.config.server -DartifactId=config-server -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
* Gradle command
```
gradle init --type pom
```
* Add spring-boot, devtools, actuator, `spring-cloud-config-server`, `spring-boot-configuration-processor` dependencies. Refer [pom.xml](config-server/pom.xml) (or) [build.gradle](config-server/build.gradle)
* Main class - [App.java](config-server/src/main/java/com/config/server/App.java)
* Create [applicaiton.yml](config-server/src/main/resources/application.yml). Configure following properties
	* server.port
	* spring.application.name
* Application is running on port - `8888`. Refer [applicaiton.yml](config-server/src/main/resources/application.yml) - `server.port` property