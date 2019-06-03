package ua.edu.chmnu.fks.oop.lab_9;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lab_9_Test {

    @Test
    public void countWordTest() throws IOException {
        WordCounter wordCounter = new WordCounter("D:\\Documents\\NetBeansProjects\\OOP-2k-master\\src\\main\\java\\ua\\edu\\chmnu\\fks\\oop\\lab_9\\text.txt");
        Map<String, Integer> map = new HashMap<>();
        map.put("cat", 2);
        map.put("dog", 3);
        map.put("parrot", 1);
        assertEquals(map, wordCounter.countWord());
    }
}

