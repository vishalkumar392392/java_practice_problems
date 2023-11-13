package com.java.array;

import java.util.Arrays;

public class Sort_MergeSort {

	public static void main(String[] args) {

		int arr[] = { 5, 3, 1, 8, 4, 2 };

		mergeSort(arr, 0, arr.length - 1);

		Arrays.stream(arr).boxed().forEach(j -> System.out.print(j + " "));

	}

	private static void mergeSort(int[] arr, int low, int high) {

		if (low == high) {
			return;
		}

		int mid = (low + high) / 2;

		mergeSort(arr, low, mid);
		mergeSort(arr, mid + 1, high);
		merge(arr, low, mid, high);
	}

	private static void merge(int[] arr, int low, int mid, int high) {

		int p1 = low;
		int p2 = mid + 1;

		int i = 0;

		int temp[] = new int[high - low + 1];

		while (p1 <= mid && p2 <= high) {

			if (arr[p1] < arr[p2]) {
				temp[i] = arr[p1];
				p1++;
				i++;

			} else {
				temp[i] = arr[p2];
				p2++;
				i++;
			}
		}

		while (p1 <= mid) {
			temp[i] = arr[p1++];
			i++;
		}
		while (p2 <= high) {
			temp[i] = arr[p2++];
			i++;
		}

		for (int j = 0; j < (high - low + 1); j++) {
			arr[low + j] = temp[j];
		}
	}

}
