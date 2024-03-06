package com.java.coding.accolite;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortStudentByStream {
	public static void main(String[] args) {
		// Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 22));
        students.add(new Student(2, "Bob", 20));
        students.add(new Student(3, "Alice", 25));
        students.add(new Student(4, "Charlie", 22));
        students.add(new Student(5, "Bob", 21));

        List<Student> sortedStudents = students.stream().sorted(Comparator.comparing(Student::getName).thenComparingInt(Student::getAge)).toList();
        
        sortedStudents.forEach(System.out::println);
	}
	

}
