
2. explain how the below annotaitons specify the table in database?
    
    The Column annotation will map to the database table, it will have data type var and 255 byte, and default 
    value John Snow.
    The Student cname column's lenghth is 50, and can't be null or unique

---
   @Column(columnDefinition = "varchar(255) default 'John Snow'")
   private String name;
   @Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
   private String studentName;
---
3. What is the default column names of the table in database for  @Column ?
--- it will be the entity's variable name
   @Column
   private String firstName;
   @Column
   private String operatingSystem;
4. What are the layers in springboot application? what is the role of each layer?
   Presentation Layer – Authentication & Json Translation
   Business Layer – Business Logic, Validation & Authorization
   Persistence Layer – Storage Logic
   Database Layer – Actual Database
5. Describe the flow in all of the layers if an API is called by Postman.
  call the API->service->storage
6. What is the application.properties? do you know application.yml?
   yml stores data in hierarchical format. .properties supports only key-value pairs 




