package com.java.coding.oops;

public class InterfacePractice implements MyInterface{

	@Override
	public void m1() {
		System.out.println("Without using lamda expression");	
	}
	
	public static void main(String[] args) {
		InterfacePractice i = new InterfacePractice();
		i.m1();
	}

}
