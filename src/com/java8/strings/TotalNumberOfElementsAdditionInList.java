package com.java8.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TotalNumberOfElementsAdditionInList {

	public static void main(String[] args) {

		int array[] = { 2, 5, 8, 3, 8, 1 };

		int sum = Arrays.stream(array).sum();

		System.out.println(sum);

		List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
		Integer reduce = list.stream().reduce(0, Integer::sum);
		System.out.println(reduce);
		int sum2 = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum2);
	}

}
