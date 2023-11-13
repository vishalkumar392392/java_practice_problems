package com.java8.strings;

import java.util.Arrays;

public class SortArrayConvertArraytoStream {

	public static void main(String[] args) {

		int array[] = { 7, 3, 9, 1, 0, 5, 2, 6 };

		Arrays.stream(array).boxed().sorted().forEach(System.out::print);
		;

	}

}
