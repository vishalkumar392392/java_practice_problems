package com.programs.practice;

public class ReverseArray {
	public static void main(String[] args) {

		int arr[] = { 6, 3, 10, 700, 88 };
		int arr2[] = new int[4];
		String res = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] != arr[j]) {
					if (arr[i] < arr[j]) {
						// no logic here
					} else {
						res = res + arr[i] + " ";
						break;
					}
				}
			}
		}
		String[] arr3 = res.split(" ");

		for (int i = 0; i < arr3.length; i++) {
			arr2[i] = Integer.parseInt(arr3[i]);
		}

		System.out.println("Final result....");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr2.length; j++) {
				if (arr[i] == arr2[j]) {
					break;
				}
				if (arr[i] != arr2[j]) {
					System.out.println(arr[i]);
					return;
				}
			}
		}

	}

}
