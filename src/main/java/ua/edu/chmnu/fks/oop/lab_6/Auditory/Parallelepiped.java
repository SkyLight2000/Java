package ua.edu.chmnu.fks.oop.lab_6.Auditory;

import ua.edu.chmnu.fks.oop.lab_6.Exceptions.*;

public class Parallelepiped extends Parallelogram{
    private double height;
    private double angle2;
    private double angle3;

    public Parallelepiped(){

    }

    public Parallelepiped(double length, double width, double angle1, double height, double angle2, double angle3) throws NegativeLengthException, NegativeAngleException, NegativeWidthException {
        super(length, width, angle1);
        this.height = height;
        this.angle2 = angle2;
        this.angle3 = angle3;
    }

    public double volume() throws NegativeLengthException, NegativeAngleException, NegativeWidthException {
        return Math.abs(super.square() * height * Math.sin(angle2));
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws NegativeHeightException {
        if(height > 0) {
            this.height = height;
        }
        else{
            throw new NegativeHeightException();
        }
    }

    public double getAngle2() {
        return angle2;
    }

    public void setAngle2(double angle2) throws NegativeAngleException {
        if(angle2 > 0) {
            this.angle2 = angle2;
        }
        else {
            throw new NegativeAngleException();
        }
    }

    public double getAngle3() {
        return angle3;
    }

    public void setAngle3(double angle3) throws NegativeAngleException {
        if(angle3 > 0) {
            this.angle3 = angle3;
        }
        else {
            throw new NegativeAngleException();
        }
    }

    @Override
    public double square() throws NegativeLengthException, NegativeAngleException, NegativeWidthException {
        Parallelogram p2 = new Parallelogram(getLength(), height, angle2);
        Parallelogram p3 = new Parallelogram(getWidth(), height, angle3);
        return 2 * (super.square() + p2.square() + p3.square());
    }

    @Override
    public double perimeter() {
        return super.perimeter() * 2 + 4 * height;
    }

}
