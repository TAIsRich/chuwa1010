# HW8 

## 1. **List all of the new annotations to your annotaitons.md and explain its role.**

## 2. **how do you do the debug?**

   set the checkpoints -> run the program in debug mode -> check the state and variables -> step over/into

## 3. **What is DTO, VO, Payload, DO?**

The Payload of an API module is the body of your request and response message. It contains the data that you send to 
the server when you make an API request. You can send and receive Payload in different formats, such as JSON.

DTO, VO, DO are almost the same things, they are used to transfer the data through different layers.    
DTO: date transfer objects, are objects that transport data between subsystems.The main purpose is to 
reduce the number of system calls needed between the subsystems, reducing the amount of overhead created
VO: value object, is a special type of object that can hold values such as java.lang, Integer, Money.
DO: ?
POJO: Plain Old Java Object : It's like simple class which properties, public no-arg constructor. As we declare for JPA entity
   

## 4. **What is @JsonProperty("description_yyds")?**

   it is the annotation that customizes the json property name is "description_yyds"

## 5. **do you know what is Jackson?**

   ```java
   <dependency>
   <groupId>com.fasterxml.jackson.core</groupId>
   <artifactId>jackson-databind</artifactId>
   <version>2.13.3</version>
   <scope>compile</scope>
   </dependency>
   ```

Jackson is a very popular and efficient java based library to serialize or map java objects to JSON and vice versa.

## 6. **What is spring-boot-stater?**

   Spring Boot starter is a set of convenient dependency descriptors that allow us to add in pom.xml file

### what dependencies in the below starter? do you know any starters?
Spring Boot Starter Web. It is the starter for building web, uses Spring MVC, REST and Tomcat as a default embedded server
```java
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
        
some other starters:

        - spring-boot-starter-data-jpa
        - spring-boot-starter-data-mongodb
        - spring-boot-starter-data-cassandra
        - spring-boot-starter-test

## 7. do you know `@RequestMapping(value = "/users", method = RequestMethod.POST) `? could you list CRUD by this style?

   this annotation is used to map web requests to controller methods

   POST: `@RequestMapping(value = "/users", method = RequestMethod.POST)`

   GET: `@RequestMapping(value = "/users", method = RequestMethod.GET)`

   PUT: `@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)`

   DELETE: `@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)`

## 8. **What is ResponseEntity? why do we need it?**

   ```java
   new ResponseEntity<>(postResponse, HttpStatus.OK);
   new ResponseEntity<>(postResponse, HttpStatus.CREATED);
   ResponseEntity.ok(postService.getPostById(id));
   ```
   ResponseEntity represents an http response, which includes headers, body, and status.
   We need it to have control over the headers and status code along with the response body to represent the entire http response.

## 9. **What is ResultSet in jdbc? and describe the flow how to get data using JDBC**

   it's an object that represents a set of data returned from a database, after executing database queries

   The typical flow of using JDBC:

    - load the `JDBC Driver` and create a `Connection` to the database;
    - create a `Statement` and execute the query to get a `ResultSet`
    - traverse and process the `ResultSet`
    - close the `ResultSet`, `Statement`, and `Connection`

## 10. **What is the ORM framework?**

Object-Relational Mapping, is a programming technique for converting data between 
relational databases and object oriented programming languages such as Java, C#, etc.
ORM framework example: hibernate.

## 11. **Learn how to use ObjectMapper by this example. (Jackson)**
https://github.com/TAIsRich/chuwa-eij-tutorial/blob/main/02-java-core/src/main/java/com/chuwa/exercise/oa/api/FoodOutletJackson.java

    ```java
    FoodOutlet foodOutlet =
    objectMapper.readValue(resBody, FoodOutlet.class);
    String s = objectMapper.writeValueAsString(foodOutlet);
    objectMapper.readTree()
    ```

## 12. **What is the serialization and deserialization?**

    Serialization is the process of converting data objects to a portable format (JSON, XML...)

    Deserialization is the reverse process, recreating data objects from a portable format

## 13. **use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].**

```java
    import java.util.*;
    
    public class Main {
        public static void main(String args[]) {
          int[] arr={20,3,78,9,6,53,73,99,24,32};
          double result = Arrays.stream(arr).average().orElse(Double.NaN);
          
          System.out.println("The average is: " + result);
        }
    }
    //output
    //The average is: 39.7
 ```
## 14. 抄写，https://github.com/TAIsRich/springboot-
    redbook/tree/03_post_pageable，你也可以像我一样分branch添加新代码。
## 15. (Optional) 抄写 https://github.com/TAIsRich/springboot-redbook/tree/04_comm
    ent你也可以像我一样分branch添加新代码。
## 16. (Optional) Try to write the CRUD api for a new application Cassandra-Blog
    a. spring 提供了相关dependency,(https://start.spring.io/)
    i.  Spring Data for Apache Cassandra
    b. Cassandra十分流行，且面试问的多。
 