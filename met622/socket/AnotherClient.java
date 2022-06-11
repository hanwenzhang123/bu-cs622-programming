package edu.bu.met622.socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class AnotherClient {
	public static void main(String args[]) throws Exception {
		Socket s = new Socket("localhost", 9000);
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();
		String str2 = new String();
		while (!str.equals("stop")) {
			str = br.readLine();
			dout.writeUTF(str);
			dout.flush();
			str2 = din.readUTF();
			System.out.println("Server says: " + str);
		}
		dout.close();
		s.close();
	}
}
