package com.practice.list;

import java.time.LocalDateTime;
import java.util.Date;

public class Test2 {
	

	public static void main(String[] args) {
		
		
		System.out.println(firstNonRepeatingCharacter("vvishal"));
		System.out.println(new Date().toLocaleString());
	}
	
	
	public static String firstNonRepeatingCharacter(String input){
		
		int temp = 0;
		for(int i = 0; i<input.length();i++){
			for(int j = 0; j<input.length();j++){
				if(i!=j && input.charAt(i)==input.charAt(j)){
					temp = 1;
				}
			}
			if(temp == 0){
				return ""+input.charAt(i);
			}
			temp = 0;
		}
		
		return "" ;
	}
}


