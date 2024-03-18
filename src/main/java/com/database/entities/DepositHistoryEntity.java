package com.database.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "deposit_history")
public class DepositHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deposit_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "agent_id")
    private AgentInformationEntity agent;

    @ManyToOne
    @JoinColumn(name = "account_information_id")
    private AccountInformationEntity accountInformation;

    @ManyToOne
    @JoinColumn(name = "transaction_status_id")
    private TransactionStatusEntity transactionStatus;
    
    @Column(name = "sum_initial")
    private BigDecimal sumInitial;

    @ManyToOne
    @JoinColumn(name = "deposit_currency_id")
    private CurrencyEntity depositCurrency;

    @Column(name = "sum_converted")
    private BigDecimal sumConverted;

    @Column(name = "date_time_initiated")
    private LocalDateTime dateTimeInitiated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AgentInformationEntity getAgent() {
        return agent;
    }

    public void setAgent(AgentInformationEntity agent) {
        this.agent = agent;
    }

    public AccountInformationEntity getAccountInformation() {
        return accountInformation;
    }

    public void setAccountInformation(AccountInformationEntity accountInformation) {
        this.accountInformation = accountInformation;
    }

    public TransactionStatusEntity getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatusEntity transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public BigDecimal getSumInitial() {
        return sumInitial;
    }

    public void setSumInitial(BigDecimal sumInitial) {
        this.sumInitial = sumInitial;
    }

    public CurrencyEntity getDepositCurrency() {
        return depositCurrency;
    }

    public void setDepositCurrency(CurrencyEntity depositCurrency) {
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
