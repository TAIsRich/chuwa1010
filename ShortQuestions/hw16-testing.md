# HW 16 Testing 
## 1. List all of the new learned annotations to your annotations.md

## 2.  what is selenium(YouTube)?
The test is based on user-behavior simulation.
Selenium is a open source automated testing suite for web applications across different browsers and platforms.
Selenium is a browser automation framework. It provides several tools and APIs for automating user interaction on pure HTML 
and JavaScript applications in browsers such as Internet Explorer, Mozilla Firefox, Google Chrome, Safari, etc. 
However, Selenium does not support rich internet application (RIA) technologies such as Silverlight, Flex or Flash, and JavaFX.

## 3.  what is cucumber(youtueb)?
Cucumber testing is **a behavior-driven development (BDD) technique.** BDD is an approach to software development that focuses on 
defining the behavior of an application as concrete examples before writing the code. This helps developers to understand how the application should behave.
Cucumber was developed to make it easier for developers and testers to work together on behavior-driven development projects. 
It is based on the principle that tests should be written in a language everyone on the team can understand.

## 4.  what is JMeter(youtube)?
Apache JMeter is an Apache project that can be used as a load testing tool for analyzing and measuring the performance of a variety of services, with a focus on web applications.

## 5.  what is unit-test?
Unit-test involves the testing of each unit or an individual component of the software application.
The purpose is to validate that each unit of the software code performs as expected.
Unit testing is done during development of an application by the developers.
Unit may be an individual function, method, procedure, module and object.

## 6.  What is the lifecircle of Junit?
@BeforeAll: class level setup
@BeforeEach: Setup
@Test: test execution
@AfterEach: clean up
@AfterAll: class level cleanup

## 7. Is @BeforeAll method should be Class level(static)?
Yes. Because all the class need to use the @BeforeAll method.

## 8.  What is Mockito? and what is its limitations?
Mockito is a JAVA-based library used for unit testing applications. 
This open-source library plays an important role in automated unit tests for the purpose of test-driven development or behavior-driven development. 
It uses a mock interface to add dummy functionality in the unit testing. It also uses Java reflection to create mock objects for an interface to test it.
The limitation:
**It cannot mock constructors or static methods, or private methods.** PowerMokito could mock private methods.
It requires Java version 6 plus to run.
It also cannot mock equals(), hashCode() methods.
VM mocking is only possible on VMs that are supported by Objenesis.

## 9.  What is @Mock and what is @InjectMocks?
@Mock: it is used to mock the objects.
@InjectMocks:creates an instance of the class and injects the mocks that are created with the @Mock annotations into this instance; inject mockdata into method.

## 10. What is the stubbing?
**Mocks and stubs** are fake Java classes that replace these external dependencies. These fake classes are then instructed before the test starts to behave as you expect.
**A stub** is a fake class that comes with preprogrammed return values. It’s injected into the class under test to give you absolute control over 
what’s being tested as input. A typical stub is a database connection that allows you to mimic any scenario without having a real database.
**A mock** is a fake class that can be examined after the test is finished for its interactions with the class under test.

reference: https://semaphoreci.com/community/tutorials/stubbing-and-mocking-with-mockito-2-and-junit

## 11. what is Mockito ArgumentMatchers
Argument matchers are mainly used for performing flexible verification and stubbing in Mockito. 
It extends ArgumentMatchers class to access all the matcher functions. Mockito uses **equal()** as a legacy method for verification and matching of argument values.
```java
Mockito.when(postRepositoryMock.save(ArgumentMatchers.any(Post.class)))
                .thenReturn(post);
Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
        .thenReturn(Optional.of(post));
```

## 12. what is Hamcrest Matchers
Hamcrest is a framework for writing matcher objects allowing ‘match’ rules to be defined declaratively.

## 13. do you know @spy? what is difference between @spy and @Mock?
Mocks are used to create fully mock or dummy objects. It is mainly used in large test suites. 
Spies are used for creating partial or half mock objects.
```java
 @Spy
    private ModelMapper modelMapper;
```

## 14. briefly reading this articles
    a. https://www.javatpoint.com/examples-of-mockito-and-junit-in-eclipse
    -ide
    b. https://www.javatpoint.com/junit-tutorial
    c.  https://www.javatpoint.com/testng-tutorial
    d.  https://www.javatpoint.com/jmeter-tutorial
 