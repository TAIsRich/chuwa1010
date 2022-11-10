## HW8

1. *How do you do the debug?*

   Check the logs in the console for the error information.

   Add breakpoints to code.

2. *What is DTO, VO, Payload, DO?*

   DTO - Data Transfer Object, carries useful data between processes/systems, it is used to encapsulate data, and send it from one subsystem of an application to another. usually between front-end and back-end (between View layer and Service layer).

   VO - View Object, in view layer, visible

   Payload - it is the essential information in a data block that you send to or receive from the server when making API requests. The Payload can be sent or received in a variety of formats, including JSON.. DTOs is stored in payload package.

   DO - Data object, a collection of one or more data points that create meaning as a whole, the same as PO (persistent object, the same as Entity.

3. *What is @JsonProperty("description_yyds")*

   The @JsonProperty annotation is used to map property names with JSON keys during serialization and deserialization. By default, if you try to serialize a POJO, the generated JSON will have keys mapped to the fields of the POJO.

   The content of the field with this annotion will be mapped from the "description_yyds" field passed by the JSON.

4. *do you know what is jackson?*

   ```java
   <dependency>
   
   <groupId>com.fasterxml.jackson.core</groupId>
   
   _<artifactId>jackson-databind</artifactId>
   
   _<version>2.13.3</version>
   
   _<scope>compile</scope>
   
   </dependency>
   ```

   Jackson is a very popular and efficient java based library to serialize or map java objects to JSON and vice versa. It is one such Java Json library used for parsing and generating Json files. It has built in Object Mapper class which parses json files and deserializes it to custom java objects. It helps in generating json from java objects. 6. What is spring-boot-stater?

	5.  *what dependecies in the below starter? do you know any starters?*

```java
<dependency>

<groupId>org.springframework.boot</groupId>

<artifactId>spring-boot-starter-web</artifactId>

</dependency>
```

​	Spring Boot Starters are dependency descriptors that can be added under the section in pom. xml. There are around 50+ Spring Boot Starters for different Spring and related technologies. These starters give all the dependencies under a single name.

6. *do you know @RequestMapping(value = "/users", method = RequestMethod.POST)? could you list CRUD by this style?*

​	Use the `@RequestMapping` annotation to map different HTTP requests to their respective controller methods.

​	`@RequestMapping(value = "/users", method = RequestMethod.POST)`

​	`@RequestMapping(value = "/users", method = RequestMethod.GEt)`

​	`@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT) -@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)`

7. *What is ResponseEntity? why do we need it?*

   ```java
   new ResponseEntity<>(postResponse,HttpStatus.OK);
   
   new ResponseEntity<>(postResponse,HttpStatus.CREATED);
   
   ResponseEntity.ok(postService.getPostById(id));
   ```

   ResponseEntity represents the whole HTTP response: status code, headers, and body. As a result, we can use it to fully configure the HTTP response. If we want to use it, we have to return it from the endpoint; Spring takes care of the rest.

8. *What is ResultSet in jdbc? and describe the flow how to get data using JDBC*

   ResultSet represents the result set of a database query. A ResultSet object maintains a cursor that points to the current row in the result set.

   JDBC consists of 7 elements that are known as connection steps: 1 Import the package 2 Load and Register the drivers 3 Establish the connection 4 Create the statement 5 Execute the statement 6 Process Result 7 Close/terminate

9. *What is the ORM framework?*

   ORM stands for object–relational mapping. It is a programming technique for converting data between type systems using object-oriented programming languages.

10. *Learn how to use ObjectMapper by this example.* 

    a. https://github.com/TAIsRich/chuwa-eij-tutorial/blob/main/02-java-core/src/main/java/com/chuwa/exercise/oa/api/FoodOutletJackson.java

11. *What is the serialization and desrialization?*

    Serialization is the process of converting a data object — a combination of code and data represented within a region of data storage — into a series of bytes that saves the state of the object in an easily transmittable form.

    The deserialization process recreates the object, thus making the data easier to read and modify as a native structure in a programming language.

12. *use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].*

    ```java
    import java.util.*;
    
    public class Main {
         public static void main(String[] args) {
            List<Integer> list = Arrays.asList(20, 3, 78, 9, 6, 53, 73, 99, 24, 32);
    
    		Double res = list.stream()
    			.mapToDouble(Integer::intValue)
    			.average()
    			.getAsDouble();
            
            System.out.println(res);
        }
    }
    ```

13. 抄写，https://github.com/TAIsRich/springbootredbook/tree/03_post_pageable_，你也可以像我⼀样分branch添加新代码。

14. (Optional) 抄写 https://github.com/TAIsRich/springboot-redbook/tree/04_comment 你也可以像我⼀样分branch添加新代码。

15. (Optional) Try to write the CRUD api for a new application Cassandra-Blog

​	a. spring 提供了相关dependency,(https://start.spring.io/)

​		i. Spring Data for Apache Cassandra

​	b. Cassandra⼗分流⾏，且⾯试问的多。





