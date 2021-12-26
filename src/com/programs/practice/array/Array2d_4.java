package com.programs.practice.array;

import java.util.Scanner;

public class Array2d_4 {

	public static void main(String[] args) {
		
		int arr[][] = new int[3][3];

		System.out.println("Please enter the input elemens in arary");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;

			for (int j = 0; j < arr.length; j++) {
				sum = sum + arr[i][j];
			}
			System.out.println(sum);
		}
	}
}
