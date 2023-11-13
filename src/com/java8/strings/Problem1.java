package com.java8.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem1 {

	public static void main(String[] args) {

		String str = "Hello World";

		str.toLowerCase().chars().mapToObj(i -> (char) i).filter(i -> "aeiou".indexOf(i) != -1)
				.forEach(System.out::print);

		System.out.println();
		String str1 = "Hello world";

		// Convert the string to lowercase and then convert it to a character array
		str1.toLowerCase().chars()
				// Map each character to a char
				.mapToObj(c -> (char) c)
				// Filter out non-vowels
				.filter(c -> "aeiou".indexOf(c) != -1)
				// Print each vowel
				.forEach(System.out::print);
		System.out.println();
		
		String sentence = "java is fun";
		String capitalized = Arrays.stream(sentence.split(" "))
		    .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
		    .collect(Collectors.joining(" "));
		System.out.println("Capitalized sentence: " + capitalized);
		
		String input = "aabbccddeeff";
		
		String collect = input.chars().distinct().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
		System.out.println(collect);

	}

}
