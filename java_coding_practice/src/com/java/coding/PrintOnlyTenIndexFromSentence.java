package com.java.coding;

public class PrintOnlyTenIndexFromSentence {
	public static void main(String[] args) {
		/*
		 * Problem statement Print the words in the given string till the index 10, if
		 * the word comes after the index 10 we should not display that word. also no
		 * spaces present at the last word
		 * 
		 * input: "This is sky" -> index 11 output: This is -> index 7
		 */
		String input = "This is sk";
		String[] inputArray = input.split(" ");
		approach01(inputArray);
		System.out.println("******************************");
		approach02(inputArray);

	}

	private static void approach01(String[] inputArray) {
		int count = 0;
		for (int i = 0; i < inputArray.length; i++) {
			count = count + inputArray[i].length() + 1;
			if (count <= 10) {
				if (i == 0) {
					System.out.print(inputArray[i]);
				} else {
					System.out.print(" " + inputArray[i]);
				}
			} else {
				break;
			}
		}
		System.out.println();
	}
	
	private static void approach02(String[] inputArray) {
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		int sbCount = 0;
		for(String s : inputArray) {
			sbCount = sbCount+ s.length()+1;
			if(sbCount <= 10) {
				if(first) {
					sb.append(s);
					first = false;
				}else {
					sb.append(" ").append(s);
				}
			}else {
				break;
			}
		}
		System.out.println(sb.toString());
	}
	
	
}
