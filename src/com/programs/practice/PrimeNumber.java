package com.programs.practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num,temp;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the input");
		num = in.nextInt();
		temp = num;
		--temp;
		while(temp!=0) {
			
			if(temp==1) {
				System.out.println("A prime number");
				break;
			}
			if(num%temp==0) {
				System.out.println("Not a prime number");
				break;
			}
			
			temp--;
		}
	}
}
