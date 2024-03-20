package com.proj.model.dtos;

public class FeedbackDTO {
    
    
    
    private Long id;

    
    
    private AgentInformationDTO agent;

    
    private String title;

    
    private String description;

    public FeedbackDTO(Long id, AgentInformationDTO agent, String title, String description) {
        this.id = id;
        this.agent = agent;
        this.title = title;
        this.description = description;
    }

    public FeedbackDTO() {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
