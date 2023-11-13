package com.java8.strings;

import java.util.Arrays;
import java.util.Comparator;

public class SortInDescending {

	public static void main(String[] args) {
		int array[] = { 6, 1, 9, 3, 22, 98, 5 };

		Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
