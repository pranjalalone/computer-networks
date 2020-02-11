/* 
	Client Side
	Will try to connect to server
	Author : Pranjal
*/

import java.io.*;
import java.net.*;

public class Client {
	public static void main(String args[]) {
		// Create a Socket Connection
		/*
			IP : 127.0.0.1 (localhost)
			(TCP)PORT : 5000
		*/
		Socket socket = new Socket("127.0.0.1", 5000);
	}
} 