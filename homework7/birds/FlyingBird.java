package homework7.birds;

import homework7.Flying;

public class FlyingBird extends Bird implements Flying {
    public FlyingBird(String name, double weight, int age) {
        super(name, weight, age);
    }
    @Override
    public void fly() {
        System.out.println(name+" can fly");
    }
}
