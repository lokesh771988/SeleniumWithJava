package com.Java.demo;

public class ReverseString1 {

	public static void main(String[] args) {
		String str = "Hellow welocme to my world";
		//with inbuilt reverse
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println(sb);
		
		//with out inbuilt
		String rev=" ";
		int length = str.length()-1;
		for(int i = length; i >= 0; i--)
			rev+=str.charAt(i);
		System.out.println(rev);
		
		char[] ch = str.toCharArray();
		
		for(int i = ch.length-1; i >= 0; i--) 
			System.out.println(ch[i]);
	}

}
