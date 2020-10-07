package com.test;

public class Car {
	private String carName;
	private String carType;
	private int carSpeed;
	
	public Car(String carName, String carType, int carSpeed) {
		super();
		this.carName = carName;
		this.carType = carType;
		this.carSpeed = carSpeed;
	}
	public void carStart() {
		System.out.println("品牌为： "+this.getCarName() +"的"+ this.getCarType());
		for (int i = 0; i < 3; i++) {
			this.setCarSpeed(i); 
			System.out.println("车速为：" + this.getCarSpeed() + "km/h");
		}
		System.out.println(" …… \n车辆起步成功");
	}
	public void carBraking() {
		System.out.println("品牌为： "+this.getCarName() +"的"+ this.getCarType());
		for (int i = this.carSpeed; i >= 0; i--) {
			this.setCarSpeed(i); 
			System.out.println("车速为：" + this.getCarSpeed() + "km/h");
		}
		System.out.println("车辆刹车成功");
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public int getCarSpeed() {
		return carSpeed;
	}
	public void setCarSpeed(int carSpeed) {
		this.carSpeed = carSpeed;
	}
	
}
