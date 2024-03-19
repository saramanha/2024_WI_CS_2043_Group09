package com.proj.model.dtos;

public class CurrencyConversionIdDTO {
    private Long fromCurrencyId;
    private Long toCurrencyId;
    public CurrencyConversionIdDTO(Long fromCurrencyId, Long toCurrencyId) {
        this.fromCurrencyId = fromCurrencyId;
        this.toCurrencyId = toCurrencyId;
    }
    public CurrencyConversionIdDTO() {
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
}
