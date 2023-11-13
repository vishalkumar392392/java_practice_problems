package com.java.array;

import java.util.Arrays;

public class Sort_Bubble {

	public static void main(String[] args) {

		int arr[] = { 5, 3, 1, 8, 4, 2 };
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}

		Arrays.stream(arr).boxed().forEach(i -> System.out.print(i + " "));
	}

}
