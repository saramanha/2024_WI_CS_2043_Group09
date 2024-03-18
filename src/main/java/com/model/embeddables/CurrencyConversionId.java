package com.model.embeddables;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CurrencyConversionId implements Serializable {
    @Column(name = "from_currency_id")
    private Long fromCurrencyId;

    @Column(name = "to_currency_id")
    private Long toCurrencyId;

    public CurrencyConversionId(Long fromCurrencyId, Long toCurrencyId) {
        this.fromCurrencyId = fromCurrencyId;
        this.toCurrencyId = toCurrencyId;
    }

    public Long getFromCurrencyId() {
        return fromCurrencyId;
    }

    public void setFromCurrencyId(Long fromCurrencyId) {
        this.fromCurrencyId = fromCurrencyId;
    }

    public Long getToCurrencyId() {
        return toCurrencyId;
    }

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
