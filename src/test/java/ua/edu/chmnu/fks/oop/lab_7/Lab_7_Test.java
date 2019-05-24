package ua.edu.chmnu.fks.oop.lab_7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author User
 */
public class Lab_7_Test {

    @Test
    public void quickSortTest(){
        int[] arr = { 5, 1, 8, -2, 0, 3, 10 };
        Sort qsort = spy(Sort.class);
        int low = 0;
        int high = arr.length - 1;
        qsort.sort(arr, low, high);
        verify(qsort).sort(arr, low, high);
        //verifyNoMoreInteractions(qsort);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
