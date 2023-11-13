package com.java8.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class CountWordInString {

	public static void main(String[] args) {

		String str = "I love gayathri I love baby gayathri";

		LinkedHashMap<String, Long> collect = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()));

		System.out.println(collect);

		List<String> list = Arrays.asList("I", "love", "gayathri", "I", "love", "baby", "gayathri");

		LinkedHashMap<String, Long> collect2 = list.stream()
				.collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()));
		System.out.println(collect2);
		
		
		
	}

}
