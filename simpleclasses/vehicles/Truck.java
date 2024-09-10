package simpleclasses.vehicles;

public class Truck extends Vehicle{
    private int loadCapacity;

    public Truck(String brand, int loadCapacity) {
        super(brand);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void describe() {
        System.out.println("This is a " + super.getBrand() + " truck with a load capacity of " + loadCapacity + " tons.");
    }
}
