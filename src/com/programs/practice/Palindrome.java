package com.programs.practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		String original,reverse="";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number or string");

		original = scanner.next();
		
		for(int i = original.length()-1; i>=0; i-- ) {
			
			reverse+=original.charAt(i);

		}
		if(original.equals(reverse)) {
			
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");

		}
	}
}
