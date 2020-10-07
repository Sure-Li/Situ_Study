package com.test;

import java.util.Random;

public class ArrayMaxMin {

	public static void main(String[] args) {
		Random random = new Random();
		int[] Array = new int[10];
		for (int i = 0; i < Array.length; i++) {
			Array[i] = random.nextInt();
		}
		int max = Array[0];
		int min = Array[0];
		for (int i : Array) {
			if (i > max) {
				max = i;
			}
			if (min > i) {
				min = i;
			}
		}
		System.out.println("最大值为：" + max);
		System.out.println("最小值为：" + min);

	}

}
