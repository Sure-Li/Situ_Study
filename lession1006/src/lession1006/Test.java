package lession1006;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Arithmetic ar = new Arithmetic();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入左操作数");
		int numA = sc.nextInt();
		System.out.println("请输入右操作数");
		int numB = sc.nextInt();
		System.out.println("请输入符号");
		String symbol = sc.next();
		System.out.println(ar.numHandle(numA, numB,symbol));
		sc.close();
	}
}
