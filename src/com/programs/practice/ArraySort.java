package com.programs.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySort {

	public static void main(String[] args) {

		int array[] = { 4, 6, 1, 9, 33, 90, 22 };

		Integer array2[] = { 4, 6, 1, 9, 33, 90, 22 };

		Arrays.sort(array2, Collections.reverseOrder());

		Arrays.sort(array);

		List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

		Integer array1[] = list.stream().sorted().collect(Collectors.toList()).toArray(Integer[]::new);

		Arrays.stream(array1).forEach(x -> System.out.print(x + " "));

		int num[] = { 4, 6, 1, 9, 33, 90, 22 };
		int temp = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		System.out.print("\nArray Elements in Ascending Order: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + ", ");
		}
	}
}
