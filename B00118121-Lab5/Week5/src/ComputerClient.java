// Client class to test the Computer Builder and Director
public class ComputerClient {
    public static void main(String[] args) {
        // Creating a Computer using the Builder Pattern
        Computer customComputer = new Computer.Builder("16GB", "1TB", "Intel i9")
                .setGraphicsCardEnabled(true) // Enabling Graphics Card
                .setBluetoothEnabled(true) // Enabling Bluetooth
                .build();

        // Displaying custom computer details
        System.out.println("Custom Computer Configuration:");
        customComputer.displayConfig();

        // Creating a Computer using the Director class
        Computer basicComputer = ComputerBuilderDirector.getBasicComputer();
        Computer gfxComputer = ComputerBuilderDirector.getGraphicsCardEnabledComputer();

        // Displaying pre-configured computer details
        System.out.println("\nBasic Computer Configuration:");
        basicComputer.displayConfig();

        System.out.println("\nGraphics Enabled Computer Configuration:");
        gfxComputer.displayConfig();
    }
}
