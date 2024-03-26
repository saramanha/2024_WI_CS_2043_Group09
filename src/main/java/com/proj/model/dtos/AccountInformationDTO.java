package com.proj.model.dtos;

import java.math.BigDecimal;

/**
 * Data Transfer Object (DTO) representing account information.
 * This DTO is used for transferring account-related data between different layers of the application.
 */
public class AccountInformationDTO {

    // Attributes
    
    private Long id; // Unique identifier for the account
    private Boolean isActive; // Indicates whether the account is active or inactive
    private BigDecimal bankSum; // The sum of money available in the account
    private CurrencyDTO currency; // The currency associated with the account
    private AccountTypeDTO accountType; // The type of the account

    // Constructors

    /**
     * Constructs an AccountInformationDTO object with the specified attributes.
     *
     * @param id           The unique identifier for the account.
     * @param isActive     Indicates whether the account is active or inactive.
     * @param bankSum      The sum of money available in the account.
     * @param currency     The currency associated with the account.
     * @param accountType  The type of the account.
     */
    public AccountInformationDTO(Long id, Boolean isActive, BigDecimal bankSum, CurrencyDTO currency,
        AccountTypeDTO accountType) {
        this.id = id;
        this.isActive = isActive;
        this.bankSum = bankSum;
        this.currency = currency;
        this.accountType = accountType;
    }

    /**
     * Constructs an empty AccountInformationDTO object.
     */
    public AccountInformationDTO() {
    }

    // Getters and Setters

    /**
     * Returns the unique identifier for the account.
     *
     * @return The account identifier.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the account.
     *
     * @param id The account identifier to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Returns whether the account is active or inactive.
     *
     * @return True if the account is active, false otherwise.
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * Sets whether the account is active or inactive.
     *
     * @param isActive True to set the account as active, false otherwise.
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

     /**
     * Returns the sum of money available in the account.
     *
     * @return The bank sum of the account.
     */
    public BigDecimal getBankSum() {
        return bankSum;
    }

    /**
     * Sets the sum of money available in the account.
     *
     * @param bankSum The bank sum to set.
     */
    public void setBankSum(BigDecimal bankSum) {
        this.bankSum = bankSum;
    }

    /**
     * Returns the currency associated with the account.
     *
     * @return The currency associated with the account.
     */
    public CurrencyDTO getCurrency() {
        return currency;
    }

    /**
     * Sets the currency associated with the account.
     *
     * @param currency The currency to set.
     */
    public void setCurrency(CurrencyDTO currency) {
        this.currency = currency;
    }

    /**
     * Returns the type of the account.
     *
     * @return The account type.
     */
    public AccountTypeDTO getAccountType() {
        return accountType;
    }
    
     /**
     * Sets the type of the account.
     *
     * @param accountType The account type to set.
     */ 
    public void setAccountType(AccountTypeDTO accountType) {
        this.accountType = accountType;
    }
}
