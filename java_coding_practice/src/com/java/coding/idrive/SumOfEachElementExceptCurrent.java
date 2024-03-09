package com.java.coding.idrive;

import java.util.Arrays;

public class SumOfEachElementExceptCurrent {
	public static void main(String[] args) {
		/*
		 * Do the sum of each element except the current element
		 * 
		 * input : {2,1,3,4,5}
		 * output: {13,14,12,11,10}
		 */
		
		int[] a = {2,1,3,4,5};
		int n = a.length;
		int[] b = new int[n];
		
		for(int i = 0; i<n; i++) {
			int sum = 0;
			for(int j=0; j<n; j++) {
				if(j!=i) {
					sum+=a[j];
				}
			}
			b[i] = sum;
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
	}
}
