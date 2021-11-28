package com.interview.parctice_1;

import java.util.*;

class Solution {
	 static boolean flag = false;
	 static int B;
	 static int H;

	static {
		
		Scanner sc = new Scanner(System.in);
		
		B = sc.nextInt();
		H = sc.nextInt();
		
		if((-100<=B && B<=100) && (-100<=H && H<=100)) {
			if(B<=0 ||H<=0 || B*H <=0) {
				System.out.println("java.lang.Exception: Breadth and height must be positive");
			}else if(B<=100 && H<=100){
				flag = true;
			}
		}

		

	}
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}
}
