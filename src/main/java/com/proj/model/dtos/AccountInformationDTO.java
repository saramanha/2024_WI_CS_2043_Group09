package com.proj.model.dtos;

import java.math.BigDecimal;
public class AccountInformationDTO {
    private Long id;
    private Boolean isActive;
    private BigDecimal bankSum;
    private CurrencyDTO currency;
    private AccountTypeDTO accountType;

    public AccountInformationDTO(Long id, Boolean isActive, BigDecimal bankSum, CurrencyDTO currency,
        AccountTypeDTO accountType) {
        this.id = id;
        this.isActive = isActive;
        this.bankSum = bankSum;
        this.currency = currency;
        this.accountType = accountType;
    }

    public AccountInformationDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public BigDecimal getBankSum() {
        return bankSum;
    }

    public void setBankSum(BigDecimal bankSum) {
        this.bankSum = bankSum;
    }

    public CurrencyDTO getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyDTO currency) {
        this.currency = currency;
    }

    public AccountTypeDTO getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountTypeDTO accountType) {
        this.accountType = accountType;
    }
}
