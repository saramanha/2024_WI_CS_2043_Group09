package com.proj.model.exceptions;

public class RoleNotFoundException extends RuntimeException {
    public RoleNotFoundException(String msg) {
        super(msg);
    }
}
