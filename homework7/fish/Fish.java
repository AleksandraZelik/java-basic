package homework7.fish;

import homework7.Swimming;
import homework7.animal.Animal;

public class Fish extends Animal implements Swimming {

    public Fish(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public void swim() {
        System.out.println(name+" can swim");
    }
}
