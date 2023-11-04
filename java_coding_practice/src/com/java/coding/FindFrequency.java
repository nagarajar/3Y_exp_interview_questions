package com.java.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

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
		
		Map<Character, Long> result02 = approach02(input);
		System.out.println("Output: "+result02);
		
		Map<Character, Long> result03 = approach03(input);
		System.out.println("Output: "+result03);

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
	
	private static Map<Character, Long> approach02(String input) {
		List<Character> charList = new ArrayList<>();
		for (char c : input.toCharArray()) {
		    charList.add(c);
		}
		return charList.stream().collect(Collectors.groupingBy(Character::charValue, Collectors.counting()));
	}
	
	private static Map<Character, Long> approach03(String input) {
		return input.chars().mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Character::charValue, Collectors.counting()));
	}

}
