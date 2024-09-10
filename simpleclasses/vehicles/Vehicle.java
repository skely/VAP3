package simpleclasses.vehicles;

public abstract class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
    public abstract void describe();

}
