package com.proj.model.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.proj.model.embeddables.Client_AccountJunctionId;

@Entity
@Table(name = "client_account_junction")
public class Client_AccountJunctionEntity {
    @EmbeddedId
    private Client_AccountJunctionId id;

    @ManyToOne
    @MapsId("agentId")
    @JoinColumn(name = "agent_id")
    private AgentInformationEntity agent;

    @ManyToOne
    @MapsId("accountInformationId")
    @JoinColumn(name = "account_information_id")
    private AccountInformationEntity account;

    @Column(name = "relationship_description")
    private String relationshipDescription;

    public Client_AccountJunctionId getId() {
        return id;
    }

    public void setId(Client_AccountJunctionId id) {
        this.id = id;
    }

    public AgentInformationEntity getAgent() {
        return agent;
    }

    public void setAgent(AgentInformationEntity agent) {
        this.agent = agent;
    }

    public AccountInformationEntity getAccount() {
        return account;
    }

    public void setAccount(AccountInformationEntity account) {
        this.account = account;
    }

    public String getRelationshipDescription() {
        return relationshipDescription;
    }

    public void setRelationshipDescription(String relationshipDescription) {
        this.relationshipDescription = relationshipDescription;
    }
}
