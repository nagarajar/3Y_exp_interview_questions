package com.java.coding;

import java.util.Arrays;
import java.util.List;

public class StringLengthGT3 {
	public static void main(String[] args) {
		/*
		 * Count the strings whose length is > 3 in the given list using java8.
		 * Input: ["java", "python", "you", "php", "ab", "super"]
		 * Output: 3
		 */
		
		List<String> list = Arrays.asList("java", "python", "you", "php", "ab", "super");
		
		System.out.println("Input: "+list);
		
		long count = list.stream().filter(e -> e.length() > 3).count();
		
		System.out.println("Output: "+count);
	}

}
