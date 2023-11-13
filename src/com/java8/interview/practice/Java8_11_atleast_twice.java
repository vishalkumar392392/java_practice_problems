package com.java8.interview.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Java8_11_atleast_twice {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 5, 5, 6, 7, 8 };
		;

		boolean a = Arrays.stream(arr).boxed()
				.filter(i -> Collections.frequency(Arrays.stream(arr).boxed().collect(Collectors.toList()), i) > 1)
				.distinct().collect(Collectors.toList()).size() >= 1;

		System.out.println(a);
		;

	}

}
