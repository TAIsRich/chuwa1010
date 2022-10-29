# Homework 7

### 1.  create a file to list all of the annotaitons you learned and known, and explain the usage and how do you understand it. you need to update it when you learn a new annotation. Please organize those annotations well, like annotations used by entity, annotations used by controller.
    1.  File name: annotations.md
    2.  you'd better also list a code example under the annotations. 
Please see *annotations.md*
### 2.  explain how the below annotaitons specify the table in database?
```Java
@Column(columnDefinition = "varchar(255) default 'John Snow'")
private String name;
  
@Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
private String studentName;
```
 1. First column annotation specifies a column with an SQL statment that the data type is VARCHAR with length 255 and defualt value "John Snow"
 2. Second column annotation specifies a column with java parameters that explictly defines column name, length, and not allow null value and allow repeating value
### 3.  What is the default column names of the table in database for  @Column ?
```Java
@Column
private String firstName;
@Column
private String operatingSystem;
```
They will become first_name and operating_system adhering to SQL conventions.
### 4.  What are the layers in springboot application? what is the role of each layer?
1. Controller: receives requests and directs them to defined methods in service layer
2. Service: defines the business logic in different methods that sends a data request to the persistence level
3. Persistence: is also called Data Access Object that defines ways to access data stored in database
### 5.  Describe the flow in all of the layers if an API is called by Postman.
A controller receives a request and initiate actions defined in service level. The service level creates a DTO from the defined model class. The DTO is then send to persistance level to be field with actual data and then send back to service level, where a data check will be performed if defined and then send back to controller level with a http request status. The controller returns the data and http status to front end.
### 6.  What is the application.properties? do you know application.yml?
It defines parameters needed for a DAO to access the database. The application.yml can stored more than 1 such set of parameters in case a different enviroment.
### 7.  Create a Project, name it with mongo-blog, write a POST API for mongo-blog, change database to MongoDB;
    1.  https://www.mongodb.com/compatibility/spring-boot
Please see *MavenProject\mongo-blog*
### 8.  In your redbook application, write the code for RUD APIs.
    1.  https://github.com/TAIsRich/springboot-redbook.git
    2.  Branch: 02_post_RUD
    3.  you need to call the new APIs in your postman.
    4.  You need to type it line by line and try your best to understand it. DO NOT COPY PASTE
Please see *MavenProject\redbook*