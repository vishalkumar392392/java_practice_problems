package com.interview.parctice_1;

import java.util.Scanner;

public class ArmstrongNumberUpto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Limit: ");
		int num = sc.nextInt();
		for(int i = 1;i<=num;i++) {
			if (isArmstrong(i)) {
				System.out.print(i + " ");
			}
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
			return true;
		}
		return false;
	}
}
