package ua.edu.chmnu.fks.oop.lab_6;

import ua.edu.chmnu.fks.oop.lab_6.Exceptions.*;

public class Encyclopedia extends Book {
    private String bookType = "Энциклопедия";

    public Encyclopedia(){

    }

    public Encyclopedia(String name, String author, int year, int pageNumber, int price) throws PriceException, YearException, PageNumberException{
        super(name, author, year, pageNumber, price);
    }

    public String getBookType() {
        return bookType;
    }

    @Override
    public String toString() {
        return '\n' + "Тип книги: " + bookType + '\n' +
                "Имя: " + getName() + '\n' +
                "Автор: " + getAuthor() + '\n' +
                "Год: " + getYear() + '\n' +
                "Кол-во страниц: " + getPageNumber() + '\n' +
                "Цена: " + getPrice() + '\n';
    }
}
