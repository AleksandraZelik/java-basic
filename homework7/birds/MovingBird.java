package homework7.birds;

import homework7.Moving;

public class MovingBird extends Bird implements Moving {
    public MovingBird(String name, double weight, int age) {
        super(name, weight, age);
    }
    @Override
    public void move() {
        System.out.println(name+ " can move");
    }
}
