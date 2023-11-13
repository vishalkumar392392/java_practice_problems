package com.java8.strings;

import java.util.Arrays;
import java.util.List;

public class StartingWithOne {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

		myList.stream().filter(i -> i < 20 && i > 9).forEach(System.out::println);

	}

}
