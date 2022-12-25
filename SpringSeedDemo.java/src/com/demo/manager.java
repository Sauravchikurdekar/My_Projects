package com.demo;

public class manager {
	private int managerId;
	private String managerName;
	private double managerSalary;
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public double getManagerSalary() {
		return managerSalary;
	}
	public void setManagerSalary(double managerSalary) {
		this.managerSalary = managerSalary;
	}
	@Override
	public String toString() {
		return "manager [managerId=" + managerId + ", managerName=" + managerName + ", managerSalary=" + managerSalary
				+ "]";
	}
	

}
