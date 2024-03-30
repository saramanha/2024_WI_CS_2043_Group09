package com.proj.model.exceptions;

public class AddressNotFoundException extends RuntimeException {
    public AddressNotFoundException(String msg) {
        super(msg);
    }
}
