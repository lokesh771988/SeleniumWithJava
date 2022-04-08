package com.Java.demo;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateWords {

	public static void main(String[] args) {
		
		String str = "i,i,i,india,india,love,love,me,me";
		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		map = duplicateWordCount(str);
		map1 = duplicateWordCount1(str);
		System.out.println(map);
		System.out.println(map1);
	}
	
	public static Map<String, Integer> duplicateWordCount(String str) {
		String[] arr = str.split(",");
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String s : arr) {
			Integer value = map.get(s);
			
			if(value == null) {
				value = 0;
			}			
			map.put(s, value+1);			
		}
		return map;
	}
	
	public static Map<Character, Integer> duplicateWordCount1(String str) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		
		for(char s : ch) {
			Integer value = map.get(s);
			
			if(value == null) {
				value = 0;
			}			
			map.put(s, value+1);			
		}
		return map;
	}

}

