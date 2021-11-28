package com.practice.list;

import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;



public class ListComparing {
	
	public static void main(String[] args) {
		
		
		List <String> listOne = new ArrayList<>
		                             (Arrays.asList("Americas", "asap"));
		
		List <String> listTwo = new ArrayList<>
                                      (Arrays.asList("indians", "asap"));
		
		Collections.sort(listOne);
		Collections.sort(listTwo);
		
		System.out.println(listOne.equals(listTwo));
		
		
		int array[] = new int[6];
		for(int i= 0;i<array.length;i++) {
			array[i]= i;
		}
		for(int i= 0;i<array.length;i++) {

		System.out.println(array[i]);
		}
		
		List <Integer> result = new ArrayList<>
        (Arrays.asList(1, 2,3,4,5,6));
		String finalResult= "";
		for(int i= 0;i<array.length;i++) {

			finalResult =finalResult+array[i]+",";
		}
		System.out.println(finalResult.substring(0, finalResult.length()-1));
		
		
//		String res = "US\\1.Aaron.Marchiafava@cbre.com";
//		 System.out.println(res.split("\\"));

		 byte[] encodedBytes = Base64.getEncoder().encode("Test".getBytes());
		 System.out.println("encodedBytes " + new String(encodedBytes));
		 byte[] decodedBytes = Base64.getDecoder().decode(encodedBytes);
		 System.out.println("decodedBytes " + new String(decodedBytes));
		 
		 String helper = "https://pulse-storage-dev.s3.amazonaws.com/Contacts/1589278559613/0888-learning-mysql.pdf";
		 String []arrayres = helper.split("/");
		 String fin =  arrayres[arrayres.length-1];
		        System.out.println(fin);
		        
		        if(helper.contains("https://pulse-storage-dev.s3.amazonaws.com")){
		        	
		        	int a ="https://pulse-storage-dev.s3.amazonaws.com".length();
		        	System.out.println("================");
		        	System.out.println(helper.substring(++a, helper.length()));
		        }
		System.out.println(helper.indexOf("/", 3));
		
		
	}

}
