package com.proj.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Represents the entity mapping for currency details.
 */
@Entity
@Table(name = "currency")
public class CurrencyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "currency_id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "currency_name", nullable = false)
    private String currencyName;

    @Column(name = "currency_acronym", nullable = false)
    private String currencyAcronym;

    /**
     * Constructs a currency entity with the provided parameters.
     * 
     * @param id             The currency ID.
     * @param currencyName   The name of the currency.
     * @param currencyAcronym The acronym of the currency.
     */
    public CurrencyEntity(Long id, String currencyName, String currencyAcronym) {
        this.id = id;
        this.currencyName = currencyName;
        this.currencyAcronym = currencyAcronym;
    }

    /**
     * Default constructor.
     */
    public CurrencyEntity() {
    }

    /**
     * Retrieves the currency ID.
     * 
     * @return The currency ID.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the currency ID.
     * 
     * @param id The currency ID to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the name of the currency.
     * 
     * @return The name of the currency.
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /**
     * Sets the name of the currency.
     * 
     * @param currencyName The name of the currency to set.
     */
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    /**
     * Retrieves the acronym of the currency.
     * 
     * @return The acronym of the currency.
     */
    public String getCurrencyAcronym() {
        return currencyAcronym;
    }

    /**
     * Sets the acronym of the currency.
     * 
     * @param currencyAcronym The acronym of the currency to set.
     */
    public void setCurrencyAcronym(String currencyAcronym) {
        this.currencyAcronym = currencyAcronym;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((currencyName == null) ? 0 : currencyName.hashCode());
		result = prime * result + ((currencyAcronym == null) ? 0 : currencyAcronym.hashCode());
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
		CurrencyEntity other = (CurrencyEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (currencyName == null) {
			if (other.currencyName != null)
				return false;
		} else if (!currencyName.equals(other.currencyName))
			return false;
		if (currencyAcronym == null) {
			if (other.currencyAcronym != null)
				return false;
		} else if (!currencyAcronym.equals(other.currencyAcronym))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "CurrencyEntity [id=" + id + ", currencyName=" + currencyName + ", currencyAcronym=" + currencyAcronym
                + "]";
    }
}
