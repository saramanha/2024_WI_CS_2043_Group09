package com.proj.model.dtos;

import java.time.LocalDate;

public class AccountTypeDTO {
    private Long id;
    private String name;
    private double currentInterestRate;
    private LocalDate dateEffective;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
