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

        double p1Perimeter = p1.Perimeter();
        double p1Square = p1.Square();
        double p2Perimeter = p2.Perimeter();
        double p2Square = p2.Square();

        System.out.printf("\nПериметр p1: %.2f", p1Perimeter);
        System.out.printf("\nПлощадь p1: %.2f", p1Square);
        System.out.printf("\nПериметр p2 %.2f", p2Perimeter);
        System.out.printf("\nПлощадь p2: %.2f", p2Square);
        System.out.println();
        p1.Compare(p1, p2);
    }
}

class Point {
    double x;
    double y;
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
}

class Parall {
    double ab, bc, cd, ad, ac;

    Parall(Point a, Point b, Point c, Point d){
        ab = SideLength(a, b);
        bc = SideLength(b, c);
        cd = SideLength(c, d);
        ad = SideLength(a, d);
        ac = SideLength(a, c);
    }

    public double SideLength(Point a, Point b){
        return Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
    }

    public double Perimeter(){
        return ab + bc + cd + ad;
    }

    public double Square(){
        double p;
        p = (ab + bc + ac) / 2;
        return 2 * Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }

    public void Compare(Parall a, Parall b){
        if(a.Perimeter() > b.Perimeter() && a.Square() > b.Square()){
            System.out.println("Периметр параллелограмма p1 больше чем периметр параллелограмма p2");
            System.out.println("Площадь параллелограмма p1 больше чем площадь параллелограмма p2");
        }
        else if(a.Perimeter() < b.Perimeter() && a.Square() < b.Square()){
            System.out.println("Периметр параллелограмма p2 больше чем периметр параллелограмма p1");
            System.out.println("Площадь параллелограмма p2 больше чем площадь параллелограмма p1");
        }
    }
}
