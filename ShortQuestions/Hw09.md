Hw9 (hw42-Spring-Data)

#### 1. List all of the annotations you learned from class and homework to annotaitons.md
#### 2. Type the Comment feature for the class project.
#### 3. In postman, call of the APIs in PostController and CommentController.
#### 4. what is JPA? and what is Hibernate?
JPA:

* JPA is only a specification, it is not an implementation.
* It is a set of rules and guidelines to set interfaces for implementing object-relational mapping, .
* It needs a few classes and interfaces.
* It supports simple, cleaner, and assimilated object-relational mapping.
* It supports polymorphism and inheritance.
* Dynamic and named queries can be included in JPA.

Hibernate:
* Hibernate is an implementation of JPA guidelines.
* It helps in mapping Java data types to SQL data types.
* It is the contributor of JPA.
#### 5. What is Hikari? what is the benefits of connection pool?
Hikari is a JDBC DataSource implementation that provides a connection pooling mechanism.

A connection pool is a cache of database connections maintained so that the connections can be reused when future requests to the database are required. 
Connection pools may significantly reduce the overall resource usage
#### 6. What is the @OneToMany, @ManyToOne, @ManyToMany? write some examples.
**@OneToOne**

Defines a single-valued association to another entity that has one-to-one multiplicity
Eg. Each student has one tuition, and if the student is not exist, the tuition shouldn't have
```java
// Student Table:
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true, fetch=FetchType.LAZY)
    private Tuition tuition;

    /* Getters and setters */
}

// Tuition Table:

@Entity
@Table(name = "tuition")
public class Tuition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double fee;

    //what column in Tuition table has the FK
    @JoinColumn(name = "student_id")
    @OneToOne(fetch = FetchType.LAZY)
    private Student student;

    /* Getters and setters */
}
```

**@ManyToOne**

a single-valued association to another entity class that has many-to-one multiplicity
Eg. many student can have the same university
```java
// University Table:
@Entity
@Table(name = "university")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "university", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Student> students;

    /* Getters and setters */
}

// Student Table:
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "university_id")
    private University university;

    /* Getters and setters */
}
```
**@ManyToMany**

A relationship is a connection between two types of entities. In the case of a many-to-many relationship, both sides can relate to multiple instances of the other side.
Eg. classes and students are many to many relationship
```java
// course table:
@Entity
@Table(name="course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double fee;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;

    /* Getters and setters */
}

// student table:
@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "student_course",
            joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "course_id")}
    )
    private Set<Course> courses;

    /* Getters and setters */
}
```
#### 7. What is the cascade = CascadeType.ALL, orphanRemoval = true? and what are the other CascadeType and their features? In which situation we choose which one?
`cascade = CascadeType.ALL` : it will do all actions(PRESIST, REMOVE, REFRESH, MERGE)

`orphanRemoval = true`: It marks "child" entity to be removed when it's no longer referenced from the "parent" entity, 
    e.g. when you remove the child entity from the corresponding collection of the parent entity.

other CascadeType:

`PERSIST`: When persisting an entity, also persist the entities held in its fields.

`MERGE`: When merging entity state, also merge the entities held in this field.

`REMOVE`: When deleting an entity, it also deletes the entities held in this field.

`REFRESH`: When refreshing an entity, also refresh the entities held in this field.

`DETACH`: When we use CascadeType.DETACH, the child entity will also get removed from the persistent context.
#### 8. What is the fetch = FetchType.LAZY, fetch = FetchType.EAGER? what is the difference? In which situation you choose which one?
`fetchType.LAZY` : only fetch the related entities from the database when you use the relationship.

`fetch = FetchType.EAGER`: loading of collections means that they are fetched fully at the time their parent is fetched.
 ```
 LAZY = fetch when needed
 EAGER = fetch immediately
 ```
#### 9. What is the rule of JPA naming convention? Shall we implement the method by ourselves? Could you list some examples?
JPA can implement methods according to table names and key words entered
#### 10. Try to use JPA advanced methods in your class project. In the repository layer, you need to use the naming convention to use the method provided by JPA.
#### 11. Check out a new branch(https://github.com/TAIsRich/springboot-redbook/tree/h w02_01_jdbcTemplate) from branch 02_post_RUD, replace the dao layer using JdbcTemplate.