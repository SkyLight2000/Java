package ua.edu.chmnu.fks.oop.lab_6.Exceptions;

public class AngleException extends Exception {
    public AngleException() {
    }

    public AngleException(String message) {
        super(message);
    }

    public AngleException(String message, Throwable cause) {
        super(message, cause);
    }

    public AngleException(Throwable cause) {
        super(cause);
    }

    public AngleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
