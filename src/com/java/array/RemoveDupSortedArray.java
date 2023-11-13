package com.java.array;

public class RemoveDupSortedArray {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 3, 5, 6, 6, 7, 7, 8 };

		int p1 = 0;
		int p2 = 1;

		int temp[] = new int[arr.length];
		temp[0] = arr[0];

		int i = 1;

		while (p1 < arr.length && p2 < arr.length) {
			if (arr[p2] != arr[p1]) {
				temp[i] = arr[p2];
				i++;
			}

			p1++;
			p2++;

		}

		for (int j = 0; j < temp.length; j++) {
			System.out.print(temp[j]+" ");
		}

	}

}
