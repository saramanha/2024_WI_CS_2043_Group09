package com.database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AgentInformationEntity getAgent() {
        return agent;
    }

    public void setAgent(AgentInformationEntity agent) {
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
