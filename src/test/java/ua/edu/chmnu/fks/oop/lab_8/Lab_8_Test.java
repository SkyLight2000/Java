package ua.edu.chmnu.fks.oop.lab_8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.edu.chmnu.fks.oop.lab_8.Lab_8.consonants;
import static ua.edu.chmnu.fks.oop.lab_8.Lab_8.maxConsonants;

public class Lab_8_Test {

    @Test
    public void countConsonantsTest(){
        assertEquals(4, consonants("вввуаф"));
        assertEquals(6, consonants("вввуафауеког"));
        assertEquals(1, consonants("веу"));
    }

    @Test
    public void maxConsonantsTest(){
        List<String> list = Arrays.asList("ааафвц", "аыфаа", "вввуаф");
        List<String> expected = Arrays.asList("вввуаф");

        assertEquals(expected, maxConsonants(list));

    }
}
