package com.java.coding.oops;

public class InterfacePracticeWithLamdaEx {
	
	public static void main(String[] args) {
		MyInterface i = () -> System.out.println("Using Lamda Expression");
		i.m1();
	}
}
