package com.Java.demo;

public class BasicProgrames {
	
	public static String evenOrOdd(int x) {		
		if(x%2==0) {
			return "it is even number";
		}else {
			return "it is odd number";
		}
	}

	public static StringBuilder reversStringWithBuiltIn(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		return sb;
	}
	
	//without using any condition how to reverse string
	public static String reversStringWithoutCondition(String str) {
		
		if(str.isEmpty())
			return str;
		return reversStringWithCondition(str.substring(1))+str.charAt(0);
	}
	
	// reverse string using cinditional statements 
	public static String reversStringWithCondition(String str) {
		String rev="";
		for(int i = str.length()-1; i >= 0; i--) {
			rev+=str.charAt(i);
		}
		return rev;
	}
	//how to reverse string word by word
	public static String reverseStringWordByWord(String str) {
		String rev="";
		String[] arr = str.split(" ");
		
		for(int i =0; i < arr.length; i++) {
			String word = arr[i];
			for(int j = word.length()-1; j >= 0; j--) {
				rev+=word.charAt(j);
			}
			rev = rev+" ";
		}
		return rev;
	}
	
	public static String primeNumber(int x) {
		
		if(x%2==0) {
			return "it is prime number";
		}else {
			return "it is not prime number";
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(primeNumber(21));
		
		String str = "Hellow welcome to my world";
		
		//System.out.println(reverseStringWordByWord(str));
		//System.out.println(reversStringWithCondition(str));
		//System.out.println(reversStringWithCondition(str));
		//String str = evenOrOdd(10);
		//System.out.println(str);
		//System.out.println(reversStringWithBuiltIn("Hellow world"));
	}

}
