package com.proj.model.embeddables;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Represents the composite key for the Client_AccountJunction entity, which maps the many-to-many relationship
 * between agents and account information entities.
 */
@Embeddable
public class Client_AccountJunctionId implements Serializable {
    /**
     * The ID of the agent associated with the junction.
     */
    @Column(name = "agent_id")
    private Long agentId;

    /**
     * The ID of the account information associated with the junction.
     */
    @Column(name = "account_information_id")
    private Long accountInformationId;

    /**
     * Constructs a new Client_AccountJunctionId with the specified agent ID and account information ID.
     *
     * @param agentId               The ID of the agent.
     * @param accountInformationId The ID of the account information.
     */
    public Client_AccountJunctionId(Long agentId, Long accountInformationId) {
        this.agentId = agentId;
        this.accountInformationId = accountInformationId;
    }

    /**
     * Retrieves the ID of the agent associated with the junction.
     *
     * @return The agent ID.
     */
    public Long getAgentId() {
        return agentId;
    }

    /**
     * Sets the ID of the agent associated with the junction.
     *
     * @param agentId The agent ID to set.
     */
    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    /**
     * Retrieves the ID of the account information associated with the junction.
     *
     * @return The account information ID.
     */
    public Long getAccountInformationId() {
        return accountInformationId;
    }

    /**
     * Sets the ID of the account information associated with the junction.
     *
     * @param accountInformationId The account information ID to set.
     */
    public void setAccountInformationId(Long accountInformationId) {
        this.accountInformationId = accountInformationId;
    }

    /**
     * Generates a hash code value for the object based on its agent ID and account information ID.
     *
     * @return The hash code value.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((agentId == null) ? 0 : agentId.hashCode());
        result = prime * result + ((accountInformationId == null) ? 0 : accountInformationId.hashCode());
        return result;
    }

    /**
     * Indicates whether some other object is "equal to" this one based on its agent ID and account information ID.
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
