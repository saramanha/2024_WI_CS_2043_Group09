package com.proj.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.model.dtos.AddressDTO;
import com.proj.model.dtos.DepositHistoryDTO;
import com.proj.model.dtos.TransactionHistoryDTO;
import com.proj.model.dtos.WithdrawalHistoryDTO;
import com.proj.model.repositories.AccountInformationRepository;
import com.proj.model.repositories.AddressRepository;
import com.proj.model.repositories.AgentInformationRepository;
import com.proj.model.repositories.BankBranchRepository;
import com.proj.model.repositories.CityRepository;
import com.proj.model.repositories.Client_AccountJunctionRepository;
import com.proj.model.repositories.CountryRepository;
import com.proj.model.repositories.CredentialRepository;
import com.proj.model.repositories.DocumentRepository;
import com.proj.model.repositories.DocumentTypeRepository;
import com.proj.model.repositories.GenderRepository;
import com.proj.model.repositories.ProvinceRepository;
import com.proj.model.repositories.RoleRepository;

// The only intended way to modify information related to a client object
// This class updates and persists the updates made to a given client object
@Service
public class ClientService {
    private AccountInformationRepository accountInfoRepo;
    private AgentInformationRepository agentInfoRepo;
    private Client_AccountJunctionRepository clientBankAccountJuncRepo;
    private AddressRepository addressRepo;
    private CountryRepository countryRepo;
    private ProvinceRepository provinceRepo;
    private CityRepository cityRepo;
    private CredentialRepository credentialRepo;
    private BankBranchRepository bankBranchRepo;
    private DocumentRepository docRepo;
    private DocumentTypeRepository docTypeRepo;
    private RoleRepository roleRepo;
    private GenderRepository genderRepo;
    
    @Autowired
    public ClientService(AccountInformationRepository accountInfoRepo, AgentInformationRepository agentInfoRepo,
            Client_AccountJunctionRepository clientBankAccountJuncRepo, AddressRepository addressRepo,
            CountryRepository countryRepo, ProvinceRepository provinceRepo, CityRepository cityRepo,
            CredentialRepository credentialRepo, BankBranchRepository bankBranchRepo, DocumentRepository docRepo,
            DocumentTypeRepository docTypeRepo, RoleRepository roleRepo, GenderRepository genderRepo) {
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
    }

    public Client updateCredentials(Client client) {
        return null;
    }
    
    public Client updateFirstName(Client client, String newName) {
        return null;
    }
    
    public Client updateLastName(Client client, String newName) {
        return null;
    }

    public Client updateMiddleName(Client client, String newName) {
        return null;
    }

    public Client updateAdditionalName(Client client, String newName, boolean doAppend) {
        return null;
    }
    
    public Client updatePrimaryAddress(Client client, AddressDTO newAddress) {
        return null;
    }
    
    public Client updateSecondaryAddress(Client client, AddressDTO newAddress) {
        return null;
    }
    
    public Client updateEmail(Client client, String email) {
        return null;
    }
    
    public Client updateGender(Client client, Long genderId) {
        return null;
    }
    
    public Client updateSex(Client client, char newSex) {
        return null;
    }
    
    public Client updateRole(Client client, Long roleId) {
        return null;
    }
    
    public Client addBankAccount(Client client, Long bankAccountId) {
        return null;
    }
    
    public List<DepositHistoryDTO> fetchDepositHistory(Client client, Integer length, Long bankAccountId) {
        // Negative values for <bankAccountId> will fetch all entries up to <length>
        return null;
    }
    
    public List<WithdrawalHistoryDTO> fetchWithdrawalHistory(Client client, Integer length, Long bankAccountId) {
        // Negative values for <bankAccountId> will fetch all entries up to <length>
        return null;
    }
    
    public List<TransactionHistoryDTO> fetchTransactionHistory(Client client, Integer length, Long fromBankAccountId, Long toBankAccountId) {
        // Negative values for <bankAccountId> will fetch all entries up to <length>
        return null;
    }

    public Client createNewClient() {
        return null;
    }
}
