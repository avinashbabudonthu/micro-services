## microservices with spring cloud topics
* spring cloud config server
* load balancing with Ribbon and Feign
* Naming server with Eureka
* API Gateway with Zuul
* Distributed tracing with Zipkin
* Fault tolerance with Hystrix

## What is microservice?
* REST API
* Small deployable units
* cloud enabled

## Challenges of microservices
* Bounded Context
	* Identifying the boundaries of microservice
* Configuration Management for below combinaiton of microservices
	* number of microservices
	* number of environments
	* number of instances in each environment
* Dynamic Scale Up and Scale Down
	* dynamically increasing and decreasing the instances
	* dynamically distribute load among running instances
* Visibility
	* we need to have centralized log to identify which microservice caused the problem
	* we need monitoring for all microservices. While multiple microservices are running we should be able to identify 
		* which microservice is down
		* which microservice is running out of disk space
* Pack of cards
	* we are building mulitple microservices and if one microservice is down there is chance of whole functionality gets effects
	* So we need to have fault tolerance

## Implementing microservices with spring cloud
* There are wide variety project under spring cloud. Refer https://spring.io/projects/spring-cloud
* Configuration Management is done with `Spring Cloud Config Server`
	* We can store configuration of all configurations of all different microservices for all environments in Git Repository
	* Saving all configurations in one single place
	* Spring cloud config server maintains all configuration in git repository
* Dynamic Scale Up and Scale Down
	* Naming Server and Discovery Server - Eureka
		* All microservices register with naming server
	* Ribbon - client side load balancing
	* Feign - Easier Rest client
* Visibility and Monitoring
	* Spring Cloud Sleuth
		* To assign an id to request across all microservices
	* Zipkin Distributed Tracing
		* To trace request across multiple components
	* Netflix API Gateway Zuul
		* Security
		* Logging
		* Routing
* Fault Tolerance
	* Hystrix
		* If service is down Hystrix helps us return default response

## Advantages of microservices
* Easy to adapt new technology stack
* Dynamic Scaling
* Faster release cycles

## Standardizing component ports and URLs
Application          				| Port
-------------------- 				| ---------------
Application Service 1         		| 8080, 8081
Spring Cloud Config Server  		| 8888
Application Service  2 				| 8000, 8001, 8002, ..
Application Service 3				| 8100, 8101, 8102, ..
Netflix Eureka Naming Server		| 8761
Netflix Zuul API Gateway Server		| 8765
Zipkin Distributed Tracing Server 	| 9411

