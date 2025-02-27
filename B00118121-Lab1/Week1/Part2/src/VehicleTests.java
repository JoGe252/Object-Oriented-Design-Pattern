import vehicles.Vehicle;
import vehicles.Car;
import vehicles.Motorbike;

public class VehicleTests {
    public static void main(String[] args) {
        // Create a Vehicle object
        Vehicle vehicle = new Vehicle("Black", "Truck", 3.0, 30000);
        System.out.println("Vehicle VRT: " + vehicle.calculateVRT());

        // Create a Car object
        Car car = new Car("Dark Grey", "Sedan", 1.6, 20000, 5);
        System.out.println("Car VRT: " + car.calculateVRT());

        // Create a Motorbike object
        Motorbike motorbike = new Motorbike("Blue", "Sport", 0.6, 15000, 0, true);
        System.out.println("Motorbike VRT: " + motorbike.calculateVRT());
    }
}