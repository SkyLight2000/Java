package ua.edu.chmnu.fks.oop.lab_6.Exceptions;

public class NegativeHeightException extends HeightException{
    public NegativeHeightException(){
        super("Height can't be less than 0");
    }
}
