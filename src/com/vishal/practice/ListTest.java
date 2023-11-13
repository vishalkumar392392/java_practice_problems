package com.vishal.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(10);
		List<Integer> collect = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		for (Integer integer : collect) {
			System.out.println(integer);
		}
		
		 List<Student> students = new ArrayList<>();
	        students.add(new Student("Gayathri", 20, 3.7));
	        students.add(new Student("Ajith", 31, 3.9));
	        students.add(new Student("Vishal", 19, 3.5));
	        students.add(new Student("Vikas", 22, 3.5));

//	        Collections.sort(students, new Sortbyname());
	        
	        List<Student> collect2 = students.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
	        
	        collect2.forEach(System.out::println);
		
	}
}
