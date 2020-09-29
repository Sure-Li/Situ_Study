package com.situ;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数用来计算它的阶乘");
		int factorialNum = sc.nextInt();
		long result = 1L;
		sc.close();
		for (int i = 1; i <= factorialNum; i++) {
			result *= i;
		}
		System.out.println("结果为： "+result);
	}
}
