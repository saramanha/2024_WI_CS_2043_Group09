package com.database.embeddables;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TransactionHistoryId implements Serializable{
    @Column(name = "withdrawal_id")
    private Long withdrawalId;

    @Column(name = "deposit_id")
    private Long depositId;

    public TransactionHistoryId(Long withdrawalId, Long depositId) {
        this.withdrawalId = withdrawalId;
        this.depositId = depositId;
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
