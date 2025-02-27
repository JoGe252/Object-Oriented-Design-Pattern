package RegistrySingleton;

/**
 * WindowManager is a Singleton class that manages GUI window-related operations.
 * Uses a private constructor and a static method to ensure only one instance exists.
 */
public class WindowManager {
    // Holds the single instance of WindowManager
    private static WindowManager instance;

    // Private constructor to prevent direct instantiation
    private WindowManager() {}

    /**
     * Returns the singleton instance of WindowManager.
     * Uses synchronized to ensure that multiple threads do not create multiple instances.
     */
    public static synchronized WindowManager getInstance() {
        if (instance == null) {
            instance = new WindowManager();
        }
        return instance;
    }

    /**
     * Prints the method to display the instance reference.
     * Helps in confirming that the instance remains the same.
     */
    public void print() {
        System.out.println("WindowManager instance: WindowManager@" + Integer.toHexString(System.identityHashCode(this)));
    }
}

