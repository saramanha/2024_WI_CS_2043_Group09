package com.proj.model.exceptions;

public class BankAccountException extends RuntimeException {
    private boolean clientPersonalInfoNotFound;
    private boolean bankAccountNotFound;
    private boolean currencyNotFound;
    private boolean currencyConversionRateNotFound;

    public BankAccountException(String message, boolean clientPersonalInfoNotFound, boolean bankAccountNotFound, boolean currencyNotFound,
    boolean currencyConversionRateNotFound) {
        super(message);
        this.clientPersonalInfoNotFound = clientPersonalInfoNotFound;
        this.bankAccountNotFound = bankAccountNotFound;
        this.currencyNotFound = currencyNotFound;
        this.currencyConversionRateNotFound = currencyConversionRateNotFound;
    }

    public boolean isClientPersonalInfoNotFound() {
        return clientPersonalInfoNotFound;
    }
    public boolean isBankAccountNotFound() {
        return bankAccountNotFound;
    }
    public boolean isCurrencyNotFound() {
        return currencyNotFound;
    }
    public boolean isCurrencyConversionRateNotFound() {
        return currencyConversionRateNotFound;
    }
    
}
