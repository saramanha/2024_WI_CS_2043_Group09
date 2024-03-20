package com.proj.model.dtos;

import java.time.LocalDateTime;

public class DutyHistoryDTO {
    
    
    
    private Long id;

    
    private LocalDateTime dateTimeInitiated;

    
    private LocalDateTime dateTimeSignoff;

    
    
    private BankBranchDTO bankBranch;

    
    private String dutyNotes;

    
    
    private AgentInformationDTO agent;

    public DutyHistoryDTO(Long id, LocalDateTime dateTimeInitiated, LocalDateTime dateTimeSignoff,
            BankBranchDTO bankBranch, String dutyNotes, AgentInformationDTO agent) {
        this.id = id;
        this.dateTimeInitiated = dateTimeInitiated;
        this.dateTimeSignoff = dateTimeSignoff;
        this.bankBranch = bankBranch;
        this.dutyNotes = dutyNotes;
        this.agent = agent;
    }

    public DutyHistoryDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateTimeInitiated() {
        return dateTimeInitiated;
    }

    public void setDateTimeInitiated(LocalDateTime dateTimeInitiated) {
        this.dateTimeInitiated = dateTimeInitiated;
    }

    public LocalDateTime getDateTimeSignoff() {
        return dateTimeSignoff;
    }

    public void setDateTimeSignoff(LocalDateTime dateTimeSignoff) {
        this.dateTimeSignoff = dateTimeSignoff;
    }

    public BankBranchDTO getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(BankBranchDTO bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getDutyNotes() {
        return dutyNotes;
    }

    public void setDutyNotes(String dutyNotes) {
        this.dutyNotes = dutyNotes;
    }

    public AgentInformationDTO getAgent() {
        return agent;
    }

    public void setAgent(AgentInformationDTO agent) {
        this.agent = agent;
    }
}
