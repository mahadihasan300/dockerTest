package com.example.dockerTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerTestApplication {

	@GetMapping("/test")
	public String testMethod(){
		return "Welcome to Docker Initial !";
	}
	public static void main(String[] args) {
		SpringApplication.run(DockerTestApplication.class, args);
	}

}
