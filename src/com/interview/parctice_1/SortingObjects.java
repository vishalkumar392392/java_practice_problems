package com.interview.parctice_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingObjects {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		list.add(new Person("vishal", 24, "India"));
		list.add(new Person("vikas", 25, "India"));
		list.add(new Person("ajith", 28, "India"));

		List<Person> sortedList = list.stream()
				.sorted(Comparator.comparing(Person::getName).thenComparing(Person::getAge))
				.collect(Collectors.toList());
		sortedList.forEach(i -> System.out.println(i));
	}

}

class Person {
	private String name;
	private int age;
	private String country;

	public Person(String name, int age, String country) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
	}

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", country=" + country + "]";
	}

}
