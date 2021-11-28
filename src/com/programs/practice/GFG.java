package com.programs.practice;

import java.util.Arrays;
import java.util.Scanner;

class GFG {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);

		String s = sr.next();
		int k = 2;
		int n = s.length();
		// new change start
		if (n <= 0 || n > 30) {
			System.out.println("Invalid String");
		}
		// new change end
		int freq[] = new int[256];
		int index[] = new int[256];
		for (int i = 0; i < 256; i++) {
			freq[i] = 0;
			index[i] = n;
		}
		for (int i = 0; i < n; i++) {
			freq[s.charAt(i)]++;
			if (freq[s.charAt(i)] == 1) {
				index[s.charAt(i)] = i;
			}
			if (freq[s.charAt(i)] == 2) {
				index[s.charAt(i)] = n;
			}
		}
		Arrays.sort(index);
		if (index[k - 1] != n) {
			System.out.println(s.toCharArray()[index[k - 1]]);
		} else {
			// new change start
			System.out.println("Invalid String");
			// new change end
		}
	}
}