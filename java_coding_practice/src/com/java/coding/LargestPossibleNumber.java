package com.java.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestPossibleNumber {
	public static void main(String[] args) {
		/*
		 * Write a program to generate the largest number possible by using these digits
		 * Input: arr[] = {8,6,0,4,6,4,2,7}
		 * Output: Largest number: 87664420
		 */
		List<Integer> numbers = Arrays.asList(8,6,0,4,6,4,2,7);
		System.out.println("Given digits: "+ numbers);
		StringBuilder largestNum = new StringBuilder();
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(i -> largestNum.append(i));
		System.out.println("Largest number: "+largestNum);
		
	}
}
