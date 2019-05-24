package ua.edu.chmnu.fks.oop.lab_6.Exceptions;

public class NegativeLengthException extends LengthException{
    public NegativeLengthException(){
        super("Length can't be less than 0");
    }
}
