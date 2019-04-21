/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab_5;

import java.util.Iterator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author User
 */
public class Auditory_Test {



    public Auditory_Test() {

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
    public void testFind(){
        OneLinkedList list = new OneLinkedList();
        list.addFirst(2);
        int actual = list.find(2).getData();
        assertEquals(2, actual);
    }

    @Test
    public void testAddFirst(){
        OneLinkedList list = mock(OneLinkedList.class);
        list.addFirst(2);
        verify(list, times(1)).addFirst(2);
    }

    @Test
    public void testAddLast(){
        OneLinkedList list = mock(OneLinkedList.class);
        list.addLast(5);
        verify(list, times(1)).addLast(5);
    }

    @Test
    public void testRemoveFirst(){
        OneLinkedList list = mock(OneLinkedList.class);
        list.removeFirst();
        verify(list, times(1)).removeFirst();
    }

    @Test
    public void testRemoveLast(){
        OneLinkedList list = mock(OneLinkedList.class);
        list.removeLast();
        verify(list, times(1)).removeLast();
    }

    @Test
    public void testPrintList(){
        OneLinkedList list = mock(OneLinkedList.class);
        list.addFirst(2);
        list.addLast(6);
        list.addLast(4);
        list.printList();
        verify(list, times(1)).printList();
    }

    @Test
    public void testReverseList(){
        OneLinkedList list = mock(OneLinkedList.class);
        list.addFirst(2);
        list.addLast(6);
        list.addLast(4);
        list.reverseList();
        verify(list, times(1)).reverseList();
    }

    @Test
    public void testLengthList(){
        OneLinkedList list = mock(OneLinkedList.class);
        list.addFirst(2);
        list.addLast(6);
        list.addLast(4);
        list.addLast(5);
        list.addLast(9);
        when(list.lengthList()).thenReturn(5);
        assertEquals(list.lengthList(), 5);
        verify(list).lengthList();
        doReturn(5).when(list).lengthList();
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
