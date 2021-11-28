package com.interview.parctice_1;

public class BubbleSorting {

	public static void main(String[] args) {

		int array[] = { 2, 6, 1, 8, 9, 5 };
		int temp = 0;
		for (int lastSortedIndex = array.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
			for (int j = 0; j < lastSortedIndex; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
