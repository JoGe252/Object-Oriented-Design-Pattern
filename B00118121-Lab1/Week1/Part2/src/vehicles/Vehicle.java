package vehicles;

public class Vehicle {
    private String colour;
    private String type;
    private double engineSize;
    private double netPrice;

    public Vehicle(String colour, String type, double engineSize, double netPrice) {
        this.colour = colour;
        this.type = type;
        this.engineSize = engineSize;
        this.netPrice = netPrice;
    }

    public double calculateVRT() {
        return netPrice * 0.21; // Default VRT for vehicles
    }

    // Getters
    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public double getNetPrice() {
        return netPrice;
    }
}