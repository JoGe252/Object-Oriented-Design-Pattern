package WindowManager;

// Alternative Singleton approach using a flag
class WindowManager2{
	// Will be set to true if one exists
	// Boolean flag to track if an instance exists
	private static boolean instance_flag = false;

	// Constructor that throws exception if an instance already exists
	public WindowManager2() throws SingletonException {
		if (instance_flag)
			throw new SingletonException("Only one WindowManager.WindowManager allowed.");
		else
			instance_flag = true;
	}
	// Test method so we can ensure that our
	// object works
	// Method to print a message
	public void print(String message){
		System.out.println(message);
	}
}





