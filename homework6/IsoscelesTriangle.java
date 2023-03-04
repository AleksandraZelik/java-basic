package homework6;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double leg1,  double basic) {
        this.leg1 = leg1;
        this.basic = basic;
    }
    public double square() {
        double p=((leg1*leg1)-(basic*basic))/4;
        double s=Math.sqrt(p);
        return (basic*s)/2;
    }
}