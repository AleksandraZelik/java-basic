package homework7.cars;

import homework7.Swimming;

public class SwimmingMachine extends Machine implements Swimming {
    public SwimmingMachine(String name, String color, int speed) {
        super(name, color, speed);
    }

    @Override
    public void swim() {
        System.out.println(name+" can swim");
    }
}
