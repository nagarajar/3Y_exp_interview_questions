package com.java.coding;

public class PrintNaturalNumWithoutLoop {
	public static void main(String[] args) {
		printNaturalNum(10,1);
	}
	
	public static void printNaturalNum(int n, int i){
		if(i<=n) {
			System.out.println(i);
			printNaturalNum(n,i+1);
		}
	}
}
