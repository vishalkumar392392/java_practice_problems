package com.java.array;

public class SearchElementInArray {

	public static void main(String[] args) {

		int arr[] = { 20, 5, 7, 25 };

		int a = 5;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				System.out.println(i);
				return;
			}
		}

	}

}
