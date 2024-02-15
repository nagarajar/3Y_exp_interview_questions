package com.java.coding;

import java.util.Arrays;
import java.util.List;

public class FindVowelsCount {
	public static void main(String[] args) {
		List<Character> vowels = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
		
		String s = "tcsinterview";
		
		Long count = s.chars().mapToObj(c -> (char) c).filter(e -> vowels.contains(e)).count();
		
		Long count2 = s.chars().filter(c -> c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u').count();
		
		System.out.println("Vowels Count is "+count);
		
		System.out.println("Vowels Count is "+count2);
	}

}
