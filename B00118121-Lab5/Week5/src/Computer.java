// Class representing a Computer using the Builder Pattern
public class Computer {
    // Required parameters
    private String RAM; // Amount of RAM in the computer
    private String HDD; // Storage capacity of the computer
    private String CPU; // Processor model

    // Optional parameters
    private boolean isGraphicsCardEnabled; // Flag for graphics card presence
    private boolean isBluetoothEnabled; // Flag for Bluetooth capability

    // Private constructor to initialize values using the Builder
    private Computer(Builder builder) {
        this.RAM = builder.RAM;
        this.HDD = builder.HDD;
        this.CPU = builder.CPU;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    // Method to display computer specifications
    public void displayConfig() {
        System.out.println("RAM: " + RAM + ", HDD: " + HDD + ", CPU: " + CPU +
                ", Graphics Card: " + isGraphicsCardEnabled + ", Bluetooth: " + isBluetoothEnabled);
    }

    // Static Builder class to construct Computer objects
    public static class Builder {
        // Required parameters
        private String RAM;
        private String HDD;
        private String CPU;

        // Optional parameters (default false)
        private boolean isGraphicsCardEnabled = false;
        private boolean isBluetoothEnabled = false;

        // Constructor requiring mandatory fields
        public Builder(String RAM, String HDD, String CPU) {
            this.RAM = RAM;
            this.HDD = HDD;
            this.CPU = CPU;
        }

        // Setter methods for optional parameters
        public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        // Builds and returns a Computer object
        public Computer build() {
            return new Computer(this);
        }
    }
}