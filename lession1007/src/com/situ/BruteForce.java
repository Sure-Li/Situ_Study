package com.situ;

import java.util.Random;

public class BruteForce {
	public static String[] array = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e" };
	public static Random rc = new Random();

	public static void main(String[] args) {

		// 随机生成一个密码 【0，9】 6位数的面
		StringBuffer passWord = new StringBuffer();
		passWord = creatPassword();
		System.out.println(passWord.toString() + "------------------------");// 用于测试
		long recursionBruteForceCount = recursionBruteForce(passWord);
		long randomBruteForceCount = randomBruteForce(passWord);
		if (recursionBruteForceCount > randomBruteForceCount) {
			System.out.println("递归比随机效率低");
		} else if (recursionBruteForceCount < randomBruteForceCount) {
			System.out.println("随机比递归效率低");
		} else {
			System.out.println("效率一样高");
		}

	}

	public static StringBuffer creatPassword() {
		StringBuffer password = new StringBuffer();
		for (int i = 0; i < 6; i++) {
			password.append(array[rc.nextInt(14)]);
		}
		return password;
	}

	public static long recursionBruteForce(StringBuffer passWord) {
		String[] array = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e" };
//		String passwordForce = "";
		StringBuffer passwordForce = new StringBuffer();
		long count = 0;
		long starTime = System.currentTimeMillis();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				for (int j2 = 0; j2 < array.length; j2++) {
					for (int k = 0; k < array.length; k++) {
						for (int k2 = 0; k2 < array.length; k2++) {
							for (int l = 0; l < array.length; l++) {
//								passwordForce = array[i] + array[j] + array[j2] + array[k] + array[k2] + array[l];//效率太低占用资源太高 用Stringbuffer代替掉
								// 链式语法
								passwordForce.append(array[i]).append(array[j]).append(array[j2]).append(array[k])
										.append(array[k2]).append(array[l]);
								if (passwordForce.toString().equals(passWord.toString())) {
									long endTime = System.currentTimeMillis();
									long time = endTime - starTime;
									System.out.println("递归方式:  密码破解成功，密码为： " + passwordForce + " 破解次数为：" + count
											+ " 破解时间为： " + time / 1000f + " S");
									return count;
								} else {
									count++;
//										System.out.println(passwordForce);
									passwordForce.setLength(0);
								}
							}
						}
					}
				}
			}
		}
		System.out.println("破解失败" + "破解次数为:  " + count);
		return count;
	}

	public static long randomBruteForce(StringBuffer passWord) {
		StringBuffer passwordForce = new StringBuffer();
		long count = 0;
		long starTime = System.currentTimeMillis();
		String[] array = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e" };
		while (true) {
			for (int i = 0; i < 6; i++) {
				passwordForce.append(array[rc.nextInt(14)]);
			}
			if (passwordForce.toString().equals(passWord.toString())) {
				long endTime = System.currentTimeMillis();
				long time = endTime - starTime;
				System.out.println(
						"随机方式:  密码破解成功，密码为： " + passwordForce + " 破解次数为：" + count + " 破解时间为： " + time / 1000f + " S");
				return count;
			} else {
				count++;
//					System.out.println(passwordForce);
				passwordForce.setLength(0);
			}
		}
	}
}
