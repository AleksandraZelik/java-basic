package Homework3;

public class Homework3_task3 {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        double costHour = Double.parseDouble(args[1]);
        double tax = Double.parseDouble(args[2]);
        final int WORK_DAY_HOUR=8;
        final int REST_DAY_MONTH=8;
        final String SALARY_MONTH="Зарплатня на місяць без податків: ";
        final String SALARY_MONTH_TAX="Зарплатня на місяць з податками: ";

        if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
            int workDayMonth=31;
            double salaryInMonth = costHour*WORK_DAY_HOUR*(workDayMonth-REST_DAY_MONTH);
            double salaryInMonthTax = salaryInMonth-(salaryInMonth*tax/100);
            System.out.println(SALARY_MONTH + salaryInMonth);
            System.out.println(SALARY_MONTH_TAX +salaryInMonthTax);
        } else if (month==4 || month==6 || month==9 || month==11) {
            int workDayMonth=30;
            double salaryInMonth = costHour*WORK_DAY_HOUR*(workDayMonth-REST_DAY_MONTH);
            double salaryInMonthTax = salaryInMonth-(salaryInMonth*tax/100);
            System.out.println(SALARY_MONTH + salaryInMonth);
            System.out.println(SALARY_MONTH_TAX +salaryInMonthTax);
        } else if (month==2){
            int workDayMonth=28;
            double salaryInMonth = costHour*WORK_DAY_HOUR*(workDayMonth-REST_DAY_MONTH);
            double salaryInMonthTax = salaryInMonth-(salaryInMonth*tax/100);
            System.out.println(SALARY_MONTH +salaryInMonth);
            System.out.println(SALARY_MONTH_TAX +salaryInMonthTax);
        }
    }
}

