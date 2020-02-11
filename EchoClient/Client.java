import java.io.*;
import java.net.*;

public class Client {
	public static void main(String args[]) {
		try {
			Socket sckt = new Socket("127.0.0.1", 8000);
			System.out.println("Client : Connected to Server!!");

			// Close the Socket

			// Send message from the Client
			String message = args[0];
			// System.out.println(message);
			DataOutputStream dataopstream = new DataOutputStream(sckt.getOutputStream());
			dataopstream.writeUTF(message);
			dataopstream.flush();
			dataopstream.close();
			sckt.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}