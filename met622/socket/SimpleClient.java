package edu.bu.met622.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SimpleClient {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 9000);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("--> Hello 4m Client");
			dout.close();
			dout.flush();
			s.close();
		} catch (IOException ex) {
			System.out.println("[Client] Error:" + ex.getMessage());
			ex.printStackTrace();
		}

	}
}
