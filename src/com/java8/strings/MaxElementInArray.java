package com.java8.strings;

import java.util.Arrays;

public class MaxElementInArray {

	public static void main(String[] args) {

		int arr[] = { 6, 1, 2, 9, 33, 4 };

		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println(max);

		Integer integer = Arrays.stream(arr).boxed().max(Integer::compare).get();
		System.out.println(integer);
	}

}
