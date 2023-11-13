package com.java8.interview.practice;

import java.util.Arrays;

public class Java8_06_max_value_array {

	public static void main(String[] args) {

		int arr[] = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };

		Integer orElse = Arrays.stream(arr).boxed().max(Integer::compareTo).orElse(Integer.MIN_VALUE);
		System.out.println(orElse);

	}

}
