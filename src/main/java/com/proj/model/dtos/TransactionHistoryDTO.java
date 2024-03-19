package com.proj.model.dtos;

import java.time.LocalDateTime;

public class TransactionHistoryDTO {
    
    private TransactionHistoryIdDTO id;

    
    
    
    private DepositHistoryDTO deposit;

    
    
    
    private WithdrawalHistoryDTO withdrawal;

    
    
    private TransactionTypeDTO transactionType;

    
    
    private TransactionStatusDTO transactionStatus;

    
    private LocalDateTime transactionInitiationDateTime;

    
    private LocalDateTime transactionClosureDateTime;

    public TransactionHistoryIdDTO getId() {
        return id;
    }

    public void setId(TransactionHistoryIdDTO id) {
        this.id = id;
    }

    public DepositHistoryDTO getDeposit() {
        return deposit;
    }

    public void setDeposit(DepositHistoryDTO deposit) {
        this.deposit = deposit;
    }

    public WithdrawalHistoryDTO getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(WithdrawalHistoryDTO withdrawal) {
        this.withdrawal = withdrawal;
    }

    public TransactionTypeDTO getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionTypeDTO transactionType) {
        this.transactionType = transactionType;
    }

    public TransactionStatusDTO getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatusDTO transactionStatus) {
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
