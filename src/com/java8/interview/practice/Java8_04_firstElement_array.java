package com.java8.interview.practice;

import java.util.Arrays;

public class Java8_04_firstElement_array {

	public static void main(String[] args) {
		
		int arr[] = {10,15,8,49,25,98,98,32,15};
		
		Integer orElse = Arrays.stream(arr).boxed().findFirst().orElse(null);
		
		System.out.println(orElse);
	}

}
