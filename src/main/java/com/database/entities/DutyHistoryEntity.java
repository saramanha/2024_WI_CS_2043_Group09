package com.database.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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

    public BankBranchEntity getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(BankBranchEntity bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getDutyNotes() {
        return dutyNotes;
    }

    public void setDutyNotes(String dutyNotes) {
        this.dutyNotes = dutyNotes;
    }

    public AgentInformationEntity getAgent() {
        return agent;
    }

    public void setAgent(AgentInformationEntity agent) {
        this.agent = agent;
    }
}
