package com.interview.parctice_1;

public class Fibonacci {

	public static void main(String[] args) {

		int num = 20;
		int num1 = 0;
		int num2 = 1;
		int num3;
		
		for(int i = 0; i<num; i++) {
			num3 = num1 + num2;
			System.out.print(num1+" ");
			num1 = num2;
			num2 = num3;
		}
	}

}
