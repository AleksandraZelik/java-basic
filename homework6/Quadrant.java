package homework6;

public class Quadrant extends Quadrilateral{

    public Quadrant(double side1) {
        this.side1=side1;
    }
    public double square(){
        return side1 * side1;
    }
}
