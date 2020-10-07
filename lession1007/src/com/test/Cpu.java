package com.test;

public class Cpu {
	private String cpuName;
	private double cpuHz;
	public boolean cpuReturnSettingEnable;

	public Cpu(String cpuName, double cpuHz) {
		super();
		this.cpuName = cpuName;
		this.cpuHz = cpuHz;
		this.cpuReturnSettingEnable = true;
	}

	/**
	 * @return the cpuName
	 */
	public String getCpuName() {
		return cpuName;
	}

	/**
	 * @param cpuName the cpuName to set
	 */
	public void setCpuName(String cpuName) {
		this.cpuName = cpuName;
	}

	/**
	 * @return the cpuHz
	 */
	public double getCpuHz() {
		return cpuHz;
	}

	/**
	 * @param cpuHz the cpuHz to set
	 */
	public void setCpuHz(float cpuHz) {
		this.cpuHz = cpuHz;
	}

	public int cpuMotion(int a, int b, String c) {
		this.cpuReturnSettingEnable = true;
		if (c.equals("+") ) {
			return a + b;
		} else if (c.equals("-")) {
			return a-b;	
		}else {
			this.cpuReturnSettingEnable = false;
		return 0;	
		}
	}

	@Override
	public String toString() {
		return "Cpu [cpuName=" + cpuName + ", cpuHz=" + cpuHz + "]";
	}

}
