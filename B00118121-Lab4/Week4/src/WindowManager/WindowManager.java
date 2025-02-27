package WindowManager;

// Singleton class for managing windows
public class WindowManager
{
	// This will be the one and only WindowManager.WindowManager instance
	// The one and only WindowManager instance
	private static WindowManager wmanager;
	// Private constructor to prevent instantiation
	private WindowManager(){
		// Private constructor that does nothing
	}
	// Public synchronized method which will return a
	// WindowManager.WindowManager
	// Public synchronized method to get the singleton instance
	public static synchronized WindowManager getManager(){
		// If true then we need to create an instance of
		// WindowManager.WindowManager
		// If no instance exists, create one
		if (wmanager == null)
			wmanager = new WindowManager();
		return wmanager;
	}
	// Test method so we can ensure that our
	// object works
	// Method to print a message
	public void print(String message){
		System.out.println(message);
	}
}

















