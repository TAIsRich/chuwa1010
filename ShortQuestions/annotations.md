**Java common use**

1.

@Override: The child class implements the methods from the parent class.

```Java
public class Shape {
    public double getPerimeter(){
        return 0;
    }

}

public class Rectangle extends Shape {
    //Inheritance
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {

        return length + width;
    }

}


```

2. @FunctionalInterface: ensure that the functional interface can’t have more than one abstract method. It will throw errors if more than one abstract methods.
	
	
	```Java
	@FunctionalInterface
	public interface Bar {
    String method(String string);

    default String defaultBar(){
        String s = "default Bar method";
        System.out.println(s);
        return s;
    }

    default String defaultCommon(){
        String s = "defaultCommon from Bar";
        System.out.println(s);
        return s;
    }
}
	```
	
3. @Test: tells JUnit that the public void method to which it is attached can be run as a test case

```Java
 @Test
    public void lambdaFoo(){
        Foo foo = parameter -> parameter + " from Foo";

        String hello = foo.method("Hello");
        System.out.println(hello);
    }
```

**Customized Annotations**

1. @Documented:  Indicates that annotations with a type are to be documented by javadoc and similar tools by default. This type should be used to annotate the declarations of types whose annotations affect the use of annotated elements by their clients. If a type declaration is annotated with Documented, its annotations become part of the public API of the annotated elements.

	@Target

	@Retention


2. @Entity: the class is an entity and is mapped to a database table

@Table annotation: specify the details of the table that will be used to persist the entity in the database

@UniqueConstraint: ensure that all values in a column are different.

@id: indicating the member field below is the primary key of the current entity.

@GeneratedValue: configure the way of increment of the specified column

```Java
@GeneratedValue(strategy = GenerationType.IDENTITY)
//specify auto_increment
```

@Column: adding the column the name in the table of a particular MySQL database

@CreationTimestamp, @UpdateTimestamp: make it easy to track the timestamp of the creation and last update of an entity. used in Hibernate.

3.

@ResponseStatus: mark a method or exception class with the status code and reason message that should be returned

4.

@SpringBootApplication: a collection including following annotations:

@EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism

@ComponentScan: enable @Component scan on the package where the application is located (see the best practices)

@Configuration: allow to register extra beans in the context or import additional configuration classes

5.

@Repository: a specialization of @Component annotation which is used to indicate that the class provides the mechanism for storage, retrieval, update, delete and search operation on objects

6.

@RestController: create RESTful web services using Spring MVC. Spring RestController takes care of mapping request data to the defined request handler method. Once response body is generated from the handler method, it converts it to JSON or XML response.

@RequestMapping: map web requests onto specific handler classes and/or handler methods. 

@Autowired: used for automatic dependency injection. Spring framework is built on dependency injection and we inject the class dependencies through spring bean configuration file.

@PostMapping, @GetMapping, @PutMapping, @DeleteMapping:

maps HTTP requests onto specific handler methods. It is a composed annotation that acts as a shortcut for 

E:@RequestMapping(method = RequestMethod. DELETE)

