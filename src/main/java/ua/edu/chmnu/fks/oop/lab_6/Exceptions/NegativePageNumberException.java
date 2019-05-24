package ua.edu.chmnu.fks.oop.lab_6.Exceptions;

public class NegativePageNumberException extends PageNumberException{
    public NegativePageNumberException(){
        super("Page number can't be less than 0");
    }
}
