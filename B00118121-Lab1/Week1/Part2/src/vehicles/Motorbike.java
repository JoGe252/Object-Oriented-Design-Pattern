package vehicles;

public class Motorbike extends Car {
    private boolean carrier;

    public Motorbike(String colour, String type, double engineSize, double netPrice, int numberOfDoors, boolean carrier) {
        super(colour, type, engineSize, netPrice, numberOfDoors);
        this.carrier = carrier;
    }

    @Override
    public double calculateVRT() {
        return getNetPrice() * 0.13; // VRT for motorbikes
    }

    // Getter
    public boolean hasCarrier() {
        return carrier;
    }
}