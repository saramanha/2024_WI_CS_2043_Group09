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

/**
 * Represents the entity mapping for currency conversion details.
 */
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

    /**
     * Constructs a currency conversion entity with the provided parameters.
     * 
     * @param id                  The currency conversion ID.
     * @param fromCurrency        The source currency.
     * @param toCurrency          The target currency.
     * @param multRateDenominator The denominator for the conversion rate.
     * @param multRateNumerator   The numerator for the conversion rate.
     * @param effectiveDateTime   The effective date and time of the conversion rate.
     */
    public CurrencyConversionEntity(CurrencyConversionId id, CurrencyEntity fromCurrency, CurrencyEntity toCurrency,
            Long multRateDenominator, Long multRateNumerator, LocalDateTime effectiveDateTime) {
        this.id = id;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.multRateDenominator = multRateDenominator;
        this.multRateNumerator = multRateNumerator;
        this.effectiveDateTime = effectiveDateTime;
    }

    /**
     * Default constructor.
     */
    public CurrencyConversionEntity() {
    }

    /**
     * Retrieves the currency conversion ID.
     * 
     * @return The currency conversion ID.
     */
    public CurrencyConversionId getId() {
        return id;
    }

    /**
     * Sets the currency conversion ID.
     * 
     * @param id The currency conversion ID to set.
     */
    public void setId(CurrencyConversionId id) {
        this.id = id;
    }

    /**
     * Retrieves the source currency.
     * 
     * @return The source currency.
     */
    public CurrencyEntity getFromCurrency() {
        return fromCurrency;
    }

    /**
     * Sets the source currency.
     * 
     * @param fromCurrency The source currency to set.
     */
    public void setFromCurrency(CurrencyEntity fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    /**
     * Retrieves the target currency.
     * 
     * @return The target currency.
     */
    public CurrencyEntity getToCurrency() {
        return toCurrency;
    }

    /**
     * Sets the target currency.
     * 
     * @param toCurrency The target currency to set.
     */
    public void setToCurrency(CurrencyEntity toCurrency) {
        this.toCurrency = toCurrency;
    }

    /**
     * Retrieves the denominator for the conversion rate.
     * 
     * @return The denominator for the conversion rate.
     */
    public Long getMultRateDenominator() {
        return multRateDenominator;
    }

    /**
     * Sets the denominator for the conversion rate.
     * 
     * @param multRateDenominator The denominator to set for the conversion rate.
     */
    public void setMultRateDenominator(Long multRateDenominator) {
        this.multRateDenominator = multRateDenominator;
    }

    /**
     * Retrieves the numerator for the conversion rate.
     * 
     * @return The numerator for the conversion rate.
     */
    public Long getMultRateNumerator() {
        return multRateNumerator;
    }

    /**
     * Sets the numerator for the conversion rate.
     * 
     * @param multRateNumerator The numerator to set for the conversion rate.
     */
    public void setMultRateNumerator(Long multRateNumerator) {
        this.multRateNumerator = multRateNumerator;
    }

    /**
     * Retrieves the effective date and time of the conversion rate.
     * 
     * @return The effective date and time of the conversion rate.
     */
    public LocalDateTime getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * Sets the effective date and time of the conversion rate.
     * 
     * @param effectiveDateTime The effective date and time to set for the conversion rate.
     */
    public void setEffectiveDateTime(LocalDateTime effectiveDateTime) {
        this.effectiveDateTime = effectiveDateTime;
    }
}
