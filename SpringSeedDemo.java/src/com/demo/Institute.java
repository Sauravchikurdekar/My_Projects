package com.demo;
class Department{
	private int dId;
	private String dName;
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + "]";
	}
}

public class Institute {
	private int instituteId;
	private String name;
	private Department dept;
	public int getInstituteId() {
		return instituteId;
	}
	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Institute [instituteId=" + instituteId + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
	
	

}
