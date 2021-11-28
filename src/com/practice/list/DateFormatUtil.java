package com.practice.list;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

public class DateFormatUtil {

	public static final String DEFAULT_TARGET = "dd/MM/yyyy";
	
	public static void main(String[] args) {
		Date date = new Date();
		LocalDate localdate = LocalDate.now();
//		System.out.println(convertDateFormat("dd/MM/yyyy", "MM-yyyy-dd", date));
//		System.out.println(convertDateFormat("dd-MM-yyyy", "MM-dd-yyyy", "29-09-2020"));
		System.out.println(convertDateFormat("dd-MM-yyyy", "MM/dd/yyyy", localdate));

	}

	public static Object convertDateFormat(String baseFormat, String targetFormat, Date date) {

		if ((Objects.nonNull(baseFormat) && !baseFormat.isEmpty()) &&
				(Objects.nonNull(targetFormat) && !targetFormat.isEmpty()) && Objects.nonNull(date)) {

			if (validate(targetFormat.replace('m', 'M'))) {
				SimpleDateFormat ft = new SimpleDateFormat(targetFormat);

				return ft.format(date);
			}
			else {
				SimpleDateFormat ft = new SimpleDateFormat(DEFAULT_TARGET);

				return ft.format(date);
			}
				

		}

		return null;

	}

	public static Object convertDateFormat(String baseFormat, String targetFormat, String date) {

		if ((Objects.nonNull(baseFormat) && !baseFormat.isEmpty()) &&
				(Objects.nonNull(targetFormat) && !targetFormat.isEmpty())
				&& Objects.nonNull(date)) {
			if (validate(targetFormat.replace('m', 'M')) && validate(baseFormat.replace('m', 'M')) ) {
				DateFormat df = new SimpleDateFormat(baseFormat.replace('m', 'M'));
				Date startDate;
				try {
					startDate = df.parse(date);
					SimpleDateFormat ft = new SimpleDateFormat(targetFormat);
					return ft.format(startDate);

				} catch (ParseException e) {
					return date;
				}
			}else {
				return date;
			}

		}
		return null;
	}

	public static Object convertDateFormat(String baseFormat, String targetFormat, LocalDate date) {

		if ((Objects.nonNull(baseFormat) && !baseFormat.isEmpty()) &&
				(Objects.nonNull(targetFormat) && !targetFormat.isEmpty())
				&& Objects.nonNull(date)) {
			if (validate(targetFormat.replace('m', 'M'))) {
				return date.format(DateTimeFormatter.ofPattern(targetFormat));
			}
			else {
				return date.format(DateTimeFormatter.ofPattern(DEFAULT_TARGET));

			}

		}
		return null;
	}

	private static boolean validate(String target) {

		if (target.equalsIgnoreCase("dd/MM/yyyy") || target.equalsIgnoreCase("dd/yyyy/MM")
				|| target.equalsIgnoreCase("yyyy/MM/dd") || target.equalsIgnoreCase("MM/dd/yyyy")
				|| target.equalsIgnoreCase("MM/yyyy/dd") || target.equalsIgnoreCase("yyyy/dd/MM")
				|| target.equalsIgnoreCase("yyyy-dd-MM") || target.equalsIgnoreCase("dd-MM-yyyy")
				|| target.equalsIgnoreCase("dd-yyyy-MM") || target.equalsIgnoreCase("yyyy-MM-dd")
				|| target.equalsIgnoreCase("MM-dd-yyyy") || target.equalsIgnoreCase("MM-yyyy-dd")
				|| target.equalsIgnoreCase("MM.dd.yyyy") || target.equalsIgnoreCase("MM.yyyy.dd")
				|| target.equalsIgnoreCase("dd.MM.yyyy") || target.equalsIgnoreCase("dd.yyyy.MM")
				|| target.equalsIgnoreCase("yyyy.dd.MM") || target.equalsIgnoreCase("yyyy.MM.DD")) {
			return true;
		} else
			return false;
	}

}
