In this branch,
1. add new dependencies in pom.
```xml
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-validation</artifactId>
</dependency>
```

## Validation
add annotation for fields
* com.chuwa.redbook.payload.PostDto

* com.chuwa.redbook.payload.CommentDto
  add @Valid for RequestBody in controller

* com.chuwa.redbook.controller.PostController

* com.chuwa.redbook.controller.CommentController

* com.chuwa.redbook.exception.GlobalExceptionHandler override handleMethodArgumentNotValid method

## Actuator

add dependency

```java
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starteractuator</artifactId>
</dependency>
```

add application.properties

```java
# actuator, JMX
management.endpoints.web.exposure.include=*
```

