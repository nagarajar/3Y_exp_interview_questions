package com.java.coding.accolite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudentByLamdaExp {
	public static void main(String[] args) {
		// Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 22));
        students.add(new Student(2, "Bob", 20));
        students.add(new Student(3, "Alice", 25));
        students.add(new Student(4, "Charlie", 22));
        students.add(new Student(5, "Bob", 21));

        // Sort the list using Collections.sort and the custom comparator
        Collections.sort(students, (s1, s2) -> {
            // Compare by name asc
            int nameComparison = s1.getName().compareTo(s2.getName());
            //DSC
            //int nameComparison = s2.getName().compareTo(s1.getName());

            // If names are the same, compare by age
            if (nameComparison == 0) {
            	//ASC
                return Integer.compare(s1.getAge(), s2.getAge());
                //DSC
                //return Integer.compare(s2.getAge(), s1.getAge());
            }

            return nameComparison;
        });

        // Print the sorted list
        for (Student student : students) {
            System.out.println(student);
        }
	}
}
