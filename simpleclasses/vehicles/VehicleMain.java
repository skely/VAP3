package simpleclasses.vehicles;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("Toyota", 5);
        vehicles[1] = new Truck("Volvo", 1000);
        vehicles[2] = new Car("Honda", 4);

        for (Vehicle vehicle : vehicles) {
            vehicle.describe();
        }
    }
}
