package com.situ;

import java.util.Scanner;

public class Royalty {

	public double countRoyalty(double Performance) {
		double result = 0;
		if (Performance <= 10) {
			result = Performance * 0.1;
		} else if ((Performance > 10) && (Performance <= 20)) {
			result = 10 * 0.1 + (Performance - 10) * 0.075;
		} else if ((Performance > 20) && (Performance <= 40)) {
			result = 10 * 0.1 + 10 * 0.075 + (Performance - 20) * 0.05;
		} else if ((Performance > 40) && (Performance <= 60)) {
			result = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + (Performance - 40) * 0.03;
		} else if ((Performance > 60) && (Performance <= 100)) {
			result = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + (Performance - 60) * 0.015;
		} else if ((Performance > 100)) {
			result = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + +20 * 0.03 + 40 * 0.015 + (Performance - 100) * 0.01;
		}
		return result;
	}

	public double countRoyaltyAccumulation(double Performance) {
		if (Performance > 0) {
			// 需要用来计算提成金额//---------不合理 放弃
			double count1 = (Performance - 100) >= 0 ? (Performance - 100) * 0.01 : 0;
			double count2 = (Performance - 60) >= 0 ? (Performance - 60) * 0.015 : 0;
			double count3 = (Performance - 40) >= 0 ? (Performance - 40) * 0.03 : 0;
			double count4 = (Performance - 20) >= 0 ? (Performance - 20) * 0.05 : 0;
			double count5 = (Performance - 10) >= 0 ? (Performance - 10) * 0.075 : 0;
			double count6 = Performance * 0.1;
			return (count1 + count2 + count3 + count4 + count5 + count6);
		} else {
			return 0;
		}

	}

}
