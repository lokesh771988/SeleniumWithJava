package com.Java.demo;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MyAuthenticator extends Authenticator {

	@Override
	protected PasswordAuthentication getPasswordAuthentication()
	{
	return new PasswordAuthentication("frnd.lokesh",
	"gthulasi9");
	}
}
