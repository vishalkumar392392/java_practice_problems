package com.java8.interview.practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class Java8_18_count_String {

	public static void main(String[] args) {

		String[] array = { "AA", "BB", "AA", "CC" };

		LinkedHashMap<String, Long> collect = Arrays.stream(array)
				.collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()));
		System.out.println(collect);
	}

}
