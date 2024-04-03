// TODO: similar excetion system to the BankAccountService -> Done

package com.proj.model.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proj.model.dtos.AccountInformationDTO;
import com.proj.model.dtos.AddressDTO;
import com.proj.model.dtos.BankBranchDTO;
import com.proj.model.dtos.DepositHistoryDTO;
import com.proj.model.dtos.GenderDTO;
import com.proj.model.dtos.RoleDTO;
import com.proj.model.dtos.TransactionHistoryDTO;
import com.proj.model.dtos.WithdrawalHistoryDTO;
import com.proj.model.embeddables.Client_AccountJunctionId;
import com.proj.model.entities.AccountInformationEntity;
import com.proj.model.entities.AddressEntity;
import com.proj.model.entities.AgentInformationEntity;
import com.proj.model.entities.BankBranchEntity;
import com.proj.model.entities.Client_AccountJunctionEntity;
import com.proj.model.entities.DepositHistoryEntity;
import com.proj.model.entities.GenderEntity;
import com.proj.model.entities.RoleEntity;
import com.proj.model.entities.TransactionHistoryEntity;
import com.proj.model.entities.WithdrawalHistoryEntity;
import com.proj.model.exceptions.AccountNotFoundException;
import com.proj.model.exceptions.AddressNotFoundException;
import com.proj.model.exceptions.ClientNotFoundException;
import com.proj.model.exceptions.ClientServiceException;
import com.proj.model.exceptions.GenderNotFoundException;
import com.proj.model.exceptions.RoleNotFoundException;
import com.proj.model.mappers.AccountInformationMapper;
import com.proj.model.mappers.AddressMapper;
import com.proj.model.mappers.AgentInformationMapper;
import com.proj.model.mappers.BankBranchMapper;
import com.proj.model.mappers.DepositHistoryMapper;
import com.proj.model.mappers.GenderMapper;
import com.proj.model.mappers.RoleMapper;
import com.proj.model.mappers.TransactionHistoryMapper;
import com.proj.model.mappers.WithdrawalHistoryMapper;
import com.proj.model.repositories.AccountInformationRepository;
import com.proj.model.repositories.AddressRepository;
import com.proj.model.repositories.AgentInformationRepository;
import com.proj.model.repositories.BankBranchRepository;
import com.proj.model.repositories.CityRepository;
import com.proj.model.repositories.Client_AccountJunctionRepository;
import com.proj.model.repositories.CountryRepository;
import com.proj.model.repositories.CredentialRepository;
import com.proj.model.repositories.DepositHistoryRepository;
import com.proj.model.repositories.DocumentRepository;
import com.proj.model.repositories.DocumentTypeRepository;
import com.proj.model.repositories.GenderRepository;
import com.proj.model.repositories.ProvinceRepository;
import com.proj.model.repositories.RoleRepository;
import com.proj.model.repositories.TransactionHistoryRepository;
import com.proj.model.repositories.WithdrawalHistoryRepository;

// The only intended way to modify information related to a client object
// This class updates and persists the updates made to a given client object
@Service
public class ClientService {
    private AccountInformationRepository accountInfoRepo;
    private AgentInformationRepository agentInfoRepo;
    private Client_AccountJunctionRepository clientBankAccountJuncRepo;
    private AddressRepository addressRepo;
    // Planned functionality
    private CountryRepository countryRepo;
    // Planned functionality
    private ProvinceRepository provinceRepo;
    // Planned functionality
    private CityRepository cityRepo;
    private CredentialRepository credentialRepo;
    private BankBranchRepository bankBranchRepo;
    // Planned functionality
    private DocumentRepository docRepo;
    private DocumentTypeRepository docTypeRepo;
    private DepositHistoryRepository depositRepo;
    private RoleRepository roleRepo;
    private GenderRepository genderRepo;
    private WithdrawalHistoryRepository withdrawalRepo;
    private TransactionHistoryRepository transactionHistoryRepo;
    
