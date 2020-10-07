package com.test;

public class Displayer {
	private String displayerName;
	private double displayerSize;

	public Displayer(String displayerName, double displayerSize) {
		super();
		this.displayerName = displayerName;
		this.displayerSize = displayerSize;
	}

	/**
	 * @return the displayerName
	 */
	public String getDisplayerName() {
		return displayerName;
	}

	/**
	 * @param displayerName the displayerName to set
	 */
	public void setDisplayerName(String displayerName) {
		this.displayerName = displayerName;
	}

	/**
	 * @return the displayerSize
	 */
	public double getDisplayerSize() {
		return displayerSize;
	}

	/**
	 * @param displayerSize the displayerSize to set
	 */
	public void setDisplayerSize(float displayerSize) {
		this.displayerSize = displayerSize;
	}

	@Override
	public String toString() {
		return "Displayer [displayerName=" + displayerName + ", displayerSize=" + displayerSize + "]";
	}

	public String displayerMotion() {
		return "输入错误显示器无内容可以显示";
	}

	public String displayerMotion(int setting) {
		return ("显示器显示计算的结果为：" + setting);
	}
}
