package com.proj.model.exceptions;

public class ClientServiceException extends RuntimeException {
    public ClientServiceException(String msg) {
        super(msg);
    }
}
