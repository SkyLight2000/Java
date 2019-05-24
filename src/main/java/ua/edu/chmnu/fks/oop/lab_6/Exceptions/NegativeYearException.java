package ua.edu.chmnu.fks.oop.lab_6.Exceptions;

public class NegativeYearException extends YearException {
    public NegativeYearException(){
        super("Year can't be less than 0");
    }
}
