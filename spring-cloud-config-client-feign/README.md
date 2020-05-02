# Communication between microservice with Feign

## Requirement
* Create 2 services
	* Savings Accounts Service
	* Accounts Service
* Configure cloud config server
* Setup above 2 services to config server
* On calling API in Savings Accounts Service
	* Get accounts details from Accounts Service
* API calls should be done with Feign

## Pre Requisite
* Should know 
	* Create Spring Cloud config server
	* Connecting Spring Cloud config server to git repo
	* Connecting Spring cloud client to spring cloud config server
* Refer - https://github.com/avinashbabudonthu/micro-services/tree/master/example-1

## API
* Import [spring-cloud-config-client-feign.postman_collection.json](files/spring-cloud-config-client-feign.postman_collection.json) to local postman

## Config Server
* Maven command
```
mvn archetype:generate -DgroupId=com.config.server -DartifactId=config-server -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
* Gradle command
```
gradle init --type pom
```
* Refere dependencies in [config-server/pom.xml](config-server/pom.xml) or [config-server/build.gradle](config-server/build.gradle)
* Configure spring cloud config server in [config-server/application.yml](config-server/src/main/resources/application.yml)
* Configure spring cloud config server in [App.java](config-server/src/main/java/com/config/server/App.java)
	* Declare `@EnableConfigServer` at class level


## Accounts Service
* Maven command
```
mvn archetype:generate -DgroupId=com.accounts.service -DartifactId=accounts-service -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
* Gradle command
```
gradle init --type pom
```
* Refer dependencies in [accounts-service/pom.xml](accounts-service/pom.xml) or [accounts-service/build.gradle](accounts-service/build.gradle)
* Connect to spring cloud config server as client. Refer [accounts-service/bootstrap.yml](accounts-service/src/main/resources/bootstrap.yml)
* Classes
	* Main class - [App.java](accounts-service/src/main/java/com/accounts/service/App.java)
	* config class - [AppConfig.java](accounts-service/src/main/java/com/accounts/service/config/AppConfig.java)
	* Controller class - [AppController.java](accounts-service/src/main/java/com/accounts/service/controller/AppController.java)
	* Model classes - [accounts-service/src/main/java/com/accounts/service/model](accounts-service/src/main/java/com/accounts/service/model)

## Savings Accounts Service
* Maven command
```
mvn archetype:generate -DgroupId=com.savings.accounts.service -DartifactId=savings-accounts-service -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
* Gradle command
```
gradle init --type pom
```
* Refer dependencies in [savings-accounts-service/pom.xml](savings-accounts-service/pom.xml) or [savings-accounts-service/build.gradle](savings-accounts-service/build.gradle)
	* Add `spring-cloud-starter-openfeign` dependency for Feign
* Properties in [savings-accounts-service/bootstrap.yml](savings-accounts-service//bootstrap.yml)
* Classes
	* Main class - [App.java](savings-accounts-service/src/main/java/com/savings/accounts/service/App.java)
	* Model classes - [savings-accounts-service/src/main/java/com/savings/accounts/service/model](savings-accounts-service/src/main/java/com/savings/accounts/service/model)
	* Controller class - [AppController.java](savings-accounts-service/src/main/java/com/savings/accounts/service/controller/AppController.java)
	* Feign proxy interface - [AccountService.java](savings-accounts-service/src/main/java/com/savings/accounts/service/rest/clients/AccountService.java)
	
## Run application
* Start `config-server` - [App.java](config-server/src/main/java/com/config/server/App.java)
* Start `accounts-service` - [App.java](accounts-service/src/main/java/com/accounts/service/App.java)
* Start `savings-accounts-service` - [App.java](savings-accounts-service/src/main/java/com/savings/accounts/service/App.java)
* Hit API - [spring-cloud-config-client-feign.postman_collection.json](files/spring-cloud-config-client-feign.postman_collection.json)
	* savings-accounts-service/feign-accounts - http://localhost:9001/feign/accounts