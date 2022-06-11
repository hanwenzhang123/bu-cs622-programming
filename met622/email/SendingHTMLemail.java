package edu.bu.met622.email;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.util.Properties;

public class SendingHTMLemail {
	 private void sendMail(String host, int port, String username, String password) {

	        Properties prop = new Properties();
	        prop.put("mail.smtp.auth", true);
	        prop.put("mail.smtp.starttls.enable", "true");
	        prop.put("mail.smtp.host", host);
	        prop.put("mail.smtp.port", port);
	        prop.put("mail.smtp.ssl.trust", host);

	        Session session = Session.getInstance(prop, new Authenticator() {
	            @Override
	            protected PasswordAuthentication getPasswordAuthentication() {
	               return new PasswordAuthentication(username, password);
	            }
	        });

	        try {
	                Message message = new MimeMessage(session);
	                message.setFrom(new InternetAddress("testsender@noemail.com"));
	                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("rezar@bu.edu"));
	                message.setSubject("CS622 subject");
	                String msg = new String("<h1>This is the message in html format</h1> </br> </br> Goodbye");
	                MimeBodyPart mimeBodyPart = new MimeBodyPart();
	                mimeBodyPart.setContent(msg, "text/html");

	              //  MimeBodyPart attachmentBodyPart = new MimeBodyPart();
	              //  attachmentBodyPart.attachFile(new File("pom.xml"));

	                Multipart multipart = new MimeMultipart();
	                multipart.addBodyPart(mimeBodyPart);
//	                multipart.addBodyPart(attachmentBodyPart);

	                message.setContent(multipart);

	                Transport.send(message);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	 
	 public static void main(String ... args) {
		    SendingHTMLemail semail = new SendingHTMLemail();
	        System.out.println("start initiating the connection");
	        semail.sendMail("localhost", 26, "someusername", "somepass");
	        System.out.println("email send process is finished");
	    }
}
