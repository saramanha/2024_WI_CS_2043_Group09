package com.proj.model.dtos;

public class Client_AccountJunctionDTO {
    private Client_AccountJunctionIdDTO id;
    private AgentInformationDTO agent;
    private AccountInformationDTO account;
    private String relationshipDescription;

    public Client_AccountJunctionIdDTO getId() {
        return id;
    }

    public void setId(Client_AccountJunctionIdDTO id) {
        this.id = id;
    }

    public AgentInformationDTO getAgent() {
        return agent;
    }

    public void setAgent(AgentInformationDTO agent) {
        this.agent = agent;
    }

    public AccountInformationDTO getAccount() {
        return account;
    }

    public void setAccount(AccountInformationDTO account) {
        this.account = account;
    }

    public String getRelationshipDescription() {
        return relationshipDescription;
    }

    public void setRelationshipDescription(String relationshipDescription) {
        this.relationshipDescription = relationshipDescription;
    }
}
