package com.java8.interview.practice;

import java.util.Arrays;

public class Java8_15_sort_array {

	public static void main(String[] args) {
		int arr[] = { 99, 55, 203, 99, 4, 91 };

		Arrays.sort(arr);
		Arrays.stream(arr).forEach(System.out::print);
	}

}
