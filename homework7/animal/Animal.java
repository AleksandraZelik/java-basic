package homework7.animal;

public abstract class Animal {
    protected String name;
    protected double weight;
    protected int age;
    public Animal(String name,double weight,int age){
        this.name=name;
        this.weight=weight;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }
}