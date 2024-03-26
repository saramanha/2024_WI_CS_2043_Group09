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
}
