package com.java.coding.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Java8SteamPracticeOnStringArray {
	public static void main(String[] args) {
		/*
		 * 1. Find and print the count of strings that have length greater than 5.
		 */
		List<String> fruites = Arrays.asList("apple","banana","watermelon","kiwi","grape","orange");
		List<String> lengthGT5 = fruites.stream().filter(f -> f.length() > 5).toList();
		System.out.println("lengthGT5 :: "+lengthGT5);
		
		/*
		 * 2. Concatenate all the strings in a list into a single string.
		 */
		String combinedFruitesName = fruites.stream().collect(Collectors.joining());
		System.out.println("combinedFruitesName :: "+combinedFruitesName);
		
		/*
		 * 3. Convert each string to upper case and then sort them in alphabetical order.
		 */
		List<String> fruitesInUpperCase = fruites.stream().map(String::toUpperCase).sorted().toList();
		System.out.println("fruitesInUpperCase :: "+fruitesInUpperCase);
		
		/*
		 * 4. Find the longest string in a list using streams.
		 */
		int maxLengthString = fruites.stream().mapToInt(String::length).max().getAsInt();
		System.out.println("maxLengthString :: "+maxLengthString);
	}

}
