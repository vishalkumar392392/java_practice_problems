package com.java8.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElementsInlist {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		List<Integer> collect = myList.stream()
				.collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(i -> i.getValue() > 1).map(i -> i.getKey()).collect(Collectors.toList());

		collect.forEach(System.out::println);

		System.out.println();
		List<Integer> collect2 = myList.stream().filter(i -> Collections.frequency(myList, i) > 1).distinct()
				.collect(Collectors.toList());
		collect2.forEach(System.out::println);

	}

}
