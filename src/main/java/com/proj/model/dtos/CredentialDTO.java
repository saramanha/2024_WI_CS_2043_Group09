package com.proj.model.dtos;

public class CredentialDTO {
    
    private Long id;

    
    
    
    private AgentInformationDTO agent;

    
    private String userName;

    
    private String passwordHash;

    
    private String passwordHashSalt;

    public CredentialDTO(Long id, AgentInformationDTO agent, String userName, String passwordHash,
            String passwordHashSalt) {
        this.id = id;
        this.agent = agent;
        this.userName = userName;
        this.passwordHash = passwordHash;
        this.passwordHashSalt = passwordHashSalt;
    }

    public CredentialDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AgentInformationDTO getAgent() {
        return agent;
    }

    public void setAgent(AgentInformationDTO agent) {
        this.agent = agent;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPasswordHashSalt() {
        return passwordHashSalt;
    }

    public void setPasswordHashSalt(String passwordHashSalt) {
        this.passwordHashSalt = passwordHashSalt;
    }
}
