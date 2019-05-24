package ua.edu.chmnu.fks.oop.lab_6.Exceptions;

public class YearException extends Exception{
    public YearException() {
    }

    public YearException(String message) {
        super(message);
    }

    public YearException(String message, Throwable cause) {
        super(message, cause);
    }

    public YearException(Throwable cause) {
        super(cause);
    }

    public YearException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
