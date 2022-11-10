# hw42 Exception-Validation

*1. List all of the annotations you learned from class and homework to*
*annotaitons.md*

*2. what is the @configuration and @bean?*

Configuration: Annotating a class with the @Configuration annotation indicates that the class will be used by JavaConfig as a source of bean definitions. 

@Bean is a method-level annotation and a direct analog of the XML <bean/> element.

The annotation supports most of the attributes offered by bean. To declare a bean, simply annotate a method with the `@Bean` annotation. When JavaConfig encounters such a method, it will execute that method and register the return value as a bean within a `BeanFactory`. By default, the bean name will be that of the method name (see [bean naming](https://docs.spring.io/spring-javaconfig/docs/1.0.0.m3/reference/html/creating-bean-definitions.html#bean-naming) for details on how to customize this behavior).

*3. How do you handle the exception in Spring?*

1. Controller Based - We can define exception handler methods in our controller classes. All we need is to annotate these methods with @ExceptionHandler annotation. This annotation takes Exception class as argument. So if we have defined one of these for Exception class, then all the exceptions thrown by our request handler method will have handled. These exception handler methods are just like other request handler methods and we can build error response and respond with different error page. We can also send JSON error response, that we will look later on in our example. If there are multiple exception handler methods defined, then handler method that is closest to the Exception class is used. For example, if we have two handler methods defined for IOException and Exception and our request handler method throws IOException, then handler method for IOException will get executed.
2. Global Exception Handler - Exception Handling is a cross-cutting concern, it should be done for all the pointcuts in our application. We have already looked into Spring AOP and that’s why Spring provides @ControllerAdvice annotation that we can use with any class to define our global exception handler. The handler methods in Global Controller Advice is same as Controller based exception handler methods and used when controller class is not able to handle the exception.
3. HandlerExceptionResolver - For generic exceptions, most of the times we serve static pages. Spring Framework provides HandlerExceptionResolver interface that we can implement to create global exception handler. The reason behind this additional way to define global exception handler is that Spring framework also provides default implementation classes that we can define in our spring bean configuration file to get spring framework exception handling benefits. SimpleMappingExceptionResolver is the default implementation class, it allows us to configure exceptionMappings where we can specify which resource to use for a particular exception. We can also override it to create our own global handler with our application specific changes, such as logging of exception messages.

*4. How do you do the validations in Spring?*

Steps:

*1. import dependecy*

*<dependency>*
*<groupId>org.springframework.boot</groupId>*
*<artifactId>spring-boot-starter-validation</artifactId>*
*<version>2.7.0</version>*
*</dependency>* 
*2. Add validation Rule to payload*

*3. Add @valid to controller to apply the Rule* 

1. Check it in Postman

1. *What is the actuator?*
A tool that monitors the applicaiton. You can use it by adding it into dependencies.

*<dependency>*
*<groupId>org.springframework.boot</groupId>*
*<artifactId>spring-boot-starteractuator</*
*artifactId>*
*</dependency>*