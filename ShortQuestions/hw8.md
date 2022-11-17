### how do you do the debug?
1. Define where the program needs to be stopped: BreakPoints
2. Run the program in debug mode
3. Use the debugger to get the information about the state of the program and how it changes during running

### What is DTO, VO, Payload, DO?
1. A DTO, also referred to as Data Transfer Object, encapsulates values to carry data between processes or networks.

DTOs have flat structures without any business logic. They use the same format as that of POJOs. 
A DTO only contains storage, accessors, and methods related to serializing or parsing.
DTOs basically map to a domain model and thus send data to a method or a server.

2. VO, also known as the Value Object, is a special type of object that can hold values such as java.lang.Integer and java.lang.Long.
3. Payload is the essential information in a data block that you send to or receive from the server when making API requests. The Payload can be sent or received in a variety of formats, including JSON
4. DTO是一个比较特殊的对象，他有两种存在形式：

   在后端，他的存在形式是java对象，也就是在controller里面定义的那个东东，通常在后端不需要关心怎么从json转成java对象的，这个都是由一些成熟的框架帮你完成啦，比如spring框架

   在前端，他的存在形式通常是js里面的对象（也可以简单理解成json），也就是通过ajax请求的那个数据体

### What is @JsonProperty("description_yyds")
@JsonProperty is used to mark non-standard getter/setter method to be used with respect to json property.
(https://stackoverflow.com/questions/12583638/when-is-the-jsonproperty-property-used-and-what-is-it-used-for)

###do you know what is jackson?

```xml
<dependency>
  <groupId>com.fasterxml.jackson.core</groupId>
  <artifactId>jackson-databind</artifactId>
  <version>2.13.3</version>
  <scope>compile</scope>
</dependency>
```

Jackson is **a suite of data-processing tools for Java**. It allows to read and write data in JSON, Avro, BSON, CBOR, CSV, Smile, (Java) Properties, Protobuf, XML or YAML format. Jackson is auto-configured. It comes with the spring-boot-starter-json.  It has built in Object Mapper class which parses json files and deserializes it to custom java objects. It helps in generating json from java objects.

### What is spring-boot-stater?
Spring Boot Starters are dependency descriptors that can be added under the <dependencies> section in pom. xml. There are around 50+ Spring Boot Starters for different Spring and related technologies. These starters give all the dependencies under a single name

  ```xml
   <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
   </dependency>
   ```

Web.



### do you know @RequestMapping(value = "/users", method =RequestMethod.POST) ? could you list CRUD by this style?

Use the @RequestMapping annotation to map different HTTP requests to their respective controller methods.

Post: @RequestMapping(value = "/users", method = RequestMethod.POST)

Read: @RequestMapping(value = "/uesrs", method = RequestMethod.GET)

Update: @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)

Delete: @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)

### What is ResponseEntity? why do we need it?
   ```
   new ResponseEntity<>(postResponse, HttpStatus.OK); 
   new ResponseEntity<>(postResponse, HttpStatus.CREATED);
   ResponseEntity.ok(postService.getPostById(id));
   ```

ResponseEntity represents the whole HTTP response: status code, headers, and body.
We can use it to fully configure the HTTP response.

### What is ResultSet in jdbc? and describe the flow how to get data using JDBC
ResultSet represents the result set of a database query. A ResultSet object maintains a cursor that points to the current row in the result set.

JDBC consists of 7 elements that are known as connection steps:
1	Import the package
2	Load and Register the drivers
3	Establish the connection
4	Create the statement
5	Execute the statement
6	Process Result
7	Close/terminate

### What is the ORM framework?
Basically, the ORM framework/software generates objects (as in OOP) that virtually map (like the map of a city) the tables in a database. Then you as a programmer, would use these objects to interact with the database. So the main idea, is to try and shield the programmer from having to write optimized SQL code – the ORM generated objects take care of that for you.

### What is the serialization and desrialization?
(https://hazelcast.com/glossary/serialization/)

### use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].
```
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
```


### 