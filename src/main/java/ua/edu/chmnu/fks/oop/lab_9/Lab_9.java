package ua.edu.chmnu.fks.oop.lab_9;

import java.io.IOException;

public class Lab_9 {
    public static void main(String[] args) throws IOException {
        WordCounter wordCounter = new WordCounter("D:\\Documents\\NetBeansProjects\\OOP-2k-master\\src\\main\\java\\ua\\edu\\chmnu\\fks\\oop\\lab_9\\text.txt");
        System.out.println(wordCounter.countWord());
    }
}
