package com.java.coding.idrive;

import java.util.Arrays;
import java.util.List;

public class SumOfArrayElements {
	public static void main(String[] args) {
		/*
		 * Find the sum of array elements using java 8
		 * input : {1,2,3,4,5,6,7,8,9}
		 * output1: 45 
		 * 
		 * Sum of even numbers only
		 * Output2: 20
		 */
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println("Input: "+numbers);
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Output1: "+sum);
		int sumOfEvenNum = numbers.stream().filter(e-> e%2==0).mapToInt(Integer::intValue).sum();
		System.out.println("Output1: "+sumOfEvenNum);
	}
}
