// Specifies the package for organizing the test class
package com.example.sbaauth;

// Importing necessary JUnit and Spring Boot test classes

// Marks a method as a test case
import org.junit.jupiter.api.Test;
// Loads the full Spring application context for testing
import org.springframework.boot.test.context.SpringBootTest;

// Marks this class as a Spring Boot test class
@SpringBootTest
class SbaJwtAuthApplicationTests {

	// A simple test to verify that the Spring application context loads successfully
	@Test
	void contextLoads() {
	}
}
