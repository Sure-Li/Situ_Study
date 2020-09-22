package com.situ;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//		System.out.println(a > b && b > a);
		int num;
		System.out.println("请输入一个数字来判断是否可以被3，5，17整除");
		try (Scanner sc = new Scanner(System.in)) {
			num = sc.nextInt();
		}
		if ((0 == num % 3) && (0 == num % 5) && (0 == num % 17)) {
			System.out.println("可以被 3，5，17整除");
		} else {
			if (0 != num % 3) {
				System.out.println("不能被3整除");
			}
			if (0 != num % 5) {
				System.out.println("不能被5整除");
			}
			if (0 != num % 17) {
				System.out.println("不能被17整除");
			}
		}
	}
}
