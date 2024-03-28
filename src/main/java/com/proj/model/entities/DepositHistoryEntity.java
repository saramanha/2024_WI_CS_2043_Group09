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

/**
 * Represents the entity mapping for deposit history.
 */
@Entity
@Table(name = "deposit_history")
public class DepositHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deposit_id")
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
    @JoinColumn(name = "deposit_currency_id")
    private CurrencyEntity depositCurrency;

    @Column(name = "sum_converted")
    private BigDecimal sumConverted;

    @Column(name = "date_time_initiated")
    private LocalDateTime dateTimeInitiated;

    /**
     * Constructs a deposit history entity with the provided parameters.
     * 
     * @param id                   The deposit ID.
     * @param agent                The agent associated with the deposit.
     * @param accountInformation   The account information associated with the deposit.
     * @param transactionStatus    The transaction status associated with the deposit.
     * @param sumInitial           The initial sum of the deposit.
     * @param depositCurrency      The currency of the deposit.
     * @param sumConverted         The converted sum of the deposit.
     * @param dateTimeInitiated    The date and time when the deposit was initiated.
     */
    public DepositHistoryEntity(Long id, AgentInformationEntity agent, AccountInformationEntity accountInformation,
            TransactionStatusEntity transactionStatus, BigDecimal sumInitial, CurrencyEntity depositCurrency,
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
     * Default constructor.
     */
    public DepositHistoryEntity() {
    }

    // Getters and setters for the class attributes

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
		DepositHistoryEntity other = (DepositHistoryEntity) obj;
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
}
