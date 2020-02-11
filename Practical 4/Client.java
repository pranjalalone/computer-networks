/*
	This file will create a Client which will then connect to the Day Time Server
	Author : Pranjal Alone
*/


import java.io.*;
import java.net.*;

public class Client {
	public static void main(String args[]) {
		try {
			Socket s = new Socket("localhost", 8000);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
			dout.writeUTF("Hello Server");  
			dout.flush();  
			dout.close();  
			s.close();  
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

