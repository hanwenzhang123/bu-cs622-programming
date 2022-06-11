package edu.bu.met622.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static void main(String[] args) {
		try {
			ServerSocket serversocket = new ServerSocket(9000);
			System.out.println("[Server] Server started ... waiting ...");
			Socket socket = serversocket.accept();
			DataInputStream dis = new DataInputStream(socket.getInputStream());  
			String str = (String)dis.readUTF();  
			System.out.println("[Server] the message that the server recieved is: "+str);  
			socket.close();  
		} catch(IOException ex) {
			ex.printStackTrace();
			System.out.println("[Server] ERROR:"+ex.getMessage());
		}
	}
}
