package com.java8.interview.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_09_sort_asc_array {

	public static void main(String[] args) {

		int arr[] = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };

		List<Integer> collect = Arrays.stream(arr).boxed().sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());
		System.out.println(collect);
	}

}
