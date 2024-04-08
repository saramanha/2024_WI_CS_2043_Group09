package com.proj.model.dtos;

/**
 * A Data Transfer Object (DTO) representing feedback provided by an agent.
 */
public class FeedbackDTO {
    private Long id; // The unique identifier of the feedback.
    private AgentInformationDTO agent; // The agent providing the feedback.
    private String title; // The title of the feedback.
    private String description; // The description of the feedback.

    /**
     * Constructs a new FeedbackDTO object with specified parameters.
     * @param id The unique identifier of the feedback.
     * @param agent The agent providing the feedback.
     * @param title The title of the feedback.
     * @param description The description of the feedback.
     */
    public FeedbackDTO(Long id, AgentInformationDTO agent, String title, String description) {
        this.id = id;
        this.agent = agent;
        this.title = title;
        this.description = description;
    }

    /**
     * Default constructor for FeedbackDTO.
     */
    public FeedbackDTO() {
    }

    /**
     * Retrieves the ID of the feedback.
     * @return The ID of the feedback.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the feedback.
     * @param id The ID of the feedback.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the agent providing the feedback.
     * @return The agent providing the feedback.
     */
    public AgentInformationDTO getAgent() {
        return agent;
    }

    /**
     * Sets the agent providing the feedback.
     * @param agent The agent providing the feedback.
     */
    public void setAgent(AgentInformationDTO agent) {
        this.agent = agent;
    }

    /**
     * Retrieves the title of the feedback.
     * @return The title of the feedback.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the feedback.
     * @param title The title of the feedback.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retrieves the description of the feedback.
     * @return The description of the feedback.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the feedback.
     * @param description The description of the feedback.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((agent == null) ? 0 : agent.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FeedbackDTO other = (FeedbackDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (agent == null) {
            if (other.agent != null)
                return false;
        } else if (!agent.equals(other.agent))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "FeedbackDTO [id=" + id + ", agent=" + agent + ", title=" + title + ", description=" + description + "]";
    }
}
