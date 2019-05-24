package ua.edu.chmnu.fks.oop.lab_6.Exceptions;

public class EnormousPageNumberException extends PageNumberException{
    public EnormousPageNumberException(){
        super("It can't be bigger then book of the fund min a-kasse, the biggest book in the world(It has 23675 pages!)");
    }
}
