package com.proj.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
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
import com.proj.model.entities.AccountInformationEntity;
import com.proj.model.entities.AccountTypeEntity;
import com.proj.model.entities.AddressEntity;
import com.proj.model.entities.BankBranchEntity;
import com.proj.model.entities.CurrencyEntity;
import com.proj.model.entities.RoleEntity;
import com.proj.model.mappers.AddressMapper;
import com.proj.model.mappers.BankBranchMapper;
import com.proj.model.mappers.RoleMapper;
import com.proj.model.repositories.AccountInformationRepository;
import com.proj.model.repositories.AccountTypeRepository;
import com.proj.model.repositories.BankBranchRepository;
import com.proj.model.repositories.CurrencyRepository;
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

    private CurrencyRepository currencyRepository;

    private AccountTypeRepository accountTypeRepository;

    private AccountInformationRepository accountInformationRepository;
    
    @Autowired
    public Main(
        ClientSearchService clientSearchService, ClientService clientService, AddressService addressService, BankBranchRepository bankBranchRepository,
        RoleRepository roleRepository, CurrencyRepository currencyRepository, AccountTypeRepository accountTypeRepository, AccountInformationRepository accountInformationRepository
        
    ) {
        this.clientSearchService = clientSearchService;
        this.clientService = clientService;
        this.addressService = addressService;
        this.bankBranchRepository = bankBranchRepository;
        this.roleRepository = roleRepository;
        this.currencyRepository = currencyRepository;
        this.accountTypeRepository = accountTypeRepository;
        this.accountInformationRepository = accountInformationRepository;
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
            System.out.println("Demonstrative argument detected: Demonstrative insertions");
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
            demoCurrency = currencyRepository.saveAndFlush(demoCurrency);
            System.out.println("Inserted a currency: ".concat(demoCurrency.toString()));

            AccountTypeEntity demoAccountType = new AccountTypeEntity(null, "Demo account type", 0., LocalDate.now());
            demoAccountType = accountTypeRepository.saveAndFlush(demoAccountType);
            System.out.println("Inserted a demo account type".concat(demoAccountType.toString()));

            AccountInformationEntity demoAccountInfo = new AccountInformationEntity(null, false, new BigDecimal("0.00"), demoCurrency, demoAccountType);
            demoAccountInfo = accountInformationRepository.saveAndFlush(demoAccountInfo);
            System.out.println("Inserted a banking account: ".concat(demoAccountInfo.toString()));
        }

        if(Arrays.asList(args).contains("run")) {
            AddressEntity defaultAddress = AddressMapper.INSTANCE.dtoToEntity(addressService.createAddress(
                "branch l1", "branch l2", "Branch st", "Branch city", "Branch province", "Demo country"
            ));
            System.out.println("Launch: Created a default Address for the default bank branch");
            BankBranchDTO defaultBankBranch = BankBranchMapper.INSTANCE.entityToDto(bankBranchRepository.save(new BankBranchEntity(null, defaultAddress, "Demo bank branch")));
            RoleDTO defaultClient = RoleMapper.INSTANCE.entityToDto(
                roleRepository.save(new RoleEntity(null, "Demonstration client role", "This is a demonstration"))
            );
            System.out.println("Launch: Created a default role entity for clients");
            CommandLineInterface currentProgram = new CommandLineInterface(clientService, clientSearchService, defaultBankBranch, defaultClient, addressService);
            currentProgram.start();
        }
        return;
    }

}
