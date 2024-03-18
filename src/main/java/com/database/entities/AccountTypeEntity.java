package com.database.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_type")
public class AccountTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_type_id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "current_interest_rate", nullable = false)
    private double currentInterestRate;

    @Column(name = "date_effective", nullable = false)
    private LocalDate dateEffective;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInterestRate() {
        return currentInterestRate;
    }

    public void setInterestRate(double interestRate) {
        currentInterestRate = interestRate;
    }

    public LocalDate getDateEffective() {
        return dateEffective;
    }

    public void setDateEffective(LocalDate date) {
        dateEffective = date;
    }
}
