package com.java8.interview.practice;

import java.util.Arrays;

public class Java8_21 {

	public static void main(String[] args) {

		int array[] = { 12, 19, 20, 88, 00, 9 };

		Integer integer = Arrays.stream(array).boxed().max(Integer::compareTo).get();
		System.out.println(integer);
	}

}
