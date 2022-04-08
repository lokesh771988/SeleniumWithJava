package com.Java.demo;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendMail1 {

	public static void sendMail() {
		try {

			String from = "hpt6749@gmail.com";
			String password = "gthulasi9";
			String proxyPort = "8080";
			String proxyHost = "web-proxy.austin.hpicorp.net";
			//System.setProperty("socksProxyVersion", "5");
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "465");
			props.put("mail.smtp.socketFactory.port", "465"); //587 , 465
			props.put("mail.smtp.starttls.enable", "true");

			props.put("mail.smtp.socks.host", proxyHost);
			props.put("mail.smtp.socks.port", proxyPort);
			
			props.put("mail.smtp.socketFactory.port", "587");
			props.put("mail.smtp.socketFactory.fallback", "false");
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			
			props.put("proxySet", "true");
			props.put("proxyHost", proxyHost);
			props.put("proxyPort", proxyPort);
			props.put("socksProxyHost", proxyHost);
			props.put("socksProxyPort", proxyPort);
			Session s = Session.getInstance(props, null);
			s.setDebug(true);

			MimeMessage msg = new MimeMessage(s);

			String fromEmail = "hpt6749@gmail.com";

			String addressTo = "lokesh.ust@gmail.com";
			InternetAddress to = new InternetAddress(addressTo);

			InternetAddress fromAddr = new InternetAddress(fromEmail);

			msg.setSentDate(new java.util.Date());
			msg.setFrom(fromAddr);
			msg.addRecipient(Message.RecipientType.TO, to);

			msg.setSubject("hi");
			msg.setContent("hello", "text/plain");
			// TODO: try it for text/html.

			Transport tr = s.getTransport("smtp");
			String smtp_server = props.getProperty("mail.smtp.host");

			tr.connect(smtp_server, from, password);
			msg.saveChanges();
			tr.sendMessage(msg, msg.getAllRecipients());
			tr.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static void sendMail1() {
		// Create object of Property file
		Properties props = new Properties();

		// this will set host of server- you can change based on your requirement
		props.put("mail.smtp.host", "smtp.gmail.com");

		// set the port of socket factory
		props.put("mail.smtp.socketFactory.port", "465");

		// set socket factory
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

		// set the authentication to true
		props.put("mail.smtp.auth", "true");

		// set the port of SMTP server
		props.put("mail.smtp.port", "465");

		// This will handle the complete authentication
		Session session = Session.getDefaultInstance(props,

				new javax.mail.Authenticator() {

					protected PasswordAuthentication getPasswordAuthentication() {

						return new PasswordAuthentication("hpt6749@gmail.com", "gthulasi9");

					}

				});

		try {

			// Create object of MimeMessage class
			Message message = new MimeMessage(session);

			// Set the from address
			message.setFrom(new InternetAddress("hpt6749@gmail.com"));

			// Set the recipient address
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("lokesh.ust@gmail.com"));

			// Add the subject link
			message.setSubject("Testing Subject");

			// Create object to add multimedia type content
			BodyPart messageBodyPart1 = new MimeBodyPart();

			// Set the body of email
			messageBodyPart1.setText("This is message body");

			// Create another object to add another content
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();

			// Mention the file which you want to send
			String filename = "C:\\Users\\GorantlL\\OneDrive - HP Inc\\Documents\\Project Information\\HP_Holiday_2022.docx";

			// Create data source and pass the filename
			DataSource source = new FileDataSource(filename);

			// set the handler
			messageBodyPart2.setDataHandler(new DataHandler(source));

			// set the file
			messageBodyPart2.setFileName(filename);

			// Create object of MimeMultipart class
			Multipart multipart = new MimeMultipart();

			// add body part 1
			multipart.addBodyPart(messageBodyPart2);

			// add body part 2
			multipart.addBodyPart(messageBodyPart1);

			// set the content
			message.setContent(multipart);

			// finally send the email
			Transport transport = session.getTransport("smtp");
			transport.connect("smtp.gmail.com","hpt6749@gmail.com" , "gthulasi9");
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
			//Transport.send(message);

			System.out.println("=====Email Sent=====");

		} catch (MessagingException e) {

			throw new RuntimeException(e);

		}
	}

	public static void main(String[] args) {
		sendMail();
		//sendMail1();
	}

}
