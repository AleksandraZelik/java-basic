package homework7.birds;

import homework7.Swimming;

public class SwimmingBird extends Bird implements Swimming {
    public SwimmingBird(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public void swim() {
        System.out.println(name+" can swim");
    }
}
