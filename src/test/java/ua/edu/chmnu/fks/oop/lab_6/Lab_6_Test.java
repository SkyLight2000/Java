package ua.edu.chmnu.fks.oop.lab_6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static ua.edu.chmnu.fks.oop.lab_6.Lab_6.*;

/**
 *
 * @author User
 */
public class Lab_6_Test {

    public Lab_6_Test() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {

    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void getBookTypeTest(){
        Manual manual = mock(Manual.class);
        when(manual.getBookType()).thenReturn("Пособие");
        assertEquals(manual.getBookType(), "Пособие");
    }

    @Test
    public void getNameTest(){
        Manual manual = mock(Manual.class);
        when(manual.getName()).thenReturn("Нормальная физиология");
        assertEquals(manual.getName(), "Нормальная физиология");
    }

    @Test
    public void getAuthorTest(){
        Manual manual = mock(Manual.class);
        when(manual.getAuthor()).thenReturn("Агаджанян Николай Александрович");
        assertEquals(manual.getAuthor(), "Агаджанян Николай Александрович");
    }

    @Test
    public void getYearTest(){
        Manual manual = mock(Manual.class);
        when(manual.getYear()).thenReturn(2001);
        assertEquals(manual.getYear(), 2001);
    }

    @Test
    public void getPageNumberTest(){
        Manual manual = mock(Manual.class);
        when(manual.getPageNumber()).thenReturn(233);
        assertEquals(manual.getPageNumber(), 233);
    }

    @Test
    public void getPriceTest(){
        Manual manual = mock(Manual.class);
        when(manual.getPrice()).thenReturn(500);
        assertEquals(manual.getPrice(), 500);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
