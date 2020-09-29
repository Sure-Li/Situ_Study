package com.situ;

import java.util.Scanner;

public class PrintRectangular {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行数");
		int row = sc.nextInt();
		System.out.println("请输入列数");
		int col = sc.nextInt();
		sc.close();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
