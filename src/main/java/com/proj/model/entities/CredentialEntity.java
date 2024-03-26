package com.proj.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Represents the entity mapping for credentials associated with an agent.
 */
@Entity
@Table(name = "credential")
public class CredentialEntity {
    @Id
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "agent_id")
    private AgentInformationEntity agent;

    @Column(name = "username")
    private String userName;

    @Column(name = "password_hash")
    private String passwordHash;

    @Column(name = "password_hash_salt")
    private String passwordHashSalt;

    /**
     * Constructs a credential entity with the provided parameters.
     * 
     * @param id               The ID of the credential.
     * @param agent            The agent associated with the credential.
     * @param userName         The username for the credential.
     * @param passwordHash     The hashed password for the credential.
     * @param passwordHashSalt The salt used in hashing the password.
     */
    public CredentialEntity(Long id, AgentInformationEntity agent, String userName, String passwordHash,
            String passwordHashSalt) {
        this.id = id;
        this.agent = agent;
        this.userName = userName;
        this.passwordHash = passwordHash;
        this.passwordHashSalt = passwordHashSalt;
    }

    /**
     * Default constructor.
     */
    public CredentialEntity() {
    }

    /**
     * Retrieves the ID of the credential.
     * 
     * @return The ID of the credential.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the credential.
     * 
     * @param id The ID to set for the credential.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the agent associated with the credential.
     * 
     * @return The agent associated with the credential.
     */
    public AgentInformationEntity getAgent() {
        return agent;
    }

    /**
     * Sets the agent associated with the credential.
     * 
     * @param agent The agent to set for the credential.
     */
    public void setAgent(AgentInformationEntity agent) {
        this.agent = agent;
    }

    /**
     * Retrieves the username for the credential.
     * 
     * @return The username for the credential.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the username for the credential.
     * 
     * @param userName The username to set for the credential.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Retrieves the hashed password for the credential.
     * 
     * @return The hashed password for the credential.
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * Sets the hashed password for the credential.
     * 
     * @param passwordHash The hashed password to set for the credential.
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    /**
     * Retrieves the salt used in hashing the password.
     * 
     * @return The salt used in hashing the password.
     */
    public String getPasswordHashSalt() {
        return passwordHashSalt;
    }

    /**
     * Sets the salt used in hashing the password.
     * 
     * @param passwordHashSalt The salt to set for the credential.
     */
    public void setPasswordHashSalt(String passwordHashSalt) {
        this.passwordHashSalt = passwordHashSalt;
    }
}
