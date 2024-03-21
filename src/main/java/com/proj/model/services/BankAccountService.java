// TODO: create exception system. Scan for activeness of the account

package com.proj.model.services;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proj.model.dtos.AccountInformationDTO;
import com.proj.model.dtos.AgentInformationDTO;
import com.proj.model.dtos.DepositHistoryDTO;
import com.proj.model.dtos.TransactionHistoryDTO;
import com.proj.model.dtos.WithdrawalHistoryDTO;
import com.proj.model.embeddables.Client_AccountJunctionId;
import com.proj.model.embeddables.CurrencyConversionId;
import com.proj.model.embeddables.TransactionHistoryId;
import com.proj.model.entities.AccountInformationEntity;
import com.proj.model.entities.AccountTypeEntity;
import com.proj.model.entities.AgentInformationEntity;
import com.proj.model.entities.Client_AccountJunctionEntity;
import com.proj.model.entities.CurrencyConversionEntity;
import com.proj.model.entities.CurrencyEntity;
import com.proj.model.entities.DepositHistoryEntity;
import com.proj.model.entities.TransactionHistoryEntity;
import com.proj.model.entities.WithdrawalHistoryEntity;
import com.proj.model.mappers.AccountInformationMapper;
import com.proj.model.mappers.AgentInformationMapper;
import com.proj.model.mappers.DepositHistoryMapper;
import com.proj.model.mappers.TransactionHistoryMapper;
import com.proj.model.mappers.WithdrawalHistoryMapper;
import com.proj.model.repositories.AccountInformationRepository;
import com.proj.model.repositories.AccountTypeRepository;
import com.proj.model.repositories.AgentInformationRepository;
import com.proj.model.repositories.Client_AccountJunctionRepository;
import com.proj.model.repositories.CurrencyConversionRepository;
import com.proj.model.repositories.CurrencyRepository;
import com.proj.model.repositories.DepositHistoryRepository;
import com.proj.model.repositories.TransactionHistoryRepository;
import com.proj.model.repositories.TransactionStatusRepository;
import com.proj.model.repositories.TransactionTypeRepository;
import com.proj.model.repositories.WithdrawalHistoryRepository;

// Given a AccountInformationDTO. The service can operate on it doing modifications: deposits, withdrawals, deactivation, activation, 
// and given a second account it can do a transaction (debatable to reduce complexity)
@Service
public class BankAccountService {
    private AccountInformationRepository accountInformationRepo;
    private AgentInformationRepository agentInfoRepo;
    private DepositHistoryRepository depositHistoryRepo;
    private WithdrawalHistoryRepository withdrawalHistoryRepo;
    private Client_AccountJunctionRepository clientAccountJuncRepo;
    private CurrencyConversionRepository currencyConversionRepo;
    private CurrencyRepository currencyRepo;
    private AccountTypeRepository accountTypeRepo;
    private TransactionTypeRepository transactionTypeRepo;
    private TransactionStatusRepository transactionStatusRepo;
    private TransactionHistoryRepository transactionHistoryRepo;

    
    @Autowired
    public BankAccountService(AccountInformationRepository accountInformationRepo,
            AgentInformationRepository agentInfoRepo, DepositHistoryRepository depositHistoryRepo,
            WithdrawalHistoryRepository withdrawalHistoryRepo, Client_AccountJunctionRepository clientAccountJuncRepo,
            CurrencyConversionRepository currencyConversionRepo, CurrencyRepository currencyRepo,
            AccountTypeRepository accountTypeRepo, TransactionTypeRepository transactionTypeRepo,
            TransactionStatusRepository transactionStatusRepo, TransactionHistoryRepository transactionHistoryRepo) {
        this.accountInformationRepo = accountInformationRepo;
        this.agentInfoRepo = agentInfoRepo;
        this.depositHistoryRepo = depositHistoryRepo;
        this.withdrawalHistoryRepo = withdrawalHistoryRepo;
        this.clientAccountJuncRepo = clientAccountJuncRepo;
        this.currencyConversionRepo = currencyConversionRepo;
        this.currencyRepo = currencyRepo;
        this.accountTypeRepo = accountTypeRepo;
        this.transactionTypeRepo = transactionTypeRepo;
        this.transactionStatusRepo = transactionStatusRepo;
        this.transactionHistoryRepo = transactionHistoryRepo;
    }

