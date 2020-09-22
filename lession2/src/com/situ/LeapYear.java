package com.situ;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		System.out.println("请输入一个年份来判断是闰年");
		try (Scanner sc = new Scanner(System.in)) {
			year = sc.nextInt();
		}
		if (year > 0) {
			if (((0 == year % 4) && (0 != year % 100)) || (0 == year % 400)) {
				System.out.print(year + "为闰年");
				if (0 == year % 400) {
					System.out.println(",且为世纪闰年");
				} else {

					System.out.println(",且为普通闰年");
				}
			} else {
				System.out.println("不是闰年");
				if (0 != year % 4) {
					System.out.println(year + "不能被4整除");
				}
				if (0 == year % 100) {
					System.out.println(year + "能被100整除");
				}
				if (0 != year % 400) {
					System.out.println(year + "不能被400整除");
				}
			}
		} else {
			System.out.println("请输入正确的年份");
		}   
//		if (year % 4 == 0) {
//            if (year % 100 != 0) {
//                System.out.println("闰年");
//            } else {
//                if (year % 400 == 0) {
//                    System.out.println("闰年");
//                } else {
//                    System.out.println("平年");
//                }
//            }
//        } else {
//            System.out.println("平年");
//        }
	}

}
