package homework7.cars;

import homework7.Moving;

public class RoadMachine extends Machine implements Moving {
    public RoadMachine(String name, String color, int speed) {
        super(name, color, speed);
    }

    @Override
    public void move() {
        System.out.println(name+ " can move");
    }
}
