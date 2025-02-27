package MessageManager;

import java.io.*;
import java.net.*;

// Class responsible for managing message sending via UDP
public class MessageManager{
	// This will be the one and only RegistrySingleton.MessageManager.RegistrySingleton.MessageManager instance
	// This will be the one and only MessageManager instance (Singleton pattern)
	private static MessageManager manager;
	// DatagramSocket used for sending messages
	private static DatagramSocket dsock;

	// Private constructor to prevent direct instantiation
	private MessageManager(){
		try{
			dsock = new DatagramSocket(); // Initializes the socket
		}
		catch(IOException e){
			System.out.println(e.toString());
		}
	}

	// Public synchronized method which returns a
	// RegistrySingleton.MessageManager.RegistrySingleton.MessageManager
	// Public synchronized method to obtain the singleton instance of MessageManager
	public static synchronized MessageManager getManager(){
		// If true then we need to create an instance of
		// WindowManager.WindowManager
		if (manager == null)
			manager = new MessageManager();

		return manager;
	}

// Method to send a message to a specified hostname and port using UDP
	public void send(String hostname, int port, String message)
	{
		try
		{
			InetAddress address = InetAddress.getByName(hostname); // Resolve hostname to IP

			byte[] sendBuf = message.getBytes();// Convert message to bytes

			// Create UDP packet with the message
			DatagramPacket packet =
			new DatagramPacket(sendBuf, sendBuf.length, address, port);

			// Send the packet
			dsock.send(packet);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
	// Add a dummy print method for testing
	public void print(String message) {
		System.out.println("RegistrySingleton.MessageManager instance: " + this + " - " + message);
	}
}










