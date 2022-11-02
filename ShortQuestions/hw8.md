# Homework 8

### 1. List all of the new annotations to your annotaitons.md and explain its role.
Please see *annotations.md*
### 2. how do you do the debug?
You can set breakpoint at any where of the code, e.g. in a method, within a lambda, and inspect field values in IDE to debug.
### 3. What is DTO, VO, Payload, DO?
- DTO: Data Transfer Objects are Java objects used to hold parameters of a model design and transport data through different layers of an application.
- VO: Value Objects can be used to describe DTOs, but it's definition has shifted to describe an object that holds an immutable value rather than mutable object though reference
- Payload: Under the context of web application, payload are information in a data block that you can send or receive from the server when making API requests. It can be seen as the abstract definition of DTOs
- DO: Java Data Objects is the stardard to access presistent data
### 4. What is @JsonProperty("description_yyds")?
The decorator maps a Java field with a Json field as specfieid in ().
### 5. do you know what is jackson?
```XML
<dependency>
  <groupId>com.fasterxml.jackson.core</groupId>
  <artifactId>jackson-databind</artifactId>
  <version>2.13.3</version>
  <scope>compile</scope>
</dependency>
```
Jackson is the Java Json library to parse and generate Json files to communicate with http requests from front end.
### 6. What is spring-boot-stater?
Spring-boot-starters are dependency pakcages spcified in pom.xml for a spring boot project to let Maven know what dependencies to downlaod when building the application
a. what dependecies in the below starter? do you know any starters?
```XML
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
This is the Spring Web dependency used to build web applications using Spring MVC, where Apache Tomcat is the default embedded container.
Other starters include Spring data JPA, spring data mongodb, Junit Test, etc.

### 7. do you know `@RequestMapping(value = "/users", method = RequestMethod.POST)` ? could you list CRUD by this style?
This decorator is used to map a method with a url request though path variable `/users` to send POST request.
- Create: `@RequestMapping(value = "/users", method = RequestMethod.POST)`
- Read: `@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)`
- Update: `@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)`
- Delete: `@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)`

### 8. What is ResponseEntity? why do we need it?
```JAVA
new ResponseEntity<>(postResponse, HttpStatus.OK);
new ResponseEntity<>(postResponse,
HttpStatus.CREATED);
ResponseEntity.ok(postService.getPostById(id));
```
ResponseEntity is the Java object that sends response result string back to front end with an http request status. We need it to convert Java DTO to json strings that browsers can read.

### 9. What is ResultSet in jdbc? and describe the flow how to get data using JDBC
ResultSet is the java object that stores all the data fatched from an SQL data query. It can be iterated to read next row of data and its get methods to get data by column name.
The flow of getting data using JDBC:
1.  establishing a connection
2.  creating a prepared statement or query
3.  execute the query
4.  looping through the result set to get the objects
5.  close the connection 


### 10.  What is the ORM framework?
ORM stands for Object-Relational Mapping, which is a programming techinique sued to convert data between relational database and Java objects.
### 11.  Learn how to use ObjectMapper by this example.
Please see *Coding\hw8*
### 12. What is the serialization and desrialization?
a. https://hazelcast.com/glossary/serialization/
Serialization is the process of converting Java objects into byte codes to be stored or transmitted in file system or database. Deserilization is the process to convert such byte codes into Java objects.
### 13. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].
`Arrays.stream(new int[]{20, 3, 78, 9, 6, 53, 73, 99, 24, 32}).average().getAsDouble();`
### 14. 抄写，https://github.com/TAIsRich/springbootredbook/tree/03_post_pageable
Please see *MavenProject\redbook-03*