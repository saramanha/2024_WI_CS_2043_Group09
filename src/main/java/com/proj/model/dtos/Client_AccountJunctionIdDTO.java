package com.proj.model.dtos;
public class Client_AccountJunctionIdDTO {
    private Long agentId;
    private Long accountInformationId;
    
    public Client_AccountJunctionIdDTO(Long agentId, Long accountInformationId) {
        this.agentId = agentId;
        this.accountInformationId = accountInformationId;
    }

    public Client_AccountJunctionIdDTO() {
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
}
