package com.proj.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Represents the entity mapping for feedback.
 */
@Entity
@Table(name = "feedback")
public class FeedbackEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feedback_id", nullable = false, updatable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "agent_id")
    private AgentInformationEntity agent;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    /**
     * Constructs a feedback entity with the provided parameters.
     * 
     * @param id          The feedback ID.
     * @param agent       The agent associated with the feedback.
     * @param title       The title of the feedback.
     * @param description The description of the feedback.
     */
    public FeedbackEntity(Long id, AgentInformationEntity agent, String title, String description) {
        this.id = id;
        this.agent = agent;
        this.title = title;
        this.description = description;
    }

    /**
     * Default constructor.
     */
    public FeedbackEntity() {
    }

    /**
     * Retrieves the ID of the feedback.
     * 
     * @return The feedback ID.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the feedback.
     * 
     * @param id The feedback ID to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the agent associated with the feedback.
     * 
     * @return The agent associated with the feedback.
     */
    public AgentInformationEntity getAgent() {
        return agent;
    }

    /**
     * Sets the agent associated with the feedback.
     * 
     * @param agent The agent to set.
     */
    public void setAgent(AgentInformationEntity agent) {
        this.agent = agent;
    }

    /**
     * Retrieves the title of the feedback.
     * 
     * @return The title of the feedback.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the feedback.
     * 
     * @param title The title of the feedback to set.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retrieves the description of the feedback.
     * 
     * @return The description of the feedback.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the feedback.
     * 
     * @param description The description of the feedback to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
