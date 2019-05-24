package ua.edu.chmnu.fks.oop.tasks;

import java.util.Date;
import java.util.Objects;

public class Book {
    private String sbn;
    private String author;
    private String title;
    private Date date;
    private int pages;

    public Book(String sbn, String author, String title, Date date, int pages) {
        this.sbn = sbn;
        this.author = author;
        this.title = title;
        this.date = date;
        this.pages = pages;
    }

    public String getSbn() {
        return sbn;
    }

    public void setSbn(String sbn) {
        this.sbn = sbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getPages() == book.getPages() &&
                Objects.equals(getSbn(), book.getSbn()) &&
                Objects.equals(getAuthor(), book.getAuthor()) &&
                Objects.equals(getTitle(), book.getTitle()) &&
                Objects.equals(getDate(), book.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSbn(), getAuthor(), getTitle(), getDate(), getPages());
    }

    @Override
    public String toString() {
        return "Book{" +
                "sbn='" + sbn + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", pages=" + pages +
                '}';
    }
}
