﻿_1. See Annotation.md in the same folder.

_2. explain how the below annotaitons specify the table in database?_
```
@Column(columnDefinition="varchar(255) default 'John Snow'")

private String name;

@Column(name="STUDENT_NAME",length=50,nullable=false,unique=false)

private String studentName;
```

- 1. it defines the "name" column, whose string type is varchar(255) and default value "John Snow"
- 2. it defines the "studentName" column, whose value length is 50, value can not be null, and don't need to be unique

_3. What is the default column names of the table in database for_ _@Column_ _?_
```
@Column
private String firstName;
@Column
private String operatingSystem;
```
- 1. firstName
- 2. operatingSystem

_4. What are the layers in springboot application? what is the role of each layer?_

- 1. Presentation Layer - controller, handles the HTTP requests and performs authentication. It is responsible for converting the JSON field’s parameter to Java Objects and vice-versa.
- 2. Business Layer - service class, contains all the business logic. 
- 3. Persistence Layer - contains all the database storage logic. It is responsible for converting business objects to the database row and vice-versa.
- 4. Database Layer - contains all the databases (can be more than one)

_5. Describe the flow in all of the layers if an API is called by Postman._

- build project:
	- Initializing a Spring Boot Project
	- Connecting to the Database
	- Creating a User Model
	- Creating Repository Classes
	- Creating a Controller
	- Compile, Build and Run.

- when an API is called:
	- controller layer receive the request
	- send request to the service layer for further process
	- DAO manage the data stored in database per request
	- return result

_6. What is the application.properties? do you know application.yml?_

- application.properties files are used to keep 'N' number of properties/configuration in a single file to run the application in a different environment. The application.properties file is located in the src/main/resources directory.

- As well as Java properties files, we can also use YAML-based configuration files in our Spring Boot application. YAML is a convenient format for specifying hierarchical configuration data. This can be more readable than its property file alternative since it does not contain repeated prefixes.



