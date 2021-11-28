package com.programs.practice;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringSplitUsingPattern {

	public static void main(String[] args) {
		
	String test = "2,3,4,5,6";
		
		String fin = Pattern.compile(",").splitAsStream(test).collect(Collectors.joining(":"));
	    System.out.println(fin);
	    
	    System.out.println(11%10);
	}
}
