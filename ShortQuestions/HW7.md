## HW7 Spring Boot

1. Create a file to list all of the annotations you learned and known, and explain the usage and how do you understand it. you need to update it when you learn a new annotation. Please organize those annotations well, like annotations used by entity, annotations used by controller.
   	1. File name: annotations.md
   	1. you'd better also list a code example under the annotations.

2. Explain how the below annotations specify the table in database?

   ```java
   @Column(columnDefinition = "varchar(255) default 'John Snow'")
   private String name;
   ```

   Column: name

   sets the data type to archer(255) and creates a default value which is "John Snow"

   ```java
   @Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
   private String studentName;
   ```

   Column: STUDENT_NAME

   sets the name of the column, sets the length of name up to 50 characters, sets the column to not nullable, sets the column to not unique

3. What is the default column names of the table in database for @Column ?

   ```java
   @Column
   private String firstName;
   @Column
   private String operatingSystem;
   ```

   firstName, operatingSystem

   If we don't specify the annotation, the name of the column will be the name of the field

4. What are the layers in spring boot application? what is the role of each layer?
   - Presentation layer: It handles the HTTP requests, performs authentication, converts json to object
   - Business layer: It contains all business logics
   - Persistence layer: It contains all storage logics, converts business object to database row
   - Database layer: It contains all databases

5. Describe the flow in all of the layers if an API is called by Postman.

   The Postman `Client` makes the HTTP requests

   -> The request goes to `Controller`. Controller takes care of mapping request data to the defined request handler method which defined in `Service`. Once response body is generated from the handler method, it converts it to JSON response

   -> In the `Service` class, the business logic is performed. Mapping to entity & Mapping to DTO are performed in this layer. The request handler method will call `JpaRepository` to handle

   -> The `JpaRepository` contains API for CRUD operations which can be applied to our `database`

   -> The `database` is created by the entity class, and it's able to perform the CRUD operations

6. What is the application.properties? do you know application.yml?

   The `application.properties` file contains the configuration which is required to run the application in a different environment. Inside the file, we define the properties like the server port, database connectivity, and hibernate.

   Spring Boot supports YAML file so we can use application.yml file instead to specify the configurations. YAML is more readable and it is good for the developers to read and write the configuration file.

7. In your redbook application, write the code for RUD APIs.

​	GetAll:

![Screenshot 2022-11-06 at 10.18.32 PM](/Users/eillot/Desktop/Screenshot 2022-11-06 at 10.18.32 PM.png)

​	GetByID:

![Screenshot 2022-11-06 at 10.20.08 PM](/Users/eillot/Desktop/Screenshot 2022-11-06 at 10.20.08 PM.png)

​	Delete:

![Screenshot 2022-11-07 at 12.57.27 PM](/Users/eillot/Desktop/Screenshot 2022-11-07 at 12.57.27 PM.png)