package homework5;

import java.util.Arrays;
import java.util.Collections;

public class Credit {
    private double sum;
    private double percent;
    private double monthPay;
    private int term;

    public Credit(double sum, double percent, double monthPay) {
        this.sum = sum;
        this.percent = percent;
        this.monthPay = monthPay;
    }

    public Credit(double sum, double percent, int term) {
        this.sum = sum;
        this.percent = percent;
        this.term = term;
    }


    public double getSum() {
        return sum;
    }

    public double getPercent() {
        return percent;
    }

    public int getTerm() {
        return term;
    }

    public double getMonthPay() {
        return monthPay;
    }

    public void setMonthPay(double monthPay) {
        this.monthPay = monthPay;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public String countMonthPay() {
        double firstMonthPayment = sum / term;
        double[] Array = new double[term+1];

        for (int j = term; j > 0; j--) {
           double resultPayment = ((sum * percent) / 100) + firstMonthPayment;
            sum = sum - firstMonthPayment;
            Array[j] = resultPayment;
        }
        return Arrays.toString(Array);
    }

}



