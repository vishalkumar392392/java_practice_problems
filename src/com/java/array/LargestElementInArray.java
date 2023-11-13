package com.java.array;

public class LargestElementInArray {

	public static void main(String[] args) {

		int arr[] = { 2, 6, 9, 33, 0 };

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}

		}

		System.out.println(max);
	}

}
