package com.programs.practice;


public class StringReverse {

	public static void main(String[] args) {
		
		
		String type = "Full Stack Developer";
		
		String reverse = "";
		
		for(int i = type.length()-1;i>=0;i--) {
			
			reverse+=type.charAt(i);
		}
		
		System.out.println(reverse);
	}
}

