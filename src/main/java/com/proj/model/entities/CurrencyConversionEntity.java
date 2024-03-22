package com.proj.model.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.CascadeType;

import com.proj.model.embeddables.CurrencyConversionId;

@Entity
@Table(name = "currency_conversion")
public class CurrencyConversionEntity {
    @EmbeddedId
    private CurrencyConversionId id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @MapsId("fromCurrencyId")
    @JoinColumn(name = "from_currency_id")
    private CurrencyEntity fromCurrency;

    @ManyToOne(cascade = CascadeType.MERGE)
    @MapsId("toCurrencyId")
    @JoinColumn(name = "to_currency_id")
    private CurrencyEntity toCurrency;

    @Column(name = "multiplicator_rate_denominator")
    private Long multRateDenominator;

    @Column(name = "multiplicator_rate_numerator")
    private Long multRateNumerator;

    @Column(name = "effective_date_time")
    private LocalDateTime effectiveDateTime;

    public CurrencyConversionEntity(CurrencyConversionId id, CurrencyEntity fromCurrency, CurrencyEntity toCurrency,
            Long multRateDenominator, Long multRateNumerator, LocalDateTime effectiveDateTime) {
        this.id = id;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.multRateDenominator = multRateDenominator;
        this.multRateNumerator = multRateNumerator;
        this.effectiveDateTime = effectiveDateTime;
    }

    public CurrencyConversionEntity() {
    }

    public CurrencyConversionId getId() {
        return id;
    }

    public void setId(CurrencyConversionId id) {
        this.id = id;
    }

    public CurrencyEntity getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(CurrencyEntity fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public CurrencyEntity getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(CurrencyEntity toCurrency) {
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
