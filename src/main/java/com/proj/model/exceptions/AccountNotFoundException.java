package com.proj.model.exceptions;

public class AccountNotFoundException extends RuntimeException{
    public AccountNotFoundException(String msg) {
        super(msg);
    }
}
