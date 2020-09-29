package com.situ;

import java.util.Scanner;

public class Royalty {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入绩效");
		double Performance = sc.nextFloat();
		sc.close();
		double result = 0;
		if (Performance <= 10) {
			result = Performance * 0.1;
		} else if ((Performance > 10) && (Performance <= 20)) {
			result = 10 * 0.1 + (Performance - 10) * 0.075;
		} else if ((Performance > 20) && (Performance <= 40)) {
			result = 10 * 0.1 + 10 * 0.075 + (Performance - 20) * 0.05;
		} else if ((Performance > 40) && (Performance <= 60)) {
			result = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + (Performance - 40) * 0.03;
		} else if ((Performance > 60) && (Performance <= 100)) {
			result = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + (Performance - 60) * 0.015;
		} else if ((Performance > 100)) {
			result = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 40 * 0.015 + (Performance - 100) * 0.01;
		}
		System.out.println("提成为：" + result + "万元");
	}

}
