package com.interview.parctice_1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the number");
		int a = sc.nextInt();
		int temp = 0;
		if (a <= 1) {
			temp = 1;
		}
		for (int i = 2; i < a; i++) {

			if (a % i == 0) {
				temp = 1;
			}
		}
		if (temp == 0) {
			System.out.println("Prime Number");
		}
		if (temp == 1) {
			System.out.println("Not a Prime Number");
		}
	}
}
