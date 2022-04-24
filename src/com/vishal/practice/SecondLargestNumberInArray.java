package com.vishal.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {

		Integer[] arr = { 4, 100, 2, 90, 99, 9, 8 };
		Map<Integer, Integer> number = getNumber(arr);
		List<Integer> list = Arrays.stream(arr).collect(Collectors.toList());
		Integer[] array = list.stream().filter(num -> (num) != number.keySet().stream().findFirst().get())
				.toArray(Integer[]::new);
		System.out.println("Second Largest Number is: " + getNumber(array).keySet().stream().findFirst().get());
	}

	private static Map<Integer, Integer> getNumber(Integer[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (i != j && arr[i] < arr[j]) {
					temp = 1;
					break;
				}
			}
			if (temp == 0) {
				map.put(arr[i], i);
				break;
			}
			temp = 0;
		}
		return map;
	}

}
