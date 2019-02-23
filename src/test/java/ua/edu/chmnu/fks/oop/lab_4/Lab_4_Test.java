/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab_4;

import java.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class Lab_4_Test {
    
    public Lab_4_Test() {
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
    public void testSort(){
        int arr[] = {4, 2, 7, -9, 1};
        int expected[] = {-9, 1, 2, 4, 7};
        Lab_4.tailQuickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testIsOrdered(){
        int arr[] = {-9, 1, 2, 4, 7};
        boolean a = Lab_4.isOrdered(arr);
        assertEquals(true, a);
    }

    @Test
    public void testNotOrdered(){
        int arr[] = {4, 2, 7, -9, 1};
        boolean a = Lab_4.isOrdered(arr);
        assertEquals(false, a);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
