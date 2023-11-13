package com.vishal.practice;

import java.util.Comparator;

public class Student implements Comparable<Student> {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	String name;
	int age;
	double gpa;

	public Student(String name, int age, double gpa) {
		super();
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(o.age, this.age);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gpa=" + gpa + "]";
	}

}

class Sortbyroll implements Comparator<Student> {

	// Method
	// Sorting in ascending order of roll number
	public int compare(Student a, Student b) {

		return a.age - b.age;
	}
}

class Sortbyname implements Comparator<Student> {

	// Method
	// Sorting in ascending order of name
	public int compare(Student a, Student b) {

		return a.name.compareTo(b.name);
	}
}