import java.io.*;
import java.net.*;

public class Server {
	public static void main(String args[]) {
		try {
			// Create a Sever Socket
			// port - 8000
			ServerSocket svrSckt = new ServerSocket(8000);
			Socket sckt = svrSckt.accept();
			System.out.println("Client Connected!!");
			// Get the message and display on screen
			DataInputStream dataipstream = new DataInputStream(sckt.getInputStream());
			String message = (String)dataipstream.readUTF();
			System.out.println("Message from Client : " + message);
			svrSckt.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}