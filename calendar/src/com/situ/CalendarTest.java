package com.situ;

import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		
//		  Calendar calendar = Calendar.getInstance(); 
//		  calendar.set(Calendar.YEAR,2018);//可以在此处对calendar中的属性赋值 /
//		  calendar.add(Calendar.DAY_OF_MONTH, 11);
//		  int year = calendar.get(Calendar.YEAR); System.out.println(year); 
//		  int month = calendar.get(Calendar.MONTH) + 1; 
//		  System.out.println(month);// 月份 0-11 
//		  int day = calendar.get(Calendar.DAY_OF_MONTH); System.out.println(day); 
//		  int hour = calendar.get(Calendar.HOUR_OF_DAY); System.out.println(hour); 
//		  int minute = calendar.get(Calendar.MINUTE); System.out.println(minute); 
//		  int second = calendar.get(Calendar.SECOND); System.out.println(second);
//		  System.out.println("------------");
//		  System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
//		  System.out.println(calendar.get(Calendar.DAY_OF_WEEK));//周天到周六 1-7
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个年份来判断此年是否有黑色星期五：");
		int year = sc.nextInt();
		for (int i = 0; i < 12; i++) {
			Calendar calendar = Calendar.getInstance();
			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.MONTH, i);
//			System.out.println(calendar.get(Calendar.MONTH));
			calendar.set(Calendar.DAY_OF_MONTH, 13);
			if (6 == calendar.get(Calendar.DAY_OF_WEEK)) {
				System.out.println(year + "年" + (i+1) + "月13日" + "为黑色星期五");
//				System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
			}
		}
	}
}
