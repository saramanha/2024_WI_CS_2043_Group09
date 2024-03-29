package com.proj.model.units;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.proj.controller.Main;
import com.proj.model.entities.AccountInformationEntity;
import com.proj.model.entities.AccountTypeEntity;
import com.proj.model.entities.AddressEntity;
import com.proj.model.entities.AgentInformationEntity;
import com.proj.model.entities.BankBranchEntity;
import com.proj.model.entities.CityEntity;
import com.proj.model.entities.CountryEntity;
import com.proj.model.entities.CurrencyEntity;
import com.proj.model.entities.DepositHistoryEntity;
import com.proj.model.entities.GenderEntity;
import com.proj.model.entities.ProvinceEntity;
import com.proj.model.entities.RoleEntity;
import com.proj.model.entities.TransactionStatusEntity;
import com.proj.model.entities.WithdrawalHistoryEntity;
import com.proj.model.repositories.AccountInformationRepository;
import com.proj.model.repositories.AccountTypeRepository;
import com.proj.model.repositories.AddressRepository;
import com.proj.model.repositories.AgentInformationRepository;
import com.proj.model.repositories.BankBranchRepository;
import com.proj.model.repositories.CityRepository;
import com.proj.model.repositories.CountryRepository;
import com.proj.model.repositories.CurrencyRepository;
import com.proj.model.repositories.DepositHistoryRepository;
import com.proj.model.repositories.GenderRepository;
import com.proj.model.repositories.ProvinceRepository;
import com.proj.model.repositories.RoleRepository;
import com.proj.model.repositories.TransactionStatusRepository;
import com.proj.model.repositories.WithdrawalHistoryRepository;

@SpringBootTest(classes = Main.class)
public class TransactionsTest {
    @Autowired
    private AgentInformationRepository agentInfoRepo;

    @Autowired
    private AddressRepository addressRepo;

    @Autowired
    private CityRepository cityRepo;

    @Autowired
    private ProvinceRepository provinceRepo;

    @Autowired
    private CountryRepository countryRepo;

    @Autowired
    private GenderRepository genderRepo;
    
    @Autowired
    private BankBranchRepository bankBranchRepo;
    
    @Autowired
    private RoleRepository roleRepo;
    
    @Autowired
    private AccountInformationRepository accInfoRepo;
    
    @Autowired
    private CurrencyRepository currencyRepo;
    
    @Autowired
    private AccountTypeRepository accTypeRepo;
    
    @Autowired
    private TransactionStatusRepository transactionStatusRepo;
    
    @Autowired
    private DepositHistoryRepository depositRepo;
    
    @Autowired
    private WithdrawalHistoryRepository withdrawalRepo;

    @Test
    public void depositWithdrawalTest() {
        CurrencyEntity currency = new CurrencyEntity(null, "test currency name", "TCN");
        AccountTypeEntity accType = new AccountTypeEntity(null, "Test", 0, LocalDate.now());
        currencyRepo.saveAndFlush(currency);
        accTypeRepo.saveAndFlush(accType);
        
        AccountInformationEntity newAccountInfo = new AccountInformationEntity(null, false, new BigDecimal("0.00"), currency, accType);
        AccountInformationEntity savedAccount = accInfoRepo.saveAndFlush(newAccountInfo);

        Optional<AccountInformationEntity> retrievedAccount = accInfoRepo.findById(savedAccount.getId());

        assertNotNull(retrievedAccount.get(), "Failed to retrieve new bank account");
        AccountInformationEntity currAccInfo = retrievedAccount.get();

        CountryEntity country = countryRepo.saveAndFlush(new CountryEntity(null, "Test country"));
        CityEntity city = cityRepo.saveAndFlush(new CityEntity(null, "Test city"));
        ProvinceEntity province = provinceRepo.saveAndFlush(new ProvinceEntity(null, "Test province"));
        AddressEntity primaryAddress = addressRepo.saveAndFlush(new AddressEntity(
            null,
            "123", 
            "546",
            "Test street name", 
            city, 
            province, 
            country)
        );

        GenderEntity gender = genderRepo.saveAndFlush(new GenderEntity(null, "Test gender", "..."));

        BankBranchEntity bankBranch = bankBranchRepo.saveAndFlush(new BankBranchEntity(null, primaryAddress, "Test branch"));

        RoleEntity role = roleRepo.saveAndFlush(new RoleEntity(null, "tester", "..."));

        AgentInformationEntity newAgentInfo = new AgentInformationEntity(
            null,
            "Test first name",
            "Test last name",
            "Test",
            "FAdfgasdgg",
            LocalDate.now(),
            primaryAddress,
            primaryAddress,
            "Abc@fmail.com",
            gender,
            'M',
            LocalDate.now(),
            123435L,
            bankBranch,
            role
        );

        AgentInformationEntity savedAgentInfo = agentInfoRepo.saveAndFlush(newAgentInfo);

        Optional<AgentInformationEntity> retrievedAgent = agentInfoRepo.findById(savedAgentInfo.getId());

        assertNotNull(retrievedAgent.get(), "Failed to retrieve the agent information");

        AgentInformationEntity currAgentInfo = retrievedAgent.get();

        TransactionStatusEntity transactionStatus = transactionStatusRepo.saveAndFlush(new TransactionStatusEntity(null, "...", "test"));

        DepositHistoryEntity deposit = new DepositHistoryEntity(
            null,
            currAgentInfo, 
            currAccInfo, 
            transactionStatus, 
            new BigDecimal("10.00"), 
            currencyRepo.save(new CurrencyEntity(null, "Deposit currency", "DC")), 
            new BigDecimal("10.00"),
            LocalDateTime.now()
        );

        DepositHistoryEntity savedDeposit = depositRepo.saveAndFlush(deposit);

        Optional<DepositHistoryEntity> retrievedDepost = depositRepo.findById(savedDeposit.getId());

        assertNotNull(retrievedDepost.get(), "Failed to retrieve the deposit");
        assertEquals(savedDeposit, retrievedDepost.get(), "Failed to compare the saved deposit with retrieved deposit");

        WithdrawalHistoryEntity withdrawal = new WithdrawalHistoryEntity(
            null,
            currAgentInfo, 
            currAccInfo, 
            transactionStatus,
            new BigDecimal("0.00"),
            currencyRepo.save(new CurrencyEntity(null, "Withdrawal currency", "WC")),
            new BigDecimal("0.00"),
            LocalDateTime.now()
        );

        WithdrawalHistoryEntity savedWithdrawal = withdrawalRepo.saveAndFlush(withdrawal);

        Optional<WithdrawalHistoryEntity> retrievedWithdrawal = withdrawalRepo.findById(savedWithdrawal.getId());

        assertNotNull(retrievedWithdrawal.get(), "Failed to retrieve withdrawal");
        assertEquals(savedWithdrawal, retrievedWithdrawal.get(), "Failed to compare the saved and retrieved withdrawal");
    }

    // @Test
    // public void transactionTest() {
    //     TransactionHistoryId transactionId = new TransactionHistoryId(null, null);

    //     TransactionHistoryEntity transaction = new TransactionHistoryEntity(
    //         null,
    //         null,
    //         null, 
    //         null, 
    //         transactionStatus, 
    //         LocalDateTime.now(), 
    //         LocalDateTime.now()
    //     );
    // }
}
