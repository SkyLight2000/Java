package ua.edu.chmnu.fks.oop.lab_6;

import ua.edu.chmnu.fks.oop.lab_6.Exceptions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public abstract class Book {
    private ArrayList<Book> books;
    private String name;
    private String author;
    private int year;
    private int pageNumber;
    private int price;

    public Book(){

    }

    public Book(String name, String author, int year, int pageNumber, int price) throws YearException, PageNumberException, PriceException {
        this.name = name;
        this.author = author;
        if(year > 0 && year < 2019) {
            this.year = year;
        }
        else if(year < 0) {
            throw new NegativeYearException();
        }
        else{
            throw new FutureYearException();
        }
        if(pageNumber > 0 && pageNumber < 23675) {
            this.pageNumber = pageNumber;
        }
        else if(pageNumber < 0) {
            throw new NegativePageNumberException();
        }
        else{
            throw new EnormousPageNumberException();
        }
        if(price > 0 && price < 300800000) {
            this.price = price;
        }
        else if(price < 0) {
            throw new NegativePriceException();
        }
        else {
            throw new EnormousPriceException();
        }
    }

    public abstract String getBookType();

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

    public int getPageNumber(){
        return pageNumber;
    }

    public int getPrice(){
        return  price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setYear(int year) throws YearException {
        if(year > 0 && year < 2019) {
            this.year = year;
        }
        else if(year < 0) {
            throw new NegativeYearException();
        }
        else{
            throw new FutureYearException();
        }
    }

    public void setPageNumber(int pageNumber) throws PageNumberException {
        if(pageNumber > 0 && pageNumber < 23675) {
            this.pageNumber = pageNumber;
        }
        else if(pageNumber < 0) {
            throw new NegativePageNumberException();
        }
        else{
            throw new EnormousPageNumberException();
        }
    }

    public void setPrice(int price) throws PriceException {
        if(price > 0 && price < 300800000) {
            this.price = price;
        }
        else if(price < 0) {
            throw new NegativePriceException();
        }
        else {
            throw new EnormousPriceException();
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getYear() == book.getYear() &&
                getPageNumber() == book.getPageNumber() &&
                getPrice() == book.getPrice() &&
                books.equals(book.books) &&
                getName().equals(book.getName()) &&
                getAuthor().equals(book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(books, getName(), getAuthor(), getYear(), getPageNumber(), getPrice());
    }
}
