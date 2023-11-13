package com.java8.strings;

import java.util.Arrays;

public class WordCount {

	public static void main(String[] args) {

		String input = "hello world vishal is good boy";
		long count = Arrays.stream(input.split(" ")).count();
		System.out.println(count);
	}

}
