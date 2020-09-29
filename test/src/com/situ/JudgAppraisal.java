package com.situ;

import java.util.Scanner;

public class JudgAppraisal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入裁判的人数");
		int judgeNum = sc.nextInt();
		float scoreMax = 0f;
		float scoreMin = 100f;
		float scoreSum = 0f;
		float temporaryNum = 0f;
		for (int i = 0; i < judgeNum; i++) {
			System.out.println("请输入成绩");
			temporaryNum = sc.nextInt();
			if (temporaryNum > scoreMax) {
				scoreMax = temporaryNum;
			}
			if (temporaryNum < scoreMin) {
				scoreMin = temporaryNum;
			}
			scoreSum += temporaryNum;
		}
		scoreSum = (scoreSum - scoreMax - scoreMin) / (judgeNum - 2);
		System.out.println("此位选手的成绩为：" + scoreSum);
		sc.close();
	}

}
