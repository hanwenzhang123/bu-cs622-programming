package edu.bu.met622.socket;

import java.io.*;
import java.net.*;
import java.util.*;

public class MultiThreadServer {
	public static void main(String[] args)
	{
		try {
			ServerSocket serversocket = new ServerSocket(9000);
			System.out.println("Server says: Server started ... waiting ...");
			while (true)
			{
				Socket socket = serversocket.accept();
				InetAddress inetad = socket.getInetAddress();
				System.out.println("Client IP address: " + inetad.getHostAddress() +
						" host name: " + inetad.getHostName());
				new Thread(new ProcessingSingleClient(socket)).start();
			}
		} catch (IOException excep) {
			excep.printStackTrace();
		}
	}
}
