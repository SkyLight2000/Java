package ua.edu.chmnu.fks.oop.lab_6;

public class Auditory {

    public static void main(String[] args) throws NegativeLengthException, NegativeAngleException, NegativeWidthException {
        Parallelogram par1 = new Parallelogram(4, 6, 12);
        System.out.println("Par1 perimeter = " + par1.perimeter());
        System.out.println("Par1 square = " + par1.square());

        Parallelepiped parp1 = new Parallelepiped(4, 6, 12, 10, 0.5, 0.4);
        System.out.println("Parp1 perimeter = " + parp1.perimeter());
        System.out.println("Parp1 square = " + parp1.square());
        System.out.println("Parp1 volume = " + parp1.volume());
    }

    public static class Parallelogram{
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
                throw new NegativeLengthException("Length can't be less than 0");
            }
            if(width > 0) {
                this.width = width;
            }
            else{
                throw new NegativeWidthException("Width can't be less than 0");
            }
            if(angle1 > 0) {
                this.angle1 = angle1;
            }
            else {
                throw new NegativeAngleException("Angle can't less than 0");
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
                throw new NegativeLengthException("Length can't be less than 0");
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
                throw new NegativeWidthException("Width can't be less than 0");
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
                throw new NegativeAngleException("Angle can't less than 0");
            }
        }
    }

    public static class Parallelepiped extends Parallelogram{
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
                throw new NegativeHeightException("Height can't be less than 0");
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
                throw new NegativeAngleException("Angle can't less than 0");
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
                throw new NegativeAngleException("Angle can't less than 0");
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
}
