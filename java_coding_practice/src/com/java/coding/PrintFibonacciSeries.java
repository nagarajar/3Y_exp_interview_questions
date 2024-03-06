package com.java.coding;

public class PrintFibonacciSeries {
	public static void main(String [] args) {
		int n = 10;
		printFibonacciSeries(n);
	}
	
	public static void printFibonacciSeries(int n) {
		int a = 0;
		int b = 1;
		int c;
		for(int i = 0; i<n; i++) {
			System.out.print(a+" ");
			c = a+b;
			a = b;
			b = c;
			//if any one asked till the number he asked
//			if(a>n) {
//				break;
//			}
		}
	}
}
