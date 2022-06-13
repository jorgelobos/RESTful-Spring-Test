# Getting Started

## Build and execution instructions

This application was made on Apache NetBeans IDE 13, from now on NetBeans.

To run this Application, on NetBeans you can open the project and press Shift + F11 on Windows to Clean & Build it. Then Run it with the F6 key.

It will start a TomCat WebServer at port 8080 (accesible by http://localhost:8080)

You can send then commands by terminal to test the endpoints


## Brief explanation about architectural and technological decisions made for the application.

A lot of the technologies chosen were due to the constraints of the task sent:
> Java 11 was used because it was requested in the task.
> As for the build tool, Gradle was chosen due to the lack of experience with it, and as an opportunity to learn how to use it while doing the task
> For the persistance database, MySQL was selected due to it's simplicity for an small application 
> Spring Boot is an excellent tool to create stand-alone Spring based applications

As this was a test, and due to brief time for personal reasons, couldn't implement Unit Testing and Integration Testing as much as I would have liked.

------

As far as architectural decisions, I implemented each repository as an interface which represents an action written at the dao packages:

- Retrieve either a list of products with [$ curl -v localhost:8080/products] or a single product with [$ curl -v localhost:8080/employees/{productId}]
- Store a new product with [$ curl -X POST localhost:8080/products -H 'Content-type:application/json' -d {newProduct}]
- Update a particular product with [$ curl -X PUT localhost:8080/products/{productId} -H 'Content-type:application/json' -d '{updatedProduct}']
- Delete a stored product with [$ curl -X DELETE localhost:8080/products/{productId}]

The conventions used are detailed in https://restfulapi.net/resource-naming/, and follow the guideline that URIs SHOULDN'T use CRUD function names as part of the endpoint. instead, defined by the HTTP request method.
I did it that way so each action has an independent responsability and keep low coupling.

Also, implemented Product.java as a DTO because it's behavior includes  storage, retrieval, serialization and deserialization of its own data.

Finally, added on the Gradle build.gradle file the Spring Boot Starter HATEOAS so the responses are actually RESTful, and not a simple API that gives plain responses.

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.0/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.0/gradle-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.0/reference/htmlsingle/#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.0/reference/htmlsingle/#data.sql.jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

