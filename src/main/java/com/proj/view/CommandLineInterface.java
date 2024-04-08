package com.proj.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// import org.springframework.format.datetime.joda.LocalDateParser;

import com.proj.model.services.AddressService;
import com.proj.model.services.Client;
import com.proj.model.services.ClientSearchService;
import com.proj.model.services.ClientService;
import com.proj.model.dtos.AddressDTO;
// import com.proj.model.dtos.AgentInformationDTO;
import com.proj.model.dtos.BankBranchDTO;
import com.proj.model.dtos.GenderDTO;
import com.proj.model.dtos.RoleDTO;
// import com.proj.model.entities.AddressEntity;
import com.proj.model.exceptions.ClientServiceException;

public class CommandLineInterface {
    private ClientService clientService;
    private ClientSearchService clientSearchService;
    private Scanner scanner;
    private BankBranchDTO defaultBankBranch;
    private RoleDTO defaultClient;
    private AddressService addressService;

    public CommandLineInterface(
        ClientService clientService, ClientSearchService clientSearchService, BankBranchDTO defaultBankBranch, RoleDTO defaultClient, AddressService addressService
    ) {
        this.addressService = addressService;
        this.clientService = clientService;
        this.clientSearchService = clientSearchService;
        this.scanner = new Scanner(System.in);
        this.defaultBankBranch = defaultBankBranch;
        this.defaultClient = defaultClient;
    }

