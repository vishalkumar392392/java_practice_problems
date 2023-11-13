package com.java.array;

public class SecondLargestElement {

	public static void main(String[] args) {

		int arr[] = { 2, 6, 9, 33, 55};

		int firstMax = Integer.MIN_VALUE;

		int secondMax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > firstMax) {
				firstMax = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != firstMax && arr[i] > secondMax) {
				secondMax = arr[i];
			}
		}
		
		System.out.println(secondMax);
	}

}
