package Homework3;

import java.util.Scanner;

public class Homework3_task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть кількість товару:");
        int countProduct = scan.nextInt();
        double priceProduct = Double.parseDouble(args[0]);
        final  String COMMON_SUM="Загальна сумма товару: ";


        if (countProduct<=10) {
            double price = countProduct * priceProduct;
            System.out.println(COMMON_SUM + price);

        } else if (countProduct>10 && countProduct<=20) {
            final double SALE_PERCENT=5;
            double price = (countProduct * priceProduct) - ((countProduct * priceProduct * SALE_PERCENT)/ 100);
            System.out.println(COMMON_SUM + price);

        } else if (countProduct>20 && countProduct<=30) {
            final double SALE_PERCENT=10;
            double price=(countProduct*priceProduct)-((countProduct*priceProduct*SALE_PERCENT)/100);
            System.out.println(COMMON_SUM +price);

        } else if (countProduct>30 && countProduct<=40) {
            final double SALE_PERCENT=12;
            double price=(countProduct*priceProduct)-((countProduct*priceProduct*SALE_PERCENT)/100);
            System.out.println(COMMON_SUM +price);

        } else if (countProduct>40 && countProduct<=50) {
            final double SALE_PERCENT=12.4;
            double price=(countProduct*priceProduct)-((countProduct*priceProduct*SALE_PERCENT)/100);
            System.out.println(COMMON_SUM +price);

        }else if (countProduct>50 && countProduct<=60) {
            final double SALE_PERCENT=12.8;
            double price=(countProduct*priceProduct)-((countProduct*priceProduct*SALE_PERCENT)/100);
            System.out.println(COMMON_SUM +price);

        }else if (countProduct>60 && countProduct<=70) {
            final double SALE_PERCENT=13.2;
            double price=(countProduct*priceProduct)-((countProduct*priceProduct*SALE_PERCENT)/100);
            System.out.println(COMMON_SUM +price);

        }else if (countProduct>70 && countProduct<=80) {
            final double SALE_PERCENT=13.6;
            double price=(countProduct*priceProduct)-((countProduct*priceProduct*SALE_PERCENT)/100);
            System.out.println(COMMON_SUM +price);

        } else if (countProduct>80) {
            final double SALE_PERCENT=13;
            double price=(countProduct*priceProduct)-((countProduct*priceProduct*SALE_PERCENT)/100);
            System.out.println(COMMON_SUM +price);
        }
    }
}

