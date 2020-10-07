package com.test;

public class TestCar {

	public static void main(String[] args) {
		Car c1 = new Car("丰田", "suv", 0);
		People p1 = new People("张三");
		p1.driveCar(c1);
	}
}
