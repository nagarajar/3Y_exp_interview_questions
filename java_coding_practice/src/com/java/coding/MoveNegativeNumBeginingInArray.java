package com.java.coding;

import java.util.Arrays;

public class MoveNegativeNumBeginingInArray {
	public static void main(String[] args) {
		/*
		 * Move all the negative values to beginning in the array.
		 * Input: -12,11,-13,-5,6,-7,5,-3,-6
		 * Output: -13,-12,-7,-6,-5,-3,5,6,11
		 */
		
		int[] arr = {-12,11,-13,-5,6,-7,5,-3,-6};
		int temp;
		
		String str1 = new String("nagaraja");
		String str2 = "nagaraja";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				//Ascending Order
				//if(arr[i] > arr[j]) // Move all Negative number to beginning
				//Descending Order
				if(arr[i] < arr[j])  // Move all positive number to beginning
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
