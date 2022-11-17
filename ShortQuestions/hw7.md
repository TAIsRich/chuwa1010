### explain how the below annotations specify the table in database?
```
@Column(columnDefinition = "varchar(255) default 'John Snow'")
private String name;
@Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
private String studentName;
```
the column name is 'name', the value type is varchar(255), the default value is 'John Snow'

the colum name is 'STUDENT_NAME', the length is 50, the variable cannot be null and is not unique

### What is the default column names of the table in database for @Column?
```
@Column
private String firstName;
@Column
private String operatingSystem;
```
the default column name is 'first-name', 'operating-system'

### What are the layers in springboot application? what is the role of each layer?
- Presentation Layer – Authentication & Json Translation
- Business Layer – Business Logic, Validation & Authorization
- Persistence Layer – Storage Logic
- Database Layer – Actual Database

### Describe the flow in all of the layers if an API is called by Postman.
The Presentation Layer get the http request, and the controller(API) handle the request and 
sent it to Business Layer, where services are done. Then it performs the necessary data CRUD through DAO and changed are made in database.
In this process, we use Model and DTO to map data structure. Finally return a response.

### What is the application.properties? do you know application.yml?

Application properties are configurable application parameters to change an application's behavior

application.yml supports multi-document files by design, and this way, we can store multiple profiles in the same file no matter which version of Spring Boot we use