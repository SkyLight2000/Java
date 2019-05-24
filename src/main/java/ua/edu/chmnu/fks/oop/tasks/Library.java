package ua.edu.chmnu.fks.oop.tasks;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books){
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void load(){
        try(FileInputStream fileInputStream = new FileInputStream("library.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream))
        {
            setBooks((ArrayList<Book>) objectInputStream.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void save(String file){
        try(FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream))
        {
            objectOutputStream.writeObject(books);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Book> getByAuthor(String author) {
        return books.stream()
                .filter(b -> b.getAuthor() == author)
                .collect(Collectors.toList());
    }

    public List<Book> getByDate(Date date) {
        return books.stream()
                .filter(b -> b.getDate().getDate() == date.getDate())
                .collect(Collectors.toList());
    }

    public List<Book> getByDiapason(int from, int to){
        return books.stream()
                .filter(b -> b.getPages() >= from && b.getPages() <= to)
                .collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return getBooks().equals(library.getBooks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBooks());
    }
}
