package homework5;

public class Main {
    public static void main(String[] args) {
     Triangle first;
        first = new Triangle(3,3,3);
        double perimeter=first.perimeter();
        System.out.println(first.perimeter());


        double square= first.square();
        System.out.println(first.square());

        Product jeans;
        jeans = new Product ("jeans", 2,500.5, "blue,XL", true);
        System.out.println(jeans.getName());
        System.out.println(jeans.getCode());
        System.out.println(jeans.getPrice());
        System.out.println(jeans.getDescription());
        System.out.println(jeans.getAvailability());


       Employee ivanov = new Employee("Ivan","Ivanov","worker",50);
        System.out.println(ivanov.salaryInMonth(2));
        System.out.println(ivanov.salaryInYear());

        Credit credit=new Credit(100000,15, 36);
        System.out.println(credit.getSum());
        System.out.println(credit.getPercent());
    }
    }
