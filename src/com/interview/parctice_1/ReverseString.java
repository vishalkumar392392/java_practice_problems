package com.interview.parctice_1;

public class ReverseString {

	public static void main(String[] args) {

		String name = "vishal palla";
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev += name.charAt(i);
		}
		System.out.println(rev);
		
		String array[] = name.split(" ");
		String word = "";
		for(int i = 0; i<array.length;i++) {
			for (int j = array[i].length() - 1; j >= 0; j--) {
				word += array[i].charAt(j);
			}
			word+= " ";
		}
		System.out.println(word);

	}
}
