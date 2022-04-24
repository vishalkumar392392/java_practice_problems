package com.vishal.practice;

import java.util.HashMap;
import java.util.Map;

public class LargestNumberInArray {

	public static void main(String[] args) {
		Integer[] arr = { 4, 100, 2, 90, 99, 9, 8 };
		Map<Integer, Integer> number = getNumber(arr);
		System.out.println("Largest Number is: " + number.keySet().stream().findFirst().get());
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
