package com.java.coding.accolite;

public class A extends Derived {
	
	/*
	 * 1. Cannot reduce the visibility of the inherited method from Derived
	 * 2. Exception Exception is not compatible with throws clause in Derived.getDetails()
	 */
	protected void getDetails() throws Exception {
		System.out.println("A - class");
	}

	public static void main(String[] args) {
		Derived devRef = new A();
		devRef.getDetails();
	}
}
