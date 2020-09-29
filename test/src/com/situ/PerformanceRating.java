package com.situ;

import java.util.Scanner;

public class PerformanceRating {
	public static String getLevel(int score) {
		String level = null;
		if(score >= 90)
		{
			level = "A";
		}else if((score>= 60)&&(score <=89))
		{
			level = "B";
		}else if(score<60)
		{
			level = "C";
		}
		return level;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩进行评级");
		System.out.println("您的成绩为："+getLevel(sc.nextInt()));
		sc.close();
	}
}
