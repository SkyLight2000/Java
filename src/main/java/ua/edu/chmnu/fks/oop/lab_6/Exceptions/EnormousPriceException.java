package ua.edu.chmnu.fks.oop.lab_6.Exceptions;

public class EnormousPriceException extends PriceException{
    public EnormousPriceException(){
        super("It can't be more expensive than Leicester Code, the most expensive book in the world");
    }
}
