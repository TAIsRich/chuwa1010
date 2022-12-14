# HW AOP-Batch-Swagger
## 1. List all of the annotations you learned from class and homework to annotaitons.md

## 2. Briefly reading: https://www.techgeeknext.com/spring-boot/spring-aop-intervie w-questions

## 3. What is the Aspect Oriented Programming?
Aspect Oriented Programming(AOP) is a programming paradigm that aims to increase modularity by allowing the separation of cross-cutting concerns.
## 4. What are the advantages and disadvantages of Spring AOP?
Advantages: APO isolates the concerns of your application, reduces code clutter, and improves the maintainability and readability of your code.
It is non-invasive, not touching our code or business logic.
It is implemented in pure Java.
It uses Spring's IOC for dependency injection. Aspects can be configured as normal spring beans.
It weaves cross cutting concerns into the classes, without making a call to the cross cutting concerns from those classes.
Centralize or modularize the cross cutting concerns.
Provision to create aspects using schema based(XML configuraiton) or @AspectJ annotation based style.
Easy to configure.
(https://www.jbktutorials.com/spring-aop/advantages-of-spring-aop.php#gsc.tab=0)

Disadvantages:
A little difficult to debug the AOP based application code.
Only method level advising is supported, doesn't support field level interception.
Only methods with public visibility will be advised.
A little runtime overhead, but its negligible.
Aspects cannot advise other aspects.
(https://www.jbktutorials.com/spring-aop/disadvantages-of-spring-aop.php#gsc.tab=0)

## 5. What is Aspect in Spring AOP?
Aspect is the class to define all AOP self methods.

## 6. What is Pointcut in Spring AOP?
PointCut is the expression to find all main application methods to insert AOP.

## 7. What is the Join point in Spring AOP?
A join point is an individual place where you can execute code with AOP, such as "when a method throws an exception."
A pointcut is a collection of join points, such as "when a method in class Foo throws an exception."

## 8. What does it mean by Advice and its types in Spring AOP?
Advice is the before/after/around/afterThrowing.It tells when to execute AOP methods when the application pointcut is found.
@Before: run before the method (matching with pointcut expression) execution
@After: run after the method returned a result
@AfterReturning: run after the method returned a result, intercept the returned result as well.
@AfterThrowing: run after the method throws an exception.
@Around: run around the method execution, combine all three advices above.

## 9. What is Spring AOP Proxy?
It is an object created by AOP framework in order to implement the aspect contracts(advise method executions and so on.)

## 10. Briefly Reading: https://www.javainuse.com/spring/sprbatch_interview

## 11. When to use Spring Batch?
Jobs that can run without end user interaction, or can be scheduled to run as resources permit, are called batch jobs.
The Spring boot batch chunk aids in the configuration of execution. Spring batch includes reusable functions such as logging/tracing,
transaction management, job processing statistics, job restart, skip, and resource management that are necessary when processing
large volumes of records.

## 12. How Spring Batch works?
Spring batch follows the traditional batch architecture where a job repository does the work of scheduling and interacting with the job.
A job can have more than one step. And every step typically follows the sequence of reading data, processing it and writing it.

## 13. How can we schedule a Spring Batch Job?
1. Create Spring Batch jobs
2. Add tasks to your job using Tasklets
3. Define all the job-related configuration and execution logic in the config.
4. Configure Spring Batch jobs in two ways:
   using the @EnableScheduling annotation;
   creating a method annotated with @Scheduled and providing recurrence details with the job. Then add the job execution logic inside this method.
5. Trigger Spring Batch jobs
   (https://hevodata.com/learn/spring-batch-scheduling/)

## 14. What is Swagger?
Swagger allows you to describe the structure of your APIs so that machines can read them. 
It is a set of open-source tools built around the OpenAPI specification that can help you design, build, document and consume REST APIs.