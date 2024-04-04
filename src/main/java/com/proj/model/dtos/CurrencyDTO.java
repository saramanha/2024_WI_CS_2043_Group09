package com.proj.model.dtos;

/**
 * Represents a currency used in the application.
 */
public class CurrencyDTO {
    private Long id;                // Identifier for the currency
    private String currencyName;    // Full name of the currency
    private String currencyAcronym; // Acronym or code representing the currency

    /**
     * Constructs a new CurrencyDTO with the specified identifier, currency name, and currency acronym.
     * 
     * @param id             The identifier for the currency.
     * @param currencyName   The full name of the currency.
     * @param currencyAcronym The acronym or code representing the currency.
     */
    public CurrencyDTO(Long id, String currencyName, String currencyAcronym) {
        this.id = id;
        this.currencyName = currencyName;
        this.currencyAcronym = currencyAcronym;
    }

    /**
     * Default constructor for CurrencyDTO.
     */
    public CurrencyDTO() {
    }

    /**
     * Retrieves the identifier for the currency.
     * 
     * @return The identifier for the currency.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the identifier for the currency.
     * 
     * @param id The identifier for the currency.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the full name of the currency.
     * 
     * @return The full name of the currency.
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /**
     * Sets the full name of the currency.
     * 
     * @param currencyName The full name of the currency.
     */
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    /**
     * Retrieves the acronym or code representing the currency.
     * 
     * @return The acronym or code representing the currency.
     */
    public String getCurrencyAcronym() {
        return currencyAcronym;
    }

    /**
     * Sets the acronym or code representing the currency.
     * 
     * @param currencyAcronym The acronym or code representing the currency.
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
        CurrencyDTO other = (CurrencyDTO) obj;
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
        return "CurrencyDTO [id=" + id + ", currencyName=" + currencyName + ", currencyAcronym=" + currencyAcronym
                + "]";
    }
}
