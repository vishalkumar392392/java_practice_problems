package com.java8.interview.practice;

import java.util.Arrays;

public class Java8_05_total_count_array {

	public static void main(String[] args) {

		int arr[] = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };

		long count = Arrays.stream(arr).boxed().count();
		System.out.println(count);
	}

}
