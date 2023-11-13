package com.java8.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class AtLeastTwiceInArray {

	public static void main(String[] args) {

		int array[] = { 2, 6, 2, 8, 9, 4, 6 };

		long count = Arrays.stream(array).boxed()
				.filter(i -> Collections.frequency(Arrays.stream(array).boxed().collect(Collectors.toList()), i) > 1)
				.distinct().count();

		System.out.println(count);
	}

}
