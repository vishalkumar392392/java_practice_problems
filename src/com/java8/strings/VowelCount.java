package com.java8.strings;

import java.util.Arrays;

public class VowelCount {

	public static void main(String[] args) {
		String str = "Hello world";

		Arrays.stream(str.split("")).map(String::toLowerCase).filter(i -> "aeiou".contains(i))
				.forEach(System.out::println);

	}

}
