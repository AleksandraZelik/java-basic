package homework2;

public class Homework2_task1 {
    public static void main(String[] args) {

        double number1 = Double.parseDouble(args[0]);
        double number2 = Double.parseDouble(args[1]);
        double result = Math.pow(number1,number2);
        System.out.println(result);
    }
}

