package com.situ;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请按照下列提示选择您需要的功能：");
			System.out.println("1.开卡    2.查询余额    3.转账    0.退出");
			int chooseNum = sc.nextInt();
			switch (chooseNum) {
			case 1:
				System.out.println("开卡成功");
				break;
			case 2:
				System.out.println("余额500元");
				break;
			case 3:
				System.out.println("请输入转入账户");
				sc.nextInt();
				System.out.println("请输入金额");
				sc.nextInt();
				System.out.println("转账成功");
				break;
			case 0:
				System.out.println("退出成功");
				break;
			default:
				System.out.println("选择错误");
				break;
			}
			if (0 == chooseNum) {
				break;
			}
		}
		sc.close();
	}

}
