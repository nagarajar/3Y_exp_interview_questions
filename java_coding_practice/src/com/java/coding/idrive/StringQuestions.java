package com.java.coding.idrive;

public class StringQuestions {
	public static void main(String[] args) {
		String s1 = "bangalore";
		String s2 = new String("bangalore");
		String s3= "bangalore";

		System.out.println(s1 == s2);//=> false
		System.out.println(s1 == s3);//=> true
		System.out.println(s1.equals(s2));//=> true 
		 
	}
}
