package homework6;

public class Triangle extends Figure{
    double leg1;
    double leg2;
    double basic;

    public Triangle(double leg1,double leg2,double basic ){
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.basic = basic;
    }

    public Triangle() {

    }

    public double getLeg1() {
        return leg1;
    }
    public double getLeg2() {
        return leg2;
    }
    public double getBasic() {
        return basic;
    }

    public double square() {
        double p=(leg1+leg2+basic)/2;
        double s=p*(p-leg1)*(p-leg2)*(p-basic);
        return Math.sqrt(s);
    }
}

