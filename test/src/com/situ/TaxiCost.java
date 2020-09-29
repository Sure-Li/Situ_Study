package com.situ;

import java.util.Scanner;

public class TaxiCost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入公里数，用来计算那辆车更便宜");
		float kiloMeter = sc.nextFloat();
		sc.close();
		float taxi1 = kiloMeter * 2f + 10f;
		float taxi2 = kiloMeter * 2.2f + 8f;
		if (taxi1 > taxi2) {
			System.out.println("坐第二辆出租车便宜");
		} else if (taxi1 < taxi2) {
			System.out.println("做第一辆出租车便宜");
		} else {
			System.out.println("两辆出租侧一样价格");
		}
	}

}
