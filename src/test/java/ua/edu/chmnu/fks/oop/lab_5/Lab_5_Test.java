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

    Point a1 = new Point(3, 2);
    Point b1 = new Point(5, 4);
    Point c1 = new Point(10, 4);
    Point d1 = new Point(8, 2);
    Parall p1 = new Parall(a1, b1, c1, d1);

    Point a2 = new Point(1, 5);
    Point b2 = new Point(4, 8);
    Point c2 = new Point(10, 8);
    Point d2 = new Point(7, 5);
    Parall p2 = new Parall(a2, b2, c2, d2);

    public Lab_5_Test() {
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
    public void sideLengthTest(){
        double sideLength = p1.SideLength(a1, b1);
        double expected = 2.83;
        assertEquals(expected, round(sideLength, 2));
    }

    @Test
    public void perimeterTest(){
        double perimeter = p1.Perimeter();
        double expected = 15.66;
        assertEquals(expected, round(perimeter, 2));
    }

    @Test
    public void squareTest(){
        double square = p1.Square();
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
