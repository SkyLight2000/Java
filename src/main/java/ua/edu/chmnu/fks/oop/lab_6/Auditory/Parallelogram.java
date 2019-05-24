package ua.edu.chmnu.fks.oop.lab_6.Auditory;

import ua.edu.chmnu.fks.oop.lab_6.Exceptions.NegativeAngleException;
import ua.edu.chmnu.fks.oop.lab_6.Exceptions.NegativeLengthException;
import ua.edu.chmnu.fks.oop.lab_6.Exceptions.NegativeWidthException;

public class Parallelogram {
    private double length = 0.0;
    private double width = 0.0;
    private double angle1 = 0.0;

    public Parallelogram(){

    }

    public Parallelogram(double length, double width, double angle1) throws NegativeLengthException, NegativeWidthException, NegativeAngleException {
        if(length > 0) {
            this.length = length;
        }
        else{
            throw new NegativeLengthException();
        }
        if(width > 0) {
            this.width = width;
        }
        else{
            throw new NegativeWidthException();
        }
        if(angle1 > 0) {
            this.angle1 = angle1;
        }
        else {
            throw new NegativeAngleException();
        }
    }

    public double perimeter(){
        return 2 * (length + width);
    }

    public double square() throws NegativeLengthException, NegativeAngleException, NegativeWidthException {
        return Math.abs(width * length * width * Math.sin(angle1));
    }

    public final double getLength() {
        return length;
    }

    public void setLength(double length) throws NegativeLengthException {
        if(length > 0) {
            this.length = length;
        }
        else{
            throw new NegativeLengthException();
        }
    }

    public final double getWidth() {
        return width;
    }

    public void setWidth(double width) throws NegativeWidthException {
        if(width > 0) {
            this.width = width;
        }
        else{
            throw new NegativeWidthException();
        }
    }

    public double getAngle1() {
        return angle1;
    }

    public void setAngle1(double angle1) throws NegativeAngleException {
        if(angle1 > 0) {
            this.angle1 = angle1;
        }
        else {
            throw new NegativeAngleException();
        }
    }
}
