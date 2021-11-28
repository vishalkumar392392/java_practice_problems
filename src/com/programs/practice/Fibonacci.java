package com.programs.practice;

public class Fibonacci {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		int num3 ;
		int fin=0;
		
		while(fin<10) {
			num3 = num1 + num2;
			System.out.print(num1+" ");
			num1=num2;
			num2=num3;
			fin++;
		}
		
	}
}
