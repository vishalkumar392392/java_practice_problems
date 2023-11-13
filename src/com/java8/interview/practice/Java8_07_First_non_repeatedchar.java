package com.java8.interview.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Java8_07_First_non_repeatedchar {

	public static void main(String[] args) {

		String input = "Java Articles are Awesome";

		String orElse = Arrays.stream(input.split(""))
				.filter(i -> Collections.frequency(Arrays.stream(input.split("")).collect(Collectors.toList()), i) == 1)
				.findFirst().orElse("");

		System.out.println(orElse);
	}

}
