package com.proj.model.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.model.dtos.AccountInformationDTO;
import com.proj.model.dtos.AgentInformationDTO;
import com.proj.model.dtos.DepositHistoryDTO;
import com.proj.model.dtos.TransactionHistoryDTO;
import com.proj.model.dtos.WithdrawalHistoryDTO;
import com.proj.model.repositories.AccountInformationRepository;
import com.proj.model.repositories.AccountTypeRepository;
import com.proj.model.repositories.Client_AccountJunctionRepository;
import com.proj.model.repositories.CurrencyConversionRepository;
import com.proj.model.repositories.CurrencyRepository;
import com.proj.model.repositories.DepositHistoryRepository;
import com.proj.model.repositories.TransactionStatusRepository;
import com.proj.model.repositories.TransactionTypeRepository;
import com.proj.model.repositories.WithdrawalHistoryRepository;

// Given a AccountInformationDTO. The service can operate on it doing modifications: deposits, withdrawals, deactivation, activation, 
// and given a second account it can do a transaction (debatable to reduce complexity)
@Service
public class BankAccountService {
    private AccountInformationRepository accountInformationRepo;
    private DepositHistoryRepository depositHistoryRepo;
    private WithdrawalHistoryRepository withdrawalHistoryRepo;
    private Client_AccountJunctionRepository clientAccountJuncRepo;
    private CurrencyConversionRepository currencyConversionRepo;
    private CurrencyRepository currencyRepo;
    private AccountTypeRepository accountTypeRepo;
    private TransactionTypeRepository transactionTypeRepo;
    private TransactionStatusRepository transactionStatusRepo;

    @Autowired
    public BankAccountService(AccountInformationRepository accountInformationRepo,
            DepositHistoryRepository depositHistoryRepo, WithdrawalHistoryRepository withdrawalHistoryRepo,
            Client_AccountJunctionRepository clientAccountJuncRepo, CurrencyConversionRepository currencyConversionRepo,
            CurrencyRepository currencyRepo, AccountTypeRepository accountTypeRepo,
            TransactionTypeRepository transactionTypeRepo, TransactionStatusRepository transactionStatusRepo) {
        this.accountInformationRepo = accountInformationRepo;
        this.depositHistoryRepo = depositHistoryRepo;
        this.withdrawalHistoryRepo = withdrawalHistoryRepo;
        this.clientAccountJuncRepo = clientAccountJuncRepo;
        this.currencyConversionRepo = currencyConversionRepo;
        this.currencyRepo = currencyRepo;
        this.accountTypeRepo = accountTypeRepo;
        this.transactionTypeRepo = transactionTypeRepo;
        this.transactionStatusRepo = transactionStatusRepo;
    }

    public AccountInformationDTO deposit(Long bankAccountId, BigDecimal sum) {
        return null;   
    }
    
    public AccountInformationDTO withdrawal(Long bankAccountId, BigDecimal sum) {
        return null;
    }
    
    public AccountInformationDTO processTransaction(Long fromBankAccountId, Long toBankAccountId, BigDecimal sum) {
        return null;
    }

    public AccountInformationDTO addOwner(Long bankAccountId, Long clientAccountId) {
        return null;
    }
    
    public AccountInformationDTO removeOwner(Long bankAccountId, Long clientAccountId) {
        return null;
    }
    
    public List<AgentInformationDTO> getOwners(Long bankAccountId) {
        return null;
    }
    
    public AccountInformationDTO changeCurrency(Long bankAccountId, Long currencyId) {
        return null;
    }
    
    public AccountInformationDTO deactivate(Long bankAccountId) {
        return null;
    }
    
    public AccountInformationDTO activate(Long bankAccountId) {
        return null;
    }

    public List<TransactionHistoryDTO> getTransactionHistory(Long bankAccountId) {
        return null;
    }
    
    public List<DepositHistoryDTO> getDepositHistory(Long bankAccountId) {
        return null;
    }
    
    public List<WithdrawalHistoryDTO> getWithdrawalsHistory(Long bankAccountId) {
        return null;
    }
    
    public AccountInformationDTO createBankAccount() {
        return null;
    }
}
