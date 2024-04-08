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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((agent == null) ? 0 : agent.hashCode());
        result = prime * result + ((accountInformation == null) ? 0 : accountInformation.hashCode());
        result = prime * result + ((transactionStatus == null) ? 0 : transactionStatus.hashCode());
        result = prime * result + ((sumInitial == null) ? 0 : sumInitial.hashCode());
        result = prime * result + ((withdrawalCurrency == null) ? 0 : withdrawalCurrency.hashCode());
        result = prime * result + ((sumConverted == null) ? 0 : sumConverted.hashCode());
        result = prime * result + ((dateTimeInitiated == null) ? 0 : dateTimeInitiated.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WithdrawalHistoryDTO other = (WithdrawalHistoryDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (agent == null) {
            if (other.agent != null)
                return false;
        } else if (!agent.equals(other.agent))
            return false;
        if (accountInformation == null) {
            if (other.accountInformation != null)
                return false;
        } else if (!accountInformation.equals(other.accountInformation))
            return false;
        if (transactionStatus == null) {
            if (other.transactionStatus != null)
                return false;
        } else if (!transactionStatus.equals(other.transactionStatus))
            return false;
        if (sumInitial == null) {
            if (other.sumInitial != null)
                return false;
        } else if (!sumInitial.equals(other.sumInitial))
            return false;
        if (withdrawalCurrency == null) {
            if (other.withdrawalCurrency != null)
                return false;
        } else if (!withdrawalCurrency.equals(other.withdrawalCurrency))
            return false;
        if (sumConverted == null) {
            if (other.sumConverted != null)
                return false;
        } else if (!sumConverted.equals(other.sumConverted))
            return false;
        if (dateTimeInitiated == null) {
            if (other.dateTimeInitiated != null)
                return false;
        } else if (!dateTimeInitiated.equals(other.dateTimeInitiated))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "WithdrawalHistoryDTO [id=" + id + ", agent=" + agent + ", accountInformation=" + accountInformation
                + ", transactionStatus=" + transactionStatus + ", sumInitial=" + sumInitial + ", withdrawalCurrency="
                + withdrawalCurrency + ", sumConverted=" + sumConverted + ", dateTimeInitiated=" + dateTimeInitiated
                + "]";
    }
}
