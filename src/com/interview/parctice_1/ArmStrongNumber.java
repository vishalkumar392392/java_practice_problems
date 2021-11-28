package com.interview.parctice_1;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (isArmstrong(num)) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not a Armstrong number");
		}
		sc.close();
	}

	private static boolean isArmstrong(int num) {

		int temp, digits = 0, a = 0, sum = 0;
		temp = num;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = num;
		while (num > 0) {
			a = num % 10;
			num = num / 10;
			sum += Math.pow(a, digits);
		}

		if (temp == sum) {
			System.out.println(sum);
			return true;
		}
		return false;
	}
}
