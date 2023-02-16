package homework2;

import java.util.Scanner;

public class Homework2_task3 {
    public static void main(String[] args) {
        Scanner count = new Scanner(System.in);
        System.out.println("Введіть кількість робочих годин на тиждень:");
        int hourWeek = count.nextInt();

        System.out.println("Введіть річну зарплатню с податками:");
        int salaryTax = count.nextInt();

        System.out.println("Введіть відсоток податку:");
        int tax = count.nextInt();

        final int NUMBER_WEEK=4;
        final int NUMBER_MONTH=12;
        int costHour = (salaryTax - (salaryTax*tax/100))/  (hourWeek * NUMBER_WEEK * NUMBER_MONTH);

        System.out.println("При "+hourWeek+" робочих годин на тиждень з річною зарплатою в " +salaryTax+
                " та податком " +tax+ "%" + " година часу коштує "+costHour);
    }
}

