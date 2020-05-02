# Communication between microservice with Feign

## Requirement
* Create 2 services
	* Customer Service
	* Savings Accounts Service
	* Accounts Service
* Configure cloud config server
* Setup above 3 services to config server
* On calling API in Accounts Service
	* Get customer details from Customer Service
	* Get savings accounts details from Savings Accounts Service
* API calls should be done with Feign

## Pre Requisite
* Should know 
	* Create Spring Cloud config server
	* Connecting Spring Cloud config server to git repo
	* Connecting Spring cloud client to spring cloud config server
* Refer - https://github.com/avinashbabudonthu/micro-services/tree/master/example-1

## Customer Service
* Maven command
```
mvn archetype:generate -DgroupId=com.customer.service -DartifactId=customer-service -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
* Gradle command
```
gradle init --type pom
```

## Savings Accounts Service
* Maven command
```
mvn archetype:generate -DgroupId=com.savings.accounts.service -DartifactId=savings-accounts-service -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
* Gradle command
```
gradle init --type pom
```

## Savings Accounts Service
* Maven command
```
mvn archetype:generate -DgroupId=com.accounts.service -DartifactId=accounts-service -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
* Gradle command
```
gradle init --type pom
```

## Config Server
* Maven command
```
mvn archetype:generate -DgroupId=com.config.server -DartifactId=config-server -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
* Gradle command
```
gradle init --type pom
```