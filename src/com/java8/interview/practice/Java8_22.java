package com.java8.interview.practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class Java8_22 {

	public static void main(String[] args) {
		String str = "string data to count each character";

		LinkedHashMap<String, Long> collect = Arrays.stream(str.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()));
		System.out.println(collect);
	}

}
