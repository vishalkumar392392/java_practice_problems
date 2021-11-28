package com.programs.practice;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 165667;//It is the number to check armstrong
		
		/** 1st method to find Armstrong number */
		double fin = 0;
		int times = String.valueOf(num).length();

		for (int i = 0; i < times; i++) {
			fin += Math.pow(Integer.parseInt(String.valueOf(num).charAt(i) + ""), times);
		}
		if (num == (int) fin) {

			System.out.println("It is Armstrong number");
		}else {
			System.out.println("It is not Armstrong number");

		}
		
		/** 2nd method to find Armstrong number */
		 int c=0,a,temp;  
		    int n=153;//It is the number to check armstrong  
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   
		   
		
		
		
	}
}
