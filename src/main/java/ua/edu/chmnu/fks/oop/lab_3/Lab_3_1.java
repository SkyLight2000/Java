/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab_3_1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            Random rnd = new Random();
            int mas[] = new int[10];
            System.out.println("Введите число: ");
            int s = in.nextInt();
            for(int i = 0; i < mas.length; i++){
                mas[i] = rnd.nextInt(10 - -10);
                System.out.print(mas[i] + " ");
            }
            System.out.println("");
            Arrays.sort(mas);
            inverse(mas);
            int min = 0;
            for(int i = 0; i < mas.length; i++){
                if(mas[i] > s){
                    min = mas[i];
                }
            }
            System.out.println("Минимальное число, которое меньше заданного: " + min);
        }
        catch(Exception e){
            System.out.println("Invalid input");
        }
    }
    
    static void inverse(int[] mas){
        for (int i = 0; i < mas.length / 2; i++) {
            int tmp = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = tmp;
        }
    }
}