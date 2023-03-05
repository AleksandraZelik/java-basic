package homework6;

public class Quadrilateral extends Figure {
    double side1;
    double side2;
    double side3;
    double side4;
    double angleDeg;

    public Quadrilateral(double side1, double side2, double side3, double side4, double angleDeg){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        this.side4=side4;
        this.angleDeg=angleDeg;
    }
    public Quadrilateral(){

    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getSide4() {
        return side4;
    }

    public double getAngleDeg() {
        return angleDeg;
    }



    public double square(){
        double angleRadian=(angleDeg*3.14)/180;
        double sinAngle=Math.sin(angleRadian);
        return 0.5 * side1 * side2 * sinAngle;
    }


}