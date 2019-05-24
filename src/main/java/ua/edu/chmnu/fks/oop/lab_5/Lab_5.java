/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab_5;

/**
 *
 * @author User
 */
public class Lab_5 {
    public static void main(String[] args){
        Point a1 = new Point(3, 2);
        Point b1 = new Point(5, 4);
        Point c1 = new Point(10, 4);
        Point d1 = new Point(8, 2);

        Point a2 = new Point(1, 5);
        Point b2 = new Point(4, 8);
        Point c2 = new Point(10, 8);
        Point d2 = new Point(7, 5);

        Parall p1 = new Parall(a1, b1, c1, d1);
        Parall p2 = new Parall(a2, b2, c2, d2);

        double p1Perimeter = p1.perimeter();
        double p1Square = p1.square();
        double p2Perimeter = p2.perimeter();
        double p2Square = p2.square();

        System.out.printf("\nПериметр p1: %.2f", p1Perimeter);
        System.out.printf("\nПлощадь p1: %.2f", p1Square);
        System.out.printf("\nПериметр p2 %.2f", p2Perimeter);
        System.out.printf("\nПлощадь p2: %.2f", p2Square);
        System.out.println();
        p1.compare(p1, p2);
    }
}

