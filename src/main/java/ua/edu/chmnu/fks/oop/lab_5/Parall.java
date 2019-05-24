package ua.edu.chmnu.fks.oop.lab_5;

public class Parall {
    double ab, bc, cd, ad, ac;

    Parall(Point a, Point b, Point c, Point d){
        ab = sideLength(a, b);
        bc = sideLength(b, c);
        cd = sideLength(c, d);
        ad = sideLength(a, d);
        ac = sideLength(a, c);
    }

    public double sideLength(Point a, Point b){
        return Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
    }

    public double perimeter(){
        return ab + bc + cd + ad;
    }

    public double square(){
        double p;
        p = (ab + bc + ac) / 2;
        return 2 * Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }

    public void compare(Parall a, Parall b){
        if(a.perimeter() > b.perimeter() && a.square() > b.square()){
            System.out.println("Периметр параллелограмма p1 больше чем периметр параллелограмма p2");
            System.out.println("Площадь параллелограмма p1 больше чем площадь параллелограмма p2");
        }
        else if(a.perimeter() < b.perimeter() && a.square() < b.square()){
            System.out.println("Периметр параллелограмма p2 больше чем периметр параллелограмма p1");
            System.out.println("Площадь параллелограмма p2 больше чем площадь параллелограмма p1");
        }
    }
}
