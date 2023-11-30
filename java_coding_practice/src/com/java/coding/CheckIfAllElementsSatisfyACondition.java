package com.java.coding;

import java.util.Arrays;
import java.util.List;

public class CheckIfAllElementsSatisfyACondition {
	/*
	 * Problem Statement: Check if all elements in the list satisfy a condition (if all are even numbers)
	 * 
	 * Input list: [1,2,3,4,5]
	 * Output: All numbers are not even numbers.
	 * 
	 * Input list: [2,4,6,8,10]
	 * Output: All numbers are even numbers.
	 */
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		boolean match = numbers.stream().allMatch(n-> n%2==0);
		System.out.println("Input list: "+ numbers);
		if(match) {
			System.out.println("Output: All numbers are even numbers.");
		}else {
			System.out.println("Output: All numbers are not even numbers.");
		}
		
		List<Integer> numbers1 = Arrays.asList(2,4,6,8,10);
		boolean match1 = numbers1.stream().allMatch(n-> n%2==0);
		System.out.println("Input list: "+ numbers1);
		if(match1) {
			System.out.println("Output: All numbers are even numbers.");
		}else {
			System.out.println("Output: All numbers are not even numbers.");
		}
	}

}
