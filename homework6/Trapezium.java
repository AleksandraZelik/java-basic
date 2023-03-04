package homework6;

public class Trapezium extends Quadrilateral {
    public Trapezium(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double square() {
        double p=(side1+side2+2*side3)/2;
        double d=(p-side1)*(p-side2)*(p-side3);
        double f=Math.pow(d,2);
        return Math.sqrt(f);
    }
}