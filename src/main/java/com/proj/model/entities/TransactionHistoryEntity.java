package com.proj.model.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.CascadeType;

import com.proj.model.embeddables.TransactionHistoryId;

/**
 * Represents the entity mapping for transaction history.
 */
@Entity
@Table(name = "transaction_history")
public class TransactionHistoryEntity {
    @EmbeddedId
    private TransactionHistoryId id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @MapsId("depositId")
    @JoinColumn(name = "deposit_id")
    private DepositHistoryEntity deposit;

    @ManyToOne(cascade = CascadeType.MERGE)
    @MapsId("withdrawalId")
    @JoinColumn(name = "withdrawal_id")
    private WithdrawalHistoryEntity withdrawal;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "transaction_type_id")
    private TransactionTypeEntity transactionType;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "transaction_status_id")
    private TransactionStatusEntity transactionStatus;

    @Column(name = "transaction_initiation_date_time")
    private LocalDateTime transactionInitiationDateTime;

    @Column(name = "transaction_closure_date_time")
    private LocalDateTime transactionClosureDateTime;

    /**
     * Constructs a transaction history entity with the provided parameters.
     * 
     * @param id                           The transaction history ID.
     * @param deposit                      The associated deposit history entity.
     * @param withdrawal                   The associated withdrawal history entity.
     * @param transactionType              The associated transaction type entity.
     * @param transactionStatus            The associated transaction status entity.
     * @param transactionInitiationDateTime The initiation date and time of the transaction.
     * @param transactionClosureDateTime   The closure date and time of the transaction.
     */
    public TransactionHistoryEntity(TransactionHistoryId id, DepositHistoryEntity deposit,
            WithdrawalHistoryEntity withdrawal, TransactionTypeEntity transactionType,
            TransactionStatusEntity transactionStatus, LocalDateTime transactionInitiationDateTime,
            LocalDateTime transactionClosureDateTime) {
        this.id = id;
        this.deposit = deposit;
        this.withdrawal = withdrawal;
        this.transactionType = transactionType;
        this.transactionStatus = transactionStatus;
        this.transactionInitiationDateTime = transactionInitiationDateTime;
        this.transactionClosureDateTime = transactionClosureDateTime;
    }

    /**
     * Default constructor.
     */
    public TransactionHistoryEntity() {
    }

    // Getters and setters

    /**
     * Retrieves the ID of the transaction history.
     * 
     * @return The transaction history ID.
     */
    public TransactionHistoryId getId() {
        return id;
    }

    /**
     * Sets the ID of the transaction history.
     * 
     * @param id The transaction history ID to set.
     */
    public void setId(TransactionHistoryId id) {
        this.id = id;
    }

       /**
     * Retrieves the associated deposit history entity.
     * 
     * @return The associated deposit history entity.
     */
    public DepositHistoryEntity getDeposit() {
        return deposit;
    }

    /**
     * Sets the associated deposit history entity.
     * 
     * @param deposit The deposit history entity to set.
     */
    public void setDeposit(DepositHistoryEntity deposit) {
        this.deposit = deposit;
    }

    /**
     * Retrieves the associated withdrawal history entity.
     * 
     * @return The associated withdrawal history entity.
     */
    public WithdrawalHistoryEntity getWithdrawal() {
        return withdrawal;
    }

    /**
     * Sets the associated withdrawal history entity.
     * 
     * @param withdrawal The withdrawal history entity to set.
     */
    public void setWithdrawal(WithdrawalHistoryEntity withdrawal) {
        this.withdrawal = withdrawal;
    }

    /**
     * Retrieves the associated transaction type entity.
     * 
     * @return The associated transaction type entity.
     */
    public TransactionTypeEntity getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the associated transaction type entity.
     * 
     * @param transactionType The transaction type entity to set.
     */
    public void setTransactionType(TransactionTypeEntity transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * Retrieves the associated transaction status entity.
     * 
     * @return The associated transaction status entity.
     */
    public TransactionStatusEntity getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the associated transaction status entity.
     * 
     * @param transactionStatus The transaction status entity to set.
     */
    public void setTransactionStatus(TransactionStatusEntity transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    /**
     * Retrieves the initiation date and time of the transaction.
     * 
     * @return The initiation date and time of the transaction.
     */
    public LocalDateTime getTransactionInitiationDateTime() {
        return transactionInitiationDateTime;
    }

    /**
     * Sets the initiation date and time of the transaction.
     * 
     * @param transactionInitiationDateTime The initiation date and time to set.
     */
    public void setTransactionInitiationDateTime(LocalDateTime transactionInitiationDateTime) {
        this.transactionInitiationDateTime = transactionInitiationDateTime;
    }

    /**
     * Retrieves the closure date and time of the transaction.
     * 
     * @return The closure date and time of the transaction.
     */
    public LocalDateTime getTransactionClosureDateTime() {
        return transactionClosureDateTime;
    }

    /**
     * Sets the closure date and time of the transaction.
     * 
     * @param transactionClosureDateTime The closure date and time to set.
     */
    public void setTransactionClosureDateTime(LocalDateTime transactionClosureDateTime) {
        this.transactionClosureDateTime = transactionClosureDateTime;
    }
}
