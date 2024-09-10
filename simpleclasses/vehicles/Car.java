package simpleclasses.vehicles;

public class Car extends Vehicle{
    private int numSeats;

    public Car(String brand, int numSeats) {
        super(brand);
        this.numSeats = numSeats;
    }

    @Override
    public void describe() {
        System.out.println("This is a " + super.getBrand() + " car with " + numSeats + " seats.");
    }
}
