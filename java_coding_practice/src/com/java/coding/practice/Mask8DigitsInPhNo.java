package com.java.coding.practice;

public class Mask8DigitsInPhNo {
	public static void main(String[] args) {
		String phoneNumber = "9865321245";
		System.out.println(phoneNumber.replaceAll(".(?=.{2})", "#"));
		phoneNumber = phoneNumber.replaceAll("^\\d{8}", "########");
		System.out.println(phoneNumber);
		phoneNumber = "########" + phoneNumber.substring(8);
		System.out.println(phoneNumber);
	}
}
