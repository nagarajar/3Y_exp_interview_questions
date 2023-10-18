package com.java.coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindFrequency {
	public static void main(String[] args) {
		/*
		 * Find the frequency of the characters of given string
		 * Input: nagaraja
		 * Output: n-1, a-4,g-1,r-1,j-1
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String input = sc.next();
		Map<Character, Integer> result01 = approach01(input);
		System.out.println("Output: "+result01);
	}

	private static Map<Character, Integer> approach01(String input) {
		Map<Character, Integer> map = new HashMap<>();
		char ch;
		for(int i=0; i<input.length(); i++) {
			ch = input.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		return map;
	}
}
