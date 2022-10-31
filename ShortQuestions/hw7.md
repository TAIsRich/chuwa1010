### 1. create a file to list all of the annotations you learned and known, and explain the usage and how do you understand it. You need to update it when you learn a new annotation. Please organize those annotations well, like annotations used by entity, annotations used by controller.
1) file name: **annotations.md**
2) you'd better also list a **code example** under the annotations


### 2. explain how the below annotations specify the table in database?
```
@Column(columnDefinition = "varchar(255) default 'John Snow'")
private String name;
@Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
private String studentName;
```
- The `@Column` annotation is used to specify the details of the column to which a field or property will be mapped.  
  - `name` attribute: permits the name of the column to be explicitly specified.
  - `length` attribute: permits the size of the column used to map a value particularly for a String value.
  - `nullable` attribute: permits the column to be marked NOT NULL when the schema is generated.
  - `unique` attribute: permits the column to be marked as containing only unique values.
- explain how the above annotations
  - First `@Column` annotation: the data type is VARCHAR, its length is 255 and its default value is "John Snow".
  - Second `@Column` annotation: the column name is STUDENT_NAME, length is 50, it does not allow null value, and it can have the same name.


### 3. What is the default column names of the table in database for @Column ?
```
@Column
private String firstName;
@Column
private String operatingSystem;
```
- the default column names of the table in database for @Column:  
  - first_name
  - operating_system


### 4. What are the layers in spring boot application? what is the role of each layer?
- Presentation Layer: authentication, JSON translation
- Business Layer: business logic, validation, and authorisation
- Persistence Layer: storage logic
- Database Layer: actual databbase


### 5. Describe the flow in all of the layers if an API is called by Postman.
- When an API is called by Postman, the flow would be:
  - Controller receives the request
  - Then Service gets the mapping information from Controller. In Service, we will map to entity and DTO for these information.


### 6. What is the application.properties? do you know application.yml?
- **application.properties**
  - The application.properties file is located in the src/main/resources directory. The application.properties file is used to write the application-related property into that file. This file contains the different configuration which is required to run the application in a different environment, and each environment will have a different property defined by it. Inside the application properties file, we define every type of property like changing the port, database connectivity, connection to the eureka server, and many more.
- **application.yml**
  - The application.properties file is not that readable. So developers choose application.yml file over application.properties file. YAML is a superset of JSON, and is a convenient format for specifying hierarchical configuration data. YAML is more readable, and it is good for the developers to read/write configuration files.


### 7. Create a Project, name it with mongo-blog, write a POST API for mongo-blog, change database to MongoDB.
In mongo-blog directory.  

POST 127.0.0.1:8080/api/v1/posts  
Request body:
```
{
    "title": "this is title 2",
    "description": "this is description 2",
    "content": "this is content 2..."
}
```

mongodb cmd: db.posts.find({})


### 8. In your redbook application, write the code for RUD APIs.
- Read(GET): `http://localhost:8080/api/v1/posts/`
- Read(GET): `http://localhost:8080/api/v1/posts/{id}`
- Update(PUT): `http://localhost:8080/api/v1/posts/{id}`
- Delete(DELETE): `http://localhost:8080/api/v1/posts/{id}`