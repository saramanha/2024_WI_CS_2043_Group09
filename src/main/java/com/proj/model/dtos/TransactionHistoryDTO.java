package com.proj.model.dtos;

import java.time.LocalDateTime;

/**
 * A Data Transfer Object (DTO) representing transaction history information.
 */
public class TransactionHistoryDTO {
    private TransactionHistoryIdDTO id; // The unique identifier of the transaction history.
    private DepositHistoryDTO deposit; // The deposit history associated with the transaction.
    private WithdrawalHistoryDTO withdrawal; // The withdrawal history associated with the transaction.
    private TransactionTypeDTO transactionType; // The type of the transaction.
    private TransactionStatusDTO transactionStatus; // The status of the transaction.
    private LocalDateTime transactionInitiationDateTime; // The date and time when the transaction was initiated.
    private LocalDateTime transactionClosureDateTime; // The date and time when the transaction was closed.

    /**
     * Constructs a new TransactionHistoryDTO object with specified parameters.
     * @param id The unique identifier of the transaction history.
     * @param deposit The deposit history associated with the transaction.
     * @param withdrawal The withdrawal history associated with the transaction.
     * @param transactionType The type of the transaction.
     * @param transactionStatus The status of the transaction.
     * @param transactionInitiationDateTime The date and time when the transaction was initiated.
     * @param transactionClosureDateTime The date and time when the transaction was closed.
     */
    public TransactionHistoryDTO(TransactionHistoryIdDTO id, DepositHistoryDTO deposit, WithdrawalHistoryDTO withdrawal,
            TransactionTypeDTO transactionType, TransactionStatusDTO transactionStatus,
            LocalDateTime transactionInitiationDateTime, LocalDateTime transactionClosureDateTime) {
        this.id = id;
        this.deposit = deposit;
        this.withdrawal = withdrawal;
        this.transactionType = transactionType;
        this.transactionStatus = transactionStatus;
        this.transactionInitiationDateTime = transactionInitiationDateTime;
        this.transactionClosureDateTime = transactionClosureDateTime;
    }

    /**
     * Default constructor for TransactionHistoryDTO.
     */
    public TransactionHistoryDTO() {
    }

        /**
     * Retrieves the unique identifier of the transaction history.
     * @return The unique identifier of the transaction history.
     */
    public TransactionHistoryIdDTO getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the transaction history.
     * @param id The unique identifier to be set.
     */
    public void setId(TransactionHistoryIdDTO id) {
        this.id = id;
    }

    /**
     * Retrieves the deposit history associated with the transaction.
     * @return The deposit history associated with the transaction.
     */
    public DepositHistoryDTO getDeposit() {
        return deposit;
    }

    /**
     * Sets the deposit history associated with the transaction.
     * @param deposit The deposit history to be set.
     */
    public void setDeposit(DepositHistoryDTO deposit) {
        this.deposit = deposit;
    }

    /**
     * Retrieves the withdrawal history associated with the transaction.
     * @return The withdrawal history associated with the transaction.
     */
    public WithdrawalHistoryDTO getWithdrawal() {
        return withdrawal;
    }

    /**
     * Sets the withdrawal history associated with the transaction.
     * @param withdrawal The withdrawal history to be set.
     */
    public void setWithdrawal(WithdrawalHistoryDTO withdrawal) {
        this.withdrawal = withdrawal;
    }

    /**
     * Retrieves the type of the transaction.
     * @return The type of the transaction.
     */
    public TransactionTypeDTO getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the type of the transaction.
     * @param transactionType The transaction type to be set.
     */
    public void setTransactionType(TransactionTypeDTO transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * Retrieves the status of the transaction.
     * @return The status of the transaction.
     */
    public TransactionStatusDTO getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the status of the transaction.
     * @param transactionStatus The transaction status to be set.
     */
    public void setTransactionStatus(TransactionStatusDTO transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    /**
     * Retrieves the date and time when the transaction was initiated.
     * @return The date and time when the transaction was initiated.
     */
    public LocalDateTime getTransactionInitiationDateTime() {
        return transactionInitiationDateTime;
    }

    /**
     * Sets the date and time when the transaction was initiated.
     * @param transactionInitiationDateTime The initiation date and time to be set.
     */
    public void setTransactionInitiationDateTime(LocalDateTime transactionInitiationDateTime) {
        this.transactionInitiationDateTime = transactionInitiationDateTime;
    }

    /**
     * Retrieves the date and time when the transaction was closed.
     * @return The date and time when the transaction was closed.
     */
    public LocalDateTime getTransactionClosureDateTime() {
        return transactionClosureDateTime;
    }

    /**
     * Sets the date and time when the transaction was closed.
     * @param transactionClosureDateTime The closure date and time to be set.
     */
    public void setTransactionClosureDateTime(LocalDateTime transactionClosureDateTime) {
        this.transactionClosureDateTime = transactionClosureDateTime;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((deposit == null) ? 0 : deposit.hashCode());
        result = prime * result + ((withdrawal == null) ? 0 : withdrawal.hashCode());
        result = prime * result + ((transactionType == null) ? 0 : transactionType.hashCode());
        result = prime * result + ((transactionStatus == null) ? 0 : transactionStatus.hashCode());
        result = prime * result
                + ((transactionInitiationDateTime == null) ? 0 : transactionInitiationDateTime.hashCode());
        result = prime * result + ((transactionClosureDateTime == null) ? 0 : transactionClosureDateTime.hashCode());
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
        TransactionHistoryDTO other = (TransactionHistoryDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (deposit == null) {
            if (other.deposit != null)
                return false;
        } else if (!deposit.equals(other.deposit))
            return false;
        if (withdrawal == null) {
            if (other.withdrawal != null)
                return false;
        } else if (!withdrawal.equals(other.withdrawal))
            return false;
        if (transactionType == null) {
            if (other.transactionType != null)
                return false;
        } else if (!transactionType.equals(other.transactionType))
            return false;
        if (transactionStatus == null) {
            if (other.transactionStatus != null)
                return false;
        } else if (!transactionStatus.equals(other.transactionStatus))
            return false;
        if (transactionInitiationDateTime == null) {
            if (other.transactionInitiationDateTime != null)
                return false;
        } else if (!transactionInitiationDateTime.equals(other.transactionInitiationDateTime))
            return false;
        if (transactionClosureDateTime == null) {
            if (other.transactionClosureDateTime != null)
                return false;
        } else if (!transactionClosureDateTime.equals(other.transactionClosureDateTime))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "TransactionHistoryDTO [id=" + id + ", deposit=" + deposit + ", withdrawal=" + withdrawal
                + ", transactionType=" + transactionType + ", transactionStatus=" + transactionStatus
                + ", transactionInitiationDateTime=" + transactionInitiationDateTime + ", transactionClosureDateTime="
                + transactionClosureDateTime + "]";
    }
}


