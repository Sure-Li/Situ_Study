package com.situ;

import java.util.Calendar;

public class SimpleDate {
	public static int year;
	public static int month;
	public static int day;

	private static String bulidString() {
		return year + "年" + month + "月" + day + "日";
	}

	private static String nextDay() {
		Calendar caNext = Calendar.getInstance();
		caNext.add(Calendar.DAY_OF_MONTH, 1);
		day = caNext.get(Calendar.DAY_OF_MONTH);
		return year + "年" + month + "月" + day + "日";
	}

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		year = ca.get(Calendar.YEAR);
		month = ca.get(Calendar.MONTH) + 1;
		day = ca.get(Calendar.DAY_OF_MONTH);
		System.out.println(bulidString());
		System.out.println(nextDay());
	}
}
