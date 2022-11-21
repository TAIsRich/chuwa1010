1. #### **List all of the annotations you learned from class and homework to annotaitons.md**

   Please see annotations.md

2. #### **what is the @configuration and @bean?**

   

   Annotating a class with the **@Configuration** indicates that the class can be used by the Spring IoC container as a source of bean definitions. 

   

   The **@Bean** annotation tells Spring that a method annotated with @Bean will return an object that should be registered as a bean in the Spring application context.

   

   **@Bean** is usullay used in thid-party packages(**method level**), as we normally use @Component, @Service, @Controller and @Repository(**class level**) in our own source code.

   

3. #### **How do you handle the exception in Spring?**

   By handling the exceptions in Spring, we could define a global exception handler class by using **@ControllerAdvice**, in which each exception class would be defined in its methods by using **@ExceptionHandler(SpecficException.class)**

   

4. #### **How do you do the validations in Spring?**

   In the DTO POJOs, we use annotations like **@NotEmpty, @Email, @Size** to set up rules for the attributes

   On the Controller layer, we could use **@Valid** to check inputs from client requests using the rules that we set up in the DTO layers 

   

5. #### **What is the actuator?**

   - Spring Boot’s ‘Actuator’ dependency is used to monitor and manage the Spring web application.

   - We can use it to monitor and manage the application with the help of HTTP endpoints or with the JMX.

     

6. #### **watch those videos(泛泛地看一遍，能理解多少是多少。千万千万不要看其它的视频，会走火入魔晕乎乎的)**

   a. Spring 简介: https://www.youtube.com/watch?v=l0MqsOADAUE&list=PLmOn9nNkQxJFbsU4Qz8CdRiVM4Qs3ci75&index=64

   b. IOC/DI: https://www.youtube.com/watch?v=PyMxNr2p0C0&list=PLmOn9nNkQxJFbsU4Qz8CdRiVM4Qs3ci75&index=65

   c. IOC container: https://www.youtube.com/watch?v=pLa77Tw-yyI&list=PLmOn9nNkQxJFbsU4Qz8CdRiVM4Qs3ci75&index=66

   d. Bean:

   ​	https://www.youtube.com/watch?v=OpgMHzM7tgQ&list=PLmOn9nNkQxJFbsU4Qz8CdRiVM4Qs3ci75&index=67

   ​	https://www.youtube.com/watch?v=OpgMHzM7tgQ&list=PLmOn9nNkQxJFbsU4Qz8CdRiVM4Qs3ci75&index=68

   ​	https://www.youtube.com/watch?v=OpgMHzM7tgQ&list=PLmOn9nNkQxJFbsU4Qz8CdRiVM4Qs3ci75&index=69

​		e. DI:

​			https://www.youtube.com/watch?v=OpgMHzM7tgQ&list=PLmOn9nNkQxJFbsU4Qz8CdRiVM4Qs3ci75&index=67

​			https://www.youtube.com/watch?v=OpgMHzM7tgQ&list=PLmOn9nNkQxJFbsU4Qz8CdRiVM4Qs3ci75&index=68

​			https://www.youtube.com/watch?v=MgTpBST9onM&list=PLmOn9nNkQxJFbsU4Qz8CdRiVM4Qs3ci75&index=70

​			https://www.youtube.com/watch?v=yhEWZx2i1BA&list=PLmOn9nNkQxJFbsU4Qz8CdRiVM4Qs3ci75&index=71