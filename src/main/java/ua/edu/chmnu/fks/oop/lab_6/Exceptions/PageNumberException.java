package ua.edu.chmnu.fks.oop.lab_6.Exceptions;

public class PageNumberException extends Exception {
    public PageNumberException() {
    }

    public PageNumberException(String message) {
        super(message);
    }

    public PageNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public PageNumberException(Throwable cause) {
        super(cause);
    }

    public PageNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
