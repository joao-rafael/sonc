package com.sonc.fc.up.pt.shared;

public class SoncException extends java.lang.Exception {
    private String message;
    private Throwable cause;
    private boolean enableSuppression;
    private boolean writableStackTrace;
    public SoncException() {

    }

    public SoncException(String message) {
        this.message = message;
    }

    public SoncException(Throwable cause) {
        this.cause = cause;
    }

    public SoncException(String message, Throwable cause) {
        this.message = message;
        this.cause = cause;
    }

    public SoncException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        this(message, cause);
        this.enableSuppression = enableSuppression;
        this.writableStackTrace = writableStackTrace;
    }

}
