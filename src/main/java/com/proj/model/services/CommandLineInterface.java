package com.proj.model.services;

import java.util.Scanner;
import com.proj.model.services.Client;
import com.proj.model.services.ClientSearchService;
import com.proj.model.services.ClientService;
import com.proj.model.services.ClientServiceException;

public class CommandLineInterface {
    private ClientService clientService;
    private ClientSearchService clientSearchService;
    private Scanner scanner;

    public CommandLineInterface(ClientService clientService, ClientSearchService clientSearchService) {
        this.clientService = clientService;
        this.clientSearchService = clientSearchService;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the Client Service CLI!");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Update Client Information");
            System.out.println("2. Add Bank Account");
            System.out.println("3. Generate Reports");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
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

    private void updateClientInformation() {
     
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
                System.out.println("1. Transaction Report");
                System.out.println("2. Deposit Report");
                System.out.println("3. Withdrawal Report");

                int reportChoice = scanner.nextInt();
                scanner.nextLine(); 

                switch (reportChoice) {
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

    public static void main(String[] args) {
        ClientService clientService = new ClientService();
        ClientSearchService clientSearchService = new ClientSearchService();
        CommandLineInterface cli = new CommandLineInterface(clientService, clientSearchService);

        cli.start();
    }
}
