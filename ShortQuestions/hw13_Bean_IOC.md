# HW 13
## 1. List all of the annotations you learned from class and homework to annotaitons.md
## 2. What is Spring and Springboot? What is the benfits of using Srpingboot?
- Spring is an application development framework in Java. Main features of Spring includes Spring MVC, JDBC, Security, ORM, AOP, Test, Web Flow, etc..
- Spring Boot is an extension of Spring, which eliminates the boilerplate configurations required for setting up a Spring application. Featuring default codes and annotation based configuration, Spring Boot enables a faster and more efficient development ecosystem.
- 
## 3. What is IOC and What is DI?
**IOC: Inversion of Control.**
The IoC container that is also known as a DI Container is a framework for implementing automatic dependency injection very effectively. It manages the complete object creation and its lifetime, as well as it also injects the dependencies into the classes.
Spring IoC (Inversion of Control) Container is the core of Spring Framework. It creates the objects, configures and assembles their dependencies, manages their entire life cycle. The Container uses Dependency Injection(DI) to manage the components that make up the application. It gets the information about the objects from a configuration file(XML) or Java Code or Java Annotations and Java POJO class. These objects are called Beans. Since the Controlling of Java objects and their lifecycle is not done by the developers, hence the name Inversion Of Control. The followings are some of the main features of Spring IoC,
- Creating Object for us,
- Managing our objects,
- Helping our application to be configurable,
- Managing dependencies
**DI: Dependency Injection.**
- It is used to implement IOC.
It is a way to achieve Inversion of control (IoC) in our application by moving objects binding from compile time to runtime.
- 
## 4. What is @ComponentScan?
@ComponentScan is used to desine which package spring need to scan.
```java
@Configuration
@ComponentScan(basePackages = {"com.chuwa.springbasic"})
public class BeanConfig {

    /**
     * bean 名是方法名
     */
    @Bean
    public JpaChuwa myDataNucleus() {
        return new DataNucleusChuwaNoComponent();
    }
}
```
## 5. How to define which package spring need to scan in xml and annotaiton?
In annotation: @ComponentScan
Example: @ComponentScan(basePackages = {"com.chuwa.springbasic"})
In xml：<context:component-scan base-package="packageName"/>, as the example below:
```java
<context:component-scan base-package="com.chuwa.springbasic"/>
    <bean id="dataNucleusChuwaNoComponent" class = "com.chuwa.springbasic.components.impl.DataNucleusChuwaNoComponent"></bean>
```
## 6. What is @SpringbootApplication?
@SpringBootApplication anotation is used to mark a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning.
A single @SpringBootApplication annotation can be used to enable three features including:
- @Configuration, which declares a class as the source for bean definitions.
- @EnableAutoConfiguration, which allows the application to add beans using classpath definitions.
- @ComponentScan, which directs Spring to search for components in the path specified.

## 7. How many ways we can define a bean?
**Class level:**
    @Component
    @Service
    @Repository
    @Controller
**Method level:**
@Bean (used with @Configuration) together. See the example in question 8.
**XML**
```java
<bean id="dataNucleusChuwaNoComponent" class="com.chuwa.springbasic.components.impl.DataNu
cleusChuwaNoComponent"></bean>
```

## 8. What is default bean name for @Component and @Bean?
- default bean name for @Component is class name converting the first character to lower case.
- default bean name for @Bean is method name converting the first character to lower case.

It the method name under @Bean. As in the example below, the bean name is "modelMapper", and the type is "ModelMapper".
```java
@Configuration
public class CommonConfig {
   //当需要把第三方lib放入到IOC容器时候，则会用@Bean
    // "modelmapper" -> new ModelMapper();
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
```
## 9. What is the difference between @component and @service,@repository?
They are mostly the same, except that they are used for different layers(service, repository, controller). @Component is generic.
All of the three annotations are class-level. They are define beans.
**@Component** is a generic stereotype for any Spring-managed component. It is used to mark a Java class as a bean. A Java class annotated with @Component is found during the classpath.
The Spring Framework pick it up and configure it in the application context as a Spring Bean.
**@Service** annotates classes at the service layer. It tells the Spring that class contains the business logic.
**@Repository** annotates classes at the persistence layer, which will act as a database repository. The repository is a DAOs (Data Access Object) that access the database directly. The repository does all the operations related to the database.

