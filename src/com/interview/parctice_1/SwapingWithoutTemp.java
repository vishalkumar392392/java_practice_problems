package com.interview.parctice_1;

public class SwapingWithoutTemp {

	public static void main(String[] args) {

		int a = 25;
		int b = 30;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Num 1: "+a);
		System.out.println("Num 2: "+b);

	}

}
