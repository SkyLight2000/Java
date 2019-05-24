package ua.edu.chmnu.fks.oop.lab_6.Exceptions;

public class NegativeWidthException extends WidthException{
    public NegativeWidthException(){
        super("Width can't be less than 0");
    }
}
