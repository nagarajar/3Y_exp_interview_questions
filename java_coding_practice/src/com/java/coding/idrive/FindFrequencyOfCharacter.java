package com.java.coding.idrive;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFrequencyOfCharacter {
	public static void main(String[] args) {
		/*
		 * Input : nagaraja
		 * output: [n=1,a=4,g=1,r=1,j=1]
		 */
		
		String s = "nagaraja";
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		System.out.println(s);
		System.out.println(map);
	}

}
