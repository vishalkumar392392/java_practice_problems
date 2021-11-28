package com.interview.parctice_1;

public class SwapNumersWithTemp {

	public static void main(String[] args) {
		int a = 25;
		int b = 30;
		
		int temp = 0;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("Num 1: "+a);
		System.out.println("Num 2: "+b);

	}
}
