#### HW8

List all of the new annotations to your annotaitons.md and explain its role.
2.  how do you do the debug?
    create a breakpoint on the code then hit the debug button
3.  What is DTO, VO, Payload, and DO?
    DTO is data transfer object, the idea was to encapsulate data in a value object that could be transferred over the network.
    VO is value object. Is a object that holds value eg. java.lang.Integer.
    POJO: Plain Old Java Object which is not a special object

4.  What is @JsonProperty("description_yyds") (不会的话，课上问)?
    @JsonProperty is used to mark non-standard getter/setter method to be used with respect to json property.
5.  do you know what is jackson?
    Jackson is a very popular and efficient java based library to serialize or map java objects to JSON and vice versa.
6.  What is spring-boot-stater?
    Spring Boot Starters are dependency descriptors that can be added under the <dependencies> section in pom. xml.

a. what dependecies in the below starter? do you know any starters?
Spring web, nosql, my sql, lambda
7. do you know  @RequestMapping(value = "/users", method = RequestMethod.POST) ? could you list CRUD by this style?
   @RequestMapping(value = "/users", method =RequestMethod.GET)
   @RequestMapping(value = "/users", method =RequestMethod.PUT)
   @RequestMapping(value = "/users", method =RequestMethod.DELETE)
8.  What is ResponseEntity? why do we need it?
    new ResponseEntity<>(postResponse, HttpStatus.OK);
    new ResponseEntity<>(postResponse,
    HttpStatus.CREATED);
    ResponseEntity.ok(postService.getPostById(id));
    ResponseEntity represents the whole HTTP response: status code, headers, and body.
9.  What is ResultSet in jdbc? and describe the flow how to get data using JDBC
    Resultset in jdbc is use to retrieve data from database.
    Database url,username, password->connect to db->retrieve data from db
10. What is the ORM framework?
    a relationship between an object and relational database by mapping an object state to database column.
11. Learn how to use ObjectMapper by this example.

a. https://github.com/TAIsRich/chuwa-eij-tutorial/blob/main/02-java-cor
e/src/main/java/com/chuwa/exercise/oa/api/FoodOutletJackson.java
12. What is the serialization and desrialization?
    a. https://hazelcast.com/glossary/serialization/
13. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].
14. 抄写，https://github.com/TAIsRich/springboot-
    redbook/tree/03_post_pageable，你也可以像我一样分branch添加新代码。
15. (Optional) 抄写 https://github.com/TAIsRich/springboot-redbook/tree/04_comm
    ent你也可以像我一样分branch添加新代码。
16. (Optional) Try to write the CRUD api for a new application Cassandra-Blog
    a. spring 提供了相关dependency,(https://start.spring.io/)
    i.  Spring Data for Apache Cassandra
    b. Cassandra十分流行，且面试问的多。
