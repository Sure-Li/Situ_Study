package com.situ;

public class ThreeInt {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			if ((1 == i % 2) && (i % 3 != 0)) {
				sum += i;
			}
		}
		System.out.println("和为："+sum);
	}

}
