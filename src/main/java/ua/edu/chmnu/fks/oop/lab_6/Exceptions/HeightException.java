package ua.edu.chmnu.fks.oop.lab_6.Exceptions;

public class HeightException extends Exception {
    public HeightException() {
    }

    public HeightException(String message) {
        super(message);
    }

    public HeightException(String message, Throwable cause) {
        super(message, cause);
    }

    public HeightException(Throwable cause) {
        super(cause);
    }

    public HeightException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
