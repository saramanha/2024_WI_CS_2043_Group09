package com.proj.model.dtos;

import java.time.LocalDateTime;

/**
 * Represents a DTO (Data Transfer Object) for duty history.
 */
public class DutyHistoryDTO {
    private Long id; // The ID of the duty history.
    private LocalDateTime dateTimeInitiated; // The date and time when the duty was initiated.
    private LocalDateTime dateTimeSignoff; // The date and time when the duty was signed off.
    private BankBranchDTO bankBranch; // The bank branch associated with the duty.
    private String dutyNotes; // Notes related to the duty.
    private AgentInformationDTO agent; // The agent involved in the duty.

    /**
     * Constructs a DutyHistoryDTO object.
     * @param id The ID of the duty history.
     * @param dateTimeInitiated The date and time when the duty was initiated.
     * @param dateTimeSignoff The date and time when the duty was signed off.
     * @param bankBranch The bank branch associated with the duty.
     * @param dutyNotes Notes related to the duty.
     * @param agent The agent involved in the duty.
     */
    public DutyHistoryDTO(Long id, LocalDateTime dateTimeInitiated, LocalDateTime dateTimeSignoff,
                          BankBranchDTO bankBranch, String dutyNotes, AgentInformationDTO agent) {
        this.id = id;
        this.dateTimeInitiated = dateTimeInitiated;
        this.dateTimeSignoff = dateTimeSignoff;
        this.bankBranch = bankBranch;
        this.dutyNotes = dutyNotes;
        this.agent = agent;
    }

    /**
     * Default constructor for DutyHistoryDTO.
     */
    public DutyHistoryDTO() {
    }

       /**
     * Retrieves the ID of the duty history.
     * @return The ID of the duty history.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the duty history.
     * @param id The ID of the duty history.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the date and time when the duty was initiated.
     * @return The date and time when the duty was initiated.
     */
    public LocalDateTime getDateTimeInitiated() {
        return dateTimeInitiated;
    }

    /**
     * Sets the date and time when the duty was initiated.
     * @param dateTimeInitiated The date and time when the duty was initiated.
     */
    public void setDateTimeInitiated(LocalDateTime dateTimeInitiated) {
        this.dateTimeInitiated = dateTimeInitiated;
    }

    /**
     * Retrieves the date and time when the duty was signed off.
     * @return The date and time when the duty was signed off.
     */
    public LocalDateTime getDateTimeSignoff() {
        return dateTimeSignoff;
    }

    /**
     * Sets the date and time when the duty was signed off.
     * @param dateTimeSignoff The date and time when the duty was signed off.
     */
    public void setDateTimeSignoff(LocalDateTime dateTimeSignoff) {
        this.dateTimeSignoff = dateTimeSignoff;
    }

    /**
     * Retrieves the bank branch associated with the duty.
     * @return The bank branch associated with the duty.
     */
    public BankBranchDTO getBankBranch() {
        return bankBranch;
    }

    /**
     * Sets the bank branch associated with the duty.
     * @param bankBranch The bank branch associated with the duty.
     */
    public void setBankBranch(BankBranchDTO bankBranch) {
        this.bankBranch = bankBranch;
    }

    /**
     * Retrieves the notes related to the duty.
     * @return Notes related to the duty.
     */
    public String getDutyNotes() {
        return dutyNotes;
    }

    /**
     * Sets the notes related to the duty.
     * @param dutyNotes Notes related to the duty.
     */
    public void setDutyNotes(String dutyNotes) {
        this.dutyNotes = dutyNotes;
    }

    /**
     * Retrieves the agent involved in the duty.
     * @return The agent involved in the duty.
     */
    public AgentInformationDTO getAgent() {
        return agent;
    }

    /**
     * Sets the agent involved in the duty.
     * @param agent The agent involved in the duty.
     */
    public void setAgent(AgentInformationDTO agent) {
        this.agent = agent;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((dateTimeInitiated == null) ? 0 : dateTimeInitiated.hashCode());
        result = prime * result + ((dateTimeSignoff == null) ? 0 : dateTimeSignoff.hashCode());
        result = prime * result + ((bankBranch == null) ? 0 : bankBranch.hashCode());
        result = prime * result + ((dutyNotes == null) ? 0 : dutyNotes.hashCode());
        result = prime * result + ((agent == null) ? 0 : agent.hashCode());
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
        DutyHistoryDTO other = (DutyHistoryDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (dateTimeInitiated == null) {
            if (other.dateTimeInitiated != null)
                return false;
        } else if (!dateTimeInitiated.equals(other.dateTimeInitiated))
            return false;
        if (dateTimeSignoff == null) {
            if (other.dateTimeSignoff != null)
                return false;
        } else if (!dateTimeSignoff.equals(other.dateTimeSignoff))
            return false;
        if (bankBranch == null) {
            if (other.bankBranch != null)
                return false;
        } else if (!bankBranch.equals(other.bankBranch))
            return false;
        if (dutyNotes == null) {
            if (other.dutyNotes != null)
                return false;
        } else if (!dutyNotes.equals(other.dutyNotes))
            return false;
        if (agent == null) {
            if (other.agent != null)
                return false;
        } else if (!agent.equals(other.agent))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "DutyHistoryDTO [id=" + id + ", dateTimeInitiated=" + dateTimeInitiated + ", dateTimeSignoff="
                + dateTimeSignoff + ", bankBranch=" + bankBranch + ", dutyNotes=" + dutyNotes + ", agent=" + agent
                + "]";
    }
}