    @Autowired
    public ClientService(AccountInformationRepository accountInfoRepo, AgentInformationRepository agentInfoRepo,
            Client_AccountJunctionRepository clientBankAccountJuncRepo, AddressRepository addressRepo,
            CountryRepository countryRepo, ProvinceRepository provinceRepo, CityRepository cityRepo,
            CredentialRepository credentialRepo, BankBranchRepository bankBranchRepo, DocumentRepository docRepo,
            DocumentTypeRepository docTypeRepo, RoleRepository roleRepo, GenderRepository genderRepo,
            DepositHistoryRepository depositRepo, WithdrawalHistoryRepository withdrawalRepo,
            TransactionHistoryRepository transactionHistoryRepo) {
        this.accountInfoRepo = accountInfoRepo;
        this.agentInfoRepo = agentInfoRepo;
        this.clientBankAccountJuncRepo = clientBankAccountJuncRepo;
        this.addressRepo = addressRepo;
        this.countryRepo = countryRepo;
        this.provinceRepo = provinceRepo;
        this.cityRepo = cityRepo;
        this.credentialRepo = credentialRepo;
        this.bankBranchRepo = bankBranchRepo;
        this.docRepo = docRepo;
        this.docTypeRepo = docTypeRepo;
        this.roleRepo = roleRepo;
        this.genderRepo = genderRepo;
        this.depositRepo = depositRepo;
        this.withdrawalRepo = withdrawalRepo;
        this.transactionHistoryRepo = transactionHistoryRepo;
    }

    // public Client updateCredentials(Client client) {
    //     return null;
    // }
    
    @Transactional
    public Client updateFirstName(Client client, String newName) {
        try {
            AgentInformationEntity personalInfoE = agentInfoRepo.findById(client.getPersonalInfo().getId())
                    .orElseThrow(() -> new ClientNotFoundException("Client not found"));
            personalInfoE.setFirstName(newName);
            client.setPersonalInfo(AgentInformationMapper.INSTANCE.entityToDto(agentInfoRepo.save(personalInfoE)));
            return client;
        } catch (EntityNotFoundException ex) {
            throw new ClientServiceException("Failed to update first name: " + ex.getMessage());
        }
    }

    @Transactional
    public Client updateLastName(Client client, String newLastName) {
        try {
            AgentInformationEntity personalInfoE = agentInfoRepo.findById(client.getPersonalInfo().getId())
                    .orElseThrow(() -> new ClientNotFoundException("Client not found"));
            personalInfoE.setLastName(newLastName);
            client.setPersonalInfo(AgentInformationMapper.INSTANCE.entityToDto(agentInfoRepo.save(personalInfoE)));
            return client;
        } catch (EntityNotFoundException ex) {
            throw new ClientServiceException("Failed to update last name: " + ex.getMessage());
        }
    }

    @Transactional
    public Client updateMiddleName(Client client, String newMiddleName) {
        try {
            AgentInformationEntity personalInfoE = agentInfoRepo.findById(client.getPersonalInfo().getId())
                    .orElseThrow(() -> new ClientNotFoundException("Client not found"));
            personalInfoE.setMiddleName(newMiddleName);
            client.setPersonalInfo(AgentInformationMapper.INSTANCE.entityToDto(agentInfoRepo.save(personalInfoE)));
            return client;
        } catch (EntityNotFoundException ex) {
            throw new ClientServiceException("Failed to update middle name: " + ex.getMessage());
        }
    }

    @Transactional
    public Client updateAdditionalName(Client client, String newAdditionalName, boolean doAppend) {
        try {
            AgentInformationEntity personalInfoE = agentInfoRepo.findById(client.getPersonalInfo().getId())
                    .orElseThrow(() -> new ClientNotFoundException("Client not found"));
            if (doAppend) {
                personalInfoE.setAdditionalNames(personalInfoE.getAdditionalNames().concat(newAdditionalName));
            } else {
                personalInfoE.setAdditionalNames(newAdditionalName);
            }
            client.setPersonalInfo(AgentInformationMapper.INSTANCE.entityToDto(agentInfoRepo.save(personalInfoE)));
            return client;
        } catch (EntityNotFoundException ex) {
            throw new ClientServiceException("Failed to update additional name: " + ex.getMessage());
        }
    }

    
    // Assumes that the newAddress is really new
    @Transactional
    public Client updatePrimaryAddress(Client client, Long addressId) {
        try {
            AgentInformationEntity personalInfoE = agentInfoRepo.findById(client.getPersonalInfo().getId())
                    .orElseThrow(() -> new ClientNotFoundException("Client not found"));
            AddressEntity address = addressRepo.findById(addressId).orElseThrow(() -> new AddressNotFoundException("Address not found"));
            personalInfoE.setPrimaryAddress(address);
            client.setPersonalInfo(AgentInformationMapper.INSTANCE.entityToDto(agentInfoRepo.save(personalInfoE)));
            return client;
        } catch (EntityNotFoundException ex) {
            throw new ClientServiceException("Failed to update primary address: " + ex.getMessage());
        }
    }
    
