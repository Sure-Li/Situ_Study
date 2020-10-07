package com.situ;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		int numGuessMax = 100, numGuessMin = 0;
		int num = new Random().nextInt(100);
		System.out.println("请输入0-100进行猜数");
		Scanner sc = new Scanner(System.in);
		int numGuess;
		while (true) {
			numGuess = sc.nextInt();
			if (numGuess > num) {
				System.out.println("这个数大于正确答案");
				if (numGuess < numGuessMax) {
					numGuessMax = numGuess;
				}
				System.out.println("要猜的数处于" + numGuessMin + "与" + numGuessMax + "之间");
			} else if (numGuess < num) {
				System.out.println("这个是小于正确答案");
				if (numGuess > numGuessMin) {
					numGuessMin = numGuess;
				}
				System.out.println("要猜的数处于" + numGuessMin + "与" + numGuessMax + "之间");
			}
//			numGuess = sc.nextInt();
			if (numGuess == num) {
				System.out.println("这就是正确答案，正确答案为：" + num);
				break;
			}
		}
		sc.close();
	}
}
