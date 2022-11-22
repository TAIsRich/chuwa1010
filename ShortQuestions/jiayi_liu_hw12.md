1. #### **List all of the annotations you learned from class and homework to annotaitons.md**

   Please see it in annotations.md

2. #### **What is Spring and Springboot? What is the benfits of using Srpingboot?**

   **Spring** is the most popular application developmemt framework in Java with a major feature that supports dependy injection, allowing developing loosely coupled applications. 

   **<u>Benefits of Spring</u>**

   - Can be used for all layers of application development

   - Quite lightweight considering the POJO model

   - **Allows loose coupling** and easy testing

   - Supports declarative programming

   - Supports XML and annotation configurations

   - Provides middleware services

     

   **Spring boot** extends from **Spring**, and it does offer all the features and benefits of Spring. Spring Boot aims to reduce code length and provides developers with the easiest way to build an appliction.

   

3. #### **What is IOC and What is DI?**

   **Inversion of Controll ** Container is the core of Spring framework, and it creates the objects, configures and assembles their dependencies, manages their entire life cycle.

   Dependency Injection (DI) is a design pattern used to implement IoC. It **allows the creation of dependent objects outside of a class and provides those objects to a class through different ways**. 

   

4. #### **What is @CompnonentScan?**

   We use **@ComponentScan** to tell Spring where to search classes with anotations that could become Spring beans in IOC container.

   - **@ComponentScan without Argument**

     ***@ComponentScan* without arguments tells Spring to scan the current package and all of its sub-packages.**

     ```java
     @Configuration
     @ComponentScan
     public class SpringComponentScanApp {
         private static ApplicationContext applicationContext;
     
         @Bean
         public ExampleBean exampleBean() {
             return new ExampleBean();
         }
     
         public static void main(String[] args) {
             applicationContext = 
               new AnnotationConfigApplicationContext(SpringComponentScanApp.class);
     				
           	//get all beans from our IOC container
             for (String beanName : applicationContext.getBeanDefinitionNames()) {
                 System.out.println(beanName); 
               //it will print springComponentScanApp, cat, dog, rose, exampleBean
             }
         }
     }
     
     //Cat and Dog components in com.baeldung.componentscan.springapp.animals package:
     package com.baeldung.componentscan.springapp.animals;
     @Component
     public class Cat {}
     
     package com.baeldung.componentscan.springapp.animals;
     @Component
     public class Dog {}
     
     //Rose component in com.baeldung.componentscan.springapp.flowers package:
     package com.baeldung.componentscan.springapp.flowers;
     @Component
     public class Rose {}
     
     /**
     *the output will be: 
     * springComponentScanApp
     * cat
     * dog
     * rose
     * exampleBean
     */
     ```

     

   - **@SpringBootApplication combines three anotatons together - @Configuration, @EnableAutoConfigration, @ComponentScan**

     

     **@Configuration** declares a class as the source for bean definitions

     **@EnableAutoConfiguration** allows the application to add beans using classpath definitions

     **@ComponentScan** sirect Spring to search for components in the path specified

     ```java
     package com.baeldung.componentscan.springbootapp;
     // create a similar structure but using @SpringBootApplication
     @SpringBootApplication
     public class SpringBootComponentScanApp {
         private static ApplicationContext applicationContext;
     
         @Bean
         public ExampleBean exampleBean() {
             return new ExampleBean();
         }
     
         public static void main(String[] args) {
             applicationContext = SpringApplication.run(SpringBootComponentScanApp.class, args);
             checkBeansPresence(
               "cat", "dog", "rose", "exampleBean", "springBootComponentScanApp");
     
         }
     
         private static void checkBeansPresence(String... beans) {
             for (String beanName : beans) {
                 System.out.println("Is " + beanName + " in ApplicationContext: " + 
                   applicationContext.containsBean(beanName));
             }
         }
     }
     
     /**
     *the output will be: 
     * springComponentScanApp
     * cat
     * dog
     * rose
     * exampleBean
     */
     ```

   - **@Component with Arguments**

     Now let's customize the paths for scanning. For example, let's say we want to exclude the *Rose* bean.

     ```java
     @ComponentScan(basePackages = "com.baeldung.componentscan.springapp.animals")
     @Configuration
     public class SpringComponentScanApp {
        // ...
     }
     
     /**
     *the output will be: 
     * springComponentScanApp
     * cat
     * dog
     * exampleBean
     */
     ```

     

5. #### **How to define which package spring need to scan in xml and annotaiton?**

   **XML**

   ```xml
   <bean id="componentName"  class="ComponentName"></bean>
   ```

   **annotation**

   ```java
   @Bean //method level
   @Component
   @Service
   @Controller
   @Repository
   @ControllerAdvice
   ```

   

