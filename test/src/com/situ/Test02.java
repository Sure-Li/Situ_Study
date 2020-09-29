package com.situ;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score = sc.nextInt();
		if ((score < 0) || (score > 100)) {
			System.out.println("输入成绩格式不正确，请重新输入");
			score = sc.nextInt();
		}
		if (score >= 90) {
			System.out.println("成绩等级为 A");
		} else if ((score >= 80) && (score < 90)) {
			System.out.println("成绩等级为 B");
		} else if ((score >= 70) && (score < 80)) {
			System.out.println("成绩等级为 C");
		} else if ((score >= 60) && (score < 70)) {
			System.out.println("成绩等级为 D");
		} else {
			System.out.println("成绩等级为 E\n您的成绩不合格");
		}
		sc.close();
	}

}
