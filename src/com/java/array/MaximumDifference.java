package com.java.array;

public class MaximumDifference {

	public static void main(String[] args) {

		int array[] = { 2, 3, 10, 6, 4, 8, 1 };

		int maxDifference = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((array[j] - array[i]) > maxDifference) {
					maxDifference = array[j] - array[i];
				}
			}
		}

		System.out.println("Max difference: "+ maxDifference);

	}

}
