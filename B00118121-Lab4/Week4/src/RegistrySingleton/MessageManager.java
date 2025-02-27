package RegistrySingleton;

/**
 * MessageManager is a Singleton class that manages messaging operations.
 * Ensures that only one instance is created.
 */
public class MessageManager {
    // Holds the single instance of MessageManager
    private static MessageManager instance;

    // Private constructor to prevent direct instantiation
    private MessageManager() {}

    /**
     * Returns the singleton instance of MessageManager.
     * Ensures only one instance is created even in multithreaded environments.
     */
    public static synchronized MessageManager getInstance() {
        if (instance == null) {
            instance = new MessageManager();
        }
        return instance;
    }

    /**
     * Prints the method to display the instance reference.
     * Used to verify that the instance remains the same.
     */
    public void print() {
        System.out.println("MessageManager instance: MessageManager@" + Integer.toHexString(System.identityHashCode(this)));
    }
}
