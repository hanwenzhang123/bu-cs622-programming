package edu.bu.met622.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
/**
 * This codes belongs to server and it is not a client 
 */
public class ProcessingSingleClient implements Runnable
{
	private Socket socket;
	public ProcessingSingleClient(Socket s) {
		socket = s; 
	}
	public void run()
	{
		try {
			System.out.println("Thread Id = " + Thread.currentThread().getId() + " start");
			DataInputStream inputfromclient = new DataInputStream(socket.getInputStream());
			DataOutputStream outputtoclient = new DataOutputStream(socket.getOutputStream());
//			int j = inputfromclient.readInt();
//			System.out.printf("from Server: client sent %d%n", j);
//			outputtoclient.writeInt(j * j);
//			System.out.printf("Client send back %d%n", j * j);
			System.out.println("Thread Id = " + Thread.currentThread().getId() + " end");
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
