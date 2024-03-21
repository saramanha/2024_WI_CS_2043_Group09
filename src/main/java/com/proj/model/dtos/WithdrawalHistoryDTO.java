package com.proj.model.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class WithdrawalHistoryDTO {
    
    
    
    private Long id;

    
    
    private AgentInformationDTO agent;

    
    
    private AccountInformationDTO accountInformation;

    
    
    private TransactionStatusDTO transactionStatus;
    
    
    private BigDecimal sumInitial;

    
    
    private CurrencyDTO withdrawalCurrency;

    
    private BigDecimal sumConverted;

    
    private LocalDateTime dateTimeInitiated;

    public WithdrawalHistoryDTO(Long id, AgentInformationDTO agent, AccountInformationDTO accountInformation,
            TransactionStatusDTO transactionStatus, BigDecimal sumInitial, CurrencyDTO withdrawalCurrency,
            BigDecimal sumConverted, LocalDateTime dateTimeInitiated) {
        this.id = id;
        this.agent = agent;
        this.accountInformation = accountInformation;
        this.transactionStatus = transactionStatus;
        this.sumInitial = sumInitial;
        this.withdrawalCurrency = withdrawalCurrency;
        this.sumConverted = sumConverted;
        this.dateTimeInitiated = dateTimeInitiated;
    }

    public WithdrawalHistoryDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AgentInformationDTO getAgent() {
        return agent;
    }

    public void setAgent(AgentInformationDTO agent) {
        this.agent = agent;
    }

    public AccountInformationDTO getAccountInformation() {
        return accountInformation;
    }

    public void setAccountInformation(AccountInformationDTO accountInformation) {
        this.accountInformation = accountInformation;
    }

    public TransactionStatusDTO getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatusDTO transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public BigDecimal getSumInitial() {
        return sumInitial;
    }

    public void setSumInitial(BigDecimal sumInitial) {
        this.sumInitial = sumInitial;
    }

    public CurrencyDTO getDepositCurrency() {
        return withdrawalCurrency;
    }

    public void setDepositCurrency(CurrencyDTO withdrawalCurrency) {
        this.withdrawalCurrency = withdrawalCurrency;
    }

    public BigDecimal getSumConverted() {
        return sumConverted;
    }

    public void setSumConverted(BigDecimal sumConverted) {
        this.sumConverted = sumConverted;
    }

    public LocalDateTime getDateTimeInitiated() {
        return dateTimeInitiated;
    }

    public void setDateTimeInitiated(LocalDateTime dateTimeInitiated) {
        this.dateTimeInitiated = dateTimeInitiated;
    }
}
