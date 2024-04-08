package com.proj.model.dtos;

/**
 * Represents a data transfer object (DTO) for the junction between a client and an account.
 */
public class Client_AccountJunctionDTO {
    private Client_AccountJunctionIdDTO id; // The unique identifier of the junction.
    private AgentInformationDTO agent; // The agent associated with the junction.
    private AccountInformationDTO account; // The account associated with the junction.
    private String relationshipDescription; // The description of the relationship between the client and the account.

    /**
     * Constructs a new Client_AccountJunctionDTO object with the given parameters.
     * 
     * @param id                      The unique identifier of the junction.
     * @param agent                   The agent associated with the junction.
     * @param account                 The account associated with the junction.
     * @param relationshipDescription The description of the relationship between the client and the account.
     */
    public Client_AccountJunctionDTO(Client_AccountJunctionIdDTO id, AgentInformationDTO agent,
            AccountInformationDTO account, String relationshipDescription) {
        this.id = id;
        this.agent = agent;
        this.account = account;
        this.relationshipDescription = relationshipDescription;
    }

    /**
     * Constructs a new empty Client_AccountJunctionDTO object.
     */
    public Client_AccountJunctionDTO() {
    }

    /**
     * Retrieves the unique identifier of the junction.
     * 
     * @return The unique identifier of the junction.
     */
    public Client_AccountJunctionIdDTO getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the junction.
     * 
     * @param id The unique identifier to set.
     */
    public void setId(Client_AccountJunctionIdDTO id) {
        this.id = id;
    }

    /**
     * Retrieves the agent associated with the junction.
     * 
     * @return The agent associated with the junction.
     */
    public AgentInformationDTO getAgent() {
        return agent;
    }

    /**
     * Sets the agent associated with the junction.
     * 
     * @param agent The agent to set.
     */
    public void setAgent(AgentInformationDTO agent) {
        this.agent = agent;
    }

    /**
     * Retrieves the account associated with the junction.
     * 
     * @return The account associated with the junction.
     */
    public AccountInformationDTO getAccount() {
        return account;
    }

    /**
     * Sets the account associated with the junction.
     * 
     * @param account The account to set.
     */
    public void setAccount(AccountInformationDTO account) {
        this.account = account;
    }

    /**
     * Retrieves the description of the relationship between the client and the account.
     * 
     * @return The relationship description.
     */
    public String getRelationshipDescription() {
        return relationshipDescription;
    }

    /**
     * Sets the description of the relationship between the client and the account.
     * 
     * @param relationshipDescription The relationship description to set.
     */
    public void setRelationshipDescription(String relationshipDescription) {
        this.relationshipDescription = relationshipDescription;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((agent == null) ? 0 : agent.hashCode());
        result = prime * result + ((account == null) ? 0 : account.hashCode());
        result = prime * result + ((relationshipDescription == null) ? 0 : relationshipDescription.hashCode());
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
        Client_AccountJunctionDTO other = (Client_AccountJunctionDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (agent == null) {
            if (other.agent != null)
                return false;
        } else if (!agent.equals(other.agent))
            return false;
        if (account == null) {
            if (other.account != null)
                return false;
        } else if (!account.equals(other.account))
            return false;
        if (relationshipDescription == null) {
            if (other.relationshipDescription != null)
                return false;
        } else if (!relationshipDescription.equals(other.relationshipDescription))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Client_AccountJunctionDTO [id=" + id + ", agent=" + agent + ", account=" + account
                + ", relationshipDescription=" + relationshipDescription + "]";
    }
}
