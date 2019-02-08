/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab_1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab_1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("¬ведите два числа: ");
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.printf("%d+%d=%d\n",a , b, a + b);
            in.close();
        } 
        catch(Exception e){
            System.out.println("Invalid input");
        }
    }
}
