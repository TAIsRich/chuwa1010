1. ### **List all of the new annotations to your annotaitons.md and explain its role.**

   please see ShortQuestions/annotations.md

2. ### how do you do the debug?

   we could add breakpoints so that we could see the results stop by the breakpoints

3. ### What is DTO, VO, Payload, DO?

   #### <u>DTO</u>

   A **DTO**, also referred to **as [Data Transfer Object](https://www.baeldung.com/java-dto-pattern)**, encapsulates values to carry data between processes or networks.

   This helps in reducing the number of methods called. By including multiple parameters or values in a single call, we reduce the network overhead in remote operations.

   One more advantage of this pattern is the encapsulation of the serialization's logic. It lets the program store and transfer data in a specific format.

   **A DTO does not have any explicit behavior. It basically helps in making the code loosely coupled by decoupling the domain models from the presentation layer.**

   ```java
   public class EmployeeDTO {
   
       private String firstName;
       private String lastName;
       private LocalDate startDate;
   
       // standard getters and setters
   }
   ```

   #### <u>VO</u>

   **VO, also known as the Value Object**, is a special type of object that can hold values such as *java.lang.Integer* and *java.lang.Long*.

   A VO should **always override the *equals()* and *hashCode()* methods**. VOs **generally encapsulate small objects such as numbers, dates, strings, and more**. They follow the value semantics, i.e., they directly change the object's value and pass copies around instead of references.

   ```java
   public class EmployeeVO {
   
       private String firstName;
       private String lastName;
       private LocalDate startDate;
   
       public EmployeeVO(String firstName, String lastName, LocalDate startDate) {
           this.firstName = firstName;
           this.lastName = lastName;
           this.startDate = startDate;
       }
       // Getters
   
       @Override
       public boolean equals(Object obj) {
   
           if (this == obj) return true;
           if (obj == null || getClass() != obj.getClass()) return false;
   
           EmployeeVO emp = (EmployeeVO) obj;
   
           return Objects.equals(firstName, emp.firstName)
             && Objects.equals(lastName, emp.lastName)
             && Objects.equals(startDate, emp.startDate);
       }
   
       @Override
       public int hashCode() {
           return Objects.hash(firstName, lastName, startDate);
       }
   }
   ```

   #### <u>Payload</u>

   The payload of an API is **the data you are interested in transporting to the server when you make an API request**. Simply put, it is the body of your HTTP request and response message.

   #### <u>DO</u>

   The Java Data Objects is an API designed for persisting object-oriented data into any database and provide a user-friendly query language using the Java syntax.

   

4. ### What is @JsonProperty("description_yyds") ?

   We can use the *@JsonPropertyOrder* annotation to specify **the order of properties on serialization**.

   Let's set a custom order for the properties of a *MyBean* entity:

   ```java
   @JsonPropertyOrder({ "name", "id" })
   public class MyBean {
       public int id;
       public String name;
   }
   ```

   Here's the output of serialization:

   ```json
   {
       "name":"My bean",
       "id":1
   }
   ```

   Reference: https://www.baeldung.com/jackson-annotations

   

5. ### do you know what is jackson?

   ```java
   <dependency>
     <groupId>com.fasterxml.jackson.core</groupId>
     <artifactId>jackson-databind</artifactId>
     <version>2.13.3</version>
     <scope>compile</scope>
   </dependency>
   ```

   **jackson is a package that helps the tranformation between json and java objects.**

   

6. ### What is **spring-boot-stater**?

   a. what dependecies in the below starter? do you know any starters?

   ```java
   <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
   </dependency>
   ```

   **Spring Boot Starters** are dependency descriptors that can be added under the **<dependencies>** section in pom.xml. 

   There are around 50+ Spring Boot Starters for different Spring and related technologies. These starters give all the dependencies under a single name. For example, if you want to use Spring Data JPA for database access, you can include **spring-boot-starter-data-jpa** dependency. 

   **The advantages of using Starters are as follows:**

   - Increase productivity by decreasing the Configuration time for developers.

   - Managing the POM is easier since the number of dependencies to be added is decreased.

   - Tested, Production-ready**,** and supported dependency configurations.

   - No need to remember the name and version of the dependencies.

     

7. ### do you know @RequestMapping(value = "/users", method = RequestMethod.POST) ? could you list CRUD by this style?

   - Create: `@RequestMapping(value = "/users", method = RequestMethod.POST)`
   - Read: `@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)`
   - Update: `@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)`
   - Delete: `@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)`
   
   
   
8. ### What is ResponseEntity? why do we need it?

   ```java
   new ResponseEntity<>(postResponse, HttpStatus.OK); 
   new ResponseEntity<>(postResponse,HttpStatus.CREATED);
   ResponseEntity.ok(postService.getPostById(id));
   ```

   ResponseEntity encapsulates the result that need to be returned back to controller.

   

9. ### What is ResultSet in jdbc? and describe the flow how to get data using JDBC?

   The ***ResultSet\* is a table of data generated by executing database queries.** 

   

10. ### What is the ORM framework?

    ORM stands for **O**bject-**R**elational **M**apping (ORM) is a programming technique for converting data between relational databases and object oriented programming languages

    There are several persistent frameworks and ORM options in Java. A persistent framework is an ORM service that stores and retrieves objects into a relational database.

    - Enterprise JavaBeans Entity Beans

    - Java Data Objects

    - Castor

    - TopLink

    - Spring DAO

    - Hibernate

    - And many more

      

11. ### Learn how to use ObjectMapper by this example.

    a. https://github.com/TAIsRich/chuwa-eij-tutorial/blob/main/02-java-core/src/main/java/com/chuwa/exercise/oa/api/FoodOutletJackson.java

    ```java
    FoodOutlet foodOutlet = objectMapper.readValue(resBody, FoodOutlet.class);
    String s = objectMapper.writeValueAsString(foodOutlet);
    objectMapper.readTree() // learn how to use it?
    ```

    

12. ### What is the serialization and desrialization?

    a. https://hazelcast.com/glossary/serialization/

    Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.

    

    ![image-20221031163653996](/Users/amelia/Library/Application Support/typora-user-images/image-20221031163653996.png)

    

13. ### use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].

    ```java
    List<Integer> arr = Arrays.asList(20, 3, 78, 9, 6, 53, 73, 99, 24, 32);
    
    OptionalDouble avg = arr.stream().mapToInt(Integer::intValue).average();
    ```

    

    

14. ### 抄写，https://github.com/TAIsRich/springboot-redbook/tree/03_post_pageable，你也可以像我一样分branch添加新代码。

    please see it in MavenProject/redbook

    

15. ### (Optional) 抄写 https://github.com/TAIsRich/springboot-redbook/tree/04_comment 你也可以像我一样分branch添加新代码。

    please see it in MavenProject/redbook

16. ### (Optional) Try to write the CRUD api for a new application Cassandra-Blog.

    a. spring 提供了相关dependency,(https://start.spring.io/)

    ​	**Spring Data for Apache Cassandra**

    b. Cassandra十分流行，且面试问的多。