package homework6;

public class Rectangle extends Quadrilateral {
    public Rectangle(double side1,double side2) {
        this.side1=side1;
        this.side2=side2;
    }
    public double square(){
        return side1 * side2;
    }
}
