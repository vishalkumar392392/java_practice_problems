package com.criticaldate.java8;

import java.util.Arrays;

public class ArrayToListJava8 {

	public static void main(String[] args) {
		
		
		int array[] = {1,10,20,19,43,13};
		
		Arrays.stream(array).boxed().filter(i -> i<20).forEach(i -> {
			System.out.println(i);
		});
		
	}
}
