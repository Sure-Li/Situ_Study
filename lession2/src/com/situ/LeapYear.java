package com.situ;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		System.out.println("请输入一个年份来判断是闰年");
		try (Scanner sc = new Scanner(System.in)) {
			year = sc.nextInt();
		}
		if(year>0)
		{
			if ((0 == year % 4) && (0 != year % 100) && (0 == year % 400)) {
				System.out.println(year+"为闰年");
			} else {
				if (0 != year % 4) {
					System.out.println(year+"不能被4整除，所以不是闰年");
				}
				if (0 == year % 100) {
					System.out.println(year+"能被100整除，所以不是闰年");
				}
				if (0 != year % 400) {
					System.out.println(year+"不能被400整除，所以不是闰年");
				}
			}
		}else
		{
			System.out.println("请输入正确的年份");
		}
	}

}
