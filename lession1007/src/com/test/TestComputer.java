package com.test;

public class TestComputer {

	public static void main(String[] args) {
		Cpu cpu1 = new Cpu("intel", 1.5);
		Displayer displayer1 = new Displayer("三星", 14.6);
		Computer computer1 = new Computer(cpu1,displayer1);
		computer1.cpuMotion();				
	}

}
