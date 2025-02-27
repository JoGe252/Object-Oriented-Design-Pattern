package RegistrySingleton;

/**
 * LogManager is a Singleton class responsible for handling logging operations.
 * It ensures that only one instance of LogManager exists throughout the application.
 */
public class LogManager {
    // Static variable to hold the single instance of LogManager
    private static LogManager instance;

    // Private constructor to prevent direct instantiation
    private LogManager() {}

    /**
     * Returns the singleton instance of LogManager.
     * Uses synchronized to ensure thread safety when multiple threads access it.
     */
    public static synchronized LogManager getInstance() {
        if (instance == null) {
            instance = new LogManager(); // Create the instance only if it doesn't exist
        }
        return instance;
    }

    /**
     * Prints method to display the instance reference.
     * This helps confirm that only one instance exists.
     */
    public void print() {
        System.out.println("LogManager instance: LogManager@" + Integer.toHexString(System.identityHashCode(this)));
    }
}

