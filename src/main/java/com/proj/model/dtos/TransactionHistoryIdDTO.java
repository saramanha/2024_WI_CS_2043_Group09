package com.proj.model.dtos;

public class TransactionHistoryIdDTO {
    private Long withdrawalId;
    private Long depositId;

    /**
     * Constructs a TransactionHistoryIdDTO object with the specified withdrawal and deposit IDs.
     * @param withdrawalId The ID of the associated withdrawal.
     * @param depositId The ID of the associated deposit.
     */
    public TransactionHistoryIdDTO(Long withdrawalId, Long depositId) {
        this.withdrawalId = withdrawalId;
        this.depositId = depositId;
    }

    /**
     * Constructs a TransactionHistoryIdDTO object with default values.
     */
    public TransactionHistoryIdDTO() {
    }

    /**
     * Retrieves the ID of the associated withdrawal.
     * @return The ID of the associated withdrawal.
     */
    public Long getWithdrawalId() {
        return withdrawalId;
    }

    /**
     * Sets the ID of the associated withdrawal.
     * @param withdrawalId The ID of the associated withdrawal to be set.
     */
    public void setWithdrawalId(Long withdrawalId) {
        this.withdrawalId = withdrawalId;
    }

    /**
     * Retrieves the ID of the associated deposit.
     * @return The ID of the associated deposit.
     */
    public Long getDepositId() {
        return depositId;
    }

    /**
     * Sets the ID of the associated deposit.
     * @param depositId The ID of the associated deposit to be set.
     */
    public void setDepositId(Long depositId) {
        this.depositId = depositId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((withdrawalId == null) ? 0 : withdrawalId.hashCode());
        result = prime * result + ((depositId == null) ? 0 : depositId.hashCode());
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
        TransactionHistoryIdDTO other = (TransactionHistoryIdDTO) obj;
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

    @Override
    public String toString() {
        return "TransactionHistoryIdDTO [withdrawalId=" + withdrawalId + ", depositId=" + depositId + "]";
    }
}
