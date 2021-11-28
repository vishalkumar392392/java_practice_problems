package com.practice.list;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;



public class TimeZonePractice {

	private static String baseTimezone = "Asia/Kolkata";
	private static String targetTimezone = "America/New_York";
	public static void main(String[] args) throws Exception {
		
		 String DATE_FORMAT = "dd-M-yyyy hh:mm:ss a";
		 String TARGET_FORMAT = "yyyy-M-dd hh:mm:ss a";

			System.out.println(convert(baseTimezone, targetTimezone, DATE_FORMAT, TARGET_FORMAT, LocalTime.now()));

			ZoneOffset offset  = ZonedDateTime.now().getOffset();
			System.out.println(offset);
			ZoneId here = ZoneId.of("Asia/Kolkata");
			ZonedDateTime hereAndNow = Instant.now().atZone(here);
			String.format("%tz", hereAndNow);
			
			Date date = new Date();
			
			System.out.println(date.getTimezoneOffset()*(-1));
		     TimeZone tz = TimeZone.getDefault();

			 String[] availableIDs = TimeZone.getAvailableIDs(330);
		     for(int i = 0; i < availableIDs.length; i++) {
		       System.out.println(availableIDs[i]);
		     }

		     
		     ZoneId zone = ZoneId.systemDefault(); //It will give current System's timezone (IST for you)
		     Date date1 = new Date(); // Any date

		     DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS Z", Locale.ENGLISH);

		     ZonedDateTime zonedTime = ZonedDateTime.ofInstant(date1.toInstant(), zone);

		     System.out.println(zonedTime.format(formatter));
		     TimeZone timezone = TimeZone.getTimeZone("300");

		     System.out.println(timezone);
		     
		     
		     String signature = "<p>test man</p>";
		     System.out.println(signature.replaceAll("\\<.*?\\>", ""));
		     
		     LocalDateTime now = LocalDateTime.now().plusDays(0);
				DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss'Z'");
				System.out.println(now.format(format));
		       System.out.println("20051208T053000Z");
		       System.out.println(LocalDateTime.now().format(format));
		       System.out.println(Instant.now().toString() );

		       System.out.println(LocalDateTime.now().format(format));
		       System.out.println(LocalDateTime.now(ZoneOffset.UTC).format(format));
		       
		       final LocalDateTime nowdq = LocalDateTime.now();
		       System.out.println(nowdq.format(format));
		      System.out.println( nowdq.atZone(ZoneId.systemDefault()).withZoneSameInstant(ZoneOffset.UTC).toLocalDateTime().format(format));

		      String st = "  ";
		      String st1 = "name";
		      System.out.println(st.trim());
		      System.out.println(st1.trim());
	}
	
	@SuppressWarnings("static-access")
	public static String convert(String baseTimezone, String targetTimezone, String baseFormat, String targetFormat,
			LocalTime dateTime) throws Exception {

		ZoneId targetTimezoneId = ZoneId.of(targetTimezone);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss a");

		return format.format(dateTime.now(targetTimezoneId));
	}
}
