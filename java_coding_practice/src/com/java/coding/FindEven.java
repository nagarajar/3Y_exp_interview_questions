package com.java.coding;

import java.util.Arrays;
import java.util.List;

public class FindEven {
	public static void main(String[] args) {
		/*
		 * Find even number from the given list using java 8
		 * Input : [1,7,2,5,8,3,10]
		 * Output: [2,8,10]
		 */
		
		List<Integer> list = Arrays.asList(1,7,2,5,8,3,10);
		List<Integer> evenNumlist = list.stream().filter(i -> i%2==0).toList();
		System.out.println(evenNumlist);
	}

}
