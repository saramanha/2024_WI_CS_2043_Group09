package com.proj.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.proj.model.services.ClientSearchService;
import com.proj.model.services.ClientService;
import com.proj.view.CommandLineInterface;

/**
 * The Main class serves as the entry point for the Spring Boot application.
 * It initializes the Spring Boot environment and starts the application.
 */
@SpringBootApplication
@ComponentScan({"com.proj.controller", "com.proj.model.services"})
@EntityScan("com.proj.model.entities")
@EnableJpaRepositories("com.proj.model.repositories")
public class Main implements CommandLineRunner {

    private ClientSearchService clientSearchService;

    private ClientService clientService;
    
    @Autowired
    public Main(ClientSearchService clientSearchService, ClientService clientService) {
        this.clientSearchService = clientSearchService;
        this.clientService = clientService;
    }

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
        if(Arrays.asList(args).contains("run")) {
            CommandLineInterface currentProgram = new CommandLineInterface(clientService, clientSearchService);
            currentProgram.start();
        }
        return;
    }

}
