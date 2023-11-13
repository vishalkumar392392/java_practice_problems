package com.java8.interview.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Java8_03_duplicates_in_array {

	public static void main(String[] args) {

		int arr[] = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };

		Arrays.stream(arr).boxed()
				.filter(i -> Collections.frequency(Arrays.stream(arr).boxed().collect(Collectors.toList()), i) > 1)
				.distinct().forEach(System.out::println);

	}
}
