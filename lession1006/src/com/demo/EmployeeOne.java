package com.demo;

public class EmployeeOne {
	private String name;
	private int age;

	public EmployeeOne(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return getClass().getName() + "EmployeeOne [name=" + name + ", age=" + age + "]";
	}

}
