package com.situ;

public class Test04 {
	public static void main(String[] args) {
		/*
		 * int sum = 1; for (int i = 1; i <= 10; i++) { sum *= i; }
		 * System.out.println("1...10累乘和为：" + sum); for (int i = 0; i < 26; i++) {
		 * System.out.print((char) (65 + i)); if (0 == i % 5) { System.out.println(); }
		 * } long a = 10L; int b = 7; long c = a + b; System.out.println(10 + 5 * 6 +
		 * "a" + (30 + 6));
		 */
		for (int i = 1; (i <= 10); i++) {
			if (1 == i % 2) {
				System.out.print(i + " ");
			}
		}

	}

}
