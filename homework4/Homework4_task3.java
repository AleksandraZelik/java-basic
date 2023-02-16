package homework4;

import java.util.Scanner;

public class Homework4_task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть загальну суму кредиту:");
        double kredit = sc.nextDouble();
        System.out.println("Введіть місячний відсоток на залишок по кредиту:");
        int percent = sc.nextInt();

        System.out.println("Який розрахунок потрібно зробити?Якщо потрібно розрахувати кількість щомісячних платежів," +
                " які необхідно зробити для повного погашення кредиту, введіть 1. Якщо потрібно розрахувати суму" +
                " щомісячного платежу, введіть 2");
        int ans = sc.nextInt();

        if (ans==1) {
            System.out.println("Введіть суму щомісячного взносу:");
            double monthP = sc.nextInt();
            int count = 1;

            if(monthP <= (kredit*percent)/100) {
                System.out.println("Сума щомісячного взносу повинна складати більше: " + (kredit*percent)/100);
            } else {
                for (double i = kredit; i >= 0; i = kredit) {
                    kredit = kredit - monthP + (((kredit - monthP) * percent) / 100);
                    if(kredit < 0) {
                        System.out.println("Кількість щомісячних платежів складає:" + count);
                        System.out.println("Залишок до повного погашення кредиту складає:" + i);
                        break;
                    }
                    count++;
                }
            }
        } else if (ans==2) {
            System.out.println("Введіть кількість платежів:");
            int countPay = sc.nextInt();
            double firstMonthPayment = kredit/countPay;

            for (int i = countPay; i > 0; i--) {
                double resultPayment = ((kredit*percent)/100) + firstMonthPayment;

                kredit = kredit - firstMonthPayment;

                System.out.println("місячний платіж: " + resultPayment);
            }
        }
    }
}

