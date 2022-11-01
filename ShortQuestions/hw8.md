###### 2. how do you do the debug?
- Check log of error information in IDE
- Add breakpoint to the code and run in debug mode, check variable status

###### 3. What is DTO, VO, Payload, DO?
```
DTO -> Data Transfer Object, an object that is used to encapsulate data, and send it from one subsystem of an application to another, usually between View layer and Service layer.
VO -> Value Object, basically a Java object
Payload -> the data you are interested in transporting to the server when you make an API request. DTOs are stored in payload package. 
DO -> Data Object, the same as Entity
```

###### 4. What is @JsonProperty("description_yyds") (不会的话，课上问)?
The ``@JsonProperty`` annotation is used to map property names with JSON keys during serialization and deserialization. By default, if you try to serialize a POJO, the generated JSON will have keys mapped to the fields of the POJO.

###### 5. do you know what is jackson?
Jackson is a high-performance JSON processor used for Java. It is the most popular library used for serializing Java objects or Map to JSON and vice-versa. It is completely based on Java. 

###### 6. What is spring-boot-stater?
Spring Boot Starters are dependency descriptors that can be added under the <dependencies> section in pom. xml. There are around 50+ Spring Boot Starters for different Spring and related technologies. 

- what dependecies in the below starter? do you know any starters?
```
Spring Boot Starter Web is used for building RESTful applications using Spring MVC.
Spring Boot JPA is a Java specification for managing relational data in Java applications. It allows us to access and persist data between Java object/ class and relational database.
  ```

###### 7. do you know @RequestMapping(value = "/users", method = RequestMethod.POST) ? could you list CRUD by this style?
- @RequestMapping(value = "/users", method = RequestMethod.GET)
- @RequestMapping(value = "/users/{id}, method = RequestMethod.GET)
- @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
- @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)

###### 8. What is ResponseEntity? why do we need it?
ResponseEntity represents the whole HTTP response: status code, headers, and body. As a result, we can use it to fully configure the HTTP response. If we want to use it, we have to return it from the endpoint; Spring takes care of the rest. 

###### 9. What is ResultSet in jdbc? and describe the flow how to get data using JDBC
The SQL statements that read data from a database query, return the data in a result set. A ResultSet object maintains a cursor that points to the current row in the result set. The term "result set" refers to the row and column data contained in a ResultSet object.
workflow - 
1. load JDBC Driver
2. connect to DB
3. define SQL statement
4. create a statement object
5. use statement object to execute SQL statement
6. get ResultSet's data to java object
7. close connections and other resource

###### 10. What is the ORM framework?
ORM (Object–relational mapping) in computer science is a programming technique for converting data between type systems using object-oriented programming languages. This creates, in effect, a "virtual object database" that can be used from within the programming language.

###### 11. Learn how to use ObjectMapper by this example.

###### 12. What is the serialization and desrialization?
  ````
Serialization is the process of converting a data object - a combination of code and data represented within a region of data storage—into a series of bytes that saves the state of the object in an easily transmittable form. In this serialized form, the data can be delivered to another data store (such as an in-memory computing platform), application, or some other destination.
The reverse process - constructing a data structure or object from a series of bytes - is deserialization. The deserialization process recreates the object, thus making the data easier to read and modify as a native structure in a programming language.
Serialization and deserialization work together to transform/recreate data objects to/from a portable format.
  ````

###### 13. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32]
  ```
List<Integer> list = Arrays.asList(20, 3, 78, 9, 6, 53, 73, 99, 24, 32);
double avg = list.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
System.out.println(avg);
  ```
