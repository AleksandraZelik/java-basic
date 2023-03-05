package homework7.cars;

import homework7.Flying;
import homework7.cars.Machine;

public class FlyingMachine extends Machine implements Flying {
    public FlyingMachine(String name, String color, int speed) {
        super(name, color, speed);
    }

    @Override
    public void fly() {
        System.out.println(name+ " can fly");
    }
}
