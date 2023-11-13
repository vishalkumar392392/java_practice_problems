package com.java8.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_14_cube_list_integers {

	public static void main(String[] args) {

		int array[] = { 4, 5, 6, 7, 1, 2, 3 };

		List<Integer> collect = Arrays.stream(array).boxed().map(i -> i * i * i).filter(i -> i > 50)
				.collect(Collectors.toList());
		System.out.println(collect);
	}

}
