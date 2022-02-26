package web.model;

public class Car {
    private String brand;
    private String name;
    private int speed;

    public Car(String brand, String name, int speed) {
        this.brand = brand;
        this.name = name;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
