package com.test;

public class People {
	private String peopleName;
	
	public People(String peopleName) {
		super();
		this.peopleName = peopleName;
	}

	public void driveCar(Car c) {
		System.out.println(this.getPeopleName()+"将要开车");
		System.out.println(this.getPeopleName()+"已经上车将要对车辆进行起步");
		c.carStart();
		System.out.println(this.getPeopleName()+"开车即将到达目的地，将进行刹车");
		c.carBraking();
	}

	public String getPeopleName() {
		return peopleName;
	}

	public void setPeopleName(String peopleName) {
		this.peopleName = peopleName;
	}

	@Override
	public String toString() {
		return "People [peopleName=" + peopleName + "]";
	}
	
}
