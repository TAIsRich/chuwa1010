1. create a file to list all of the annotaitons you learned and known, and explain the usage and how do you understand it. you need to update it when you learn a new annotation. Please organize those annotations well, like annotations used by entity, annotations used by controller.

   \1. Filename:**annotations.md**

   \2. you'd better also list a **codeexample** under the annotations.

2. explain how the below annotaitons specify the table in database?

   ```java
   @Column(columnDefinition = "varchar(255) default 'John Snow'")
   private String name;
   @Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
   private String studentName;
   ```

   The SQL fragment that is used when generating the DDL for the column.
   Defaults to the generated SQL to create a column of the inferred type.

   Set name column with type varchar (255) and default value is 'John Snow'

   

   The name of the column. Defaults to the property or field name.

   The column length. (Applies only if a string-valued column is used.)

   Whether the database column is nullable.

   Whether the column is a unique key. This is a shortcut for the UniqueConstraint annotation at the table level and is useful for when the unique key constraint corresponds to only a single column. This constraint applies in addition to any constraint entailed by primary key mapping and to constraints specified at the table level.

3. What is the default column names of the table in database for @Column?

   ```java
   @Column
   private String firstName;
   @Column
   private String operatingSystem;
   ```

   Defaults to the property or field name. firstName and operatingSystem.

4. What are the **layers** in springboot application? what is the **role** of each layer?

   1. **Presentation Layer** – Authentication & Json Translation
   2. **Business Layer** – Business Logic, Validation & Authorization
   3. **Persistence Layer** – Storage Logic
   4. **Database Layer** – Actual Database

   ![Layers Of Spring Boot](https://media.geeksforgeeks.org/wp-content/uploads/20220306155306/Fig47.jpg)

   **1. Presentation Layer**

   The presentation layer is the top layer of the spring boot architecture. It consists of Views. i.e., the front-end part of the application. It handles the HTTP requests and performs authentication. It is responsible for converting the JSON field’s parameter to Java Objects and vice-versa. Once it performs the authentication of the request it passes it to the next layer. i.e., the business layer.

   **2. Business Layer**

   The business layer contains all the business logic. It consists of services classes. It is responsible for validation and authorization.

   **3. Persistence Layer**

   The persistence layer contains all the database storage logic. It is responsible for converting business objects to the database row and vice-versa.

   **4. Database Layer**

   The database layer contains all the databases such as [MySql](https://www.geeksforgeeks.org/sql-tutorial/), [MongoDB](https://www.geeksforgeeks.org/mongodb-an-introduction/), etc. This layer can contain multiple databases. It is responsible for performing the [CRUD](https://www.geeksforgeeks.org/spring-boot-crud-operations/) operations.

5. Describe the **flow in all of the layers** if an API is called by Postman.

   **PRESENTATION LAYER**

   This layer is at the top of the architecture. This tier is responsible for:

   ✔️ Performing authentication.

   ✔️ Converting JSON data into an object (and vice versa).

   ✔️ Handling HTTP requests.

   ✔️ Transfering authentication to the business layer.

   The presentation layer is the equivalent of the Controller class. The Controller class handles all the incoming REST API requests (GET, POST, PUT, DELETE, PATCH) from the Client.

   **BUSINESS LAYER**

   The business layer is responsible for:

   ✔️ Performing validation.

   ✔️ Performing authorization.

   ✔️ Handling the business logic and rules.

   This layer is the equivalent to the Service class. It's where we handle the business logic. If you're wondering what do we mean by "business logic", I found an interesting discussion on [StackExchange](https://softwareengineering.stackexchange.com/questions/234251/what-really-is-the-business-logic). In short, the business logic in software engineering is where we decide what the software needs to do. An example of this is validation. If you are ever requested to validate something, this needs to happen inside the Service class.

   The Business layer communicates with both the Presentation layer and the Persistence Layer.

   **PERSISTENCE LAYER**

   This layer is responsible for:

   ✔️ Containing storage logic.

   ✔️ Fetching objects and translating them into database rows (and vice versa).

   This layer is the equivalent of the Repository interface. We write database queries inside this interface.

   The Persistence layer is the only layer that communicates with the Business layer and the Database layer.

   **DATABASE LAYER**

   This layer is responsible for:

   ✔️ Performing database operations (mainly CRUD operations).

   This layer is simply the actual database that you decide to use to build your application.

6. What is the **application.properties**? do you know application.yml?

   As we already know Spring Boot is built on the top of the spring and contains all the features of spring. And is becoming a favorite of developers these days because it’s a rapid production-ready environment that enables the developers to directly focus on the logic instead of struggling with the configuration and set-up. In Spring Boot, whenever you create a new Spring Boot Application in spring starter, or inside an IDE (Eclipse or STS) a file is located inside the ***src/main/resources*** folder named as **application.properties** file which is shown in the below image as shown below as follows:

   ![img](https://media.geeksforgeeks.org/wp-content/uploads/20211201235244/appl1.PNG)

   What does this file do? What are the major roles of this file during development? So in a spring boot application, **application.properties** file is used to write the application-related property into that file. This file contains the different configuration which is required to run the application in a different environment, and each environment will have a different property defined by it. Inside the application properties file, we define every type of property like changing the port, database connectivity, connection to the eureka server, and many more. Now let’s see some examples for better understanding.

   

   ```
   spring.jpa.hibernate.ddl-auto=update
   spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/db_example
   spring.datasource.username=springuser
   spring.datasource.password=ThePassword
   spring.datasource.driver-class-name =com.mysql.jdbc.Driver
   ```

   ```java
   spring.data.mongodb.host=localhost
   spring.data.mongodb.port=27017
   spring.data.mongodb.database=BookStore
   ```

   ### application.yml/application.yaml file

   The application.properties file is not that readable. So most of the time developers choose application.yml file over application.properties file. YAML is a superset of JSON, and as such is a very convenient format for specifying hierarchical configuration data. YAML is more readable and it is good for the developers to read/write configuration files. For example, let’s pick some of the properties files that we have explained above, and let’s write them in YAML format.

   **Case 1:** Let’s pick above example where we were connecting with the MySQL Database**,** the corresponding properties will be as follows:

   ```java
   spring:
     datasource:
       url: jdbc:mysql://${MYSQL_HOST:localhost}:3306/db_example
       username: springuser
       password: ThePassword
       driver-class-name: com.mysql.jdbc.Driver
     jpa:
       hibernate:
         ddl-auto: update
   ```

7. Create a Project, name it with **mongo-blog**, write a **POST API** for mongo-blog, change database to **MongoDB**;

   \1. https://www.mongodb.com/compatibility/spring-boot

8. In your **redbook** application, write the code for **RUD** APIs.

   \1. https://github.com/TAIsRich/springboot-redbook.git 1. Branch:**02_post_RUD**

   \2. you need to call the new APIs in your postman.
    \3. You need to type it line by line and try your best to understand it. **DO NOT COPY PASTE**