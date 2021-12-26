package com.programs.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array2d_5 {
	
	public static void main(String[] args) {
		
		int arr[][] = new int[3][3];

		System.out.println("Please enter the input elemens in arary");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int row[] = new int[arr.length];
			for (int j = 0; j < arr.length; j++) {
				row[count] = arr[i][j];
			}
			Arrays.sort(row);
			System.out.println(row[row.length -1]);
		}
	}
	
	

}
