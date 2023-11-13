package com.java.array;

import java.util.Arrays;

public class Sort_Insertion {

	public static void main(String[] args) {

		int arr[] = { 5, 3, 1, 8, 4, 2 };
		int n = arr.length;
		for (int i = 1; i < n; i++) {

			int ele = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > ele) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = ele;
		}

		Arrays.stream(arr).boxed().forEach(j -> System.out.print(j + " "));

	}

}
