#### 1. List all of the new annotations to your annotaitons.md and explain its role.
@PathVariable: handle template variables in the request URI mapping.

@RequestBody: maps the HttpRequest body to a transfer or domain object. enabling automatic deserialization of the
inbound HttpRequest body onto a java object.

#### 2. how do you do the debug?
1. click the right side of number of each line that you want to stop to get the result.
2. Check with error message if it has error

#### 3. What is DTO, VO, Payload, DO?
1. DTO: data transfer Object, carries useful data between processes / systems.
2. VO: value object
3. Payload: contains the data that could be stored or updated
4. DO: data object
#### 4. What is @JsonProperty("description_yyds") 
Add @JsonProperty to indicate the property name in JSON when we're dealing with non-standard getters and setters
```aidl
public class MyBean {
    public int id;
    private String name;

    @JsonProperty("name")
    public void setTheName(String name) {
        this.name = name;
    }

    @JsonProperty("name")
    public String getTheName() {
        return name;
    }
}
```


#### 5. do you know what is jackson?
Jaskson is used to map java objects to JSON format
```aidl
<dependency>
      <groupId>com.fasterxml.jackson.core</groupId>
      <artifactId>jackson-databind</artifactId>
      <version>2.13.3</version>
      <scope>compile</scope>
 </dependency>
```

#### 6. What is spring-boot-stater? 
1. we need to add the dependency in pom.xml
2. spring-boot-stater makes it easy to create stand-alone， production-grade spring based application s that you can just run.

##### what dependecies in the below starter? do you know any starters?
spring-boot-starter-web
1. other starter: spring-boot-starter-data-jpa, spring-boot-starter-data-mongodb
```
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-web</artifactId>
</dependency>

```


#### 7. do you know  `@RequestMapping(value = "/users", method = RequestMethod.POST)` ? could you list CRUD by this style?
1. use @RequestMapping to map different HTTP request in the controller class
2. CRUD:
   3. @RequestMapping(value = "/users", method = RequestMethod.POST)
   4. @RequestMapping(value = "/users", method = RequestMethod.GET)
   5. @RequestMapping(value = "/users", method = RequestMethod.PUT)
   6. @RequestMapping(value = "/users", method = RequestMethod.DELETE)

#### 8. What is ResponseEntity? why do we need it?
ResponseEntity is used to represent the whole http response such as status code, headers and body. And, we can use it to handle the http response
```
new ResponseEntity<>(postResponse, HttpStatus.OK);
new ResponseEntity<>(postResponse, 
HttpStatus.CREATED);
ResponseEntity.ok(postService.getPostById(id));
```

#### 9. What is ResultSet in jdbc? and describe the flow how to get data using JDBC
ResultSet is used to represent the set of database query. 
1. import the package
2. load driver
3. build connection
4. create query statement 
5. write query object
6. execute query using query statement 
7. process result 
8. terminate the connection

#### 10. What is the ORM framework?
ORM is Object relational mapping. It is used to convert data between different types of systems
#### 11. Learn how to use ObjectMapper by this example.
```aidl
FoodOutlet foodOutlet = 
objectMapper.readValue(resBody, FoodOutlet.class);
String s = 
objectMapper.writeValueAsString(foodOutlet);
objectMapper.readTree() // learn how to use it?
```
#### 12. What is the serialization and deserialization?
**serialization**: It is the process to covert the data object.

**deserialization**: It is the process to recreate the object.
#### 13. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].
```aidl
int[] arr = {20, 3, 78, 9, 6, 53, 73, 99, 24, 32};

arr.stream().average().getAsDouble();
```