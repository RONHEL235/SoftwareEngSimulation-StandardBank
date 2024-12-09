// Specifies the package for organizing the code
package com.example.sbaauth;

// Importing necessary Spring Boot classes
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbaJwtAuthApplication {

// The main method serves as the application's entry point
	public static void main(String[] args) {

		// Launches the Spring Boot application
		SpringApplication.run(SbaJwtAuthApplication.class, args);
	}

}
