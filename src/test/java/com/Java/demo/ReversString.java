package com.Java.demo;

import java.util.ArrayList;

public class ReversString {

	public static void main(String[] args) {
		String str = "Hollow my world";
		String reversed = reverseString(str);  
		System.out.println("The reversed string is: " + reversed); 
		System.out.println("For loop :: "+reverseStringUsingForLoop(str));
		System.out.println("MY loop :: "+myLoop(str));
		System.out.println("MY loop :: "+myLoop1(str));
	}
	
	public static String myLoop(String str) {
		String r = "";
		String[] arr = str.split(" ");
		
		for(int i = arr.length; i > 0; --i) {
			r+=arr[i-1]+" ";
		}
		return r;
	}
	
	public static String myLoop1(String str) {
		String r = "";
		String[] arr = str.split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			String myWord = arr[i];
			for(int j = myWord.length()-1; j >=0; j--) {
				r += myWord.charAt(j);
			}
			r = r + " ";
		}
		return r;
	}
	//Reverse string without using loop
	public static String reverseString(String s)  
	{  
	if (s.isEmpty())                            //checks the string if empty  
	return s;  
	return reverseString(s.substring(1)) + s.charAt(0);                     //recursively called function  
	}  
	
	//Reverse string using for loop
	
	public static String reverseStringUsingForLoop(String s) {
		String r = "";
		for(int i = s.length(); i > 0; --i) {
			r +=s.charAt(i-1);
		}
		return r;
	}

}
