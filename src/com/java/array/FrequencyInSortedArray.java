package com.java.array;

public class FrequencyInSortedArray {

	public static void main(String[] args) {

		int arr[] = { 10, 10, 10, 25, 30, 30 };

		int num = arr[0];
		int count = 1;
		int p1 = 1;
		while (p1 < arr.length) {
			if (num == arr[p1]) {
				count++;
			} else {
				System.out.println(num + " : " + count);
				num = arr[p1];
				count = 1;
			}
			p1++;
		}
		System.out.println(num + " : " + count);
	}

}
