package edu.bu.met622.message;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;

/**
 * Helloworld Sender code
 * @author rawassizadeh
 *
 */
public class Sender {
	private final static String QUEUE_NAME = "hello";
	  public static void main(String[] argv) throws Exception {
	      System.out.println(" [edu.nu.met622.Sender] ----- Hello from Sender----");
	      
	      // establishing a connection to the server
	      ConnectionFactory factory = new ConnectionFactory();
	      factory.setHost("localhost");
	      try (Connection connection = factory.newConnection();
	           // open the channel 
	    	   Channel channel = connection.createChannel()) {
	    	   // sending the message to the queue
	    	   channel.queueDeclare(QUEUE_NAME, false, false, false, null);
	           String message = "Hello World!";
	           channel.basicPublish("", QUEUE_NAME, null, message.getBytes("UTF-8"));
	           System.out.println(" [edu.nu.met622.Sender] Sent '" + message + "'");
	       } catch (Exception ex) {
	    	   ex.printStackTrace();
	       }
	   }
}