    @Transactional
    public Client updateSecondaryAddress(Client client, Long addressId) {
        try {
            AgentInformationEntity personalInfoE = agentInfoRepo.findById(client.getPersonalInfo().getId())
                    .orElseThrow(() -> new ClientNotFoundException("Client not found"));
            AddressEntity address = addressRepo.findById(addressId).orElseThrow(() -> new AddressNotFoundException("Address not found"));
            personalInfoE.setSecondaryAddress(address);
            client.setPersonalInfo(AgentInformationMapper.INSTANCE.entityToDto(agentInfoRepo.save(personalInfoE)));
            return client;
        } catch (EntityNotFoundException ex) {
            throw new ClientServiceException("Failed to update secondary address: " + ex.getMessage());
        }
    }
    
    @Transactional
    public Client updateEmail(Client client, String email) {
        try {
            AgentInformationEntity personalInfoE = agentInfoRepo.findById(client.getPersonalInfo().getId())
                    .orElseThrow(() -> new ClientNotFoundException("Client not found"));
            personalInfoE.setEmail(email);
            client.setPersonalInfo(AgentInformationMapper.INSTANCE.entityToDto(agentInfoRepo.save(personalInfoE)));
            return client;
        } catch (EntityNotFoundException ex) {
            throw new ClientServiceException("Failed to update email: " + ex.getMessage());
        }
    }

    @Transactional
    public Client updateGender(Client client, Long genderId) {
        try {
            AgentInformationEntity personalInfoE = agentInfoRepo.findById(client.getPersonalInfo().getId())
                    .orElseThrow(() -> new ClientNotFoundException("Client not found"));
            GenderEntity genderE = genderRepo.findById(genderId).orElseThrow(() -> new GenderNotFoundException("Gender not found"));
            personalInfoE.setSelfIdentGender(genderE);
            client.setPersonalInfo(AgentInformationMapper.INSTANCE.entityToDto(agentInfoRepo.save(personalInfoE)));
            return client;
        } catch (EntityNotFoundException ex) {
            throw new ClientServiceException("Failed to update gender: " + ex.getMessage());
        }
    }

    @Transactional
    public Client updateSex(Client client, char newSex) {
        try {
            AgentInformationEntity personalInfoE = agentInfoRepo.findById(client.getPersonalInfo().getId())
                    .orElseThrow(() -> new ClientNotFoundException("Client not found"));
            if (newSex != 'F' && newSex != 'M') {
                throw new IllegalArgumentException("Sex should be 'F' or 'M'");
            }
            personalInfoE.setSex(newSex);
            client.setPersonalInfo(AgentInformationMapper.INSTANCE.entityToDto(agentInfoRepo.save(personalInfoE)));
            return client;
        } catch (EntityNotFoundException ex) {
            throw new ClientServiceException("Failed to update sex: " + ex.getMessage());
        }
    }

    @Transactional
    public Client updateRole(Client client, Long roleId) {
        try {
            AgentInformationEntity personalInfoE = agentInfoRepo.findById(client.getPersonalInfo().getId())
                    .orElseThrow(() -> new ClientNotFoundException("Client not found"));
            RoleEntity roleE = roleRepo.findById(roleId).orElseThrow(() -> new RoleNotFoundException("Role not found"));
            personalInfoE.setRole(roleE);
            client.setPersonalInfo(AgentInformationMapper.INSTANCE.entityToDto(agentInfoRepo.save(personalInfoE)));
            return client;
        } catch (EntityNotFoundException ex) {
            throw new ClientServiceException("Failed to update role: " + ex.getMessage());
        }
    }

    @Transactional
    public Client updateBankAccounts(Client client) {
        try {
            AgentInformationEntity personalInfoE = agentInfoRepo.findById(client.getPersonalInfo().getId())
                    .orElseThrow(() -> new ClientNotFoundException("Client not found"));
            List<AccountInformationEntity> accounts = clientBankAccountJuncRepo.findAllAccountsByAgentId(personalInfoE.getId());
            ArrayList<AccountInformationDTO> bankAccountsList = new ArrayList<>();
            for (AccountInformationEntity i : accounts) {
                bankAccountsList.add(AccountInformationMapper.INSTANCE.entityToDto(i));
            }
            client.setAssociatedBankAccounts(bankAccountsList);
            return client;
        } catch (EntityNotFoundException ex) {
            throw new ClientServiceException("Failed to update bank accounts: " + ex.getMessage());
        }
    }
    
