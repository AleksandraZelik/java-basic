package homework7.cars;

public abstract class Machine {
    protected String name;
    protected String color;
    protected int speed;
    public Machine(String name,String color,int speed){
        this.name=name;
        this.color=color;
        this.speed=speed;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }
}
