package com.interview.parctice_1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		int j = 0;
		int count = 0;

		String str1 = "ABCDE";
		String str2 = "CDE";

		for (int i = 0; i < str2.length(); i++) {
			
			for(;j<str1.length(); j++) {
				if(Character.compare(str2.charAt(i), str1.charAt(j))==0) {
					count++;
					break;
				}
			}
		}
		if(count == str2.length()) {
			System.out.println("Yes");
		}else {
			System.out.println("False");
		}
	}

}
