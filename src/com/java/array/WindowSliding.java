package com.java.array;

public class WindowSliding {

	public static void main(String[] args) {

		int arr[] = { 1, 8, 30, -5, 20, 7 };

		int k = 3;
		int curr = 0;

		for (int i = 0; i < k; i++) {
			curr = curr + arr[i];
		}
		int res = curr;
		for (int i = k; i < arr.length; i++) {

			curr = curr + arr[i] - arr[i-k];

			res = Math.max(res, curr);
		}

		System.out.println(res);
	}

}
