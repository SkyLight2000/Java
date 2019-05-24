package ua.edu.chmnu.fks.oop.lab_6.Exceptions;

public class NegativeAngleException extends AngleException{
    public NegativeAngleException(){
        super("Angle can't less than 0");
    }
}
