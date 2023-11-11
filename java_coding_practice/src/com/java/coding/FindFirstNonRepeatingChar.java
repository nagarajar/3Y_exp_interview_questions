package com.java.coding;

import java.util.Scanner;

public class FindFirstNonRepeatingChar {
	public static void main(String[] args) {
		/*
		 * Find the first non repeating character in the given string
		 * Input: stress
		 * Output: t
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String input = sc.next();
		Character output = getFirstNonRepeatingChar(input);
		System.out.print("output: "+ output);
	}

	private static Character getFirstNonRepeatingChar(String input) {
		Character c = null;
		for(int i = 0; i < input.length(); i++) {
			int count = 0;
			for(int j=i+1; j < input.length(); j++) {
				if(input.charAt(i)==input.charAt(j)) {
					count++;
				}
			}
			if(count == 0) {
				c = input.charAt(i);
				break;
			}
		}
		return c;
	}

}