## 10. How many annotaitons we can use to inject the bean?
Dependency Injection: tell Spring to inject the bean for this variable.
1. @Autowired: by type > by name
2. @Resource: by name > by type
3. @Inject
Priority: @Qualifier > @Primary > By Name > throw exception(NoUniqueBeanDefinitionException)

## 11. Tell me the three types to do dependency injection(How can we inject the beans in Spring)? Which way is better and why?
The three types are constructor injection, setter injection and field injection. Constructor(or setter) injection is better becuase it could reduce circular dependencies.
1. constructor injection 
When the annotation @Autowired is used on top of the class constructor, it is referred to as Constructor-based Dependency Injection.
Example 1:
```java
@Autowired
public DependencyInjectionTypesConstructor(JpaICC jpaICC) {
        this.jpaICC = jpaICC;
    }
```
Example 2:
```java
@Configuration
public class AppConfig {
    @Bean
    public Item item1() {
        return new ItemImpl1();
    }
    @Bean
    public Store store() {
        return new Store(item1());
    }
}
```
2. setter injection
Example 1:
```java
@Autowired
public void setJpaICC(JpaICC jpaICC) {this.jpaICC = jpaICC;}
```
Example 2:
```java
@Bean
public Store store() {
    Store store = new Store();
    store.setItem(item1());
    return store;
}
```
3. field injection
```java
@Autowired 
private JpaICC jpaICC;
```
## 12. If we have multiple beans for one type, how to set one is primary? and how to let the spring to pick one bean to inject if no primary.
Use @Primary to set the primary bean
If there is no primary bean, we can use @Qualifier annotation to find the bean.
The priority of finding a bean is:
@Qualifier > @Primary > By name > throw Exception

## 13. What is the difference between BeanFactory and ApplicationContext in Spring?
The ApplicationContext comes with advanced features, including several that are geared towards enterprise applications, while the BeanFactory comes with only basic features. Therefore, it's generally recommended to use the ApplicationContext, and we should use BeanFactory only when memory consumption is critical.

The application context interface extends BeanFactory to enhance the functionality of BeanFactory.

## 14. What is the Scope of a Bean? and list the examples for each scope.
Basic(通用):
- Singleton: For a bean with the default singleton scope, Spring first checks if a cached instance of the bean already exists, and only creates a new one if it doesn't.
- prototype: If we're using the prototype scope, the container returns a new bean instance for each method call.
Web (只有web applicaiton用)
- Request 
- Session 
- Applicaiton 
- Websocket

1. singleton. This scopes the bean definition to a single instance per Spring IoC container (default).
2. prototype. This scopes a single bean definition to have any number of object instances.
3 request. This scopes a bean definition to an HTTP request. Only valid in the context of a web-aware Spring ApplicationContext.
4. session. This scopes a bean definition to an HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.
5 global-session. This scopes a bean definition to a global HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.

## 15. Configure a bean using xml. If bean has parameters/dependencies, how can we configure the bean? (you can google the tutorial how to configure beans in xml, and feel free to ask me any quesitons if you don't understand. it is a little bit old, I am not sure if I need to exaplain it in class)
```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/context https://www.springframework.org/schema/context/spring-context.xsd">

    <context:component-scan base-package="com.chuwa.springbasic"/>
    <bean id="dataNucleusChuwaNoComponent" class = "com.chuwa.springbasic.components.impl.DataNucleusChuwaNoComponent"></bean>
</beans>
```
```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

</beans>
```
**If bean has parameters/dependencies:**
//https://www.tutorialspoint.com/spring/constructor_based_dependency_injection.htm

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- arguments -->
    <bean id = "example" class = "X.Y.Example">
      <constructor-arg index = "0" value = "1"/>
      <constructor-arg index = "1" value = "aaa"/>
   	</bean>
    
    <!-- dependency -->
    <bean id = "a" class = "X.Y.A">
      <constructor-arg ref = "b"/>
   	</bean>

   	<bean id = "b" class = "X.Y.B">
    </bean>

</beans>
```