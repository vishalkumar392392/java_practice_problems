package com.java8.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_16_ToUpperCase {

	public static void main(String[] args) {

		String[] array = { "vishal", "vikas", "ajith", "ramya", "gayathri" };

		List<String> collect = Arrays.stream(array).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);
	}

}
