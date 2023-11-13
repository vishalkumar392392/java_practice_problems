package com.vishal.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		
		String str = "Hello world";

		Arrays.stream(str.split("")).map(String::toLowerCase).filter(i -> "aeiou".contains(i))
				.forEach(System.out::println);

		int arr[] = { 12, 79, 34, 567, 13, 18 };

		System.out.println();

		Arrays.stream(arr).boxed().map(String::valueOf).filter(i -> i.startsWith("1")).forEach(System.out::println);

		LinkedHashMap<String, Long> collect = Arrays.stream(str.split("")).map(String::toLowerCase)
				.filter(i -> Collections.frequency(Arrays.stream(str.split("")).collect(Collectors.toList()), i) > 1)
				.sorted().collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()));

		System.out.println(collect);

		String collect2 = Arrays.stream(arr).boxed().map(String::valueOf).collect(Collectors.joining(","));
		System.out.println(collect2);
		
	}

}
