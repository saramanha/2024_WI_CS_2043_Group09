package com.proj.model.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * An entity class representing different types of accounts.
 */
@Entity // Specifies that this class is an entity
@Table(name = "account_type") // Specifies the table name for this entity
public class AccountTypeEntity {

    @Id // Specifies the primary key for this entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies the generation strategy for the primary key
    @Column(name = "account_type_id", nullable = false, updatable = false) // Specifies the column mapping for the ID field
    private Long id; // Unique identifier for the account type

    @Column(name = "name", nullable = false) // Specifies the column mapping for the name field
    private String name; // Name of the account type

    @Column(name = "current_interest_rate", nullable = false) // Specifies the column mapping for the currentInterestRate field
    private double currentInterestRate; // Current interest rate for the account type

    @Column(name = "date_effective", nullable = false) // Specifies the column mapping for the dateEffective field
    private LocalDate dateEffective; // Date when the account type became effective

    /**
     * Constructs an AccountTypeEntity object.
     * 
     * @param id                 The unique identifier for the account type.
     * @param name               The name of the account type.
     * @param currentInterestRate The current interest rate for the account type.
     * @param dateEffective      The date when the account type became effective.
     */
    public AccountTypeEntity(Long id, String name, double currentInterestRate, LocalDate dateEffective) {
        this.id = id;
        this.name = name;
        this.currentInterestRate = currentInterestRate;
        this.dateEffective = dateEffective;
    }

    /**
     * Default constructor.
     */
    public AccountTypeEntity() {
    }

    /**
     * Retrieves the ID of the account type.
     * 
     * @return The ID of the account type.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the account type.
     * 
     * @param id The ID of the account type.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the name of the account type.
     * 
     * @return The name of the account type.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the account type.
     * 
     * @param name The name of the account type.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the current interest rate for the account type.
     * 
     * @return The current interest rate for the account type.
     */
    public double getInterestRate() {
        return currentInterestRate;
    }

    /**
     * Sets the current interest rate for the account type.
     * 
     * @param interestRate The current interest rate for the account type.
     */
    public void setInterestRate(double interestRate) {
        currentInterestRate = interestRate;
    }

    /**
     * Retrieves the date when the account type became effective.
     * 
     * @return The date when the account type became effective.
     */
    public LocalDate getDateEffective() {
        return dateEffective;
    }

    /**
     * Sets the date when the account type became effective.
     * 
     * @param date The date when the account type became effective.
     */
    public void setDateEffective(LocalDate date) {
        dateEffective = date;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(currentInterestRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((dateEffective == null) ? 0 : dateEffective.hashCode());
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
		AccountTypeEntity other = (AccountTypeEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(currentInterestRate) != Double.doubleToLongBits(other.currentInterestRate))
			return false;
		if (dateEffective == null) {
			if (other.dateEffective != null)
				return false;
		} else if (!dateEffective.equals(other.dateEffective))
			return false;
		return true;
	}
}





