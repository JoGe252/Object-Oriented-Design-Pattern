package WindowManager;

// Test class for WindowManager2 Singleton implementation
class WindowManagerTest2{
	public static void main(String[] args){
		WindowManager2 wm1, wm2;
		System.out.println("Opening WindowManager.WindowManager");
		// Tries to create WindowManager.WindowManager for the first time
		// Try to create WindowManager for the first time
		try{
			wm1 = new WindowManager2();
		}
		catch(SingletonException e){
			System.out.println(e.getMessage());
		}
		// Tries to create WindowManager.WindowManager for the second time
		// Try to create WindowManager for the second time (should throw exception)
		try{
			wm2 = new WindowManager2();
		}
		catch(SingletonException e){
			System.out.println(e.getMessage());
		}
	}
}



