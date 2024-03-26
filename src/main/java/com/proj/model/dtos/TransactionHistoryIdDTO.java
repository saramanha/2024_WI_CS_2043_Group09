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
}
