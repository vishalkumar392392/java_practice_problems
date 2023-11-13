package com.java.array;

public class MaxSumSubArray {

	public static void main(String[] args) {

		int arr[] = { 5,8,3 };
		int prev = arr[0];
		int max = prev;

		for (int i = 1; i < arr.length; i++) {

			int sum = prev + arr[i];

			prev = Math.max(arr[i], sum);
			max = Math.max(prev, max);

		}
		
		System.out.println(max);

	}

}
