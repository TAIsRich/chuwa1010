2. ```java
   @Column(columnDefinition = "varchar(255) default 'John Snow'")
   private String name;
   ```

   Defines a column which the type is varchar(255) and having a default value "John Snow"

   ```java
   @Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
   private String studentName;
   ```

   Defines a column which the name is "STUDENT_NAME", length is 50, can't be null and can have duplicate value

3. first_name and operating_system

4. 

   - Presentation layer: Authentication and JSON translation
   - Business layer: Business logic, validation and authorization
   - Persistence layer: Storage logic
   - Database: Actual database

5. The controller at the presentation layer receives the request from the client and call the service at the business layer, the service send the dto to the persistence layer, the persistence layer communicate with the database to get the data and save it in the dto, then the dto is been send back to the service and do the checks, then it would been send back to the controller.

6. application.properties is a file to store the application configuration properties of spring boot. application.yml is another way to do these configurations which is more readable.