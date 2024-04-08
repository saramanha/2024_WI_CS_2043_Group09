package com.proj.model.dtos;

/**
 * Represents a data transfer object (DTO) for the identifier of the junction between a client and an account.
 */
public class Client_AccountJunctionIdDTO {
    private Long agentId; // The identifier of the associated agent.
    private Long accountInformationId; // The identifier of the associated account information.

    /**
     * Constructs a new Client_AccountJunctionIdDTO object with the given parameters.
     * 
     * @param agentId              The identifier of the associated agent.
     * @param accountInformationId The identifier of the associated account information.
     */
    public Client_AccountJunctionIdDTO(Long agentId, Long accountInformationId) {
        this.agentId = agentId;
        this.accountInformationId = accountInformationId;
    }

    /**
     * Constructs a new empty Client_AccountJunctionIdDTO object.
     */
    public Client_AccountJunctionIdDTO() {
    }

    /**
     * Retrieves the identifier of the associated agent.
     * 
     * @return The agent identifier.
     */
    public Long getAgentId() {
        return agentId;
    }

    /**
     * Sets the identifier of the associated agent.
     * 
     * @param agentId The agent identifier to set.
     */
    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    /**
     * Retrieves the identifier of the associated account information.
     * 
     * @return The account information identifier.
     */
    public Long getAccountInformationId() {
        return accountInformationId;
    }

    /**
     * Sets the identifier of the associated account information.
     * 
     * @param accountInformationId The account information identifier to set.
     */
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
        Client_AccountJunctionIdDTO other = (Client_AccountJunctionIdDTO) obj;
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

    @Override
    public String toString() {
        return "Client_AccountJunctionIdDTO [agentId=" + agentId + ", accountInformationId=" + accountInformationId
                + "]";
    }
}
