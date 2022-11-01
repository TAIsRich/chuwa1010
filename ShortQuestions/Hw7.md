Hw40-springboot (Hw7)
#### 2. explain how the below annotations specify the table in database?
```java
@Column(columnDefinition = "varchar(255) default 'John Snow'")
private String name;
@Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
private String studentName;
```
the column name is 'name', the value type is varchar(255), and the default value is 'JOhn Snow'

the colum name is 'STUDENT_NAME', the length is 10, the element cannot be null, and the element in column is not unique


#### 3. What is the default column names of the table in database for @Column?
```java
@Column
private String firstName;
@Column
private String operatingSystem;
```
the default column name is first-name, operating-system


#### 4. What are the layers in springboot application? what is the role of each layer?

**Presentation Layer**: handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business layer.

**Business Layer**: The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.

**Persistence Layer**: The persistence layer contains all the storage logic and translates business objects from and to database rows.

**Database Layer**:  In the database layer, CRUD (create, retrieve, update, delete) operations are performed.

#### 5. Describe the flow in all of the layers if an API is called by Postman.
the controller receives the HTTP request, and handle it. Then it passes the request to the service logic if necessary.
ALl business logic is implemented in the service layer, It performs the logic on the data that is mapped to JPA using model classes.
An error is not reported to the user when a JSP page is returned to the application.

#### 6. What is the application.properties? do you know application.yml?
Application properties are configurable application parameters to change an application's behavior

application.yml supports multi-document files by design, and this way, we can store multiple profiles in the same file no matter which version of Spring Boot we use