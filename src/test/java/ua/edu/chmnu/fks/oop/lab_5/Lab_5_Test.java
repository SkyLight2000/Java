/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab_5;

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
public class Lab_5_Test {

    Point a = new Point(3, 2);
    Point b = new Point(5, 4);
    Point c = new Point(10, 4);
    Point d = new Point(8, 2);
    Parall p = new Parall(a, b, c, d);

    @Test
    public void sideLengthTest(){
        double sideLength = p.sideLength(a, b);
        double expected = 2.83;
        assertEquals(expected, round(sideLength, 2));
    }

    @Test
    public void perimeterTest(){
        double perimeter = p.perimeter();
        double expected = 15.66;
        assertEquals(expected, round(perimeter, 2));
    }

    @Test
    public void squareTest(){
        double square = p.square();
        double expected = 10;
        assertEquals(expected, round(square, 2));
    }

    private double round(double number, int scale) {
        int pow = 10;
        for (int i = 1; i < scale; i++)
            pow *= 10;
        double tmp = number * pow;
        return (double) (int) ((tmp - (int) tmp) >= 0.5 ? tmp + 1 : tmp) / pow;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
