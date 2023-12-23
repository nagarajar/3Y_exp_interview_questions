package com.java.coding.practice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNoOfOccurence {
	public static void main(String[] args) {
		/*
		 * Input: "JavaJavaEE";
		 * Output: J-2, a-4, E-2, v-2
		 */
		
		String str = "JavaJavaEE";
		//List<String> asList = Arrays.asList(str.split(""));
		//System.out.println(asList);
		Map<String, Long> map = Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(String::toString, Collectors.counting()));
		System.out.println(map);
	}
}
