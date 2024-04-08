package com.proj.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.proj.model.dtos.BankBranchDTO;
import com.proj.model.dtos.RoleDTO;
import com.proj.model.entities.AddressEntity;
import com.proj.model.entities.BankBranchEntity;
import com.proj.model.entities.CurrencyEntity;
import com.proj.model.entities.RoleEntity;
import com.proj.model.mappers.AddressMapper;
import com.proj.model.mappers.BankBranchMapper;
import com.proj.model.mappers.RoleMapper;
import com.proj.model.repositories.BankBranchRepository;
import com.proj.model.repositories.RoleRepository;
import com.proj.model.services.AddressService;
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

    private AddressService addressService;
    
    private BankBranchRepository bankBranchRepository;

    private RoleRepository roleRepository;
    
    @Autowired
    public Main(
        ClientSearchService clientSearchService, ClientService clientService, AddressService addressService, BankBranchRepository bankBranchRepository,
        RoleRepository roleRepository
    ) {
        this.clientSearchService = clientSearchService;
        this.clientService = clientService;
        this.addressService = addressService;
        this.bankBranchRepository = bankBranchRepository;
        this.roleRepository = roleRepository;
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
        if(Arrays.asList(args).contains("demo")) {
            System.out.println("Demonstrative insertions");
            AddressEntity demoAddress = AddressMapper.INSTANCE.dtoToEntity(
                addressService.createAddress(
                "Demo address line 1", 
                "Demo address line 2",
                "Demo address street name",
                "Demo address city name",
                "Demo address province name",
                "Demo address country name")
            );

            System.out.println("Inserted an address: ".concat(demoAddress.toString()));

            CurrencyEntity demoCurrency = new CurrencyEntity(null, "Demo currency 1", "DC1");
            
        }

        if(Arrays.asList(args).contains("run")) {
            AddressEntity defaultAddress = AddressMapper.INSTANCE.dtoToEntity(addressService.createAddress(
                "branch l1", "branch l2", "Branch st", "Branch city", "Branch province", "Demo country"
            ));
            BankBranchDTO defaultBankBranch = BankBranchMapper.INSTANCE.entityToDto(bankBranchRepository.save(new BankBranchEntity(null, defaultAddress, "Demo bank branch")));
            RoleDTO defaultClient = RoleMapper.INSTANCE.entityToDto(
                roleRepository.save(new RoleEntity(null, "Demonstration client role", "This is a demonstration"))
            );
            CommandLineInterface currentProgram = new CommandLineInterface(clientService, clientSearchService, defaultBankBranch, defaultClient, addressService);
            currentProgram.start();
        }
        return;
    }

}
