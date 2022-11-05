1. #### List all of the annotations you learned from class and homework to annotaitons.md

   Please see in ShortQuestions/annotations.md

   

2. #### Type the Comment feature for the class project.

   please see in Coding/MavenProject/redbook

   

3. #### In postman, call of the APIs in PostController and CommentController.

   Finished in postman

   

4. #### what is JPA? and what is Hibernate?

   JPA is a Java persistance standard that maps java objects to database(Object Relative Mapping). JPA use JDBC to CRUD database, and also transfer result from database to Java Entities.

   

5. #### What is Hiraki? what is the benefits of connection pool?

   [Hikari](https://github.com/brettwooldridge/HikariCP) is a JDBC *DataSource* implementation that provides a connection pooling mechanism.

   Compared to other implementations, it promises to be lightweight and [better performing](https://github.com/brettwooldridge/HikariCP#jmh-benchmarks-checkered_flag). 

   

   Because it would cause a lot of resources if we frequently create and destory a connection with database.

   

6. #### What is the @OneToMany, @ManyToOne, @ManyToMany? write some examples.

   All of the annotations above describes data relationships.

   @OneToMany **means that one row in a table is mapped to multiple rows in another table.**

   For example, a school could have multiple buildings

   @ManyToOne **means that multiple rows in a table is mapped to one row in another table.**

   For example, many children might have same father.

   @ManyToMany **means that one row in a table is mapped to multiple rows in another table.**

   For example, one course have many students while a student also might enroll multiple courses.

   

7. #### What is the cascade = CascadeType.ALL, orphanRemoval = true? and what are the other CascadeType and their features? In which situation we choose which one?

   

   

   

8. What is the fetch = FetchType.LAZY, fetch = FetchType.EAGER? what is the difference? In which situation you choose which one?

   

9. What is the rule of JPA naming convention? Shall we implement the method by ourselves? Could you list some examples?

   

10. Try to use JPA advanced methods in your class project. In the repository layer, you need to use the naming convention to use the method provided by JPA.

    

11. Check out a new branch(https://github.com/TAIsRich/springboot-redbook/tree/h w02_01_jdbcTemplate) from branch 02_post_RUD, replace the dao layer using JdbcTemplate.

    

12. (Optional) use JDBC to read the data from database.