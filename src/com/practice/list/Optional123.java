package com.practice.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Optional123 {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		Student student = new Student();
		student.setAddress(new Address("peenarpalem,Narsipatnam"));
		student.setEmail("vishalpalla27@gmail.com");
		student.setId(12);
		student.setName("vishal");
		student.setMarks(250);

		Student student2 = new Student();
		student.setAddress(new Address("anakapalli"));
		student.setEmail("prabhas@gmail.com");
		student.setId(13);
		student.setName("prabhas");
		student.setMarks(300);

		list.add(student2);
		list.add(student);

		getStudents(list);
		System.out.println(list.stream().filter(s -> s.getId() > 2).collect(Collectors.toList()));

		String res = getResults(student);
		System.out.println(res);

	}

	private static String getResults(Student student) {

		return Objects.nonNull(student)
				? Optional.ofNullable(student.getAddress()).map(Address::getStreetName).orElseGet(null)
				: null;

	}

	private static void getStudents(List<Student> list) {

		System.out.println(list.stream().filter(s -> s.getId() > 2).collect(Collectors.toList()));

	}

}
