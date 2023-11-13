package com.java8.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class CharacterCount {

	public static void main(String[] args) {

		String input = "string data to count each character";

		LinkedHashMap<String, Long> collect = Arrays.stream(input.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting()));

		collect.entrySet().forEach(i -> {
			System.out.println(i.getKey() + ": " + i.getValue());
		});
	}

}
