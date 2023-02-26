package homework5;

public class Product {
    private String name;
    private int code;
    private double price;
    private String description;
    private boolean availability;

    public Product(String name, int code,double price,String description,boolean availability) {
        this.name=name;
        this.code=code;
        this.price=price;
        this.description=description;
        this.availability=availability;
    }
    public Product(String name, int code,double price,boolean availability) {
        this.name=name;
        this.code=code;
        this.price=price;
        this.availability=availability;
    }

    public Product(String name, int code,boolean availability) {
        this.name=name;
        this.code=code;
        this.availability=availability;
    }

    public String getName() {
        return name;
    }
    public int getCode() {
        return code;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public boolean getAvailability() {
        return availability;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
