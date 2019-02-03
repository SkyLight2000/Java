/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Lab_2 {
    public static void main(String[] args) {
        System.out.println("1. Обчислити значення виразу із заданими параметрами");
        System.out.println("2. Обчислити значення виразу з випадковими параметрами");
        System.out.println("3. Обчислити екстремуми");
        Scanner in = new Scanner(System.in);
        double y;
        int s = in.nextInt();  
        switch(s){
            case 1:
                y = f(7.07, 5.08, 3.22, 2.04);
                System.out.println("y = " + y);
            break;
            case 2:
                double a, b, c, x;
                do{
                    a = Math.random() * 10;
                    b = Math.random() * 10;
                    c = Math.random() * 10;
                    x = Math.random() * 10;
                } while((Math.log(Math.cbrt(Math.pow(x, 5) + b / x))) < 0);
                y = f(a, b, c, x);
                System.out.println("y = " + y);
            break;
            case 3:
                int N = 200;
                double xl = -4.4, x2 = 4.4, h = (x2 - xl) / N;
                for (int i = 1; i < N; ++i) {
                    double xx = xl + i * h;
                    double y1 = f(7.07, 5.08, 3.22, xx - h), y2 = f(7.07, 5.08, 3.22, xx + h);
                    y = f(7.07, 5.08, 3.22, xx);
                    double dy1 = y - y1, dy2 = y2 - y;
                    if (dy1 < 0 && dy2 > 0) {
                        System.out.printf("Min (%.3f, %.3f)\n", xx, y);
                    } 
                    else if (dy1 > 0 && dy2 < 0) {
                        System.out.printf("Max (%.3f, %.3f)\n", xx, y);
                    }              
                }
            break;
        }
    }
    
    static double f(double a, double b, double c, double x){
        return (Math.pow((Math.pow(Math.cos(a), 2) * x - c * x), 1/5)) / Math.log(Math.cbrt(Math.pow(x, 5) + b / x));
    }
}
