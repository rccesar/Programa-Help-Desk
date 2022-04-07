package com.renato.helpdesk.exceptions;

public class DataIntegrityViolationException extends RuntimeException {
    private static final long serialVersion = 1L;

    public DataIntegrityViolationException(String message) {
        super(message);
    }

    public DataIntegrityViolationException(String message, Throwable cause) {
        super(message, cause);
    }
}
