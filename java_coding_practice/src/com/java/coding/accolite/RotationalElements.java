package com.java.coding.accolite;

import java.util.Arrays;

public class RotationalElements {
	/*
	 * Given an array of integers arr[] of size N and an integer, the task is to rotate the array elements to the left by d positions.
	 * Input: {1, 2, 3, 4, 5, 6, 7}, d = 2
	 * Output: [3 4 5 6 7 1 2]
	 * 
	 * Input: {3, 4, 5, 6, 7, 1, 2}, d=2
	 * Output: [5 6 7 1 2 3 4]
	 */
	
	public static void main(String[] args) {
		int d = 2;
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		int n = a.length;
		int[] b = new int[n];
		//Approach 01
		for(int i = d; i < n; i++) {
			b[i-d] = a[i];
		}
		
		for(int j = 0; j < d; j++) {
			b[n-d+j]=a[j];
		}
		
		System.out.println("Input: "+Arrays.toString(a));
		System.out.println("Output: "+Arrays.toString(b));
		
		//Approach 02
        for (int i = 0; i < n; i++) {
            int newPosition = (i + n - d) % n;
            //System.out.println("Iteration " + i + ": Moving " + a[i] + " to position " + newPosition);
            b[newPosition] = a[i];
            //System.out.println("Current state of b: " + Arrays.toString(b));
        }

        System.out.println("Input1: " + Arrays.toString(a));
        System.out.println("Output2: " + Arrays.toString(b));
	}
}