    public void start() {
        System.out.println("Welcome to the Client Service CLI!");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("0. Create Client Information");
            System.out.println("1. Update Client Information");
            System.out.println("2. Add Bank Account");
            System.out.println("3. Generate Reports");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 0:
                    createClientInformation();
                    break;
                case 1:
                    updateClientInformation();
                    break;
                case 2:
                    addBankAccount();
                    break;
                case 3:
                    generateReports();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void createClientInformation() {
        System.out.println("Enter the first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter the last name");
        String lastName = scanner.nextLine();
        System.out.println("Enter the middle name");
        String middleName = scanner.nextLine();
        String additionalNames = "";
        System.out.println("Enter the email");
        String email = scanner.nextLine();
        System.out.println("Enter the biological sex (M/F)");
        char sex = scanner.nextLine().charAt(0);
        System.out.println("Enter the date of birth in format YYYY-MM-DD");
        String date = scanner.nextLine();
        LocalDate dateOfBirth = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
        LocalDate dateOfRegistration = LocalDate.now();
        GenderDTO gender_info = new GenderDTO();
        System.out.println("Enter clients gender");
        gender_info.setName(scanner.nextLine());

        AddressDTO[] address_info = new AddressDTO[2];
        address_info[0] = new AddressDTO();
        address_info[1] = new AddressDTO();
        for(int i = 0; i < 2; i++) {
            System.out.println("Enter address line 1");
            String l1 = scanner.nextLine();
            System.out.println("Enter address line 2");
            String l2 = scanner.nextLine();
            System.out.println("Enter the street name");
            String street = scanner.nextLine();
            System.out.println("Enter the city name");
            String city = scanner.nextLine();
            System.out.println("Enter the province name");
            String province = scanner.nextLine();
            System.out.println("Enter the country name");
            String country = scanner.nextLine();
            address_info[i] = addressService.createAddress(l1, l2, street, city, province, country);
            if(i == 0) {
                System.out.println("Is the secondary address same as the primary? (true/false)");
                boolean answer = scanner.nextBoolean();
                if(answer) {
                    address_info[1] = address_info[0];
                    break;
                }
            }
        }

        System.out.println("Enter the social security number");
        Long socialSecurityNumber = scanner.nextLong();

        System.out.println("Creating the client with the given information...");
        Client current_client = clientService.createNewClient(
            firstName, lastName, middleName, additionalNames, address_info[0], address_info[1], email,
            gender_info, sex, defaultBankBranch, dateOfBirth, dateOfRegistration, socialSecurityNumber, defaultClient 
        );
        System.out.println(String.format("Successfuly created a client with %d id", current_client.getPersonalInfo().getId()));
    }

    private void updateClientInformation() {
        System.out.println("Enter client ID:");
        Long clientId = scanner.nextLong();
        scanner.nextLine();
    
        System.out.println("Choose information to update:");
        System.out.println("0. Cancel");
        System.out.println("1. First Name");
        System.out.println("2. Last Name");
        System.out.println("3. Primary Address");
        System.out.println("4. Email");
        System.out.println("5. Update Bank Accounts");
        System.out.println("6. Update Deposit History");
        System.out.println("7. Update Withdrawal History");
        System.out.println("8. Update Transaction History");
    
        int updateChoice = scanner.nextInt();
        scanner.nextLine();
    
        try {
            Client client = clientSearchService.findClientById(clientId);
            if (client != null) {
                switch (updateChoice) {
                    case 0:
                        System.out.println("Operation cancelled");
                        break;
                    case 1:
                        System.out.println("Enter new first name:");
                        String newFirstName = scanner.nextLine();
                        clientService.updateFirstName(client, newFirstName);
                        System.out.println("First name updated successfully.");
                        break;
                    case 2:
                        System.out.println("Enter new last name:");
                        String newLastName = scanner.nextLine();
                        clientService.updateLastName(client, newLastName);
                        System.out.println("Last name updated successfully.");
                        break;
                    case 3:
                        System.out.println("Enter new primary address ID:");
                        Long primaryAddressId = scanner.nextLong();
                        scanner.nextLine();
                        clientService.updatePrimaryAddress(client, primaryAddressId);
                        System.out.println("Primary address updated successfully.");
                        break;
                    case 4:
                        System.out.println("Enter new email:");
                        String newEmail = scanner.nextLine();
                        clientService.updateEmail(client, newEmail);
                        System.out.println("Email updated successfully.");
                        break;
                    case 5:
                        System.out.println("Updating bank accounts...");
                        clientService.updateBankAccounts(client);
                        System.out.println("Bank accounts updated successfully.");
                        break;
                    case 6:
                        System.out.println("Enter length of deposit history to fetch (Enter -1 to fetch all):");
                        int depositLength = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter bank account ID (Enter -1 for all accounts):");
                        Long depositBankAccountId = scanner.nextLong();
                        scanner.nextLine();
                        clientService.updateDepositHistory(client, depositLength, depositBankAccountId);
                        System.out.println("Deposit history updated successfully.");
                        break;
                    case 7:
                        System.out.println("Enter length of withdrawal history to fetch (Enter -1 to fetch all):");
                        int withdrawalLength = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter bank account ID (Enter -1 for all accounts):");
                        Long withdrawalBankAccountId = scanner.nextLong();
                        scanner.nextLine();
                        clientService.updateWithdrawalHistory(client, withdrawalLength, withdrawalBankAccountId);
                        System.out.println("Withdrawal history updated successfully.");
                        break;
                    case 8:
                        System.out.println("Enter length of transaction history to fetch (Enter -1 to fetch all):");
                        int transactionLength = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter bank account ID (Enter -1 for all accounts):");
                        Long transactionBankAccountId = scanner.nextLong();
                        scanner.nextLine();
                        clientService.updateTransactionHistory(client, transactionLength, transactionBankAccountId);
                        System.out.println("Transaction history updated successfully.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
                System.out.println("Updated Client Information:");
                // System.out.println(client);
            } else {
                System.out.println("Client not found.");
            }
        } catch (ClientServiceException e) {
            System.out.println("Failed to update client information: " + e.getMessage());
        }
    }
    private void addBankAccount() {
        System.out.println("Enter client ID:");
        Long clientId = scanner.nextLong();
        scanner.nextLine(); 

        System.out.println("Enter bank account ID:"); 
        Long bankAccountId = scanner.nextLong();
        scanner.nextLine(); 

        System.out.println("Enter relationship:");
        String relationship = scanner.nextLine();

        try {
            Client client = clientSearchService.findClientById(clientId);
            if (client != null) {
                Client updatedClient = clientService.addBankAccount(client, bankAccountId, relationship);
                System.out.println("Bank account added successfully.");
                System.out.println("Updated Client Information:");
                System.out.println(updatedClient);
            } else {
                System.out.println("Client not found.");
            }
        } catch (ClientServiceException e) {
            System.out.println("Failed to add bank account: " + e.getMessage());
        }
    }

    private void generateReports() {
        System.out.println("Enter client ID:");
        Long clientId = scanner.nextLong();
        scanner.nextLine(); 

        try {
            Client client = clientSearchService.findClientById(clientId);
            if (client != null) {
                System.out.println("Choose a report to generate:");
                System.out.println("0. Cancel operation");
                System.out.println("1. Transaction Report");
                System.out.println("2. Deposit Report");
                System.out.println("3. Withdrawal Report");

                int reportChoice = scanner.nextInt();
                scanner.nextLine(); 

                switch (reportChoice) {
                    case 0:
                        System.out.println("Operation cancelled");
                        break;
                    case 1:
                        String transactionReport = clientService.generateTransactionReport(client);
                        System.out.println(transactionReport);
                        break;
                    case 2:
                        String depositReport = clientService.generateDepositReport(client);
                        System.out.println(depositReport);
                        break;
                    case 3:
                        String withdrawalReport = clientService.generateWithdrawalReport(client);
                        System.out.println(withdrawalReport);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Client not found.");
            }
        } catch (ClientServiceException e) {
            System.out.println("Failed to generate report: " + e.getMessage());
        }
    }
}
