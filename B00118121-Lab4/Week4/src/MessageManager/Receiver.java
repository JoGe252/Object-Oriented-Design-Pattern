package MessageManager;

import java.io.*;
import java.net.*;

// Class to receive messages via UDP
class Receiver
{
	private DatagramSocket dsock; // Datagram socket for receiving data
	private int port; // Port number for receiving messages

	// Constructor to initialize the receiver on a given port
	Receiver(int port)
	{
		this.port = port;
		try
		{
			dsock = new DatagramSocket(port);
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
		}
	}

	// Method to wait and receive packets
	private String waitForPackets()
	{
		try
		{
			byte[] recvBuf = new byte[5000]; // Buffer for incoming data
			DatagramPacket packet = new DatagramPacket(recvBuf,recvBuf.length);
			dsock.receive(packet); // Receive packet
			int byteCount = packet.getLength(); // Get actual message length

			return new String(recvBuf, 0, byteCount); // Convert bytes to string
		}
		catch (IOException e)
		{
			System.err.println("Exception:  " + e);
			return null;
		}
	}

	// Method to continuously receive and display messages
	public void startReceiving()
	{
		String message = "";

		System.out.println("Waiting for packets on port " + port + " ...........");
		while(!message.equals("STOP"))
		{
			message = waitForPackets();

			System.out.println("Received: " + message);
		}
	}

	// Main method to start the receiver on port 5001
	public static void main(String[] args)
	{
		Receiver recv = new Receiver(5001);


		recv.startReceiving();
	}

}
