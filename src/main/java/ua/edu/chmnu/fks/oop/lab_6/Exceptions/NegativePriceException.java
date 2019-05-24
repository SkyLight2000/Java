package ua.edu.chmnu.fks.oop.lab_6.Exceptions;

public class NegativePriceException extends PriceException{
    public NegativePriceException(){
        super("Price can't be less than 0");
    }
}
