package com.java.array;

import java.util.Arrays;

public class Sort_Selection {

	public static void main(String[] args) {

		int arr[] = { 5, 3, 1, 8, 4, 2 };
		int n = arr.length;

		for (int i = 0; i + 1 < n ; i++) {
			int minIndex = minIndex(i + 1, arr);
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;

		}
		
		Arrays.stream(arr).boxed().forEach(j -> System.out.print(j+ " "));


	}

	public static int minIndex(int j, int arr[]) {

		int minIndex = -1;
		int minValue = Integer.MAX_VALUE;
		for (int i = j; i < arr.length; i++) {

			if (arr[i] < minValue) {
				minValue = arr[i];
				minIndex = i;
			}

		}

		return minIndex;
	}

}
