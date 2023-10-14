package com.java.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElements {
	public static void main(String[] args) {
		/*
		 * Find the duplicate elements using stream in java
		 * Input: [1,2,4,2,5,4,1]
		 * Output: [2,4,1]
		 */
		
		List<Integer> list = Arrays.asList(1,2,4,2,5,4,1);
		Set<Integer> set = new HashSet<>();
		List<Integer> duplicates = list.stream().filter(i-> !set.add(i)).toList();
		System.out.println(duplicates);
		
		appoach01(list);
	}

	private static void appoach01(List<Integer> list) {
		List<Integer> duplicates = new ArrayList<>();
		 for (int i = 0; i < list.size(); i++) {
	            for (int j = i + 1; j < list.size(); j++) {
	                if (list.get(i).equals(list.get(j))) {
	                    //System.out.println(list.get(i));
	                	duplicates.add(list.get(i));
	                    break; // To avoid printing duplicates more than once
	                }
	            }
	        }
		 System.out.println(duplicates);
	}
}
