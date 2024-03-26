package com.proj.model.embeddables;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Represents the composite key for the TransactionHistory entity, which consists of withdrawalId and depositId.
 */
@Embeddable
public class TransactionHistoryId implements Serializable {
    /**
     * The ID of the withdrawal associated with the transaction.
     */
    @Column(name = "withdrawal_id")
    private Long withdrawalId;

    /**
     * The ID of the deposit associated with the transaction.
     */
    @Column(name = "deposit_id")
    private Long depositId;

    /**
     * Constructs a new TransactionHistoryId with the specified withdrawalId and depositId.
     *
     * @param withdrawalId The ID of the withdrawal associated with the transaction.
     * @param depositId    The ID of the deposit associated with the transaction.
     */
    public TransactionHistoryId(Long withdrawalId, Long depositId) {
        this.withdrawalId = withdrawalId;
        this.depositId = depositId;
    }

    /**
     * Retrieves the ID of the withdrawal associated with the transaction.
     *
     * @return The withdrawalId.
     */
    public Long getWithdrawalId() {
        return withdrawalId;
    }

    /**
     * Sets the ID of the withdrawal associated with the transaction.
     *
     * @param withdrawalId The withdrawalId to set.
     */
    public void setWithdrawalId(Long withdrawalId) {
        this.withdrawalId = withdrawalId;
    }

    /**
     * Retrieves the ID of the deposit associated with the transaction.
     *
     * @return The depositId.
     */
    public Long getDepositId() {
        return depositId;
    }

    /**
     * Sets the ID of the deposit associated with the transaction.
     *
     * @param depositId The depositId to set.
     */
    public void setDepositId(Long depositId) {
        this.depositId = depositId;
    }

    /**
     * Generates a hash code value for the object based on its withdrawalId and depositId.
     *
     * @return The hash code value.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((withdrawalId == null) ? 0 : withdrawalId.hashCode());
        result = prime * result + ((depositId == null) ? 0 : depositId.hashCode());
        return result;
    }

    /**
     * Indicates whether some other object is "equal to" this one based on its withdrawalId and depositId.
     *
     * @param obj The object to compare for equality.
     * @return True if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TransactionHistoryId other = (TransactionHistoryId) obj;
        if (withdrawalId == null) {
            if (other.withdrawalId != null)
                return false;
        } else if (!withdrawalId.equals(other.withdrawalId))
            return false;
        if (depositId == null) {
            if (other.depositId != null)
                return false;
        } else if (!depositId.equals(other.depositId))
            return false;
        return true;
    }
}
