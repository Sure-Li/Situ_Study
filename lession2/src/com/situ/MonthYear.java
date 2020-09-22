package com.situ;

import java.util.Scanner;

public class MonthYear {
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 != 0) {
				return true;
			} else {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			}
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int year = 0;
		int month = 0;
		int day = 0;
		System.out.println("请输入年份");
		try (Scanner sc = new Scanner(System.in)) {
			year = sc.nextInt();
			System.out.println("请输入月份");
			month = sc.nextInt();
		}
		if ((0 == year) || (0 == month)) {
			System.out.println("输入错误");

		} else {
			if (2 == month) {
				if (isLeapYear(year)) {
					day = 29;
				} else {
					day = 28;
				}
			} else {
				switch (month) {
				case 1:
					day = 31;
					break;
				case 3:
					day = 31;
					break;
				case 4:
					day = 30;
					break;
				case 5:
					day = 31;
					break;
				case 6:
					day = 30;
					break;
				case 7:
					day = 31;
					break;
				case 8:
					day = 31;
					break;
				case 9:
					day = 30;
					break;
				case 10:
					day = 31;
					break;
				case 11:
					day = 30;
					break;
				case 12:
					day = 31;
					break;
				}
			}
			System.out.println(year + "年" + month + "月有" + day + "天");
		}

	}

}
