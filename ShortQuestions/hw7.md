## 1. create a file to list all of the annotaitons you learned and known, and explain the usage and how do you understand it. you need to update it when you learn a new annotation. Please organize those annotations well, like annotations used by entity, annotations used by controller.

   1. Filename:**annotations.md**
   2. you'd better also list a **codeexample** under the annotations.

## 2. explain how the below annotaitons specify the table in database?

   ```java
   @Column(columnDefinition = "varchar(255) default 'John Snow'")
   private String name;
   @Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
   private String studentName;
   ```
   @Column
   This annotation specifies a column in the table, the column type, default value, the column name, length, 
   whether the database column is nullable, whether the column is a unique key. This is a shortcut for the UniqueConstraint 
   annotation at the table level and is useful for when the unique key constraint corresponds to only a single column. 
   This constraint applies in addition to any constraint entailed by primary key mapping and to constraints specified at the table level.

## 3. What is the default column names of the table in database for @Column?

   ```java
   @Column
   private String firstName;
   @Column
   private String operatingSystem;
   ```
Answer:
   first_name
   operating_system

## 4. What are the **layers** in springboot application? what is the **role** of each layer?

    1. **Presentation Layer** – Authentication & Json Translation
    2. **Business Layer** – Business Logic, Validation & Authorization
    3. **Persistence Layer** – Storage Logic
    4. **Database Layer** – Actual Database

   **1. Presentation Layer**

   The presentation layer is the top layer of the spring boot architecture. It consists of Views. i.e., the front-end part of the application. 
   It handles the HTTP requests and performs authentication. It is responsible for converting the JSON field’s parameter to Java Objects and vice-versa. 
   Once it performs the authentication of the request it passes it to the next layer. i.e., the business layer.

   **2. Business Layer**

   The business layer contains all the business logic. It consists of services classes. It is responsible for validation and authorization.

   **3. Persistence Layer**

   The persistence layer contains all the database storage logic. It is responsible for converting business objects to the database row and vice-versa.

   **4. Database Layer**

   The database layer contains all the databases such as MySql, MongoDB, etc. This layer can contain multiple databases. 
   It is responsible for performing the CRUD operations.

## 5. Describe the **flow in all of the layers** if an API is called by Postman.

   **PRESENTATION LAYER**

   This layer is at the top of the architecture. This tier is responsible for:

   ✔️ Performing authentication.

   ✔️ Converting JSON data into an object (and vice versa).

   ✔️ Handling HTTP requests.

   ✔️ Transfering authentication to the business layer.

   The presentation layer is the equivalent of the Controller class. The Controller class handles all the incoming REST API requests 
   (GET, POST, PUT, DELETE, PATCH) from the Client.

   **BUSINESS LAYER**

   The business layer is responsible for:

   ✔️ Performing validation.

   ✔️ Performing authorization.

   ✔️ Handling the business logic and rules.

   This layer is the equivalent to the Service class. It's where we handle the business logic. 
   In short, the business logic in software engineering is where we decide what the software needs to do. 
   An example of this is validation. If you are ever requested to validate something, this needs to happen inside the Service class.

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

## 6. What is the **application.properties**? do you know application.yml?

    .yml stores data in hierarchical format. 
   .properties supports only key-value pairs  ddl-auto: update

## 7. Create a Project, name it with **mongo-blog**, write a **POST API** for mongo-blog, change database to **MongoDB**;
   Tutorial: https://aws.plainenglish.io/building-a-rest-api-using-mongodb-and-spring-boot-c50b18ee6efa
See the mongo-blog project under folder "Coding".

## 8. In your **redbook** application, write the code for **RUD** APIs.
See the redBook project under folder "Coding".
