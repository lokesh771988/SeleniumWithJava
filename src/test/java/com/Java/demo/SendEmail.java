package com.Java.demo;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

	public static void main(String[] args) {
		try {
			InternetAddress fromAddress = new InternetAddress("frnd.lokesh@gmail.com");
			InternetAddress toAddress = new InternetAddress("lokesh.ust@gmail.com");

			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "465");
			props.put("mail.smtp.socketFactory.port", "465");
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

			MyAuthenticator auth = new MyAuthenticator();
			//next object is java.mail.Session instance not HttpSession
			Session session = Session.getInstance(props, auth);

			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(fromAddress);
			msg.setRecipient(Message.RecipientType.TO, toAddress);
			msg.setSubject("type mail subject here");
			//second parameter below is encoding type
			msg.setContent("type mail body here.", "text/html");
			
			Transport transport = session.getTransport("smtp");
			transport.connect("smtp.gmail.com","frnd.lokesh@gmail.com","gthulasi9");
			//transport.connect(d_host, Integer.valueOf(d_port), d_uname, d_password);
			transport.sendMessage(msg, msg.getAllRecipients());
			transport.close();
			
			}
			catch(Exception e){
			System.out.println(e.getMessage());
			}

	}

}