    @Transactional
    public Client addBankAccount(Client client, Long bankAccountId, String relationship) {
        try {
            AgentInformationEntity personalInfoE = agentInfoRepo.findById(client.getPersonalInfo().getId())
                    .orElseThrow(() -> new ClientNotFoundException("Client not found"));
            AccountInformationEntity bankAccountE = accountInfoRepo.findById(bankAccountId)
                    .orElseThrow(() -> new AccountNotFoundException("Bank account not found"));
    
            Client_AccountJunctionId client_accountId = new Client_AccountJunctionId(personalInfoE.getId(), bankAccountE.getId());
            Client_AccountJunctionEntity client_accountJunction = new Client_AccountJunctionEntity(client_accountId, personalInfoE, bankAccountE, relationship);
            clientBankAccountJuncRepo.save(client_accountJunction);
    
            return updateBankAccounts(client);
        } catch (EntityNotFoundException ex) {
            throw new ClientServiceException("Failed to add bank account: " + ex.getMessage());
        }
    }
    
    public Client updateDepositHistory(Client client, Integer length, Long bankAccountId) {
        try {
            AgentInformationEntity personalInformationEntity = agentInfoRepo.findById(client.getPersonalInfo().getId())
                    .orElseThrow(() -> new ClientNotFoundException("Client not found"));
            AccountInformationEntity bankAccountEntity = accountInfoRepo.findById(bankAccountId)
                    .orElseThrow(() -> new AccountNotFoundException("Bank account not found"));
            ArrayList<DepositHistoryDTO> result = new ArrayList<>();
            List<DepositHistoryEntity> depositEntitiesList;
    
            if (bankAccountId >= 0) {
                depositEntitiesList = depositRepo.findAllByAccountInformationId(bankAccountEntity.getId());
            } else {
                depositEntitiesList = depositRepo.findAllByAgentId(personalInformationEntity.getId());
            }
    
            Integer counter = 0;
            for (DepositHistoryEntity i : depositEntitiesList) {
                if (counter >= length && length >= 0) {
                    break;
                }
                result.add(DepositHistoryMapper.INSTANCE.entityToDto(i));
                counter++;
            }
            client.setAssociatedDeposits(result);
            return client;
        } catch (EntityNotFoundException ex) {
            throw new ClientServiceException("Failed to update deposit history: " + ex.getMessage());
        }
    }
    
    public Client updateWithdrawalHistory(Client client, Integer length, Long bankAccountId) {
        try {
            AgentInformationEntity personalInformationEntity = agentInfoRepo.findById(client.getPersonalInfo().getId())
                    .orElseThrow(() -> new ClientNotFoundException("Client not found"));
            AccountInformationEntity bankAccountEntity = accountInfoRepo.findById(bankAccountId)
                    .orElseThrow(() -> new AccountNotFoundException("Bank account not found"));
            ArrayList<WithdrawalHistoryDTO> result = new ArrayList<>();
            List<WithdrawalHistoryEntity> withdrawalEntitiesList;
    
            if (bankAccountId >= 0) {
                withdrawalEntitiesList = withdrawalRepo.findAllByAccountInformationId(bankAccountEntity.getId());
            } else {
                withdrawalEntitiesList = withdrawalRepo.findAllByAgentId(personalInformationEntity.getId());
            }
    
            Integer counter = 0;
            for (WithdrawalHistoryEntity i : withdrawalEntitiesList) {
                if (counter >= length && length >= 0) {
                    break;
                }
                result.add(WithdrawalHistoryMapper.INSTANCE.entityToDto(i));
                counter++;
            }
            client.setAssociatedWithdrawals(result);
            return client;
        } catch (EntityNotFoundException ex) {
            throw new ClientServiceException("Failed to update withdrawal history: " + ex.getMessage());
        }
    }
    
    public Client updateTransactionHistory(Client client, Integer length, Long bankAccountId) {
        try {
            AgentInformationEntity personalInformationEntity = agentInfoRepo.findById(client.getPersonalInfo().getId())
                    .orElseThrow(() -> new ClientNotFoundException("Client not found"));
            AccountInformationEntity bankAccountEntity = accountInfoRepo.findById(bankAccountId)
                    .orElseThrow(() -> new AccountNotFoundException("Bank account not found"));
            ArrayList<TransactionHistoryDTO> result = new ArrayList<>();
            List<TransactionHistoryEntity> transactionEntitiesList;
    
            if (bankAccountId >= 0) {
                transactionEntitiesList = transactionHistoryRepo.findAllByDepositAccountInformationIdOrWithdrawalAccountInformationId(bankAccountEntity.getId());
            } else {
                transactionEntitiesList = transactionHistoryRepo.findAllByDepositAgentIdOrWithdrawalAgentId(personalInformationEntity.getId());
            }
    
            Integer counter = 0;
            for (TransactionHistoryEntity i : transactionEntitiesList) {
                if (counter >= length && length >= 0) {
                    break;
                }
                result.add(TransactionHistoryMapper.INSTANCE.entityToDto(i));
                counter++;
            }
            client.setAssociatedTransactions(result);
            return client;
        } catch (EntityNotFoundException ex) {
            throw new ClientServiceException("Failed to update transaction history: " + ex.getMessage());
        }
    }

