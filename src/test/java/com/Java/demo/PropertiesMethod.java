package com.Java.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesMethod {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		String path = System.getProperty("user.dir")+"\\config.properties";
		System.out.println(path);
		Properties appProps = new Properties();
		appProps.load(new FileInputStream(path));
		
		System.out.println(appProps.getProperty("broswer"));
	}
}
