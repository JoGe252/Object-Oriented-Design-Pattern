package RegistrySingleton;

/**
 * RegistryTest class verifies that the Registry correctly manages Singleton instances.
 */
public class RegistryTest {
    public static void main(String[] args) {
        // Gets the Registry instance
        Registry registry1 = Registry.getInstance();
        Registry registry2 = Registry.getInstance();

        // Tests the LogManager Singleton
        LogManager log1 = (LogManager) registry1.getSingleton("LogManager");
        LogManager log2 = (LogManager) registry2.getSingleton("LogManager");
        log1.print();
        log2.print();
        System.out.println("LogManager instances are the same: " + (log1 == log2));
        System.out.println();

        // Tests the PrintManager Singleton
        PrintManager print1 = (PrintManager) registry1.getSingleton("PrintManager");
        PrintManager print2 = (PrintManager) registry2.getSingleton("PrintManager");
        print1.print();
        print2.print();
        System.out.println("PrintManager instances are the same: " + (print1 == print2));
        System.out.println();

        // Tests the WindowManager Singleton
        WindowManager win1 = (WindowManager) registry1.getSingleton("WindowManager");
        WindowManager win2 = (WindowManager) registry2.getSingleton("WindowManager");
        win1.print();
        win2.print();
        System.out.println("WindowManager instances are the same: " + (win1 == win2));
        System.out.println();

        // Tests the MessageManager Singleton
        MessageManager msg1 = (MessageManager) registry1.getSingleton("MessageManager");
        MessageManager msg2 = (MessageManager) registry2.getSingleton("MessageManager");
        msg1.print();
        msg2.print();
        System.out.println("MessageManager instances are the same: " + (msg1 == msg2));
        System.out.println();

        // Verifies that both Registry instances are the same
        System.out.println("Registry instances are the same: " + (registry1 == registry2));
    }
}
