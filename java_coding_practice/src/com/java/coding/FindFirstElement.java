package com.java.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElement {
	/*
	 * Problem Statement: Find the first element start character b
	 * 
	 * Input list: ["apple","banana","grapes","blueberry"]
	 * Output: First match: banana
	 */
	
	public static void main(String[] args) {
		List<String> fruites = Arrays.asList("apple","banana","grapes","blueberry");
		Optional<String> findFirst = fruites.stream().filter(f -> f.startsWith("b")).findFirst();
		System.out.println("Input list: "+ fruites);
		if(findFirst.isPresent()) {
			System.out.println("Output: First match: "+ findFirst.get());
		}else {
			System.out.println("Output: No Matches Found");
		}
		
	}

}
