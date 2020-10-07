package com.test;

import java.util.Random;

public class ArrayOneToNine {

	public static void main(String[] args) {
		int[] a = new int[10];
		int oddNumber = 0;
		int evenNumber = 0;
		Random random = new Random();
		int[] Array = new int[50];
		//进行数组初始化赋值
		for (int i = 0; i < Array.length; i++) {
			Array[i] = random.nextInt(9);
		}
		System.out.print("随机数为：" );
		//遍历数组
		for (int i : Array) {
			//若遇到数组的值==j（j从0-9）
			for (int j = 0; j < a.length; j++) {
				if (j == i) {
					a[i]++;
				}
			}
			//判断奇偶数
			if (0 == i % 2) {
				evenNumber++;
			} else {
				oddNumber++;
			}
			//遍历一片所有的随机数 用于结果校验
			System.out.print(" " + i);
		}
		System.out.println();
		//遍历a[] 输出结果
		for (int k = 0; k < a.length; k++) {
			if (a[k] > 0) {
				System.out.println(k + "出现过" + a[k] + "次");
			}
		}
		System.out.println("奇数个数为："+oddNumber);
		System.out.println("偶数个数为："+evenNumber);
	}

}
