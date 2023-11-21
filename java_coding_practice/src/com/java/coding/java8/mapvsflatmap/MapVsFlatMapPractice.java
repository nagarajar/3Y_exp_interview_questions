package com.java.coding.java8.mapvsflatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MapVsFlatMapPractice {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Bob", "Developer", "Male", new String[] { "java", "scala" }));
		employees.add(new Employee(2, "Joy", "Sr. Developer", "Male", new String[] { "java" }));
		employees.add(new Employee(3, "John", "CEO", "Male", new String[] { "python", "ruby" }));
		employees.add(new Employee(4, "Bat", "Developer", "Male", new String[] { "scala" }));
		employees.add(new Employee(5, "Jolly", "Developer", "Female", new String[] { "C", "C++" }));
		employees.add(new Employee(6, "Bobby", "Developer", "Female", new String[] { ".Net", "VB" }));
		
		//Print the what are the languages our employees knows
		List<Set<String>> mapList = employees.stream().map(e -> e.getLanguages()).toList();
		System.out.println("Map list: "+ mapList);
		
		//Make into single stream
		List<String> flapMapList = employees.stream().map(e -> e.getLanguages()).flatMap(e -> e.stream()).toList();
		System.out.println("flapMapList: "+ flapMapList);
		
		//Make into single stream remove duplicates
		List<String> flapMapListDistinct = employees.stream().map(e -> e.getLanguages()).flatMap(e -> e.stream()).distinct().toList();
		System.out.println("flapMapListDistinct: "+ flapMapListDistinct);
	}
}
