package com.chuwa.mongoblog;

import com.chuwa.mongoblog.dao.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MongoBlogApplication {

	@Autowired
	PostRepository postItemRepo;

	public static void main(String[] args) {
		SpringApplication.run(MongoBlogApplication.class, args);
	}

}
