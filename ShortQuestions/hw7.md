### 2
@Column annotation is used to specify the details of the column to which a field or property will be mapped.
```angular2html
@Column(columnDefinition = "varchar(255) default 'John Snow'")
private String name;
```
this would be definiting a name column to record names which can contain up to 255 characters, each row would has a default value 'John Snow'
```angular2html
@Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
private String studentName;
```
this would be definiting an attrubute named STUDENT_NAME, each value of STUDENT_NAME is not null but can be duplicate and contain up to 50 characters
### 3
first_name,operating_System
### 4
`Presentation Layer` interacts with users, give api to users to select operations. 

`Business Layer` most logic operations are united to this layer, and pack the filtered and operated data to presentation layer to protect the data.

`Persistence Layer` accesses data and we can do crud to table based on this layer

`Database Layer` database stores our data, persistence layer would pick layer from this layer 
### 5
presentation layer received a request from users, and then according to the postman restful api called, 
the presentation call the operations supported by business layer(service),
the service operated object that persistence layer transferred from database.
### 6
`application.properties` is file that used to configure the environment, like the .env file in nodejs

`application.yml` is another way to configure the environment in spring，the difference is that the yaml file use `key:value` to set a property instead of `key=value` 

