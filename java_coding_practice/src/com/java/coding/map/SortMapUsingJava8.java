package com.java.coding.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapUsingJava8 {
	/*
	 * Sort HashMap by value using java 8
	 * We have key = name, value = age and we need to sort by value
	 * Input:
	 * "Naga", 26,
	 * "Shiva", 25,
	 * "Kiran" , 22,
	 * "Pavan", 23,
	 * "Mahesh", 26
	 *  
	 */
	public static void main(String[] args) {
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Naga", 26);
		hashMap.put("Shiva", 25);
		hashMap.put("Kiran", 22);
		hashMap.put("Pavan", 23);
		hashMap.put("Mahesh", 26);
		
		//Ascending
		LinkedHashMap<String, Integer> linkedHashMapAsc = hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2)->e1 ,LinkedHashMap::new));
		
		System.out.println("linkedHashMap: "+linkedHashMapAsc);
		
		//Descending
		LinkedHashMap<String, Integer> linkedHashMapDsc = hashMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2)->e1 ,LinkedHashMap::new));
		
		System.out.println("linkedHashMap: "+linkedHashMapDsc);
	}
}
