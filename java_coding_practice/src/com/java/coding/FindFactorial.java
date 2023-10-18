package com.java.coding;

import java.util.Scanner;

public class FindFactorial {
	public static void main(String[] args) {
		/*
		 * Write a program to find the factorial of a given number
		 * Input: 5
		 * Output: 120
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int n = sc.nextInt();
		int result1 = approach01(n);
		System.out.println("Output: "+ result1);
		int result2 = approach02(n);
		System.out.println("Output: "+ result2);
		
		
	}

	private static int approach01(int n) {
		int fact=1;
		for(int i=n; i>0; i--) {
			fact = fact * i;
		}
		return fact;
	}
	
	private static int approach02(int n) {
		if(n == 0 || n == 1)
			return 1;
		return n * approach02(n-1);
	}
}
