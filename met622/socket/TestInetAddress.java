package edu.bu.met622.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
	public static void main(String[] args) {
		try {
			InetAddress inetad = InetAddress.getByName("www.wikipedia.org");
			System.out.println("IP add = " + inetad.getHostAddress() + 
							   " Host name = " + inetad.getHostName());
		} catch (UnknownHostException excep) {
			System.out.println("Unknown IP address or host " + args[0]);
		}
	}
}
