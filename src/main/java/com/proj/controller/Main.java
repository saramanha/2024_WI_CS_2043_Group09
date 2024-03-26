package com.proj.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * The Main class serves as the entry point for the Spring Boot application.
 * It initializes the Spring Boot environment and starts the application.
 */
@SpringBootApplication
@EntityScan("com.proj.model.entities")
@EnableJpaRepositories("com.proj.model.repositories")
public class Main implements CommandLineRunner {

    /**
     * The main method starts the Spring Boot application.
     * 
     * @param args Command-line arguments passed to the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    
    /**
     * This method is invoked after the application context has been loaded.
     * It does not perform any specific tasks in this implementation.
     * 
     * @param args Command-line arguments passed to the application.
     */
    @Override
    public void run(String... args) {
        return;
    }

}