    @Transactional
    public Client createNewClient(String firstName, String lastName, String middleName, String additionalNames,
                                  AddressDTO primaryAddress, AddressDTO secondaryAddress, String email,
                                  GenderDTO gender, char sex, BankBranchDTO bankBranch,
                                  LocalDate dateOfBirth, Long SocialSecurityNumber, RoleDTO clientRole) {
        
        AddressEntity primaryAddressEntity = AddressMapper.INSTANCE.dtoToEntity(primaryAddress);
        if(!addressRepo.existsById(primaryAddressEntity.getId())) addressRepo.save(primaryAddressEntity);
        
        AddressEntity secondaryAddressEntity = AddressMapper.INSTANCE.dtoToEntity(secondaryAddress);
        if(!addressRepo.existsById(secondaryAddressEntity.getId())) addressRepo.save(secondaryAddressEntity);
        
        GenderEntity genderEntity = GenderMapper.INSTANCE.dtoToEntity(gender);
        if(!genderRepo.existsById(genderEntity.getId())) genderRepo.save(genderEntity);

        BankBranchEntity bankBranchEntity = BankBranchMapper.INSTANCE.dtoToEntity(bankBranch);
        if(!bankBranchRepo.existsById(bankBranchEntity.getId())) bankBranchRepo.save(bankBranchEntity);

        RoleEntity roleEntity = RoleMapper.INSTANCE.dtoToEntity(clientRole);
        if(!roleRepo.existsById(roleEntity.getId())) roleRepo.save(roleEntity);
        
        AgentInformationEntity currentAgent = new AgentInformationEntity(
            null, firstName, lastName, middleName, additionalNames, LocalDate.now(), primaryAddressEntity, secondaryAddressEntity,
            email, genderEntity, sex, dateOfBirth, SocialSecurityNumber, bankBranchEntity, roleEntity
        );

        Client newClient = new Client();
        newClient.setPersonalInfo(AgentInformationMapper.INSTANCE.entityToDto(agentInfoRepo.save(currentAgent)));
        return newClient;
    }
    // Function to generate a transaction report
    public String generateTransactionReport(Client client) {
        StringBuilder report = new StringBuilder();
        report.append("Transaction Report for Client: ").append(client.getPersonalInfo().getFirstName()).append("\n\n");
        
        List<TransactionHistoryDTO> associatedTransactions = client.getAssociatedTransactions();
        if (associatedTransactions != null && !associatedTransactions.isEmpty()) {
            for (TransactionHistoryDTO transaction : associatedTransactions) {
                report.append("Date: ").append(transaction.getTransactionInitiationDateTime())
                      .append("\tAmount: ").append(transaction.getDeposit().getSumConverted())
                      .append("\tType: ").append(transaction.getTransactionType())
                      .append("\n");
            }
        } else {
            report.append("No transaction history available.\n");
        }

        return report.toString();
    }

    // Function to generate a deposit report
    public String generateDepositReport(Client client) {
        StringBuilder report = new StringBuilder();
        report.append("Deposit Report for Client: ").append(client.getPersonalInfo().getFirstName()).append("\n\n");
        
        List<DepositHistoryDTO> associatedDeposits = client.getAssociatedDeposits();
        if (associatedDeposits != null && !associatedDeposits.isEmpty()) {
            for (DepositHistoryDTO deposit : associatedDeposits) {
                report.append("Date: ").append(deposit.getDateTimeInitiated())
                      .append("\tAmount: ").append(deposit.getSumConverted())
                      .append("\n");
            }
        } else {
            report.append("No deposit history available.\n");
        }

        return report.toString();
    }

    // Function to generate a withdrawal report
    public String generateWithdrawalReport(Client client) {
        StringBuilder report = new StringBuilder();
        report.append("Withdrawal Report for Client: ").append(client.getPersonalInfo().getFirstName()).append("\n\n");
        
        List<WithdrawalHistoryDTO> associatedWithdrawals = client.getAssociatedWithdrawals();
        if (associatedWithdrawals != null && !associatedWithdrawals.isEmpty()) {
            for (WithdrawalHistoryDTO withdrawal : associatedWithdrawals) {
                report.append("Date: ").append(withdrawal.getDateTimeInitiated())
                      .append("\tAmount: ").append(withdrawal.getSumConverted())
                      .append("\n");
            }
        } else {
            report.append("No withdrawal history available.\n");
        }

        return report.toString();
    }
}
