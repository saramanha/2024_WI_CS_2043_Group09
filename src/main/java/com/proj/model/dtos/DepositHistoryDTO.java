package com.proj.model.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Represents a deposit history in the application.
 */
public class DepositHistoryDTO {
    private Long id;                                // Identifier for the deposit history
    private AgentInformationDTO agent;              // Agent associated with the deposit
    private AccountInformationDTO accountInformation;  // Account information associated with the deposit
    private TransactionStatusDTO transactionStatus; // Status of the deposit transaction
    private BigDecimal sumInitial;                  // Initial sum deposited
    private CurrencyDTO depositCurrency;            // Currency used for the deposit
    private BigDecimal sumConverted;                // Converted sum after currency conversion
    private LocalDateTime dateTimeInitiated;        // Date and time when the deposit was initiated

    /**
     * Constructs a new DepositHistoryDTO with the specified parameters.
     * 
     * @param id                  The identifier for the deposit history.
     * @param agent               The agent associated with the deposit.
     * @param accountInformation The account information associated with the deposit.
     * @param transactionStatus   The status of the deposit transaction.
     * @param sumInitial          The initial sum deposited.
     * @param depositCurrency     The currency used for the deposit.
     * @param sumConverted        The converted sum after currency conversion.
     * @param dateTimeInitiated   The date and time when the deposit was initiated.
     */
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

    /**
     * Default constructor for DepositHistoryDTO.
     */
    public DepositHistoryDTO() {
    }

    // Getters and setters for the attributes

    /**
     * Retrieves the identifier for the deposit history.
     * 
     * @return The identifier for the deposit history.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the identifier for the deposit history.
     * 
     * @param id The identifier for the deposit history.
     */
    public void setId(Long id) {
        this.id = id;
    }

   /**
     * Retrieves the agent associated with the deposit.
     *
     * @return The agent associated with the deposit.
     */
    public AgentInformationDTO getAgent() {
        return agent;
    }

    /**
     * Sets the agent associated with the deposit.
     *
     * @param agent The agent associated with the deposit.
     */
    public void setAgent(AgentInformationDTO agent) {
        this.agent = agent;
    }

    /**
     * Retrieves the account information associated with the deposit.
     *
     * @return The account information associated with the deposit.
     */
    public AccountInformationDTO getAccountInformation() {
        return accountInformation;
    }

    /**
     * Sets the account information associated with the deposit.
     *
     * @param accountInformation The account information associated with the deposit.
     */
    public void setAccountInformation(AccountInformationDTO accountInformation) {
        this.accountInformation = accountInformation;
    }

    /**
     * Retrieves the transaction status of the deposit.
     *
     * @return The transaction status of the deposit.
     */
    public TransactionStatusDTO getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the transaction status of the deposit.
     *
     * @param transactionStatus The transaction status of the deposit.
     */
    public void setTransactionStatus(TransactionStatusDTO transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    /**
     * Retrieves the initial sum deposited.
     *
     * @return The initial sum deposited.
     */
    public BigDecimal getSumInitial() {
        return sumInitial;
    }

    /**
     * Sets the initial sum deposited.
     *
     * @param sumInitial The initial sum deposited.
     */
    public void setSumInitial(BigDecimal sumInitial) {
        this.sumInitial = sumInitial;
    }

    /**
     * Retrieves the currency used for the deposit.
     *
     * @return The currency used for the deposit.
     */
    public CurrencyDTO getDepositCurrency() {
        return depositCurrency;
    }

    /**
     * Sets the currency used for the deposit.
     *
     * @param depositCurrency The currency used for the deposit.
     */
    public void setDepositCurrency(CurrencyDTO depositCurrency) {
        this.depositCurrency = depositCurrency;
    }

    /**
     * Retrieves the converted sum after currency conversion.
     *
     * @return The converted sum after currency conversion.
     */
    public BigDecimal getSumConverted() {
        return sumConverted;
    }

    /**
     * Sets the converted sum after currency conversion.
     *
     * @param sumConverted The converted sum after currency conversion.
     */
    public void setSumConverted(BigDecimal sumConverted) {
        this.sumConverted = sumConverted;
    }

    /**
     * Retrieves the date and time when the deposit was initiated.
     *
     * @return The date and time when the deposit was initiated.
     */
    public LocalDateTime getDateTimeInitiated() {
        return dateTimeInitiated;
    }

    /**
     * Sets the date and time when the deposit was initiated.
     *
     * @param dateTimeInitiated The date and time when the deposit was initiated.
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
        result = prime * result + ((depositCurrency == null) ? 0 : depositCurrency.hashCode());
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
        DepositHistoryDTO other = (DepositHistoryDTO) obj;
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
        if (depositCurrency == null) {
            if (other.depositCurrency != null)
                return false;
        } else if (!depositCurrency.equals(other.depositCurrency))
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
        return "DepositHistoryDTO [id=" + id + ", agent=" + agent + ", accountInformation=" + accountInformation
                + ", transactionStatus=" + transactionStatus + ", sumInitial=" + sumInitial + ", depositCurrency="
                + depositCurrency + ", sumConverted=" + sumConverted + ", dateTimeInitiated=" + dateTimeInitiated + "]";
    }
}
