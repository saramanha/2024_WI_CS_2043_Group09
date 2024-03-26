package com.proj.model.dtos;

import java.time.LocalDate;

/**
 * The AccountTypeDTO class represents a Data Transfer Object (DTO) for handling account type information.
 * It provides attributes and methods to manage account type details.
 */
public class AccountTypeDTO {
    private Long id;
    private String name;
    private double currentInterestRate;
    private LocalDate dateEffective;

    /**
     * Constructs an AccountTypeDTO object with the specified parameters.
     *
     * @param id                 The unique identifier of the account type.
     * @param name               The name or type of the account.
     * @param currentInterestRate The current interest rate associated with the account type.
     * @param dateEffective      The effective date of the account type.
     */
    public AccountTypeDTO(Long id, String name, double currentInterestRate, LocalDate dateEffective) {
        this.id = id;
        this.name = name;
        this.currentInterestRate = currentInterestRate;
        this.dateEffective = dateEffective;
    }

    /**
     * Constructs an empty AccountTypeDTO object.
     */
    public AccountTypeDTO() {
    }

    /**
     * Retrieves the unique identifier of the account type.
     *
     * @return The id of the account type.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the account type.
     *
     * @param id The id to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the name or type of the account.
     *
     * @return The name of the account type.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name or type of the account.
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the current interest rate associated with the account type.
     *
     * @return The current interest rate.
     */
    public double getInterestRate() {
        return currentInterestRate;
    }

    /**
     * Sets the current interest rate associated with the account type.
     *
     * @param interestRate The interest rate to set.
     */
    public void setInterestRate(double interestRate) {
        currentInterestRate = interestRate;
    }

    /**
     * Retrieves the effective date of the account type.
     *
     * @return The effective date of the account type.
     */
    public LocalDate getDateEffective() {
        return dateEffective;
    }

    /**
     * Sets the effective date of the account type.
     *
     * @param date The effective date to set.
     */
    public void setDateEffective(LocalDate date) {
        dateEffective = date;
    }
}
