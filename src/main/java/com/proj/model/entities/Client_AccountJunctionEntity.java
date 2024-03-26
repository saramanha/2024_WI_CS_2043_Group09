package com.proj.model.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.CascadeType;

import com.proj.model.embeddables.Client_AccountJunctionId;

/**
 * Represents the entity mapping for the junction table between clients and accounts.
 */
@Entity
@Table(name = "client_account_junction")
public class Client_AccountJunctionEntity {
    @EmbeddedId
    private Client_AccountJunctionId id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @MapsId("agentId")
    @JoinColumn(name = "agent_id")
    private AgentInformationEntity agent;

    @ManyToOne(cascade = CascadeType.MERGE)
    @MapsId("accountInformationId")
    @JoinColumn(name = "account_information_id")
    private AccountInformationEntity account;

    @Column(name = "relationship_description")
    private String relationshipDescription;

    /**
     * Constructs a client-account junction entity with the provided parameters.
     * 
     * @param id                     The ID of the junction.
     * @param agent                  The agent associated with the junction.
     * @param account                The account associated with the junction.
     * @param relationshipDescription The description of the relationship between the client and account.
     */
    public Client_AccountJunctionEntity(Client_AccountJunctionId id, AgentInformationEntity agent,
            AccountInformationEntity account, String relationshipDescription) {
        this.id = id;
        this.agent = agent;
        this.account = account;
        this.relationshipDescription = relationshipDescription;
    }

    /**
     * Default constructor.
     */
    public Client_AccountJunctionEntity() {
    }

    /**
     * Retrieves the ID of the client-account junction.
     * 
     * @return The ID of the junction.
     */
    public Client_AccountJunctionId getId() {
        return id;
    }

    /**
     * Sets the ID of the client-account junction.
     * 
     * @param id The ID to set for the junction.
     */
    public void setId(Client_AccountJunctionId id) {
        this.id = id;
    }

    /**
     * Retrieves the agent associated with the junction.
     * 
     * @return The agent associated with the junction.
     */
    public AgentInformationEntity getAgent() {
        return agent;
    }

    /**
     * Sets the agent associated with the junction.
     * 
     * @param agent The agent to set for the junction.
     */
    public void setAgent(AgentInformationEntity agent) {
        this.agent = agent;
    }

    /**
     * Retrieves the account associated with the junction.
     * 
     * @return The account associated with the junction.
     */
    public AccountInformationEntity getAccount() {
        return account;
    }

    /**
     * Sets the account associated with the junction.
     * 
     * @param account The account to set for the junction.
     */
    public void setAccount(AccountInformationEntity account) {
        this.account = account;
    }

    /**
     * Retrieves the description of the relationship between the client and account.
     * 
     * @return The description of the relationship.
     */
    public String getRelationshipDescription() {
        return relationshipDescription;
    }

    /**
     * Sets the description of the relationship between the client and account.
     * 
     * @param relationshipDescription The description to set for the relationship.
     */
    public void setRelationshipDescription(String relationshipDescription) {
        this.relationshipDescription = relationshipDescription;
    }
}
