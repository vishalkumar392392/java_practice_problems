package com.programs.practice;

public class ArraySortDescending {

	public static void main(String[] args) {

		int num[] = { 7, 2, 9, 5, 4, 9, 2, 7, 4 };
		int temp = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {

				if (num[i] > num[j]) {

					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		for(int i = 0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}

}
