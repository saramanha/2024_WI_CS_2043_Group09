package com.proj.model.entities;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity class representing account information.
 */
@Entity
@Table(name = "account_information")
public class AccountInformationEntity {
    /**
     * The unique identifier for the account information.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_information_id")
    private Long id;

    /**
     * Indicates whether the account is active or not.
     */
    @Column(name = "is_active")
    private Boolean isActive;
    
    /**
     * The total sum in the bank associated with the account.
     */
    @Column(name = "bank_sum")
    private BigDecimal bankSum;

    /**
     * The currency associated with the account.
     */
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "currency_id")
    private CurrencyEntity currency;

    /**
     * The type of the account.
     */
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "account_type_id")
    private AccountTypeEntity accountType;

    /**
     * Constructs a new AccountInformationEntity with the specified parameters.
     *
     * @param id          The unique identifier for the account information.
     * @param isActive    Indicates whether the account is active or not.
     * @param bankSum     The total sum in the bank associated with the account.
     * @param currency    The currency associated with the account.
     * @param accountType The type of the account.
     */
    public AccountInformationEntity(Long id, Boolean isActive, BigDecimal bankSum, CurrencyEntity currency,
            AccountTypeEntity accountType) {
        this.id = id;
        this.isActive = isActive;
        this.bankSum = bankSum;
        this.currency = currency;
        this.accountType = accountType;
    }

    /**
     * Constructs a new AccountInformationEntity with default values.
     */
    public AccountInformationEntity() {
    }

    /**
     * Retrieves the unique identifier for the account information.
     *
     * @return The unique identifier.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the account information.
     *
     * @param id The unique identifier to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves whether the account is active or not.
     *
     * @return True if the account is active, otherwise false.
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * Sets whether the account is active or not.
     *
     * @param isActive The boolean value indicating the account's active status.
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * Retrieves the total sum in the bank associated with the account.
     *
     * @return The bank sum.
     */
    public BigDecimal getBankSum() {
        return bankSum;
    }

    /**
     * Sets the total sum in the bank associated with the account.
     *
     * @param bankSum The bank sum to set.
     */
    public void setBankSum(BigDecimal bankSum) {
        this.bankSum = bankSum;
    }

    /**
     * Retrieves the currency associated with the account.
     *
     * @return The currency.
     */
    public CurrencyEntity getCurrency() {
        return currency;
    }

    /**
     * Sets the currency associated with the account.
     *
     * @param currency The currency to set.
     */
    public void setCurrency(CurrencyEntity currency) {
        this.currency = currency;
    }

    /**
     * Retrieves the type of the account.
     *
     * @return The account type.
     */
    public AccountTypeEntity getAccountType() {
        return accountType;
    }

    /**
     * Sets the type of the account.
     *
     * @param accountType The account type to set.
     */
    public void setAccountType(AccountTypeEntity accountType) {
        this.accountType = accountType;
    }
}
