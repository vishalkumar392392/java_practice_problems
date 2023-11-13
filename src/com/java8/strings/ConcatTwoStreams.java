package com.java8.strings;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConcatTwoStreams {

	public static void main(String[] args) {
		int arr[] = { 1 };
		int arr1[] = { 2 };
		Stream.concat(Arrays.stream(arr).boxed(), Arrays.stream(arr1).boxed()).forEach(System.out::println);
		;
	}
}
