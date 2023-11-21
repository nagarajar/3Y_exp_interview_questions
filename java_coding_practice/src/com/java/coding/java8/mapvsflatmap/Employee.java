package com.java.coding.java8.mapvsflatmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Employee {
	private int no;
    private String name;
    private String designation;
    private String gender;
    private Set<String> languages;
    public Employee(int no, String name, String designation, String gender , String [] languages) {
        this.no = no;
        this.name = name;
        this.designation = designation;
        this.gender = gender;
        this.languages = new HashSet<>(Arrays.asList(languages));
    }
    public void addLanguage(String language){
        this.languages.add(language);
    }
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Set<String> getLanguages() {
		return languages;
	}
	public void setLanguages(Set<String> languages) {
		this.languages = languages;
	}
	@Override
	public String toString() {
		return "Employee [no=" + no + ", name=" + name + ", designation=" + designation + ", gender=" + gender
				+ ", languages=" + languages + "]";
	}
    
}
