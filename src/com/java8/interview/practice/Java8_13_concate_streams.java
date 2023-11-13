package com.java8.interview.practice;

import java.util.Arrays;
import java.util.stream.Stream;

public class Java8_13_concate_streams {

	public static void main(String[] args) {

		String[] str1 = { "A", "B", "C", "D" };
		String[] str2 = { "E", "F", "G", "H" };

		Stream<String> concat = Stream.concat(Arrays.stream(str1), Arrays.stream(str2));

		concat.forEach(i -> System.out.print(i + " "));
	}
}
