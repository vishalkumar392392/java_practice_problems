package com.java.array;

public class LeadersInArray {

	public static void main(String[] args) {

		int array[] = { 7, 10, 4, 3, 6, 5, 2 };

		int size = array.length;
		int currentleader = array[size - 1];
		System.out.print(currentleader + " ");
		for (int i = size - 2; i >= 0; i--) {
			if (array[i] > currentleader) {
				currentleader = array[i];
				System.out.print(currentleader+ " ");
			}
			
		}

	}

}
