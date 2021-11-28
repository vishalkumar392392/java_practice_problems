package com.interview.parctice_1;

public class Test {
	
	public static void main(String[] args) {
		
		String s = "10101";
		 int ans = 0, prev = 0, cur = 1;
	        for (int i = 1; i < s.length(); i++) {
	            if (s.charAt(i-1) != s.charAt(i)) {
	                ans += Math.min(prev, cur);
	                prev = cur;
	                cur = 1;
	            } else {
	                cur++;
	            }
	        }
	        System.out.println( ans + Math.min(prev, cur));
	    }

}
