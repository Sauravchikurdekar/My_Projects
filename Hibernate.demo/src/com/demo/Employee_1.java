package com.demo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Entity
@Table(name="emp")
public class Employee_1 {
    @Id
    @GeneratedValue
    @Column(name="Id")
	private int empId;
    @Column(name="Name")
	private String empName;
    @Column(name="Salary")
	private double salary;

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public Employee_1(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	public Employee_1() {
		
	}
	public static void main(String[] args) {
		Configuration config=new Configuration().configure();
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		
		//for insert
		Employee_1 emp=new Employee_1(101, "Ramesh",10000);
		session.save(emp);
		Transaction tx=session.beginTransaction();
		tx.commit();
		
		//for update
		Employee_1 emp1=new Employee_1(101, "Reeta",15000);
		session.update(emp1);
		Transaction tx1=session.beginTransaction();
		tx1.commit();
		
		//for delete
		Employee_1 emp2=session.get(Employee_1.class, 101);
		session.delete(emp2);
		Transaction tx3=session.beginTransaction();
		tx3.commit();
		
		//for search single record
		Employee emp4=session.get(Employee.class, 101);
		System.out.println(emp4);
		
		//getAll Record
		Query q=session.createQuery("FROM Employee");
		List<Employee_1> list=q.list();
		for(Employee_1 em:list)
		{
			System.out.println(em);
		}
	}
}

