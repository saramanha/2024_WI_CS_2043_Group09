package com.proj.model.exceptions;

public class AccountInactiveException extends RuntimeException {
    public AccountInactiveException (String message) {
        super(message);
    }
}
