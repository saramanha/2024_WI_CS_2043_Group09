package com.proj.model.embeddables;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Client_AccountJunctionId implements Serializable{
    @Column(name = "agent_id")
    private Long agentId;

    @Column(name = "account_information_id")
    private Long accountInformationId;

    public Client_AccountJunctionId(Long agentId, Long accountInformationId) {
        this.agentId = agentId;
        this.accountInformationId = accountInformationId;
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public Long getAccountInformationId() {
        return accountInformationId;
    }

    public void setAccountInformationId(Long accountInformationId) {
        this.accountInformationId = accountInformationId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((agentId == null) ? 0 : agentId.hashCode());
        result = prime * result + ((accountInformationId == null) ? 0 : accountInformationId.hashCode());
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
        Client_AccountJunctionId other = (Client_AccountJunctionId) obj;
        if (agentId == null) {
            if (other.agentId != null)
                return false;
        } else if (!agentId.equals(other.agentId))
            return false;
        if (accountInformationId == null) {
            if (other.accountInformationId != null)
                return false;
        } else if (!accountInformationId.equals(other.accountInformationId))
            return false;
        return true;
    }
}
