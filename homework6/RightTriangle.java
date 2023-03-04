package homework6;

public class RightTriangle extends Triangle{
    private double angle;
    public RightTriangle(double leg1, double leg2,double basic){
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.basic = basic;
    }
    public double square() {
        return (leg1+leg2)/2;
    }
}

