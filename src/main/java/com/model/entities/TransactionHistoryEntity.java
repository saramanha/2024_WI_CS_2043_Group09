package com.model.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.model.embeddables.TransactionHistoryId;

@Entity
@Table(name = "transaction_history")
public class TransactionHistoryEntity {
    @EmbeddedId
    private TransactionHistoryId id;

    @ManyToOne
    @MapsId("depositId")
    @JoinColumn(name = "deposit_id")
    private DepositHistoryEntity deposit;

    @ManyToOne
    @MapsId("withdrawalId")
    @JoinColumn(name = "withdrawal_id")
    private WithdrawalHistoryEntity withdrawal;

    @ManyToOne
    @JoinColumn(name = "transaction_type_id")
    private TransactionTypeEntity transactionType;

    @ManyToOne
    @JoinColumn(name = "transaction_status_id")
    private TransactionStatusEntity transactionStatus;

    @Column(name = "transaction_initiation_date_time")
    private LocalDateTime transactionInitiationDateTime;

    @Column(name = "transaction_closure_date_time")
    private LocalDateTime transactionClosureDateTime;

    public TransactionHistoryId getId() {
        return id;
    }

    public void setId(TransactionHistoryId id) {
        this.id = id;
    }

    public DepositHistoryEntity getDeposit() {
        return deposit;
    }

    public void setDeposit(DepositHistoryEntity deposit) {
        this.deposit = deposit;
    }

    public WithdrawalHistoryEntity getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(WithdrawalHistoryEntity withdrawal) {
        this.withdrawal = withdrawal;
    }

    public TransactionTypeEntity getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionTypeEntity transactionType) {
        this.transactionType = transactionType;
    }

    public TransactionStatusEntity getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatusEntity transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public LocalDateTime getTransactionInitiationDateTime() {
        return transactionInitiationDateTime;
    }

    public void setTransactionInitiationDateTime(LocalDateTime transactionInitiationDateTime) {
        this.transactionInitiationDateTime = transactionInitiationDateTime;
    }

    public LocalDateTime getTransactionClosureDateTime() {
        return transactionClosureDateTime;
    }

    public void setTransactionClosureDateTime(LocalDateTime transactionClosureDateTime) {
        this.transactionClosureDateTime = transactionClosureDateTime;
    }
}
