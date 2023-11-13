package com.java8.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class DuplicateElementsWithCountInStringArray {

	public static void main(String[] args) {

		String str[] = { "AA", "BB", "AA", "CC" };

		LinkedHashMap<String, Long> collect = Arrays.stream(str)
				.filter(x -> Collections.frequency(Arrays.stream(str).collect(Collectors.toList()), x) > 1)
				.collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()));
		System.out.println(collect);

		String str1[] = { "AA", "BB", "AA", "CC", "CC", "DD", "CC" };

		LinkedHashMap<String, Long> collect2 = Arrays.stream(str1)
				.filter(x -> Collections.frequency(Arrays.stream(str1).collect(Collectors.toList()), x) > 1)
				.collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()));

		System.out.println(collect2);

	}

}
