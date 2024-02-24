package com.java.coding.practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
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
		
		Map<Character, Integer> map1 = new LinkedHashMap<>();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(map1.get(c) == null) {
				map1.put(c, 1);
			}else {
				map1.put(c, map1.get(c)+1);
			}
		}
		System.out.println(map1);
	}
}
