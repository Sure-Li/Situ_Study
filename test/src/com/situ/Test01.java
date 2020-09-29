package com.situ;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要比较的第一个数");
		int numFirst = sc.nextInt();
		System.out.println("请输入要比较的第二个数");
		int numSecond = sc.nextInt();
		int numResult = (numFirst > numSecond) ? numFirst : numSecond;
		System.out.println("最大的数为：" + numResult);
		sc.close();
	}

}
