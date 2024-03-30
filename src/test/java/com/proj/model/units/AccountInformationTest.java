package com.proj.model.units;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.proj.controller.Main;
import com.proj.model.entities.AccountInformationEntity;
import com.proj.model.entities.AccountTypeEntity;
import com.proj.model.entities.CurrencyEntity;
import com.proj.model.repositories.AccountInformationRepository;
import com.proj.model.repositories.AccountTypeRepository;
import com.proj.model.repositories.CurrencyRepository;

@SpringBootTest(classes = Main.class)
public class AccountInformationTest {
    @Autowired
    private AccountInformationRepository accInfoRepo;

    @Autowired
    private CurrencyRepository currRepo;

    @Autowired
    private AccountTypeRepository accTypeRepo;

    @Test
    public void insertionTest() {
        CurrencyEntity currency = new CurrencyEntity(null, "test currency name", "TCN");
        AccountTypeEntity accType = new AccountTypeEntity(null, "Test", 0, LocalDate.now());
        currRepo.saveAndFlush(currency);
        accTypeRepo.saveAndFlush(accType);
        
        AccountInformationEntity newAccountInfo = new AccountInformationEntity(null, false, new BigDecimal("0.00"), currency, accType);
        AccountInformationEntity savedAccount = accInfoRepo.saveAndFlush(newAccountInfo);

        Optional<AccountInformationEntity> retrievedAccount = accInfoRepo.findById(savedAccount.getId());

        assertNotNull(retrievedAccount.get(), "Failed to retrieve new bank account");

        assertEquals(savedAccount.getBankSum(), retrievedAccount.get().getBankSum(), "Oops, somebody ruined the bank sum system");
        assertEquals(savedAccount, retrievedAccount.get(), "retrieved account does not equal to the saved account");
    }
}
