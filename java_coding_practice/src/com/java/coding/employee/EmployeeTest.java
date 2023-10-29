package com.java.coding.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {
	
	public static void main(String[] args) {
		/*
		 * Using Java 8 Feature solve the below questions
		 * Q1. How many male and female employees are there in organization ?
		 * Q2. Print all department names in the organization ?
		 * Q3. Get count of employees where sal > 75000, and < 75000 separate counts
		 * Q4. Get list of employee names
		 * Q5. Sort the list of employee names
		 */
		
		List<Employee> employees = getAllEmployees();
		System.out.println("size(): "+ employees.size());
		
		Map<String, Long> genderCount = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("Gender Count: "+ genderCount);
		
		List<String> departments = employees.stream().map(Employee::getDepartment).distinct().toList();
		System.out.println("Departments: "+ departments);
		
		long countSalGreater = employees.stream().filter(e -> e.getSalary()>75000).count();
		System.out.println("countSalGreater 75000: "+ countSalGreater);
		
		long countSalLessThan = employees.stream().filter(e -> e.getSalary()<=75000).count();
		System.out.println("countSalLessThan 75000: "+ countSalLessThan);
 		
		List<String> empNames = employees.stream().map(Employee::getName).toList();
		System.out.println("empNames: "+ empNames);
		
		List<String> empNamesSortAsc = employees.stream().map(Employee::getName).sorted().toList();
		System.out.println("empNamesSortAsc: "+ empNamesSortAsc);
		
		List<String> empNamesSortDsc = employees.stream().map(Employee::getName).sorted(Comparator.reverseOrder()).toList();
		System.out.println("empNamesSortDsc: "+ empNamesSortDsc);
	}
	
	public static List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "John", 25, "Male", "Development", 2021, 600000.00));
	    employees.add(new Employee(2, "Alice", 30, "Female", "Marketing", 2018, 70000.00));
	    employees.add(new Employee(3, "Bob", 28, "Male", "Sales", 2019, 55000.00));
	    employees.add(new Employee(4, "Charlie", 35, "Male", "Development", 2015, 90000.00));
	    employees.add(new Employee(5, "David", 32, "Male", "HR", 2017, 65000.00));
	    employees.add(new Employee(6, "Eve", 27, "Female", "Marketing", 2020, 72000.00));
	    employees.add(new Employee(7, "Frank", 29, "Male", "Sales", 2018, 58000.00));
	    employees.add(new Employee(8, "Grace", 31, "Female", "Development", 2016, 85000.00));
	    employees.add(new Employee(9, "Hank", 26, "Male", "Development", 2022, 610000.00));
	    employees.add(new Employee(10, "Ivy", 33, "Female", "HR", 2014, 62000.00));
	    employees.add(new Employee(11, "Jack", 30, "Male", "Sales", 2017, 60000.00));
	    employees.add(new Employee(12, "Kate", 28, "Female", "Development", 2019, 75000.00));
	    employees.add(new Employee(13, "Liam", 34, "Male", "Marketing", 2015, 69000.00));
	    employees.add(new Employee(14, "Mia", 29, "Female", "Sales", 2020, 62000.00));
	    employees.add(new Employee(15, "Noah", 27, "Male", "HR", 2021, 68000.00));
		
		return employees;
		
	}

}
