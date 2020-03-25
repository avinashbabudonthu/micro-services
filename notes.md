## What is webservice?
* Service delivered over the web
* Software system designed to support interoperable machine to machine interaction over a network
* Designed for application to application interaction
* Interoperable - Not platform dependent
* Shoud allow communication over network

## How applications exchange data?
* Http Request and Response

## How webservices are platform independent?
* Exchange data in platform independent way with following formats
	* XML
	* JSON
	
## How calling application knew repsonse format?
* With Service Definition
	* Request and Response format
	* Request Structure
	* Response Structure
	* Endpoint
	
## Webservices key terminology
* Request - Input to webservice
* Response - Output of webservice
* Message Exchange Format - Format of the request and response like `XML`, `JSON`
* Service Provider - Server
* Service Consumer - Client
* Service Definition - Contract between service provider and consumer
* Transport - How service is called
	* Http
	* MQ - `Messaging Queues`
	
## Kinds of webservices
* SOAP
	* Simple Object Access Protocol
	* XML is request and response exchange format
	* Has - Envolop. Contains
		* Header
			* Authentication
			* Authorization
			* Signature
		* Body
			* Content of the request
	* Service Definition
		* WSDL - Web Service Definition Language
			* Endpoint
			* Operations
			* Request and Response structure
* REST - Representational State Transfer
	* Communication over Http
	* Http Methods
		* GET - Select data
		* POST - Save data
		* PUT - Full update
		* PATCH - Partial update
		* DELETE - Delete data
	* Resource
		* Anything we want to expose to outside world
		* Resource has an URI
		* Can have different representations
			* XML
			* JSON
	* Tools for documentation
		* Swagger