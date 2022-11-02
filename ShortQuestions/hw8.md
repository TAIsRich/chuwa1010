1. List all of the new annotations to your annotaitons.md and explain its role.

   /ShortQuestions/annotations.md

2. how do you do the debug?

   1. check the error message which points to the problem in your code
   2. based on the information and your analysis, locate where the problem might be, mark the code, and start debug
   3. step over each time to check if we are getting desired. if not, we found the bug

3. What is DTO, VO, Payload, DO?

   [一篇文章讲清楚VO，BO，PO，DO，DTO的区别](https://zhuanlan.zhihu.com/p/102389552)

   ![img](https://pic1.zhimg.com/80/v2-24e3ed681c02b6434681719753c53b40_720w.webp)

   **DTO**: "Data transfer objects " can travel between seperate layers in software architecture. 

   DTO是一个比较特殊的对象，他有两种存在形式：

   在后端，他的存在形式是java对象，也就是在controller里面定义的那个东东，通常在后端不需要关心怎么从json转成java对象的，这个都是由一些成熟的框架帮你完成啦，比如spring框架

   在前端，他的存在形式通常是js里面的对象（也可以简单理解成json），也就是通过ajax请求的那个数据体

   **VO**: "Value objects " hold a object such as Integer,Money etc. 主要的存在形式就是js里面的对象

   **Payload**: Payload is the essential information in a data block that you send to or receive from the server when making API requests. The Payload can be sent or received in a variety of formats, including JSON.

   **DTO vs. VO**: Data Transfer Object is used for transferring a collection of data across application layers. Value Object is an object that contains values that are needed to be transferred between application layers so **DTO and VO are almost the same but it is used in different places**.

   **POJO**: Plain Old Java Object which is not a special object.

   

4. What is @JsonProperty("description_yyds") (不会的话，课上问)?

   1. @JsonProperty注解主要用于实体类的属性上，作用可以简单的理解为在反序列化的时候给属性重命名(多一个名字来识别)(约定大于配置)

   2. 使用此注解时，类必须实现序列化（implements Serializable）

   代码示例

   ```java
   import com.fasterxml.jackson.annotation.JsonProperty;
   import lombok.Data;
   
   @Data
   public class TestJson {
       @JsonProperty("my_name")
       private String myName;
       @JsonProperty("my_age")
       private Integer myAge;
   }
   ```

   ```java
   import com.example.demojson.TestJson;
   import io.swagger.annotations.Api;
   import io.swagger.annotations.ApiOperation;
   import org.springframework.web.bind.annotation.*;
   
   @RestController
   @RequestMapping("/test")
   @Api("swagger文档")
   public class TestController {
       @PostMapping("/json")
       @ApiOperation("测试@JsonProperty")
       public TestJson testJson(@RequestBody TestJson testJson) {
           String myName = testJson.getMyName();
           Integer myAge = testJson.getMyAge();
           System.out.println(testJson.toString());
           return testJson;
       }
   }
   ```

   @JsonProperty不仅仅是在序列化的时候有用，反序列化的时候也有用，比如有些接口返回的是json字符串，命名又不是标准的驼峰形式，在映射成对象的时候，将类的属性上加上@JsonProperty注解，里面写上返回的json串对应的名字

5. do you know what is jackson?

```xml
<dependency>
  <groupId>com.fasterxml.jackson.core</groupId>
  <artifactId>jackson-databind</artifactId>
  <version>2.13.3</version>
  <scope>compile</scope>
</dependency>
```

Jackson is **a suite of data-processing tools for Java**. It allows to read and write data in JSON, Avro, BSON, CBOR, CSV, Smile, (Java) Properties, Protobuf, XML or YAML format. Jackson is auto-configured. It comes with the spring-boot-starter-json.  It has built in Object Mapper class which parses json files and deserializes it to custom java objects. It helps in generating json from java objects.

6. What is **spring-boot-starter**?

   Spring Boot Starters are dependency descriptors that can be added under the <dependencies> section in pom. xml.

   Spring Boot provides a number of starters *that allow us to add jars in the classpath*. Spring Boot built-in starters make development easier and rapid.

    a. what dependecies in the below starter? do you know any starters?

   ```xml
   <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
   </dependency>
   ```

   Web.

   [Starters](https://www.geeksforgeeks.org/spring-boot-starters/)

7. do you know @RequestMapping(value = "/users", method = RequestMethod.POST) ? could you list CRUD by this style?

   Use the @RequestMapping annotation to map different HTTP requests to their respective controller methods.

   Post: @RequestMapping(value = "/users", method = RequestMethod.POST)

   Read: @RequestMapping(value = "/uesrs", method = RequestMethod.GET)

   Update: @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)

   Delete: @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)

8. What is ResponseEntity? why do we need it?

   ```java
   new ResponseEntity<>(postResponse, HttpStatus.OK); 
   new ResponseEntity<>(postResponse, HttpStatus.CREATED);
   ResponseEntity.ok(postService.getPostById(id));
   ```

   ResponseEntity represents the whole HTTP response: status code, headers, and body. 
   We can use it to fully configure the HTTP response.

9. What is ResultSet in jdbc? and describe the flow how to get data using JDBC

   ResultSet represents the result set of a database query. A ResultSet object maintains a cursor that points to the current row in the result set. 

   JDBC consists of 7 elements that are known as connection steps:
   1	Import the package 
   2	Load and Register the drivers 
   3	Establish the connection 
   4	Create the statement 
   5	Execute the statement 
   6	Process Result
   7	Close/terminate

10. What is the ORM framework?

    1) Hibernate
    Hibernate 框架是一个全表映射的框架。通常开发者只要定义好持久化对象到数据库表的映射关系，就可以通过 Hibernate 框架提供的方法完成持久层操作。

    开发者并不需要熟练地掌握 SQL 语句的编写，Hibernate 框架会根据编制的存储逻辑，自动生成对应的 SQL，并调用 JDBC 接口来执行，所以其开发效率会高于 MyBatis 框架。

    然而Hibernate框架自身也存在一些缺点，例如：
    多表关联时，对 SQL 查询的支持较差；
    更新数据时，需要发送所有字段；
    不支持存储过程；
    不能通过优化 SQL 来优化性能。

    这些问题导致其只适合在场景不太复杂且对性能要求不高的项目中使用。

    2) MyBatis
    MyBatis 框架是一个半自动映射的框架。这里所谓的“半自动”是相对于 Hibernate 框架全表映射而言的，MyBatis 框架需要手动匹配提供 POJO、SQL 和映射关系，而 Hibernate 框架只需提供 POJO 和映射关系即可。

    与 Hibernate 框架相比，虽然使用 MyBatis 框架手动编写 SQL 要比使用 Hibernate 框架的工作量大，但 MyBatis 框架可以配置动态 SQL 并优化 SQL、通过配置决定 SQL 的映射规则，以及支持存储过程等。对于一些复杂的和需要优化性能的项目来说，显然使用 MyBatis 框架更加合适。

    MyBatis 框架可应用于需求多变的互联网项目，如电商项目；Hibernate 框架可应用于需求明确、业务固定的项目，如 OA 项目、ERP 项目等。