    // TODO: Set up transaciton status system. Currently null
    @Transactional
    public DepositHistoryDTO deposit(Long bankAccountId, Long clientId, BigDecimal sum, Long currencyId) throws EntityNotFoundException {
        AccountInformationEntity bankAccEntity = accountInformationRepo.findById(bankAccountId).orElseThrow();
        AgentInformationEntity clientAccEntity = agentInfoRepo.findById(clientId).orElseThrow();
        CurrencyEntity depositCurrency = currencyRepo.findById(currencyId).orElseThrow();

        BigDecimal finalSum = sum;
        if(!bankAccEntity.getCurrency().getId().equals(depositCurrency.getId())) {
            CurrencyConversionId currencyConversionId = new CurrencyConversionId(depositCurrency.getId(), bankAccEntity.getCurrency().getId());
            CurrencyConversionEntity currencyConversionRateEntity = currencyConversionRepo.findById(currencyConversionId).orElseThrow();
            finalSum = sum.multiply(BigDecimal.valueOf(currencyConversionRateEntity.getMultRateNumerator()))
                          .divide(BigDecimal.valueOf(currencyConversionRateEntity.getMultRateDenominator()));
        }

        DepositHistoryEntity depositRecord = new DepositHistoryEntity(null,
                                                                clientAccEntity, 
                                                                bankAccEntity, 
                                                                null, 
                                                                sum, 
                                                                depositCurrency, 
                                                                finalSum, 
                                                                LocalDateTime.now());
        depositRecord = depositHistoryRepo.saveAndFlush(depositRecord);
        bankAccEntity.setBankSum(bankAccEntity.getBankSum().add(finalSum));
        accountInformationRepo.saveAndFlush(bankAccEntity);
        return DepositHistoryMapper.INSTANCE.entityToDto(depositRecord);
    }
    
    @Transactional
    public WithdrawalHistoryDTO withdrawal(Long bankAccountId, Long clientId, BigDecimal sum, Long currencyId) throws EntityNotFoundException {
        AccountInformationEntity bankAccEntity = accountInformationRepo.findById(bankAccountId).orElseThrow();
        AgentInformationEntity clientAccEntity = agentInfoRepo.findById(clientId).orElseThrow();
        CurrencyEntity withdrawalCurrency = currencyRepo.findById(currencyId).orElseThrow();

        BigDecimal finalSum = sum;
        if(!bankAccEntity.getCurrency().getId().equals(withdrawalCurrency.getId())) {
            CurrencyConversionId currencyConversionId = new CurrencyConversionId(withdrawalCurrency.getId(), bankAccEntity.getCurrency().getId());
            CurrencyConversionEntity currencyConversionRateEntity = currencyConversionRepo.findById(currencyConversionId).orElseThrow();
            finalSum = sum.multiply(BigDecimal.valueOf(currencyConversionRateEntity.getMultRateNumerator()))
                          .divide(BigDecimal.valueOf(currencyConversionRateEntity.getMultRateDenominator()));
        }

        WithdrawalHistoryEntity withdrawalRecord = new WithdrawalHistoryEntity(null,
                                                                clientAccEntity, 
                                                                bankAccEntity, 
                                                                null, 
                                                                sum, 
                                                                withdrawalCurrency, 
                                                                finalSum, 
                                                                LocalDateTime.now());
        withdrawalRecord = withdrawalHistoryRepo.saveAndFlush(withdrawalRecord);
        bankAccEntity.setBankSum(bankAccEntity.getBankSum().subtract(finalSum));
        accountInformationRepo.saveAndFlush(bankAccEntity);
        return WithdrawalHistoryMapper.INSTANCE.entityToDto(withdrawalRecord);
    }
    
    @Transactional
    public TransactionHistoryDTO processTransaction(Long fromBankAccountId, Long fromClientId, Long toBankAccountId, Long toClientId, BigDecimal sum) 
    throws EntityNotFoundException {
        AgentInformationEntity fromAgentEntity = agentInfoRepo.findById(fromClientId).orElseThrow();
        AgentInformationEntity toAgentEntity = agentInfoRepo.findById(toClientId).orElseThrow();
        AccountInformationEntity fromBankAccount = accountInformationRepo.findById(fromBankAccountId).orElseThrow();
        AccountInformationEntity toBankAccount = accountInformationRepo.findById(toBankAccountId).orElseThrow();

        WithdrawalHistoryEntity withdrawalCheck = WithdrawalHistoryMapper.INSTANCE.dtoToEntity(
            this.withdrawal(fromBankAccountId, fromClientId, sum, fromBankAccount.getCurrency().getId()));

        DepositHistoryEntity depositCheck = DepositHistoryMapper.INSTANCE.dtoToEntity(
            this.deposit(toBankAccountId, toClientId, sum, fromBankAccount.getCurrency().getId())
        );

        TransactionHistoryId transactionId = new TransactionHistoryId(withdrawalCheck.getId(), depositCheck.getId());
        TransactionHistoryEntity transaction = new TransactionHistoryEntity(transactionId,
        depositCheck, withdrawalCheck, null, null, LocalDateTime.now(), LocalDateTime.now());

        return TransactionHistoryMapper.INSTANCE.entityToDto(transactionHistoryRepo.save(transaction));
    }

    @Transactional
    public AccountInformationDTO addOwner(Long bankAccountId, Long clientAccountId, String relationShip) throws EntityNotFoundException {
        AgentInformationEntity agent = agentInfoRepo.findById(clientAccountId).orElseThrow();
        AccountInformationEntity bankAccount = accountInformationRepo.findById(bankAccountId).orElseThrow();

        Client_AccountJunctionId client_accountId = new Client_AccountJunctionId(clientAccountId, bankAccountId);
        if(!clientAccountJuncRepo.existsById(client_accountId)) {
            Client_AccountJunctionEntity newClient_AccountJunc = new Client_AccountJunctionEntity(client_accountId, agent, bankAccount, relationShip);
            clientAccountJuncRepo.save(newClient_AccountJunc);
        }

        return AccountInformationMapper.INSTANCE.entityToDto(accountInformationRepo.findById(bankAccountId).get());
    }
    
