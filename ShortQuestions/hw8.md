### 2
target endpoint in code, and debug the program
### 3
`DTO` which is data transfer object, which have whole database entity data structure, all attributes in an entity would have its relative member in DTO. The reason we need this is that java can not operate the entity like object, we have to transfer  database entity to java object first

`VO`  View Object, object used in presentation layer

`Playload` playload is package contain the dtos.

`DO` data object which map to database entity has exact same data structure with entity.
### 4
@JsonProperty("description_yyds")  set member variable key name in JSON as  description_yyds;
### 5
Jackson is a package used for transfer java object to json.
### 6
spring-boot-stater would collect the dependencies the project using instead of adding them one by one

spring-boot-starter,spring-boot-starter-json, spring-boot-starter-tomcat,   spring-boot-starter-validation,    tomcat-embed-el,spring-web, spring-webmvc

starters in spring boot: https://www.geeksforgeeks.org/spring-boot-starters/
### 7
@RequestMapping(value = "/users", method = RequestMethod.POST)
The request url is {{website}}/users, the request method is post
@RequestMapping(value = "/users", method = RequestMethod.PUT)
@RequestMapping(value = "/users", method = RequestMethod.GET)
@RequestMapping(value = "/users", method = RequestMethod.DELETE)
### 8 
when our backend received a request, we might want to send a response to the sender,
in spring we can use ResponseEntity to response.

### 9
Since when we query use sql statement, we would have a list of data as result, the resultset is used to contain this list.
jdbcTemplate.query(sql_statement, new BeanPropertyRowMapper<Object> (Object.class));
### 10
ORM: Object–relational mapping, map object in java to database table entity

### 12
a mechanism provided in java allows Java to convert object information into bytes that includes the
object’s data and type.The process is called serialization.
deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. 
### 13. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].
ArrayList<Integer> arr = new ArrayList<>{Arrays.asList());
double average= arr.stream(),mapToDouble(Integer::intValue).average()..getAsDouble();
