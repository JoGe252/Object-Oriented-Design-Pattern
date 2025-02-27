package vehicles;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String colour, String type, double engineSize, double netPrice, int numberOfDoors) {
        super(colour, type, engineSize, netPrice);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateVRT() {
        return getNetPrice() * 0.21; // VRT for cars
    }

    // Getter
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}