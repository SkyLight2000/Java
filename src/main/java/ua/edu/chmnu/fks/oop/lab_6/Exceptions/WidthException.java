package ua.edu.chmnu.fks.oop.lab_6.Exceptions;

public class WidthException extends Exception {
    public WidthException() {
    }

    public WidthException(String message) {
        super(message);
    }

    public WidthException(String message, Throwable cause) {
        super(message, cause);
    }

    public WidthException(Throwable cause) {
        super(cause);
    }

    public WidthException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
