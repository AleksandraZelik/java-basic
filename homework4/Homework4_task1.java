package homework4;

import java.util.Scanner;

public class Homework4_task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        while (cont) {
            System.out.println("Яку фігуру намалювати? Якщо ви бажаєте намалювати прямокутник, введіть 1. Якщо " +
                    "бажаєте намалювати прямокутний трикутник, введіть 2. Якщо бажаєте намалювати зворотній " +
                    "прямокутний трикутник, введіть 3. Якщо бажаєте намалювати трикутник, введіть 4.");
            int figure = sc.nextInt();

            if (figure == 1) {
                System.out.println("Введіть параметри фігури: висота");
                int height = sc.nextInt();
                System.out.println("Введіть параметри фігури: ширина");
                int width = sc.nextInt();
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= width; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            } else if (figure == 2) {
                System.out.println("Введіть параметри фігури: висота");
                int height = sc.nextInt();
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            } else if (figure == 3) {
                System.out.println("Введіть параметри фігури: висота");
                int height = sc.nextInt();
                for (int i = 1; i <= height; i++) {
                    for (int j = (height - i); j >= 0; j--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else if (figure == 4) {
                System.out.println("Введіть параметри фігури: висота");
                int height = sc.nextInt();
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= height - i; j++) {
                        System.out.print(" ");
                    }
                    for (int h = 1; h <= (i * 2) - 1; h++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }

            System.out.println("Чи хочете вивести ще одну фігуру? Якщо так, введіть yes. Якщо нi, введіть no");
            String answer = sc.next();
            if (answer.equals("yes"))
                cont = true;
            else cont = false;
        }
    }
}


