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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fromCurrencyId == null) ? 0 : fromCurrencyId.hashCode());
        result = prime * result + ((toCurrencyId == null) ? 0 : toCurrencyId.hashCode());
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
        CurrencyConversionIdDTO other = (CurrencyConversionIdDTO) obj;
        if (fromCurrencyId == null) {
            if (other.fromCurrencyId != null)
                return false;
        } else if (!fromCurrencyId.equals(other.fromCurrencyId))
            return false;
        if (toCurrencyId == null) {
            if (other.toCurrencyId != null)
                return false;
        } else if (!toCurrencyId.equals(other.toCurrencyId))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CurrencyConversionIdDTO [fromCurrencyId=" + fromCurrencyId + ", toCurrencyId=" + toCurrencyId + "]";
    }
}
