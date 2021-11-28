package com.programs.practice;

public class SwapNumbersWithTemp {

	public static void main(String[] args) {
		
		int num1,num2,temp;
		
		num1=10;
		num2=20;
		
		System.out.println("Before Swaping numbers: "+num1+" "+num2);
		
		temp = num2;
		num2 = num1;
		num1 = temp;
		
		System.out.println("After Swaping numbers: "+num1+" "+num2);

		
	}
}
