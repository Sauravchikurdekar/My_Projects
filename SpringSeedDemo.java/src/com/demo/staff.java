package com.demo;
public class staff {
	private int staffId;
	private String staffName;
	private double sataffsalary;
	public staff(int staffId, String staffName, double sataffsalary) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.sataffsalary = sataffsalary;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public double getSataffsalary() {
		return sataffsalary;
	}
	public void setSataffsalary(double sataffsalary) {
		this.sataffsalary = sataffsalary;
	}
	@Override
	public String toString() {
		return "staff [staffId=" + staffId + ", staffName=" + staffName + ", sataffsalary=" + sataffsalary + "]";
	}
	

}
