package com.java8.strings;

import java.util.Arrays;

public class CubeOnLIstElements {

	public static void main(String[] args) {

		int array[] = { 4, 5, 6, 7, 1, 2, 3 };

		Arrays.stream(array).boxed().map(i -> i * i * i).filter(i -> i > 50).forEach(System.out::println);
	}

}
