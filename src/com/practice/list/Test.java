package com.practice.list;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		
		
		

		String content = "<p>Test mail</p>";

		System.out.println(content.substring(3, content.length() - 4));

		System.out.println(String.format("RRULE:FREQ=%s;RRULE:FREQ=%s", "daily", "vema"));
		
		List<String> list = new ArrayList<String>();
		
		list.add("vishal");
		
		

		StringBuilder str = new StringBuilder();

		str.append("BEGIN:VCALENDAR");
		str.append("PRODID: Asset View 2.0");
		str.append("METHOD:REQUEST");
		str.append("BEGIN:VEVENT");

		System.out.println(str);
		  
        System.out.println("DTSTAMP:" + extracted("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'",0));
        System.out.println("DTSTAMP 2:" + extracted("yyyy-MM-dd",1));
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmssSSS");
        System.out.println(LocalDateTime.now().format(format).toString());
        System.out.println("vishal"+"\nvikas");
        
        int array [] = {1,2,3,4,5};
        System.out.println(Arrays.stream(array).boxed().collect(Collectors.toList()).stream().map(String::valueOf)
        	    .collect(Collectors.joining(",")));
        byte[] decodedBytes = Base64.getDecoder().decode("ewoibmFtZSI6InZpc2hhbCIsCiJhZ2UiOjI1LAoiZW1haSI6InZpc2hhbHBhbGxhMjdAZ21haWwuY29tIiwKInJvbGUiOiJhZG1pbiIKfQ==");
        String decodedString = new String(decodedBytes);
        System.out.println(decodedString.toString());
        
        
        
	}
	
	private static String extracted(String formatType, int days) {
		LocalDateTime now = LocalDateTime.now().plusDays(days);;  
        DateTimeFormatter format = DateTimeFormatter.ofPattern(formatType);  
        return now.format(format);
	}
	
//	@Getter
//	private enum RecurringFrequencyEnum{
//		        Daily(1),
//		        Weekly (2),
//		        Biweekly(3),
//		        Monthly (4),
//		        Quarterly (5),
//		        Semiyearly (6),
//		        Yearly (7)
//	}

}
