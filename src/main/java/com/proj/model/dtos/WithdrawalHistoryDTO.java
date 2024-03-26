package com.proj.model.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * A DTO (Data Transfer Object) representing the history of a withdrawal transaction.
 */
public class WithdrawalHistoryDTO {
    private Long id; // The unique identifier of the withdrawal history.
    private AgentInformationDTO agent; // The agent associated with the withdrawal.
    private AccountInformationDTO accountInformation; // The account information related to the withdrawal.
    private TransactionStatusDTO transactionStatus; // The status of the withdrawal transaction.
    private BigDecimal sumInitial; // The initial sum of the withdrawal.
    private CurrencyDTO withdrawalCurrency; // The currency used for the withdrawal.
    private BigDecimal sumConverted; // The converted sum of the withdrawal.
    private LocalDateTime dateTimeInitiated; // The date and time when the withdrawal was initiated.

    /**
     * Constructs a WithdrawalHistoryDTO object with the specified parameters.
     * @param id The ID of the withdrawal history.
     * @param agent The agent associated with the withdrawal.
     * @param accountInformation The account information related to the withdrawal.
     * @param transactionStatus The status of the withdrawal transaction.
     * @param sumInitial The initial sum of the withdrawal.
     * @param withdrawalCurrency The currency used for the withdrawal.
     * @param sumConverted The converted sum of the withdrawal.
     * @param dateTimeInitiated The date and time when the withdrawal was initiated.
     */
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

    /**
     * Constructs a WithdrawalHistoryDTO object with default values.
     */
    public WithdrawalHistoryDTO() {
    }

       /**
     * Retrieves the ID of the withdrawal history.
     * @return The ID of the withdrawal history.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the withdrawal history.
     * @param id The ID to be set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the agent associated with the withdrawal.
     * @return The agent associated with the withdrawal.
     */
    public AgentInformationDTO getAgent() {
        return agent;
    }

    /**
     * Sets the agent associated with the withdrawal.
     * @param agent The agent to be set.
     */
    public void setAgent(AgentInformationDTO agent) {
        this.agent = agent;
    }

    /**
     * Retrieves the account information related to the withdrawal.
     * @return The account information related to the withdrawal.
     */
    public AccountInformationDTO getAccountInformation() {
        return accountInformation;
    }

    /**
     * Sets the account information related to the withdrawal.
     * @param accountInformation The account information to be set.
     */
    public void setAccountInformation(AccountInformationDTO accountInformation) {
        this.accountInformation = accountInformation;
    }

    /**
     * Retrieves the status of the withdrawal transaction.
     * @return The status of the withdrawal transaction.
     */
    public TransactionStatusDTO getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the status of the withdrawal transaction.
     * @param transactionStatus The transaction status to be set.
     */
    public void setTransactionStatus(TransactionStatusDTO transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    /**
     * Retrieves the initial sum of the withdrawal.
     * @return The initial sum of the withdrawal.
     */
    public BigDecimal getSumInitial() {
        return sumInitial;
    }

    /**
     * Sets the initial sum of the withdrawal.
     * @param sumInitial The initial sum to be set.
     */
    public void setSumInitial(BigDecimal sumInitial) {
        this.sumInitial = sumInitial;
    }

    /**
     * Retrieves the currency used for the withdrawal.
     * @return The currency used for the withdrawal.
     */
    public CurrencyDTO getWithdrawalCurrency() {
        return withdrawalCurrency;
    }

    /**
     * Sets the currency used for the withdrawal.
     * @param withdrawalCurrency The withdrawal currency to be set.
     */
    public void setWithdrawalCurrency(CurrencyDTO withdrawalCurrency) {
        this.withdrawalCurrency = withdrawalCurrency;
    }

    /**
     * Retrieves the converted sum of the withdrawal.
     * @return The converted sum of the withdrawal.
     */
    public BigDecimal getSumConverted() {
        return sumConverted;
    }

    /**
     * Sets the converted sum of the withdrawal.
     * @param sumConverted The converted sum to be set.
     */
    public void setSumConverted(BigDecimal sumConverted) {
        this.sumConverted = sumConverted;
    }

    /**
     * Retrieves the date and time when the withdrawal was initiated.
     * @return The date and time when the withdrawal was initiated.
     */
    public LocalDateTime getDateTimeInitiated() {
        return dateTimeInitiated;
    }

    /**
     * Sets the date and time when the withdrawal was initiated.
     * @param dateTimeInitiated The initiation date and time to be set.
     */
    public void setDateTimeInitiated(LocalDateTime dateTimeInitiated) {
        this.dateTimeInitiated = dateTimeInitiated;
    }
}
