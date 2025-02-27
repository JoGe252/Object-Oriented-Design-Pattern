// Director class that helps in constructing specific types of Computer objects
public class ComputerBuilderDirector {

    // Method to build and return a basic computer with default specifications
    public static Computer getBasicComputer() {
        return new Computer.Builder("2GB", "2TB", "Intel i7")
                .setBluetoothEnabled(true) // Optional feature enabled
                .build(); // Builds and returns the Computer object
    }

    // Method to build and return a computer with a graphics card enabled
    public static Computer getGraphicsCardEnabledComputer() {
        return new Computer.Builder("2GB", "2TB", "Intel i7")
                .setGraphicsCardEnabled(true) // Optional feature enabled
                .build(); // Builds and returns the Computer object
    }
}