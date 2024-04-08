package com.proj.model.dtos;

import java.time.LocalDateTime;

/**
 * Represents a data transfer object (DTO) for currency conversion information.
 */
public class CurrencyConversionDTO {
    private CurrencyConversionIdDTO id; // The identifier for the currency conversion.
    private CurrencyDTO fromCurrency; // The source currency for conversion.
    private CurrencyDTO toCurrency; // The target currency for conversion.
    private Long multRateDenominator; // The denominator for the conversion rate multiplier.
    private Long multRateNumerator; // The numerator for the conversion rate multiplier.
    private LocalDateTime effectiveDateTime; // The date and time when the conversion rate becomes effective.

    /**
     * Constructs a new CurrencyConversionDTO object with the given parameters.
     * 
     * @param id                   The identifier for the currency conversion.
     * @param fromCurrency         The source currency for conversion.
     * @param toCurrency           The target currency for conversion.
     * @param multRateDenominator  The denominator for the conversion rate multiplier.
     * @param multRateNumerator    The numerator for the conversion rate multiplier.
     * @param effectiveDateTime    The date and time when the conversion rate becomes effective.
     */
    public CurrencyConversionDTO(CurrencyConversionIdDTO id, CurrencyDTO fromCurrency, CurrencyDTO toCurrency,
            Long multRateDenominator, Long multRateNumerator, LocalDateTime effectiveDateTime) {
        this.id = id;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.multRateDenominator = multRateDenominator;
        this.multRateNumerator = multRateNumerator;
        this.effectiveDateTime = effectiveDateTime;
    }

    /**
     * Constructs a new empty CurrencyConversionDTO object.
     */
    public CurrencyConversionDTO() {
    }

    /**
     * Retrieves the identifier for the currency conversion.
     * 
     * @return The identifier for the currency conversion.
     */
    public CurrencyConversionIdDTO getId() {
        return id;
    }

    /**
     * Sets the identifier for the currency conversion.
     * 
     * @param id The identifier for the currency conversion.
     */
    public void setId(CurrencyConversionIdDTO id) {
        this.id = id;
    }

    /**
     * Retrieves the source currency for conversion.
     * 
     * @return The source currency for conversion.
     */
    public CurrencyDTO getFromCurrency() {
        return fromCurrency;
    }

        /**
     * Sets the source currency for conversion.
     * 
     * @param fromCurrency The source currency for conversion.
     */
    public void setFromCurrency(CurrencyDTO fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    /**
     * Retrieves the target currency for conversion.
     * 
     * @return The target currency for conversion.
     */
    public CurrencyDTO getToCurrency() {
        return toCurrency;
    }

    /**
     * Sets the target currency for conversion.
     * 
     * @param toCurrency The target currency for conversion.
     */
    public void setToCurrency(CurrencyDTO toCurrency) {
        this.toCurrency = toCurrency;
    }

    /**
     * Retrieves the denominator for the conversion rate multiplier.
     * 
     * @return The denominator for the conversion rate multiplier.
     */
    public Long getMultRateDenominator() {
        return multRateDenominator;
    }

    /**
     * Sets the denominator for the conversion rate multiplier.
     * 
     * @param multRateDenominator The denominator for the conversion rate multiplier.
     */
    public void setMultRateDenominator(Long multRateDenominator) {
        this.multRateDenominator = multRateDenominator;
    }

    /**
     * Retrieves the numerator for the conversion rate multiplier.
     * 
     * @return The numerator for the conversion rate multiplier.
     */
    public Long getMultRateNumerator() {
        return multRateNumerator;
    }

    /**
     * Sets the numerator for the conversion rate multiplier.
     * 
     * @param multRateNumerator The numerator for the conversion rate multiplier.
     */
    public void setMultRateNumerator(Long multRateNumerator) {
        this.multRateNumerator = multRateNumerator;
    }

    /**
     * Retrieves the date and time when the conversion rate becomes effective.
     * 
     * @return The date and time when the conversion rate becomes effective.
     */
    public LocalDateTime getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * Sets the date and time when the conversion rate becomes effective.
     * 
     * @param effectiveDateTime The date and time when the conversion rate becomes effective.
     */
    public void setEffectiveDateTime(LocalDateTime effectiveDateTime) {
        this.effectiveDateTime = effectiveDateTime;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((fromCurrency == null) ? 0 : fromCurrency.hashCode());
        result = prime * result + ((toCurrency == null) ? 0 : toCurrency.hashCode());
        result = prime * result + ((multRateDenominator == null) ? 0 : multRateDenominator.hashCode());
        result = prime * result + ((multRateNumerator == null) ? 0 : multRateNumerator.hashCode());
        result = prime * result + ((effectiveDateTime == null) ? 0 : effectiveDateTime.hashCode());
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
        CurrencyConversionDTO other = (CurrencyConversionDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (fromCurrency == null) {
            if (other.fromCurrency != null)
                return false;
        } else if (!fromCurrency.equals(other.fromCurrency))
            return false;
        if (toCurrency == null) {
            if (other.toCurrency != null)
                return false;
        } else if (!toCurrency.equals(other.toCurrency))
            return false;
        if (multRateDenominator == null) {
            if (other.multRateDenominator != null)
                return false;
        } else if (!multRateDenominator.equals(other.multRateDenominator))
            return false;
        if (multRateNumerator == null) {
            if (other.multRateNumerator != null)
                return false;
        } else if (!multRateNumerator.equals(other.multRateNumerator))
            return false;
        if (effectiveDateTime == null) {
            if (other.effectiveDateTime != null)
                return false;
        } else if (!effectiveDateTime.equals(other.effectiveDateTime))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CurrencyConversionDTO [id=" + id + ", fromCurrency=" + fromCurrency + ", toCurrency=" + toCurrency
                + ", multRateDenominator=" + multRateDenominator + ", multRateNumerator=" + multRateNumerator
                + ", effectiveDateTime=" + effectiveDateTime + "]";
    }
}
