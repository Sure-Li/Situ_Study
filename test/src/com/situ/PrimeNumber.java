package com.situ;

public class PrimeNumber {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 101; i <= 200; i++) {

			for (int j = 1; j < i; j++) {
				if (0 == i % j) {
					count++;
				}
			}
			if (count <= 2) {
				System.out.println(i + "是素数");
			}
			count = 0;
		}
	}

}