6. #### **What is @SpringbootApplication?**

   `@SpringbootApplication` is the combination of `@Configuration`, `@EnableAutoConfiguration`, and `@ComponentScan`, which defines a class as the source for bean definitions, enable classpath definitions for bean scan, and directs the scane folder to the current class path.

   

7. #### **How many ways we can define a bean?**

   **Class Level**

   ```java
   @Component
   @Service
   @Repository
   @Controller
   @ControllerAdvice
   ```

   **Method Level**

   ```java
   @Bean //used with @Configuration
   ```

   **XML**

   ```xml
   <bean id="componentName"  class="ComponentName"></bean>
   ```

   

8. #### **What is default bean name for @Component and @Bean?**

   The default bean name for `@Component` is the class name with first letter lower-cased.

   The default bean name for `@Bean` is the method name.

   

9. #### **What is the difference between @component and @service,@repository?**

   - ***@Component*** is a **generic stereotype** for any Spring-managed component.

   - ***@Service*** annotates classes **at the service layer**.

   - ***@Repository*** annotates classes **at the persistence layer**, which will act as a database repository.

     

10. #### **How many annotaitons we can use to inject the bean?**

    ```java
    @Autowired //search for bean in the container By Type-> By Name
    
    @Resource  //search for bean in the container By Name -> By Type
    
    @Inject
    ```

    

11. #### **Tell me the three types to do dependency injection(How can we inject the beans** in Spring)? Which way is better and why?

    - Constructor Injection

    - Setter Injection

    - Field Injection

      In terms of safety, the constructor injection is the best way among these three ways. However, field injection is most popular way in the industry as it requires least codes.

      

12. #### **If we have multiple beans for one type, how to set one is primary? and how to let the spring to pick one bean to inject if no primay.**

    **@Qualifier -> @Primary -> By Bean name -> throws exception**

    

13. #### **What is the difference between BeanFactory and ApplicationContext in Spring?**

    ApplicationContext interface is the advanced container that enhances BeanFactory functionality in a more framework-oriented style. 

    While the **BeanFactory provides basic functionality for managing and manipulating beans**, often in a programmatic way, **the ApplicationContext provides extra functionality** like MessageSource, Access to resources, Event propagation to beans, Loading of multiple (hierarchical) contexts etc.

    

    **BeanFactory**

    - Bean instantiation/wiring

      In BeanFactory, the autowire mode for a bean definition is specified by using the ‘**autowire’** attribute of the **<bean/>** element in an XML-based configuration file.

      ```xml
      <bean id="welcomeBean" class="com.geeks.beans.WelcomeBean" autowire="byName"/>
      ```

    

    **Application Context**

    - Bean instantiation/wiring

      In ApplicationContext, we can use the annotation **“@Autowired”** on top of properties or setter methods in the bean class.

      ```java
      @Autowired
      private String name;
      
      ```

    - **BeanPostProcessors** Registration & **BeanFactoryPostProcessors** Registration

    - MessageSource Access

    - ApplicationEvent publication

      

14. #### **What is the Scope of a Bean? and list the examples for each scope.**

    **Bean Scopes** refers to the lifecycle of Bean that means when the object of Bean will be instantiated, how long does that object live, and how many objects will be created for that bean throughout. Basically, it controls the instance creation of the bean and it is managed by the spring container.

    **Basic**

    1. **Singleton** (By default), such as service, controller, and repository. 

       Only one instance will be created for a single bean definition per Spring IoC container and the same object will be shared for each request made for that bean.

    2. **Prototype**, such as DTO.

        new instance will be created for a single bean definition every time a request is made for that bean.

       **WEB:**

       1. **Request**

          A new instance will be created for a single bean definition every time an HTTP request is made for that bean. But Only valid in the context of a web-aware Spring ApplicationContext.

       2. **Session**

          Scopes a single bean definition to the lifecycle of an HTTP Session. But Only valid in the context of a web-aware Spring ApplicationContext.

          

15. #### **Configure a bean using xml. If bean has parameters/dependencies, how can we configure the bean? (you can google the tutorial how to configure beans in xml, and feel free to ask me any quesitons if you don't understand. it is a little bit old, I am not sure if I need to exaplain it in class)**

    - Use `<import resource="dependencies.xml"/>` to import external beans defined in other file
    - Use `<property name="dependency" ref="publicBean"/>` to import specific dependency for a bean
    - Use `<property name="parameter" value = "samplePara"/>` to define a defualt value for a parameter