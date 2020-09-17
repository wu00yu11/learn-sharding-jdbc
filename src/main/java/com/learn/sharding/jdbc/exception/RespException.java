package com.learn.sharding.jdbc.exception;

/**
 * @author wu00y
 */
public class RespException extends Exception {

    public RespException() {
        super();
    }

    public RespException(String message) {
        super(message);
    }

    public RespException(String message, Throwable cause) {
        super(message, cause);
    }

    public RespException(Throwable cause) {
        super(cause);
    }

    protected RespException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
