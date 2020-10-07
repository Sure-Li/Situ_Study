package com.test;

import java.util.Scanner;

public class Computer {
	private Cpu computerCpu;
	private Displayer computerDisplayer;

	public Computer(Cpu computerCpu, Displayer computerDisplayer) {
		super();
		this.computerCpu = computerCpu;
		this.computerDisplayer = computerDisplayer;
	}

	public void cpuMotion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("使用计算机开始计算");
		System.out.println("请输入左操作数：");
		int a = sc.nextInt();
		System.out.println("请输入运算符：");
		String c = sc.next();
		System.out.println("请输入右操作数：");
		int b = sc.nextInt();
		sc.close();
		int setting = this.computerCpu.cpuMotion(a, b, c);
		if (this.computerCpu.cpuReturnSettingEnable == false) {
			System.out.println("品牌为" + this.computerCpu.getCpuName() + "的" + this.computerCpu.getCpuHz() + "GHz"
					+ "的CPU通过计算将结果显示在品牌为：" + this.computerDisplayer.getDisplayerName() + "的"
					+ this.computerDisplayer.getDisplayerSize() + "寸的显示器上，结果为："
					+ this.computerDisplayer.displayerMotion());
		} else {
			System.out.println("品牌为" + this.computerCpu.getCpuName() + "的" + this.computerCpu.getCpuHz() + "GHz"
					+ "的CPU通过计算将结果显示在品牌为：" + this.computerDisplayer.getDisplayerName() + "的"
					+ this.computerDisplayer.getDisplayerSize() + "寸的显示器上，结果为："
					+ this.computerDisplayer.displayerMotion(setting));
		}
	}

}
