package com.proj.model.dtos;

/**
 * Represents the composite identifier for a currency conversion.
 */
public class CurrencyConversionIdDTO {
    private Long fromCurrencyId; // Identifier for the source currency
    private Long toCurrencyId;   // Identifier for the target currency

    /**
     * Constructs a new CurrencyConversionIdDTO with the specified source and target currency identifiers.
     * 
     * @param fromCurrencyId The identifier for the source currency.
     * @param toCurrencyId   The identifier for the target currency.
     */
    public CurrencyConversionIdDTO(Long fromCurrencyId, Long toCurrencyId) {
        this.fromCurrencyId = fromCurrencyId;
        this.toCurrencyId = toCurrencyId;
    }

    /**
     * Default constructor for CurrencyConversionIdDTO.
     */
    public CurrencyConversionIdDTO() {
    }

    /**
     * Retrieves the identifier for the source currency.
     * 
     * @return The identifier for the source currency.
     */
    public Long getFromCurrencyId() {
        return fromCurrencyId;
    }

    /**
     * Sets the identifier for the source currency.
     * 
     * @param fromCurrencyId The identifier for the source currency.
     */
    public void setFromCurrencyId(Long fromCurrencyId) {
        this.fromCurrencyId = fromCurrencyId;
    }

    /**
     * Retrieves the identifier for the target currency.
     * 
     * @return The identifier for the target currency.
     */
    public Long getToCurrencyId() {
        return toCurrencyId;
    }

    /**
     * Sets the identifier for the target currency.
     * 
     * @param toCurrencyId The identifier for the target currency.
     */
    public void setToCurrencyId(Long toCurrencyId) {
        this.toCurrencyId = toCurrencyId;
    }
}
