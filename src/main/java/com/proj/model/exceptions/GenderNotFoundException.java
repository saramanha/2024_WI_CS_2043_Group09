package com.proj.model.exceptions;

public class GenderNotFoundException extends RuntimeException {
    public GenderNotFoundException(String msg) {
        super(msg);
    }
}
