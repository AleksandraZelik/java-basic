package homework3;

import java.util.Scanner;

public class Homework3_task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число:");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Ваше число додатнє");
        } else if (number < 0) {
            System.out.println("Ваше число від'ємне");
        } else {
            System.out.println("Ваше число 0, не відноситься ні до від'ємних, ні до додатніх");
        }

        if (number % 2 == 0) {
            System.out.println("Ваше число парне");
        } else {
            System.out.println("Ваше число непарне");
        }

        boolean primeNumber = true;
        if (number == 0 || number == 1|| number < 0  ) {
            System.out.println("Ваше число " + number+ " не відноситься ні до простих, ні до складених");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    primeNumber = false;
                    break;}
            }
            if (primeNumber) {
                System.out.println("Ваше число просте");
            } else {
                System.out.println("Ваше число складене");
            }
        }
    }
}
