package MessageManager;

// Class to test the MessageManager functionality
public class MessageManagerTest{
	public static void main(String[] args){
		// Get the singleton instance of MessageManager
		MessageManager m = MessageManager.getManager();

		// Send 10 "Hello" messages to localhost on port 5001
		for(int i = 0; i < 10; i++){
			m.send("localhost", 5001, "Hello");
		}
		// Send a "STOP" message to indicate termination
		m.send("localhost", 5001, "STOP");
	}
}



