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
}
