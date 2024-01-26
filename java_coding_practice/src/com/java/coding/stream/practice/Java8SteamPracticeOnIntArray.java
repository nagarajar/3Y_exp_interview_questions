package com.java.coding.stream.practice;

import java.util.Arrays;
import java.util.List;

public class Java8SteamPracticeOnIntArray {
	public static void main(String[] args) {
		/*
		 * 1. Find the sum of all even numbers in a list of integers.
		 */
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sumOfEvenNumbers = numbers.stream().filter(n -> n%2==0).mapToInt(Integer::intValue).sum();
		System.out.println("sumOfEvenNumbers :: "+sumOfEvenNumbers);
		
		/*
		 * 2. Find the maximum element in a list of integers.
		 */
		int maxValue = numbers.stream().mapToInt(Integer::intValue).max().getAsInt();
		System.out.println("maxValue :: "+maxValue);
		
		/*
		 * 3. Implement a function that takes a list of integers as input and returns a new list containing the square of each element.
		 */
		List<Integer> suqareNumList = numbers.stream().map(num -> num*num).toList();
		System.out.println("suqareNumList :: "+suqareNumList);
		
		/*
		 * 4. Check if all elements in a List satisfy a given condition using streams.
		 * Is all are even numbers in the list ?
		 */
		boolean allEvenNum = numbers.stream().allMatch(n -> n%2==0);
		System.out.println("allEvenNum :: "+allEvenNum);
		
		/*
		 * 5. Check if a list contains a specific element using streams.
		 * Check 9 is present in the list or not
		 */
		boolean anyMatch = numbers.stream().anyMatch(n -> n.equals(9));
		System.out.println("anyMatch with 9 :: "+anyMatch);
		
		/*
		 * 6. Find Second Smallest Element in a List
		 * It will be 2
		 */
		Integer secondSmallestValue = numbers.stream().distinct().sorted().skip(1).findFirst().orElse(0);
		System.out.println("secondSmallestValue :: "+secondSmallestValue);
		
		/*
		 * 7. Find Intersection of Two Lists
		 */
		List<Integer> list1 = Arrays.asList(1,5,8,3);
		List<Integer> list2 = Arrays.asList(9,5,3,8);
		
		List<Integer> intersectionList = list1.stream().filter(list2::contains).toList();
		System.out.println("intersectionList :: "+intersectionList);
		
		/*
		 * 8. Find the average of all the numbers in a list of integers using Streams.
		 */
		double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println("average :: "+average);
		
		List<Double> doubleNumbers = Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0);
		double doubleNumAvg = doubleNumbers.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
		System.out.println("doubleNumAvg :: "+doubleNumAvg);
		
	}
}
