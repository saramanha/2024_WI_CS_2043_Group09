package com.proj.model.entities;

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
import javax.persistence.CascadeType;

@Entity
@Table(name = "withdrawal_history")
public class WithdrawalHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "withdrawal_id")
    private Long id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "agent_id")
    private AgentInformationEntity agent;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "account_information_id")
    private AccountInformationEntity accountInformation;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "transaction_status_id")
    private TransactionStatusEntity transactionStatus;
    
    @Column(name = "sum_initial")
    private BigDecimal sumInitial;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "withdrawal_currency_id")
    private CurrencyEntity withdrawalCurrency;

    @Column(name = "sum_converted")
    private BigDecimal sumConverted;

    @Column(name = "date_time_initiated")
    private LocalDateTime dateTimeInitiated;

    /**
     * Constructs a new WithdrawalHistoryEntity object with the given parameters.
     * 
     * @param id                    The id of the withdrawal history.
     * @param agent                 The agent associated with the withdrawal.
     * @param accountInformation    The account information associated with the withdrawal.
     * @param transactionStatus     The status of the withdrawal transaction.
     * @param sumInitial            The initial sum of the withdrawal.
     * @param withdrawalCurrency    The currency used for withdrawal.
     * @param sumConverted          The converted sum of the withdrawal.
     * @param dateTimeInitiated     The date and time when the withdrawal was initiated.
     */
    public WithdrawalHistoryEntity(Long id, AgentInformationEntity agent, AccountInformationEntity accountInformation,
            TransactionStatusEntity transactionStatus, BigDecimal sumInitial, CurrencyEntity withdrawalCurrency,
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

    /**
     * Default constructor for the WithdrawalHistoryEntity class.
     */
    public WithdrawalHistoryEntity() {
    }

    /**
     * Retrieves the ID of the withdrawal history.
     * 
     * @return The ID of the withdrawal history.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the withdrawal history.
     * 
     * @param id The ID of the withdrawal history.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the agent associated with the withdrawal.
     * 
     * @return The agent associated with the withdrawal.
     */
    public AgentInformationEntity getAgent() {
        return agent;
    }

    /**
     * Sets the agent associated with the withdrawal.
     * 
     * @param agent The agent associated with the withdrawal.
     */
    public void setAgent(AgentInformationEntity agent) {
        this.agent = agent;
    }

    /**
     * Retrieves the account information associated with the withdrawal.
     * 
     * @return The account information associated with the withdrawal.
     */
    public AccountInformationEntity getAccountInformation() {
        return accountInformation;
    }

    /**
     * Sets the account information associated with the withdrawal.
     * 
     * @param accountInformation The account information associated with the withdrawal.
     */
    public void setAccountInformation(AccountInformationEntity accountInformation) {
        this.accountInformation = accountInformation;
    }

    /**
     * Retrieves the transaction status of the withdrawal.
     * 
     * @return The transaction status of the withdrawal.
     */
    public TransactionStatusEntity getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the transaction status of the withdrawal.
     * 
     * @param transactionStatus The transaction status of the withdrawal.
     */
    public void setTransactionStatus(TransactionStatusEntity transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    /**
     * Retrieves the initial sum of the withdrawal.
     * 
     * @return The initial sum of the withdrawal.
     */
    public BigDecimal getSumInitial() {
        return sumInitial;
    }

    /**
     * Sets the initial sum of the withdrawal.
     * 
     * @param sumInitial The initial sum of the withdrawal.
     */
    public void setSumInitial(BigDecimal sumInitial) {
        this.sumInitial = sumInitial;
    }

    /**
     * Retrieves the currency used for withdrawal.
     * 
     * @return The currency used for withdrawal.
     */
    public CurrencyEntity getWithdrawalCurrency() {
        return withdrawalCurrency;
    }

    /**
     * Sets the currency used for withdrawal.
     * 
     * @param withdrawalCurrency The currency used for withdrawal.
     */
    public void setWithdrawalCurrency(CurrencyEntity withdrawalCurrency) {
        this.withdrawalCurrency = withdrawalCurrency;
    }

    /**
     * Retrieves the converted sum of the withdrawal.
     * 
     * @return The converted sum of the withdrawal.
     */
    public BigDecimal getSumConverted() {
        return sumConverted;
    }

    /**
     * Sets the converted sum of the withdrawal.
     * 
     * @param sumConverted The converted sum of the withdrawal.
     */
    public void setSumConverted(BigDecimal sumConverted) {
        this.sumConverted = sumConverted;
    }

    /**
     * Retrieves the date and time when the withdrawal was initiated.
     * 
     * @return The date and time when the withdrawal was initiated.
     */
    public LocalDateTime getDateTimeInitiated() {
        return dateTimeInitiated;
    }

    /**
     * Sets the date and time when the withdrawal was initiated.
     * 
     * @param dateTimeInitiated The date and time when the withdrawal was initiated.
     */
    public void setDateTimeInitiated(LocalDateTime dateTimeInitiated) {
        this.dateTimeInitiated = dateTimeInitiated;
    }
}
