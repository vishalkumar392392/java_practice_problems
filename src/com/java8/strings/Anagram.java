package com.java8.strings;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "vish";
		String str2 = "vika";
		long length = str1.chars().mapToObj(i -> (char) i).filter(i -> str2.contains(i + "")).count();

		if (str1.length() == str2.length() && length == str1.length()) {
			System.out.println("it is a Anagram");
		} else {
			System.out.println("Not a Anagram");
		}

	}

}
