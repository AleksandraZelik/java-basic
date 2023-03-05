package homework7;

import homework7.animal.Mammal;
import homework7.birds.FlyingBird;
import homework7.birds.MovingBird;
import homework7.birds.SwimmingBird;
import homework7.cars.FlyingMachine;
import homework7.cars.RoadMachine;
import homework7.cars.SwimmingMachine;
import homework7.fish.Fish;

public class Main {
    public static void main(String[] args){
        FlyingBird eagle = new FlyingBird("Eagle",3.5,20);
        eagle.fly();
        System.out.println("name "+eagle.getName());
        FlyingBird pigeon = new FlyingBird("Pigeon",0.3,2);
        pigeon.fly();
        System.out.println("age "+pigeon.getAge());
        FlyingBird stork = new FlyingBird("Stork",3.4,15);
        stork.fly();
        System.out.println("weight "+stork.getWeight());
        SwimmingBird duck = new SwimmingBird("Duck",2.0,3);
        duck.swim();
        System.out.println("weight "+duck.getWeight());
        SwimmingBird penguin = new SwimmingBird("Penguin",10.0,5);
        penguin.swim();
        System.out.println("weight "+penguin.getWeight());
        MovingBird ostrich = new MovingBird("Ostrich",20.0,1);
        ostrich.move();
        System.out.println("age "+ostrich.getAge());
        MovingBird kiwi = new MovingBird("Kiwi",1.0,4);
        kiwi.move();
        System.out.println("age "+kiwi.getAge());
        Mammal cat = new Mammal("Cat",5.0,5);
        cat.move();
        System.out.println("name "+cat.getName());
        Mammal dog = new Mammal("Dog",10.0,8);
        dog.move();
        System.out.println("name "+dog.getName());
        Mammal hamster = new Mammal("Hamster",0.2,1);
        hamster.move();
        System.out.println("name "+hamster.getName());
        Fish crucian = new Fish("Crucian",0.3,1);
        crucian.swim();
        System.out.println("age "+crucian.getAge());
        Fish pike = new Fish("Pike",0.7,2);
        pike.swim();
        System.out.println("weight "+pike.getWeight());
        Fish som = new Fish("Som",1.7,3);
        som.swim();
        System.out.println("weight "+som.getWeight());
        FlyingMachine hotAirBalloon = new FlyingMachine("hotAirBalloon","white",125);
        hotAirBalloon.fly();
        System.out.println("color "+hotAirBalloon.getColor());
        FlyingMachine plane = new FlyingMachine("Plane","white",350);
        plane.fly();
        System.out.println("color "+plane.getColor());
        FlyingMachine helicopter = new FlyingMachine("Helicopter","blue",330);
        helicopter.fly();
        System.out.println("speed "+helicopter.getSpeed());
        RoadMachine tractor = new RoadMachine("Tractor","blue",10);
        tractor.move();
        System.out.println("speed "+tractor.getSpeed());
        RoadMachine car = new RoadMachine("Car","red",130);
        car.move();
        System.out.println("color "+car.getColor());
        RoadMachine bus = new RoadMachine("Bus","yellow",100);
        bus.move();
        System.out.println("color "+bus.getColor());
        SwimmingMachine cutter=new SwimmingMachine("Cutter","white",60);
        cutter.swim();
        System.out.println("speed "+cutter.getSpeed());
        SwimmingMachine barge=new SwimmingMachine("Barge","black",18);
        barge.swim();
        System.out.println("speed "+barge.getSpeed());
        SwimmingMachine boat=new SwimmingMachine("Boat","red",25);
        boat.swim();
        System.out.println("speed "+boat.getSpeed());


    }

}
