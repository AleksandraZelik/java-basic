package Homework2;

public class Homework2_task2 {
    public static void main(String[] args) {

        int workHourWeek = Integer.parseInt(args[0]);
        int costHour = Integer.parseInt(args[1]);
        int tax = Integer.parseInt(args[2]);

        final int NUMBER_WEEK=4;
        final int NUMBER_MONTH=12;

        int salaryInMonth=workHourWeek*NUMBER_WEEK*costHour;
        int salaryInMonthTax=salaryInMonth-(salaryInMonth*tax/100);
        int salaryInYear=salaryInMonth*NUMBER_MONTH;
        int salaryInYearTax=salaryInMonthTax*NUMBER_MONTH;

        System.out.println("Зарплатня на місяць без податків: "+salaryInMonth);
        System.out.println("Зарплатня на місяць з податками: "+salaryInMonthTax);
        System.out.println("Зарплатня на рік без податків: "+salaryInYear);
        System.out.println("Зарплатня на рік з податками: "+salaryInYearTax);
    }
}

