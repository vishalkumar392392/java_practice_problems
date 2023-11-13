package com.java8.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_02_start_with_1 {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

		List<String> collect = myList.stream().map(String::valueOf).filter(i -> i.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(collect);
	}

}
