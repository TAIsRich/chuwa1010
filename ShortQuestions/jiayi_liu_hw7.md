1. #### **create a file to list all of the annotaitons you learned and known,and explain the usage and how do you understand it. you need to update it when you learn a new annotation. Please organize those annotations well, like annotations used by entity, annotations used by controller.**

   

   File name: annotations.md

   you'd better also list a code example under the annotations. 

   

   Please see this question answer in **annotations.md**

   

2. #### explain how the below annotaitons specify the table in database?

   ```java
   @Column(columnDefinition = "varchar(255) default 'John Snow'")
   private String name;
     
   @Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
   private String studentName;
   ```

​		The first `@Column` set up a column that is varchar with length of 255 and its default value is John Snow

​		The second `@Column` set up a column named STUDENT_NAME in database, and length. It cannot be null but allow duplicates.

3. #### What is the default column names of the table in database for @Column ?

   ```java
   @Column
   private String firstName;
   @Column
   private String operatingSystem;
   ```

   According to SQL conventions, the default names would be first_name and operating_system.

4. #### What are the layers in springboot application? what is the role of each layer?

   - **Presentation Layer**: A JSON structure is made up of viewpoints. A front layer is what is seen from the outside and a back layer is where the structure is built from viewpoints. It interprets JSON and handles authentication and HTTP requests. After authentication, it enters the business layer for further processing.

   - **Business Layer**: As part of business logic, it manages all of the business decisions and performs the business validation and consent. For example, only admins may modify the customer’s account.

   - **Persistence Layer**: All of the storage logic in this program, including database questions, is accounted for in this portion of code. It also translates between database rows and company items.

   - **Database Layer**: he structure is constructed in this way: The HTTP request or internet requests are handled by the Controllers from the demonstration layer, the providers control the company logic, as well as also the repositories preserve persistence (storage logic). Each provider, service, and repository may be controlled by a single Controller. There are many repositories, which may be managed by many repositories, and databases may be managed by many databases.

     Reference: https://www.interviewbit.com/blog/spring-boot-architecture/

5. #### Describe the flow in all of the layers if an API is called by Postman.

   Presentation layer: Controller receives a HTTP JSON formatted request and then pass it to business layer

    Business layer: handles the request from controller and created a DTO and then tranform the DTO to entity.

   Persistence layer: tranform entity class into actual database and did CRUD operations.

   Database layer: the actual CURD operations happened.

   Finally, it also send reposonse back to controller with required information and http status.

6. #### What is the application.properties? do you know application.yml?

   #### **application.properties**

   Spring Boot Framework comes with a built-in mechanism for application configuration using a file called **application.properties**. It is located inside the **src/main/resources** folde. we can use the application.properties file to: 

   - Configure the Spring Boot framework
   - define our application custom configuration properties

   There are **sixteen** categories of Spring Boot Property are as follows:

   - Core Properties
   - Cache Properties
   - Mail Properties
   - JSON Properties
   - Data Properties
   - Transaction Properties
   - Data Migration Properties
   - Integration Properties
   - Web Properties
   - Templating Properties
   - Server Properties
   - Security Properties
   - RSocket Properties
   - Actuator Properties
   - DevTools Properties
   - Testing Properties

   #### application.yml

   Spring Boot provides another file to configure the properties is called **yml** file. Instead of using the application.properties file, we can also use the application.yml file, but the **Yml** file should be present in the classpath.

   **Example of application.yml**

   ```java
   spring:  
   application:  
   name: demoApplication  
   server:  
   port: 8081  
   ```

   

7. #### Create a Project, name it with mongo-blog, write a POST API for mongo-blog, change database to MongoDB;

   ```
   https://www.mongodb.com/compatibility/spring-boot
   ```

   Please see *MavenProject\mongo-blog*

8. #### In your redbook application, write the code for RUD APIs.

   Please see *MavenProject\redbook*
