package com.java8.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringToUppecase {
	
	
	public static void main(String[] args) {
		
		String str[] = {"vishal", "gayathri"};
		
		List<String> collect = Arrays.stream(str).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);
	}

}
