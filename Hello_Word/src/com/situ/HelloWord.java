package com.situ;

import java.util.Scanner;

public class HelloWord {

	public static void main(String[] args) {
//		System.out.println("hello word");
//		System.out.println("hello word");
//		int a = 10;
//		int b = 20;
//		System.out.println(a + b);
//		System.out.println(a - b);
//		System.out.println(a * b);
//		System.out.println(a / b);
//		System.out.println(a % b);
//		for (int j = 1; j <= 10; j++) {
//			System.out.println(j);
//		}
////		双精度浮点型
//		double a1 = 2.0;
//		double a2 = 1.1;
//		double a3 = 2.1;
//		System.out.print(a2 - a1+"\n\t");
//		System.out.print(a2 - a3); 
		System.out.println("请输入金字塔层数");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = (i * 2 + 1); k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = num; i >= 0; i--) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = (i * 2 + 1); k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
