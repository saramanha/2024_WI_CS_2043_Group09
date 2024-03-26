package com.proj.model.dtos;

/**
 * Represents a data transfer object (DTO) for credentials.
 */
public class CredentialDTO {
    private Long id; // The identifier of the credential.
    private AgentInformationDTO agent; // The agent associated with the credential.
    private String userName; // The username for the credential.
    private String passwordHash; // The hashed password for the credential.
    private String passwordHashSalt; // The salt used for hashing the password.

    /**
     * Constructs a new CredentialDTO object with the given parameters.
     * 
     * @param id               The identifier of the credential.
     * @param agent            The agent associated with the credential.
     * @param userName         The username for the credential.
     * @param passwordHash     The hashed password for the credential.
     * @param passwordHashSalt The salt used for hashing the password.
     */
    public CredentialDTO(Long id, AgentInformationDTO agent, String userName, String passwordHash,
            String passwordHashSalt) {
        this.id = id;
        this.agent = agent;
        this.userName = userName;
        this.passwordHash = passwordHash;
        this.passwordHashSalt = passwordHashSalt;
    }

    /**
     * Constructs a new empty CredentialDTO object.
     */
    public CredentialDTO() {
    }

    /**
     * Retrieves the identifier of the credential.
     * 
     * @return The credential identifier.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the identifier of the credential.
     * 
     * @param id The credential identifier to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the agent associated with the credential.
     * 
     * @return The associated agent.
     */
    public AgentInformationDTO getAgent() {
        return agent;
    }

    /**
     * Sets the agent associated with the credential.
     * 
     * @param agent The agent to set.
     */
    public void setAgent(AgentInformationDTO agent) {
        this.agent = agent;
    }

    /**
     * Retrieves the username for the credential.
     * 
     * @return The username.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the username for the credential.
     * 
     * @param userName The username to set.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Retrieves the hashed password for the credential.
     * 
     * @return The hashed password.
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * Sets the hashed password for the credential.
     * 
     * @param passwordHash The hashed password to set.
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    /**
     * Retrieves the salt used for hashing the password.
     * 
     * @return The password salt.
     */
    public String getPasswordHashSalt() {
        return passwordHashSalt;
    }

    /**
     * Sets the salt used for hashing the password.
     * 
     * @param passwordHashSalt The password salt to set.
     */
    public void setPasswordHashSalt(String passwordHashSalt) {
        this.passwordHashSalt = passwordHashSalt;
    }
}
