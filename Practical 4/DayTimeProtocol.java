/*
	This file will create a server for DayTimeProtocol
	The client will connect to this server
	The server in response will send Date
	Author : Pranjal Alone
*/

import java.net.*;
import java.util.*;
import java.io.*;

public class DayTimeProtocol {
	public static void main(String args[]) {
		// Creating an instance of the DayTimeServer
		DaytimeServerThread es = new DaytimeServerThread();
      	es.start();
	}
}

class DaytimeServerThread extends Thread {
   	private ServerSocket ss;
   	private final int port = 8000;
  
   	public void run() {
      	try {
         	ss = new ServerSocket(port);
      	} catch(IOException e) {
         	e.printStackTrace();
         	return;
      	}
  
      	try {
         	while (true) {
            	Socket clientSock = ss.accept();
            	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(clientSock.getOutputStream()));
            	bw.write("" + new Date());
            	// flush the Stream
            	bw.flush();
            	clientSock.close();
         	}
      	} catch(IOException e) {
         	e.printStackTrace();
      	}
   }
}