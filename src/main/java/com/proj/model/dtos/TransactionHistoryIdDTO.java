package com.proj.model.dtos;

public class TransactionHistoryIdDTO {
    private Long withdrawalId;
    private Long depositId;
    public TransactionHistoryIdDTO(Long withdrawalId, Long depositId) {
        this.withdrawalId = withdrawalId;
        this.depositId = depositId;
    }
    public TransactionHistoryIdDTO() {
    }
    public Long getWithdrawalId() {
        return withdrawalId;
    }
    public void setWithdrawalId(Long withdrawalId) {
        this.withdrawalId = withdrawalId;
    }
    public Long getDepositId() {
        return depositId;
    }
    public void setDepositId(Long depositId) {
        this.depositId = depositId;
    }
}
