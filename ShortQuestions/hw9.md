# Homework 9

### 1.  List all of the annotations you learned from class and homework to annotaitons.md
Please see *annotations.md*
### 2.  Type the Comment feature for the class project.
Please see *MavenProject\redbook-main*
### 3.  In postman, call of the APIs in PostController and CommentController.
### 4.  what is JPA? and what is Hibernate?
JPA is a Java persistance standard that maps a Java POJO to a table in relational database. Hibernate is the most popular implementation of the JPA standard interface.
### 5.  What is Hiraki? what is the benefits of connection pool?
Hikari is a JDBC DataSource implementation that provides connections pooling mechanism to allow connection reusage for improved efficiency.
### 6.  What is the  @OneToMany, @ManyToOne, @ManyToMany? write some examples.
1. `@OneToMany` means one record of a table is referenced via a foreign key by multiple rows of another table. An example is a state can be referenced by multiple cities that belong to this state.
2. `@ManyToOne` means multiple rows in a table all reference to another table's one record. An example is multiple comments can directly to only one post.
3. `@ManyToMany` means any relationship between the two tables are through two key column names whose combination determines the unique one-on-one relationship, which is usually stored in a intermediate table that matches every pair of keys. An example is course registration where a student can register multiple courses and one course can have multiple students.
### 7. What is the  cascade = CascadeType.ALL, orphanRemoval = true? and what are the other CascadeType and their features? In which situation we choose which one?
`cascade = CascadeType.ALL, orphanRemoval = true` guarantees the most strict cascade rules by doing the same operation on the related entity when it is performed on the owning entity as well as removing the related entity when the relationship is removed.
   Other cascade types include the following:
   - Persist: saves related entity when owning entity is saved
   - Merge: merges related entity when owning entity is merged
   - Refresh: refreshes related entity when owning entity is refreshed
   - Remove: removes related entity when owning entity is removed
   - Detach: detach related entity when owning entity is removed
### 8.  What is the  fetch = FetchType.LAZY, fetch = FetchType.EAGER? what is the difference? In which situation you choose which one?
`fetch = FetchType.LAZY` only fatches related data from database when it is needed, which should be used when access to related data is not frequent or a multi-thread enviroment when write to related data is frequent.
`fetch = FetchType.Eager` fathces all related data once from database, which should be used when access to the related data is frequent and writes done by another thread is not frequent enough to cause data delay.
### 9.  What is the rule of JPA naming convention? Shall we implement the method by ourselves? Could you list some examples?
JPA methods use save/find/delete to CRUD data and convert SQL column names to Camel-Case with SQL-like operators (And, Or, Between, etc.) to specify lookup conditions. We do not need to implement such methods. Examples include `findByFirstNameOrLastName(a,b)`, `findbyAgeBetween(a,b)`.
### 10. Try to use JPA advanced methods in your class project. In the repository layer, you need to use the naming convention to use the method provided by JPA.
Please see *MavenProject\redbook-main*
### 11. Check out a new branch(https://github.com/TAIsRich/springboot-redbook/tree/hw02_01_jdbcTemplate) from branch 02_post_RUD, replace the dao layer using JdbcTemplate.
Please see *MavenProject\redbook-jdbc*