11. Learn how to use ObjectMapper by this example.

a. https://github.com/TAIsRich/chuwa-eij-tutorial/blob/main/02-java-core/src/main/java/com/chuwa/exercise/oa/api/FoodOutletJackson.java

```java
FoodOutlet foodOutlet = objectMapper.readValue(resBody, FoodOutlet.class);
String s = objectMapper.writeValueAsString(foodOutlet);
objectMapper.readTree() // learn how to use it?
```



12. What is the serialization and desrialization?

a. https://hazelcast.com/glossary/serialization/

![Serialization-Deserialization Diagram](https://hazelcast.com/wp-content/uploads/2021/12/serialization-deserialization-diagram-800x318-1.png)

13. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].

    ```java
    import java.util.*;
    
    public class MyClass {
         public static void main(String[] args) {
            List<Integer> list = Arrays.asList(20, 3, 78, 9, 6, 53, 73, 99, 24, 32);
            
            double ans = list.stream()
                .mapToDouble(Integer :: intValue)
                .average()
                .getAsDouble();
        
            System.out.println(ans);
        }
    }
    
    //Another method
    import java.util.*;
    import java.util.stream.IntStream;
    
    public class MyClass {
         public static void main(String[] args) {
            IntStream stream = IntStream.of(20, 3, 78, 9, 6, 53, 73, 99, 24, 32);
            
            double ans = stream.average()
                .getAsDouble();
        
            System.out.println(ans);
        }
    }
    ```

14. 抄写，https://github.com/TAIsRich/springboot-redbook/tree/03_post_pageable，你也可以像我一样分branch添加新代码。

    

15. (Optional) 抄写 https://github.com/TAIsRich/springboot-redbook/tree/04_comment你也可以像我一样分branch添加新代码。

16. (Optional) Try to write the CRUD api for a new application Cassandra-Blog

a. spring 提供了相关dependency,(https://start.spring.io/)

​	i. **Spring Data for Apache Cassandra** 

b. Cassandra十分流行，且面试问的多。