package com.practice.list;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Set;

public class TimezoneConversionUtil {

	private static String baseTimezone = "Asia/Kolkata";
	private static String targetTimezone = "America/New_York";
	private static final String DATE_FORMAT = "dd-M-yyyy hh:mm:ss a";
	private static final String TARGET_FORMAT = "dd-M-yyyy hh:mm:ss a";
	
	private static final String DEFAULT_BASE_FORMAT = "MM-yyyy-dd'T'HH:mm:ss.SSS'Z'";


	public static void main(String[] args) throws Exception {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
		LocalDateTime now = LocalDateTime.now();
		String dateTimeString = now.format(formatter);

//		System.out.println(dateTimeString);

		System.out.println(convert(baseTimezone, targetTimezone, DATE_FORMAT, null, dateTimeString));
		System.out.println(convert(baseTimezone, targetTimezone, null, null, now));
		System.out.println(convert(baseTimezone, targetTimezone, null, null, LocalTime.now()));


	}

	/**
	   * This method is used to give the converted 
	   * DATETIME for a specific zone
	   * @param baseTimezone: current time zone
	   * @param targetTimezone: time zone in which you want the time 
	   * @param baseFormat:current date time format
	   * @param targetFormat:target date time format
	   * @param dateTime: instance of LocalDateTime
	   * @throws Exception On Input error
	   * @return String which is converted zone time.
	   */
	public static String convert(String baseTimezone, String targetTimezone, String baseFormat, String targetFormat,
			String dateTime) throws Exception {

		validateParameters(baseTimezone, targetTimezone, baseFormat, targetFormat, dateTime);
		if (!validateZone(baseTimezone) || !validateZone(targetTimezone)) {
			throw new Exception("Please check the timezones: " + baseTimezone + " , " + targetTimezone);
		}
		if (Objects.isNull(baseFormat) || baseFormat.isEmpty()) {

			baseFormat = DEFAULT_BASE_FORMAT;
		}
		if (Objects.isNull(targetFormat) || targetFormat.isEmpty() ) {

			targetFormat = baseFormat;	
		}
		LocalDateTime ldt = null;
		try {
			ldt = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern(baseFormat));

		} catch (Exception e) {
			throw new Exception("Please provide the correct/matching baseFormat and dateTime");
		}
		ZoneId baseTimezoneId = ZoneId.of(baseTimezone);
		ZonedDateTime baseZonedDateTime = ldt.atZone(baseTimezoneId);

		ZoneId targetTimezoneId = ZoneId.of(targetTimezone);
		ZonedDateTime targetZonedDateTime = baseZonedDateTime.withZoneSameInstant(targetTimezoneId);

		DateTimeFormatter format = DateTimeFormatter.ofPattern(targetFormat);

		return format.format(targetZonedDateTime);
	}

	/**
	   * This method is used to give the converted 
	   * DATETIME for a specific zone
	   * @param baseTimezone: current time zone
	   * @param targetTimezone: time zone in which you want the time 
	   * @param baseFormat:current date time format
	   * @param targetFormat:target date time format
	   * @param dateTime: instance of LocalDateTime
	   * @throws Exception On Input error
	   * @return String which is converted zone time.
	   */
	public static String convert(String baseTimezone, String targetTimezone, String baseFormat, String targetFormat,
			LocalDateTime dateTime) throws Exception {

		validateParameters(baseTimezone, targetTimezone, baseFormat, targetFormat, dateTime);

		if (!validateZone(baseTimezone) || !validateZone(targetTimezone)) {
			throw new Exception("Please check the timezones: " + baseTimezone + " , " + targetTimezone);

		}
		if (Objects.isNull(baseFormat) || baseFormat.isEmpty()) {

			baseFormat = DEFAULT_BASE_FORMAT;
		}
		if (Objects.isNull(targetFormat) || targetFormat.isEmpty() ) {

			targetFormat = baseFormat;	
		}
		ZoneId baseTimezoneId = ZoneId.of(baseTimezone);
		ZonedDateTime baseZonedDateTime = dateTime.atZone(baseTimezoneId);

		ZoneId targetTimezoneId = ZoneId.of(targetTimezone);
		ZonedDateTime targetZonedDateTime = baseZonedDateTime.withZoneSameInstant(targetTimezoneId);

		DateTimeFormatter format = DateTimeFormatter.ofPattern(targetFormat);

		return format.format(targetZonedDateTime);
	}
	
	/**
	   * This method is used to give the TIME for a specific zone
	   * @param baseTimezone: Not mandatory
	   * @param targetTimezone: time zone in which you want the time 
	   * @param baseFormat:Not mandatory
	   * @param targetFormat:Not mandatory
	   * @param dateTime: instance of LocalTime
	   * @throws Exception On Input error
	   * @return String which is converted zone time.
	   */
	@SuppressWarnings("static-access")
	public static String convert(String baseTimezone, String targetTimezone, String baseFormat, String targetFormat,
			LocalTime dateTime) throws Exception {

		if(Objects.isNull(targetTimezone) || Objects.isNull(dateTime)) {
			throw new Exception("targetTimezone,dateTime can't be null");
		}
		ZoneId targetTimezoneId = ZoneId.of(targetTimezone);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss a");

		return format.format(dateTime.now(targetTimezoneId));
	}

	/** This method validates the zone which is available or not
	 * @param String zone
	 * @return boolean */
	private static boolean validateZone(String zone) {

		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		for (String id : zoneIds) {
			if (zone.equalsIgnoreCase(id)) {
				return true;
			}
		}
		return false;

	}
	
	/** This method validates the IN params
	 * @param String  */
	private static void validateParameters(String baseTimezone, String targetTimezone, String baseFormat,
			String targetFormat, Object dateTime) throws Exception {

		if (Objects.isNull(baseTimezone)) {
			throw new Exception("basetimezone can't be null");
		}
		if (Objects.isNull(targetTimezone)) {
			throw new Exception("targetTimezone can't be null");
		}
		
		if (Objects.isNull(dateTime)) {
			throw new Exception("dateTime can't be null");
		}
	}


}
