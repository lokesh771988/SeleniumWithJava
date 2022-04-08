package com.Java.demo;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import javax.net.ssl.SSLContext;

import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class StringClass {

	public static void sendEmail_and_checkStatus_gen1(String from_address, String from_password, String printerAddress)
			throws IOException, SAXException, ParserConfigurationException {

		String from = null;
		String password = null;
		String smtp = null;
		String port = null;
		String proxyPort = "8080";
		String proxyHost = "web-proxy.austin.hpicorp.net";
		String email_Flag = "PASS";
		if (!email_Flag.equalsIgnoreCase("FAIL")) {
			// pre check get job status API end
			String proxy = "Yes";
			// read_properties.getProxySettings();
			String client = "Gmail";
			// read_properties.getClientDetail();
			String attachmentpath = "C:\\WPPGen1\\ScrumQA_Automation\\Automation\\Gen1RegressionPie\\TestData\\Alignment test_1.pdf";
			// AttachmentPath;
			String Attnum = "1";
			// read_properties.getAttachmentCount();
			from = from_address;
			password = from_password;

			Properties sys_prop;
			sys_prop = System.getProperties();
			File f = new File(attachmentpath);
			File[] list = f.listFiles();

			if (client.equalsIgnoreCase("gmail")) {
				smtp = "smtp.gmail.com";
				port = "465";
			} else if (client.equalsIgnoreCase("yahoo")) {
				smtp = "smtp.mail.yahoo.com";
				port = "465";

			} else if (client.equalsIgnoreCase("hotmail")) {
				smtp = "smtp.live.com";
				port = "587";

			} else if (client.equalsIgnoreCase("aol")) {
				smtp = "smtp.aol.com";
				port = "465";
			} else if (client.equalsIgnoreCase("Outlook")) {
				smtp = "smtp1.hp.com";
				port = "25";

			}

			if (client.equalsIgnoreCase("hotmail")) {

				sys_prop.put("mail.transport.protocol", "SMTP");
				sys_prop.put("mail.smtp.starttls.enable", "true");
				sys_prop.put("mail.smtp.host", smtp);
				sys_prop.put("mail.smtp.auth", "true");
				sys_prop.put("mail.smtp.port", port);

			} else if (client.equalsIgnoreCase("outlook")) {

				sys_prop.setProperty("mail.smtp.host", smtp);
				sys_prop.put("mail.smtp.port", port);

			} else {

				
				// read_properties.getproxyaddress();
				// read_properties.getproxyport();
				sys_prop.put("mail.transport.protocol", "SMTP");
				sys_prop.put("mail.smtp.starttls.enable", "true");
				sys_prop.put("mail.smtp.host", smtp);
				sys_prop.put("mail.smtp.auth", "true");
				sys_prop.put("mail.smtp.port", port);
				sys_prop.put("mail.smtp.debug", "true");
				if (proxy.equalsIgnoreCase("yes")) {
					// read_properties.getProxySettings().equalsIgnoreCase("yes")) {
					sys_prop.put("mail.smtp.socks.host", proxyHost);
					sys_prop.put("mail.smtp.socks.port", proxyPort);
				}
				sys_prop.put("mail.smtp.socketFactory.port", port);
				sys_prop.put("mail.smtp.socketFactory.fallback", "false");
				sys_prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			}

			// Setting the Proxy when executing within HP Network
			if (client.equalsIgnoreCase("outlook")) {

				System.out.println("Demo outlook");

			} else {
				if (proxy.equalsIgnoreCase("yes")) {
					// (read_properties.getProxySettings().equalsIgnoreCase("yes")) {

					// proxyHost = read_properties.getproxyaddress();
					// proxyPort = read_properties.getproxyport();
					System.setProperty("socksProxyVersion", "5");
					sys_prop.put("proxySet", "true");
					sys_prop.put("proxyHost", proxyHost);
					sys_prop.put("proxyPort", proxyPort);
					sys_prop.put("socksProxyHost", proxyHost);
					sys_prop.put("socksProxyPort", proxyPort);
				}

			}

			boolean Status_flag = true;

				Authenticator authenticator = null;
				Session session = Session.getDefaultInstance(sys_prop, authenticator);
				MimeMessage message = new MimeMessage(session);
				try {
					message.setFrom(new InternetAddress(from));
					message.addRecipient(Message.RecipientType.TO, new InternetAddress(printerAddress));
					// timeStamp = new SimpleDateFormat("M/dd @
					// HH:mm:ss").format(Calendar.getInstance().getTime());
					// filename_subject[i] = "Files of Types " + fileExtension + " at " + timeStamp;
					String filename_subject = "Files of Types ";
					message.setSubject(filename_subject);

					Multipart multipart = new MimeMultipart();

					MimeBodyPart messageBodyPart = new MimeBodyPart();
					DataSource source = new FileDataSource((String) attachmentpath);
					messageBodyPart.setDataHandler(new DataHandler(source));
					messageBodyPart.setFileName("Alignment test_1.pdf");
					multipart.addBodyPart(messageBodyPart);
					message.setContent(multipart);

				} catch (MessagingException e1) {
					e1.printStackTrace();
				}
				try {

					if (client.equalsIgnoreCase("Outlook")) {

						Transport transport = session.getTransport("smtp");
						transport.connect(smtp, from);
						transport.sendMessage(message, message.getAllRecipients());
						transport.close();

					} else {

						Transport transport = session.getTransport("smtp");
						transport.connect(smtp, from, password);
						transport.sendMessage(message, message.getAllRecipients());
						transport.close();

					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			if (proxy.equalsIgnoreCase("yes")) {
					//read_properties.getProxySettings().equalsIgnoreCase("yes")) {

				sys_prop.remove("proxySet");
				sys_prop.remove("proxyHost");
				sys_prop.remove("proxyPort");
				sys_prop.remove("socksProxyHost");
				sys_prop.remove("socksProxyPort");

			}
			if (client.equalsIgnoreCase("gmail")) {

				sys_prop.remove("mail.smtp.socketFactory.class");
				sys_prop.remove("mail.smtp.socketFactory.fallback");
				sys_prop.remove("mail.smtp.socketFactory.port");

			} else if (client.equalsIgnoreCase("yahoo")) {

				sys_prop.remove("mail.smtp.socketFactory.class");
				sys_prop.remove("mail.smtp.socketFactory.fallback");
				sys_prop.remove("mail.smtp.socketFactory.port");

			} else if (client.equalsIgnoreCase("aol")) {

				sys_prop.remove("mail.smtp.socketFactory.class");
				sys_prop.remove("mail.smtp.socketFactory.fallback");
				sys_prop.remove("mail.smtp.socketFactory.port");

			}
		}

	}

	public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
		// TODO Auto-generated method stub
		String from_address= "hpt6749@gmail.com";
		String from_password="gthulasi9"; 
		String printerAddress="lokesh.ust@gmail.com";
		
		sendEmail_and_checkStatus_gen1(from_address, from_password, printerAddress);
		/*
		 * char[] ch = { 'j', 'a', 'v', 'a', 'p', 'o', 'i', 'n', 't' }; String s = new
		 * String(ch);
		 * 
		 * String str = "javapoint"; System.out.println(str); System.out.println(s);
		 * 
		 * boolean b = str.equals("javapoint"); System.out.println(b);
		 * 
		 * String st = "Hellow"; st = st.concat(" Java"); System.out.println(st);
		 */
	}

}
