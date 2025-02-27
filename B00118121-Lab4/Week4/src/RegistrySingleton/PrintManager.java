package RegistrySingleton;

/**
 * PrintManager is a Singleton class that manages printing tasks.
 * Ensures that only one instance of PrintManager exists.
 */
public class PrintManager {
    // Holds the single instance of PrintManager
    private static PrintManager instance;

    // Private constructor to prevent multiple instances
    private PrintManager() {}

    /**
     * Returns the singleton instance of PrintManager.
     * Uses synchronized to make it thread-safe.
     */
    public static synchronized PrintManager getInstance() {
        if (instance == null) {
            instance = new PrintManager();
        }
        return instance;
    }

    /**
     * Prints the method to display the instance reference.
     * Used to verify that only one instance exists.
     */
    public void print() {
        System.out.println("PrintManager instance: PrintManager@" + Integer.toHexString(System.identityHashCode(this)));
    }
}

