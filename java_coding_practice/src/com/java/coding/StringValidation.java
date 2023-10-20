package com.java.coding;

import java.util.Scanner;
import java.util.Stack;

public class StringValidation {
	
	public static void main(String[] args) {
		/*
		 * Given String should open and closed by its relative 
		 * Example: (), {}, []
		 * Input s = "(){}[]"
		 * Output = true
		 * Input s = "(]"
		 * Output = false
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String input = sc.next();
		boolean output1 = approach01(input);
		System.out.println("Output: "+ output1);
	}

	private static boolean approach01(String input) {
		Stack<Character> stack = new Stack<>();
		for(int i=0; i< input.length(); i++) {
			char ch = input.charAt(i);
			if(ch == '}') {
				if(stack.peek() == '{') {
					stack.pop();
				}else {
					return false;
				}
			}else if(ch == ')') {
				if(stack.peek() == '(') {
					stack.pop();
				}else {
					return false;
				}
			}else if(ch == ']') {
				if(stack.peek() == '[') {
					stack.pop();
				}else {
					return false;
				}
			}else {
				stack.push(ch);
			}
		}
		if(stack.isEmpty()) {
			return true;
		}
		return false;
	}
	
	

}
