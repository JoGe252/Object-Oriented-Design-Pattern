package RegistrySingleton;

import java.util.HashMap;

/**
 * The Registry class is a Singleton responsible for managing multiple Singleton instances.
 * It acts as a centralized point for obtaining instances of different Singleton classes.
 */
public class Registry {
    // Holds the single instance of Registry
    private static Registry instance;

    // HashMap to store and retrieve singleton instances dynamically
    private HashMap<String, Object> registry;

    // Private constructor to prevent multiple instances
    private Registry() {
        registry = new HashMap<>(); // Initialize the HashMap to store Singleton instances
    }

    /**
     * Returns the singleton instance of Registry.
     * Ensures that only one Registry object exists.
     */
    public static synchronized Registry getInstance() {
        if (instance == null) {
            instance = new Registry();
        }
        return instance;
    }

    /**
     * Retrieves the singleton instance of a specified class.
     * If it doesn't exist, it creates and stores it.
     *
     * @param className The name of the Singleton class to retrieve.
     * @return The instance of the requested Singleton.
     */
    public Object getSingleton(String className) {
        if (!registry.containsKey(className)) { // Check if the instance is already created
            switch (className) {
                case "LogManager":
                    registry.put(className, LogManager.getInstance());
                    break;
                case "PrintManager":
                    registry.put(className, PrintManager.getInstance());
                    break;
                case "WindowManager":
                    registry.put(className, WindowManager.getInstance());
                    break;
                case "MessageManager":
                    registry.put(className, MessageManager.getInstance());
                    break;
                default:
                    throw new IllegalArgumentException("Unknown Singleton requested: " + className);
            }
        }
        return registry.get(className); // Returns the existing or newly created instance
    }
}
