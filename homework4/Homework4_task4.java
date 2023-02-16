package homework4;

public class Homework4_task4 {
    public static void main(String[] args) {
        double costHour = Double.parseDouble(args[0]);
        double tax = Double.parseDouble(args[1]);
        final int WORK_DAY_HOUR=8;
        final int REST_DAY_MONTH=8;
        final int WORK_DAY_MONTH1=31;
        double salaryInMonth1 = costHour*WORK_DAY_HOUR*(WORK_DAY_MONTH1-REST_DAY_MONTH);
        double salaryInMonthTax1 = salaryInMonth1-(salaryInMonth1*tax/100);
        System.out.println("JAN: "+salaryInMonth1 +"  "+ salaryInMonthTax1);

        final int WORK_DAY_MONTH2=28;
        double salaryInMonth2 = costHour*WORK_DAY_HOUR*(WORK_DAY_MONTH2-REST_DAY_MONTH);
        double salaryInMonthTax2 = salaryInMonth2-(salaryInMonth2*tax/100);
        System.out.println("FEB: "+salaryInMonth2 +"  "+ salaryInMonthTax2);
        System.out.println("MAR: "+salaryInMonth1 +"  "+ salaryInMonthTax1);

        final int WORK_DAY_MONTH3=30;
        double salaryInMonth3 = costHour*WORK_DAY_HOUR*(WORK_DAY_MONTH3-REST_DAY_MONTH);
        double salaryInMonthTax3 = salaryInMonth3-(salaryInMonth3*tax/100);

        System.out.println("APR: "+salaryInMonth3 +"  "+ salaryInMonthTax3);
        System.out.println("MAI: "+salaryInMonth1 +"  "+ salaryInMonthTax1);
        System.out.println("JUN: "+salaryInMonth3 +"  "+ salaryInMonthTax3);
        System.out.println("JUL: "+salaryInMonth1 +"  "+ salaryInMonthTax1);
        System.out.println("AUG: "+salaryInMonth1 +"  "+ salaryInMonthTax1);
        System.out.println("SEP: "+salaryInMonth3 +"  "+ salaryInMonthTax3);
        System.out.println("OCT: "+salaryInMonth1 +"  "+ salaryInMonthTax1);
        System.out.println("NOV: "+salaryInMonth3 +"  "+ salaryInMonthTax3);
        System.out.println("DEC: "+salaryInMonth1 +"  "+ salaryInMonthTax1);

        System.out.printf("TOTAL: %s  %s%n", (salaryInMonth1 * 7) + salaryInMonth2 + (salaryInMonth3 * 5),
                (salaryInMonthTax1 * 7) + salaryInMonthTax2 + (salaryInMonthTax3 * 5));
    }
}

