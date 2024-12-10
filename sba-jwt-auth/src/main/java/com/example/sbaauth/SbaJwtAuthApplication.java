// Specifies the package for organizing the code
package com.example.sbaauth;

// Importing necessary Spring Boot classes
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Marks this class as the main entry point for the Spring Boot application
@SpringBootApplication
public class SbaJwtAuthApplication {

// The main method serves as the application's entry point
	public static void main(String[] args) {

		// Launches the Spring Boot application
		SpringApplication.run(SbaJwtAuthApplication.class, args);
	}

}
