package com.java.coding;

public class FindPrimeNum {
	public static void main(String[] args) {
		int num = 11;
		
		 boolean flag = isPrimeNum(num);
		
		if (flag) {
			System.out.println(num+ " is prime number");
		} else {
			System.out.println(num+ " is not prime number");
		}

	}

	public static boolean isPrimeNum(int num) {
		if(num <= 1) {
			return false;
		}else {
			for (int i = 2; i <= num/2; i++) {
				if (num % i == 0) {
					return false;

				}
			}
		}
		return true;
	}
}