package com.proj.model.embeddables;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Represents the composite key for the CurrencyConversion entity, which consists of fromCurrencyId and toCurrencyId.
 */
@Embeddable
public class CurrencyConversionId implements Serializable {
    /**
     * The ID of the currency being converted from.
     */
    @Column(name = "from_currency_id")
    private Long fromCurrencyId;

    /**
     * The ID of the currency being converted to.
     */
    @Column(name = "to_currency_id")
    private Long toCurrencyId;

    /**
     * Constructs a new CurrencyConversionId with the specified fromCurrencyId and toCurrencyId.
     *
     * @param fromCurrencyId The ID of the currency being converted from.
     * @param toCurrencyId   The ID of the currency being converted to.
     */
    public CurrencyConversionId(Long fromCurrencyId, Long toCurrencyId) {
        this.fromCurrencyId = fromCurrencyId;
        this.toCurrencyId = toCurrencyId;
    }

    /**
     * Retrieves the ID of the currency being converted from.
     *
     * @return The fromCurrencyId.
     */
    public Long getFromCurrencyId() {
        return fromCurrencyId;
    }

    /**
     * Sets the ID of the currency being converted from.
     *
     * @param fromCurrencyId The fromCurrencyId to set.
     */
    public void setFromCurrencyId(Long fromCurrencyId) {
        this.fromCurrencyId = fromCurrencyId;
    }

    /**
     * Retrieves the ID of the currency being converted to.
     *
     * @return The toCurrencyId.
     */
    public Long getToCurrencyId() {
        return toCurrencyId;
    }

    /**
     * Sets the ID of the currency being converted to.
     *
     * @param toCurrencyId The toCurrencyId to set.
     */
    public void setToCurrencyId(Long toCurrencyId) {
        this.toCurrencyId = toCurrencyId;
    }

    /**
     * Generates a hash code value for the object based on its fromCurrencyId and toCurrencyId.
     *
     * @return The hash code value.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fromCurrencyId == null) ? 0 : fromCurrencyId.hashCode());
        result = prime * result + ((toCurrencyId == null) ? 0 : toCurrencyId.hashCode());
        return result;
    }

    /**
     * Indicates whether some other object is "equal to" this one based on its fromCurrencyId and toCurrencyId.
     *
     * @param obj The object to compare for equality.
     * @return True if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CurrencyConversionId other = (CurrencyConversionId) obj;
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
}
