/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Lab_2 {
    public static void main(String[] args) {
        System.out.println("1. Обчислити значення виразу із заданими параметрами");
        System.out.println("2. Обчислити значення виразу з випадковими параметрами");
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        double a = 7.07, b = 5.08, c = 3.22, x = 2.04;
        double y1, y2;
        double  a1 = rnd.nextDouble();
        double  b1 = rnd.nextDouble();
        double  c1 = rnd.nextDouble();
        double  x1 = rnd.nextDouble();
        int s = in.nextInt();
        while((Math.log(Math.cbrt(Math.pow(x1, 5) + b1 / x1))) < 0){
            b1 = rnd.nextDouble();
            x1 = rnd.nextDouble();
        }
        y1 = f(a, b, c, x);
        y2 = f(a1, b1, c1, x1);
        switch(s){
            case 1:
                System.out.println("y = " + y1);
            break;
            case 2:
                System.out.println("y = " + y2);
            break;
        }
    }
    
    static double f(double a, double b, double c, double x){
        return (Math.pow((Math.pow(Math.cos(a), 2) * x - c * x), 1/5)) / Math.log(Math.cbrt(Math.pow(x, 5) + b / x));
    }
}
