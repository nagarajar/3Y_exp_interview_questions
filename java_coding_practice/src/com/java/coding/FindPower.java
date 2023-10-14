package com.java.coding;

import java.util.Scanner;

public class FindPower {
	public static void main(String[] args) {
		/*
		 * Write a program to find the power(a,b) where a and b are integers
		 * Input : B=3, P=3
		 * Output: 8 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the b value : ");
		int b = sc.nextInt();
		System.out.print("Enter the p value : ");
		int p = sc.nextInt();
		int result1 = approach01(b,p);
		System.out.println(b+"^"+p+" = "+result1);
		int result2 = approach02(b,p);
		System.out.println(b+"^"+p+" = "+result2);
		int result3 = approach03(b,p);
		System.out.println(b+"^"+p+" = "+result3);
		
	}

	private static int approach01(int b, int p) {
		int power = 1;
		for(int i=1;i<=p;i++) {
			power=power*b;
		}
		return power;
	}
	
	private static int approach02(int b, int p) {
		if(p==0) {
			return 1;
		}
		return b*approach02(b,p-1);
	}
	
	private static int approach03(int b, int p) {
		return (int) Math.pow(b, p);
	}

}
