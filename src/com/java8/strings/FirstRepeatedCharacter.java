package com.java8.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {

		String str = "ilovegayathri";

		List<String> list = Arrays.stream(str.split("")).collect(Collectors.toList());

		String result = Arrays.stream(str.split("")).filter(i -> Collections.frequency(list, i) > 0).findFirst()
				.orElse("");

		String string = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(i -> i.getValue() > 1).map(i -> i.getKey()).findFirst().get();

		System.out.println(result);

		System.out.println(string);

	}

}
