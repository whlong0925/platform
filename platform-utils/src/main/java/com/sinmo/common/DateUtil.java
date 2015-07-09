package com.sinmo.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUtil {
	private static Calendar calender = Calendar.getInstance();
	private static final String DATE_FORMAT = "yyyy-MM-dd";
	private static final String HOUR_FORMAT = "HH:mm:ss";
	private static final String DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	private static SimpleDateFormat sdf_date_format = new SimpleDateFormat(DATE_FORMAT);
	private static SimpleDateFormat sdf_hour_format = new SimpleDateFormat(HOUR_FORMAT);
	private static SimpleDateFormat sdf_datetime_format = new SimpleDateFormat(DATETIME_FORMAT);

	/**
	 * 获得服务器当前日期及时间，以格式为：yyyy-MM-dd HH:mm:ss的日期字符串形式返回
	 */
	public static String getDateTime() {
		return sdf_datetime_format.format(calender.getTime());
	}

	/**
	 * 获得服务器当前日期，以格式为：yyyy-MM-dd的日期字符串形式返回
	 */
	public static String getDate() {
		return sdf_date_format.format(calender.getTime());
	}

	/**
	 * 获得服务器当前时间，以格式为：HH:mm:ss的日期字符串形式返回
	 */
	public static String getTime() {
		return sdf_hour_format.format(calender.getTime());
	}

	/**
	 * 获得服务器当前日期的年份
	 */
	public static String getYear() {
		return String.valueOf(calender.get(Calendar.YEAR));
	}

	/**
	 * 获得服务器当前日期的月份
	 */
	public static String getMonth() {
		java.text.DecimalFormat df = new java.text.DecimalFormat();
		df.applyPattern("00;00");
		return df.format((calender.get(Calendar.MONTH) + 1));
	}

	/**
	 * 获得服务器在当前月中天数
	 */
	public static String getDay() {
		return String.valueOf(calender.get(Calendar.DAY_OF_MONTH));
	}

	/**
	 * 返回日期加X天后的日期
	 */
	public static String addDay(String date, int i) {
		GregorianCalendar gCal = new GregorianCalendar(Integer.parseInt(date.substring(0, 4)), Integer.parseInt(date.substring(5, 7)) - 1, Integer.parseInt(date.substring(8, 10)));
		gCal.add(Calendar.DATE, i);
		return sdf_date_format.format(gCal.getTime());
	}

	/**
	 * 返回日期加X月后的日期
	 */
	public static String addMonth(String date, int i) {
		GregorianCalendar gCal = new GregorianCalendar(Integer.parseInt(date.substring(0, 4)), Integer.parseInt(date.substring(5, 7)) - 1, Integer.parseInt(date.substring(8, 10)));
		gCal.add(Calendar.MONTH, i);
		return sdf_date_format.format(gCal.getTime());
	}

	/**
	 * 返回日期加X年后的日期
	 */
	public static String addYear(String date, int i) {
		GregorianCalendar gCal = new GregorianCalendar(Integer.parseInt(date.substring(0, 4)), Integer.parseInt(date.substring(5, 7)) - 1, Integer.parseInt(date.substring(8, 10)));
		gCal.add(Calendar.YEAR, i);
		return sdf_date_format.format(gCal.getTime());
	}
}
