/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package ua.edu.chmnu.fks.oop.lab_1;

//import java.util.*;

/**
 *
 * @author User
 */
/*public class Lab_1 {
    static public void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Введите два числа: ");
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.printf("%d+%d=%d\n", a, b, a + b);
        } catch (Exception e) {
            System.out.println("Неверные данные");
        }
    }
}*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab_1;
import java.util.Arrays;
import java.util.Random;

public class Lab_1 {

    public static void main(String[] args) {
        Random random = new Random();

        //float[] array = new float[5];
        //float[] array_new = new float[5];
        int[] array = new int[5];
        int[] array_new = new int[5];
        for (int i = 0; i < array.length-1; i++)
        {
            array[i] = random.nextInt(10);
        }
        array[4]=array[2];
        Arrays.sort(array);
        System.out.println("Сортированный  массив: " + Arrays.toString(array));
        array_new[0]=array[0];
        for (int i=1;i<array.length;i++){
            if (array[i-1] != array[i]){

                array_new[i] = array[i];
            }
        }
        System.out.println("Наш массив: " + Arrays.toString(array_new));

        // TODO code application logic here
    }
}
