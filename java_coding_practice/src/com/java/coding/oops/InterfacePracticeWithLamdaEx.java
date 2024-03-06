package com.java.coding.oops;

public class InterfacePracticeWithLamdaEx {
	
	public static void main(String[] args) {
		MyInterface i = () -> System.out.println("Using Lamda Expression");
		i.m1();
		
//		SumOfTwoNum s = (input1,input2) -> System.out.println(input1+"+"+input2+"="+(input1+input2));
		SumOfTwoNum s = (input1,input2) -> input1+input2;
		int sum = s.sumOfTwoNumbers(10, 5);
		System.out.println(sum);
	}
}
