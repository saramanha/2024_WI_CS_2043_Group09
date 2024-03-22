package com.proj.model.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;



public class DepositHistoryDTO {
    private Long id;
    private AgentInformationDTO agent;
    private AccountInformationDTO accountInformation;
    private TransactionStatusDTO transactionStatus;
    private BigDecimal sumInitial;
    private CurrencyDTO depositCurrency;
    private BigDecimal sumConverted;
    private LocalDateTime dateTimeInitiated;

    public DepositHistoryDTO(Long id, AgentInformationDTO agent, AccountInformationDTO accountInformation,
            TransactionStatusDTO transactionStatus, BigDecimal sumInitial, CurrencyDTO depositCurrency,
            BigDecimal sumConverted, LocalDateTime dateTimeInitiated) {
        this.id = id;
        this.agent = agent;
        this.accountInformation = accountInformation;
        this.transactionStatus = transactionStatus;
        this.sumInitial = sumInitial;
        this.depositCurrency = depositCurrency;
        this.sumConverted = sumConverted;
        this.dateTimeInitiated = dateTimeInitiated;
    }

    public DepositHistoryDTO() {
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
        return depositCurrency;
    }

    public void setDepositCurrency(CurrencyDTO depositCurrency) {
        this.depositCurrency = depositCurrency;
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
