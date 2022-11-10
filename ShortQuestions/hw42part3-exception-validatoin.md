## HW12 Exception and Validation

1. **List all of the annotations you learned from class and homework to annotaitons.md**


2. **what is the @configuration and @bean?**

   @configuration:Indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean.  
   @bean:applied on a method to specify that it returns a bean to be managed by Spring context.




3. **How do you handle the exception in Spring?**

   Define an exception handler class using annotation @ControllerAdvice, where each exception class is defined with a method for a specific return behavior by using @ExceptionHandler.



4. **How do you do the validations in Spring?**

    Using validation dependency. Add annotation in domain class. Add @valid in controller.


5. **What is the actuator?**

   Actuator is a tool used to monitor the application.



   