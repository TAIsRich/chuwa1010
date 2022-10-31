**2**

```Java
@Column(columnDefinition = "varchar(255) default 'John Snow'")
private String name;
@Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
private String studentName;

```
It specifies the column name as VARCHAR(255) type and default value as John Snow.

Then, it specifies the column studentName with length of 50. The value in this column should not be null. The name of student could be duplicated.


**3**

The default column names are first_name and operating_system

**4**

Presentation layer: Authentication and JSON translation

Business Layer: Bussiness logic, validation and authorization

Persistence Layer: storage logic

Database Layer: actual database

**5**

At first, the request from postmen is made. The request would be given into controller which is in the presentation layer.

Then, the request is sent to the service layer. JPA will be in charge of mapping these data with the spring boot model.

Finally, the response will be returned to postmen from the controller.

**6**

Application.properties is used to write the application-related property into that file. It could specify the server port, the url, the user of the database and corresponding password.
