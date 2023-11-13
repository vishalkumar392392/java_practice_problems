package com.vishal.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListClass {

	// Collections -> group, store, manipulate,
	// ArrayList, map

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(5);
		list.add(1);
		list.add(10);
		list.add(7);

		// for loop
		// forEach
		// Java 8 -> forEach

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}

		// forEach

		for (Integer value : list) {

			System.out.println(value);
		}
		
		
		// Java8
		//Consumer => 
		//Functional Interface
		//
		System.out.println("--------------------------------");
		list.forEach(i -> System.out.println(i));
		
		
		//get
		
		System.out.println(list.get(0));
		// remove
		list.remove(new Integer(10));
		// contains
		list.contains(0);
		
		
		System.out.println("----------------------------------------");
		 List<Student> students = new ArrayList<>();
	        students.add(new Student("Gayathri", 20, 3.7));
	        students.add(new Student("Ajith", 31, 3.9));
	        students.add(new Student("Vishal", 19, 3.5));
	        students.add(new Student("Vikas", 22, 3.5));
	        students.add(new Student("Ananya", 26, 10.0));
		
//		Collections.sort(students);
		
		for (Student student : students) {
			System.out.println(student);
		}
		
		
		// Java 8 
		
		System.out.println("----------Java8----------");
		
		 List<Student> collect = students.stream().sorted(Comparator.comparing(Student::getName).reversed()).collect(Collectors.toList());
		 for (Student student : collect) {
				System.out.println(student);
			}
		List<Integer> hj = List.of(1,2,3,4,5);
		
		
	}

}


interface Dog {
	
	public String getName();
	
}
