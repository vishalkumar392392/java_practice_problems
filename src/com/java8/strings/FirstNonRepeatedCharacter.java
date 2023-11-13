package com.java8.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		String str = "ilovegayathri";

		String res = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(i -> i.getValue() == 1).map(i -> i.getKey()).findFirst().orElse("");

		System.out.println(res);

		String string = Arrays.stream(str.split(""))
				.filter(i -> Collections.frequency(Arrays.stream(str.split("")).collect(Collectors.toList()), i) == 1)
				.findFirst().get();

		System.out.println(string);

	}

}
