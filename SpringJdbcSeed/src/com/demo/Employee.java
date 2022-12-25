package com.demo;

public class Employee {
private int empId;
private String ename;
private double esalary;
private int edeptno;



public Employee(int empId, String ename, double esalary, int edeptno) {
	super();
	this.empId = empId;
	this.ename = ename;
	this.esalary = esalary;
	this.edeptno = edeptno;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getEsalary() {
	return esalary;
}
public void setEsalary(double esalary) {
	this.esalary = esalary;
}
public int getEdeptno() {
	return edeptno;
}
public void setEdeptno(int edeptno) {
	this.edeptno = edeptno;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", ename=" + ename + ", esalary=" + esalary + ", edeptno=" + edeptno + "]";
}


}
