package com.interview.parctice_1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int temp=num,a=0,sum=0;
		String rev = "";
		while(num>0) {
			a = num%10;
			num = num/10;
			rev+=a;
		}
		System.out.println("Reversed Number: "+Integer.parseInt(rev));
	}

}
