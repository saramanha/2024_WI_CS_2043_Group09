package com.proj.model.dtos;

import java.time.LocalDateTime;

public class CurrencyConversionDTO {
    private CurrencyConversionIdDTO id;
    private CurrencyDTO fromCurrency;
    private CurrencyDTO toCurrency;
    private Long multRateDenominator;
    private Long multRateNumerator;
    private LocalDateTime effectiveDateTime;

    public CurrencyConversionIdDTO getId() {
        return id;
    }

    public void setId(CurrencyConversionIdDTO id) {
        this.id = id;
    }

    public CurrencyDTO getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(CurrencyDTO fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public CurrencyDTO getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(CurrencyDTO toCurrency) {
        this.toCurrency = toCurrency;
    }

    public Long getMultRateDenominator() {
        return multRateDenominator;
    }

    public void setMultRateDenominator(Long multRateDenominator) {
        this.multRateDenominator = multRateDenominator;
    }

    public Long getMultRateNumerator() {
        return multRateNumerator;
    }

    public void setMultRateNumerator(Long multRateNumerator) {
        this.multRateNumerator = multRateNumerator;
    }

    public LocalDateTime getEffectiveDateTime() {
        return effectiveDateTime;
    }

    public void setEffectiveDateTime(LocalDateTime effectiveDateTime) {
        this.effectiveDateTime = effectiveDateTime;
    }
}
