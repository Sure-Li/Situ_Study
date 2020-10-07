package com.test;

public class HowMangCar {
	public static final int SUM_CAR_NUM = 10;
	public static final int SUM_WHEEL_NUM = 26;

	public static void main(String[] args) {

		for (int bicyleNum = 0; bicyleNum <= SUM_CAR_NUM; bicyleNum++) {
			int tricycleNum = SUM_CAR_NUM - bicyleNum;
			if (SUM_WHEEL_NUM == bicyleNum * 2 + tricycleNum * 3) {
				System.out.println("自行车的数量为： " + bicyleNum + "三轮车的数量为： " + tricycleNum);
			}
		}
	}

}
