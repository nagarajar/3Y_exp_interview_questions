package com.java.coding.accolite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStudent implements Comparator<Student>{
	public static void main(String[] args) {
		// Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 22));
        students.add(new Student(2, "Bob", 20));
        students.add(new Student(3, "Alice", 25));
        students.add(new Student(4, "Charlie", 22));
        students.add(new Student(5, "Bob", 21));

        // Sort the list using Collections.sort and the custom comparator
        Collections.sort(students, new SortStudent());

        // Print the sorted list
        for (Student student : students) {
            System.out.println(student);
        }
	}

	@Override
	public int compare(Student o1, Student o2) {
		int order = o1.getName().compareTo(o2.getName());
		if(order == 0) {
			return Integer.compare(o1.getAge(), o2.getAge());
		}
		return order;
	}
}