    @Transactional
    public AccountInformationDTO removeOwner(Long bankAccountId, Long clientAccountId) throws EntityNotFoundException {
        AgentInformationEntity agent = agentInfoRepo.findById(clientAccountId).orElseThrow();
        AccountInformationEntity bankAccount = accountInformationRepo.findById(bankAccountId).orElseThrow();

        Client_AccountJunctionId client_accountId = new Client_AccountJunctionId(clientAccountId, bankAccountId);
        if(!clientAccountJuncRepo.existsById(client_accountId)) {
            clientAccountJuncRepo.deleteById(client_accountId);
        }

        return AccountInformationMapper.INSTANCE.entityToDto(accountInformationRepo.findById(bankAccountId).get());
    }

    public List<AgentInformationDTO> getOwners(Long bankAccountId) throws EntityNotFoundException {
        AccountInformationEntity bankAccount = accountInformationRepo.findById(bankAccountId).orElseThrow();
        List<Client_AccountJunctionEntity> client_accountLinks = clientAccountJuncRepo.findAllByAccountId(bankAccount.getId());
        ArrayList<AgentInformationDTO> result = new ArrayList<>();
        for(Client_AccountJunctionEntity client_account : client_accountLinks) {
            result.add(AgentInformationMapper.INSTANCE.entityToDto(agentInfoRepo.findById(client_account.getAgent().getId()).orElseThrow()));
        }
        return result;
    }
    
    // public AccountInformationDTO changeCurrency(Long bankAccountId, Long currencyId) {
    //     return null;
    // }
    @Transactional
    public AccountInformationDTO deactivate(Long bankAccountId) throws EntityNotFoundException {
        AccountInformationEntity bankAccount = accountInformationRepo.findById(bankAccountId).orElseThrow();
        bankAccount.setIsActive(false);
        return AccountInformationMapper.INSTANCE.entityToDto(accountInformationRepo.save(bankAccount));
    }
    
    @Transactional
    public AccountInformationDTO activate(Long bankAccountId) throws EntityNotFoundException {
        AccountInformationEntity bankAccount = accountInformationRepo.findById(bankAccountId).orElseThrow();
        bankAccount.setIsActive(true);
        return AccountInformationMapper.INSTANCE.entityToDto(accountInformationRepo.save(bankAccount));
    }

    public List<TransactionHistoryDTO> getTransactionHistory(Long bankAccountId) throws EntityNotFoundException {
        AccountInformationEntity bankAccountEntity = accountInformationRepo.findById(bankAccountId).orElseThrow();
        List<TransactionHistoryEntity> search_result = transactionHistoryRepo.findAllByDepositAccountInformationIdOrWithdrawalAccountInformationId(bankAccountEntity.getId());
        ArrayList<TransactionHistoryDTO> result = new ArrayList<>();

        for (TransactionHistoryEntity e : search_result) {
            result.add(TransactionHistoryMapper.INSTANCE.entityToDto(e));
        }
        return result;
    }
    
    public List<DepositHistoryDTO> getDepositHistory(Long bankAccountId) throws EntityNotFoundException {
        AccountInformationEntity bankAccountEntity = accountInformationRepo.findById(bankAccountId).orElseThrow();
        List<DepositHistoryEntity> search_result = depositHistoryRepo.findAllByAccountInformationId(bankAccountEntity.getId());
        ArrayList<DepositHistoryDTO> result = new ArrayList<>();

        for (DepositHistoryEntity e : search_result) {
            result.add(DepositHistoryMapper.INSTANCE.entityToDto(e));
        }
        return result;
    }
    
    public List<WithdrawalHistoryDTO> getWithdrawalsHistory(Long bankAccountId) throws EntityNotFoundException {
        AccountInformationEntity bankAccountEntity = accountInformationRepo.findById(bankAccountId).orElseThrow();
        List<WithdrawalHistoryEntity> search_result = withdrawalHistoryRepo.findAllByAccountInformationId(bankAccountEntity.getId());
        ArrayList<WithdrawalHistoryDTO> result = new ArrayList<>();

        for (WithdrawalHistoryEntity e : search_result) {
            result.add(WithdrawalHistoryMapper.INSTANCE.entityToDto(e));
        }
        return result;
    }
    
    @Transactional
    public AccountInformationDTO createBankAccount(Long accountTypeId, Long currencyId) throws EntityNotFoundException {
        AccountTypeEntity accountType = accountTypeRepo.findById(accountTypeId).orElseThrow();
        CurrencyEntity currency = currencyRepo.findById(currencyId).orElseThrow();

        AccountInformationEntity bankAccount = new AccountInformationEntity(null, false, new BigDecimal(0), currency, accountType);
        return AccountInformationMapper.INSTANCE.entityToDto(accountInformationRepo.save(bankAccount));
    }
}
