package com.chuwa.redbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedbookApplication.class, args);
	}
	// Main Frame: Controller --call-->Service, Service--call-->DAO , DAO uses Entity to map to database
	// util package: tool package, provide some static method and variables as tools and default values.
	// exception package: handle runtime exception

}
