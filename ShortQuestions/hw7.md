###### 1. create a file to list all of the annotaitons you learned and known, and explain the usage and how do you
understand it. you need to update it when you learn a new annotation. Please organize those annotations
well, like annotations used by entity, annotations used by controller.
	1. File name: annotations.md
	2. you'd better also list a code example under the annotations

###### 2. explain how the below annotaitons specify the table in database?
The data type of the name column in the table defined earlier is varchar(255) and its default value is 'John Snow'.
The predefined length of the studentName column is 50, cannot be null, can have duplicates

###### 3. What is the default column names of the table in database for @Column ?
first_name
operating_system

###### 4. What are the layers in springboot application? what is the role of each layer?
- Presentation Layer – Authentication & Json Translation
- Business Layer – Business Logic, Validation & Authorization
- Persistence Layer – Storage Logic
- Database Layer – Actual Database

###### 5. Describe the flow in all of the layers if an API is called by Postman.
The client handles the HTTP requests (PUT or GET).
The controller receives the request, and it handles it. Then, it passes the request to the service logic if necessary.
All business logic is implemented in the service layer. It performs the logic on the data that is mapped to JPA using model classes.
An error is not reported to the user when a JSP page is returned to the application.

###### 6. What is the application.properties? do you know application.yml?
application.properties file is used to write the application-related property into that file. This file contains the different configuration which is required to run the application in a different environment, and each environment will have a different property defined by it.
application.yml is also a application configure file. Some differences between application.properties and application.yml are listed below - 
- .properties stores data in sequential format, whereas .yml stores data in hierarchical format.
- .properties supports only key-value pairs (basically string values), whereas .yml supports key-value pair, as well as map, list & scalar type values.
- .properties is specifically used by Java, whereas .yml can be used by other languages (eg Java, Python, ROR, etc).
When managing multiple configuration profiles, then:
- .properties requires you to create .properties file per every profile, whereas in .yml you can create a section for each specific profile inside a single .yml file.
- In Spring projects, @PropertySource annotation can only be used with .properties.

###### 7. Create a Project, name it with mongo-blog, write a POST API for mongo-blog, change database to
MongoDB;
	1. https://www.mongodb.com/compatibility/spring-boot

###### 8. In your redbook application, write the code for RUD APIs.
1. https://github.com/TAIsRich/springboot-redbook.git
1. Branch: 02_post_RUD
2. you need to call the new APIs in your postman.
3. You need to type it line by line and try your best to understand it. DO NOT COPY PASTE
