package com.proj.model.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Represents the entity mapping for duty history.
 */
@Entity
@Table(name = "duty_history")
public class DutyHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "duty_id")
    private Long id;

    @Column(name = "date_time_initiated")
    private LocalDateTime dateTimeInitiated;

    @Column(name = "date_time_signoff")
    private LocalDateTime dateTimeSignoff;

    @ManyToOne
    @JoinColumn(name = "bank_branch_id")
    private BankBranchEntity bankBranch;

    @Column(name = "duty_notes")
    private String dutyNotes;

    @ManyToOne
    @JoinColumn(name = "agent_id")
    private AgentInformationEntity agent;

    /**
     * Constructs a duty history entity with the provided parameters.
     * 
     * @param id                The duty history ID.
     * @param dateTimeInitiated The date and time when the duty was initiated.
     * @param dateTimeSignoff   The date and time when the duty was signed off.
     * @param bankBranch        The bank branch associated with the duty.
     * @param dutyNotes         Notes related to the duty.
     * @param agent             The agent associated with the duty.
     */
    public DutyHistoryEntity(Long id, LocalDateTime dateTimeInitiated, LocalDateTime dateTimeSignoff,
            BankBranchEntity bankBranch, String dutyNotes, AgentInformationEntity agent) {
        this.id = id;
        this.dateTimeInitiated = dateTimeInitiated;
        this.dateTimeSignoff = dateTimeSignoff;
        this.bankBranch = bankBranch;
        this.dutyNotes = dutyNotes;
        this.agent = agent;
    }

    /**
     * Default constructor.
     */
    public DutyHistoryEntity() {
    }

    /**
     * Retrieves the ID of the duty history.
     * 
     * @return The duty history ID.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the duty history.
     * 
     * @param id The duty history ID to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the date and time when the duty was initiated.
     * 
     * @return The date and time when the duty was initiated.
     */
    public LocalDateTime getDateTimeInitiated() {
        return dateTimeInitiated;
    }

    /**
     * Sets the date and time when the duty was initiated.
     * 
     * @param dateTimeInitiated The date and time to set.
     */
    public void setDateTimeInitiated(LocalDateTime dateTimeInitiated) {
        this.dateTimeInitiated = dateTimeInitiated;
    }

    /**
     * Retrieves the date and time when the duty was signed off.
     * 
     * @return The date and time when the duty was signed off.
     */
    public LocalDateTime getDateTimeSignoff() {
        return dateTimeSignoff;
    }

    /**
     * Sets the date and time when the duty was signed off.
     * 
     * @param dateTimeSignoff The date and time to set.
     */
    public void setDateTimeSignoff(LocalDateTime dateTimeSignoff) {
        this.dateTimeSignoff = dateTimeSignoff;
    }

    /**
     * Retrieves the bank branch associated with the duty.
     * 
     * @return The bank branch associated with the duty.
     */
    public BankBranchEntity getBankBranch() {
        return bankBranch;
    }

    /**
     * Sets the bank branch associated with the duty.
     * 
     * @param bankBranch The bank branch to set.
     */
    public void setBankBranch(BankBranchEntity bankBranch) {
        this.bankBranch = bankBranch;
    }

    /**
     * Retrieves the notes related to the duty.
     * 
     * @return The duty notes.
     */
    public String getDutyNotes() {
        return dutyNotes;
    }

    /**
     * Sets the notes related to the duty.
     * 
     * @param dutyNotes The duty notes to set.
     */
    public void setDutyNotes(String dutyNotes) {
        this.dutyNotes = dutyNotes;
    }

    /**
     * Retrieves the agent associated with the duty.
     * 
     * @return The agent associated with the duty.
     */
    public AgentInformationEntity getAgent() {
        return agent;
    }

    /**
     * Sets the agent associated with the duty.
     * 
     * @param agent The agent to set.
     */
    public void setAgent(AgentInformationEntity agent) {
        this.agent = agent;
    }
}
