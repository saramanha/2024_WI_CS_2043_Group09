package com.database.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.database.embeddables.TransactionHistoryId;

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
}
