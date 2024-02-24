package com.java.coding;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringOnlyIfAlphabets {
	public static void main(String[] args) {
		/*
		 * Reverse a string without affecting the special character.
		 * input1: r#$ab#&cde;
		 * output1: e#$dc#&bar;
		 * 
		 * input2: r#aa$pid
		 * output:d#ip$aar
		 */
		
		System.out.println("Entere the your input");
		System.out.print("Input  : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String output1 = approach01(input);
		System.out.println("Output1 : "+ output1);
		String output2 = approach02(input);
		System.out.println("Output2 : "+ output2);
	}
	
	public static String approach01(String input) {
		char[] arr = input.toCharArray();
		int i = 0;
		int j = arr.length - 1;
		
		while(i<j) {
			//Don't reverse when char is special char
			if(!Character.isAlphabetic(arr[i])) {
				i++;
			}else if(!Character.isAlphabetic(arr[j])) {
				j--;
			}else {
				//if both are alphabetic
				char ch = arr[i];
				arr[i] = arr[j];
				arr[j] = ch;
				i++;
				j--;
			}
		}
		
		return new String(arr);
	}
	
	public static String approach02(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                stack.push(ch);
            }
        }
        System.out.println(stack);
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                result.append(stack.pop());
            } else {
                result.append(ch);
            }
        }
        System.out.println(stack);

        return result.toString();
    }
}
