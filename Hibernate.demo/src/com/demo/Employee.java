package com.demo;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//
//
//public class Employee {
//	private int empId;
//	private String empName;
//	private double salary;
//
//	public int getEmpId() {
//		return empId;
//	}
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//	public String getEmpName() {
//		return empName;
//	}
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//	public double getSalary() {
//		return salary;
//	}
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//	
//	
//	public Employee(int empId, String empName, double salary) {
//		super();
//		this.empId = empId;
//		this.empName = empName;
//		this.salary = salary;
//	}
//	
//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
//	}
//	
//	public Employee() {
//		
//		
//	}
//	public static void main(String[] args) {
//		Configuration config=new Configuration();
//		config.configure("hibernate.cfg.xml");
//		SessionFactory factory=config.buildSessionFactory();
//		Session session=factory.openSession();
//		
//		//for insert
//		Employee emp=new Employee(101, "Ramesh",10000);
//		session.save(emp);
//		Transaction tx=session.beginTransaction();
//		tx.commit();
//		System.out.println("table created");
//		
//		
//		  //for update
//		Employee emp1=new Employee(101, "Reeta",15000);
//		  session.update(emp1); Transaction tx1=session.beginTransaction();
//		  tx1.commit();
//		  System.out.println("row updated");
//		  
//		  //for delete Employee emp2=session.get(Employee.class, 101);
////		  session.delete(emp2); Transaction tx3=session.beginTransaction();
////		  tx3.commit();
//		 
//		
//		//for search single record
//		/*
//		 * Employee emp4=session.get(Employee.class, 101); System.out.println(emp4);
//		 * 
//		 * //getAll Record Query q=session.createQuery("FROM Employee"); List<Employee>
//		 * list=q.list(); for(Employee em:list) { System.out.println(em); }
//		 */
//	}
//
//}
//



import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.CollectionId;
import org.hibernate.cfg.Configuration;






@Entity
@Table(name="Emp_coder")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type" ,discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "Employee")
public class Employee {
	
	
	
	@Id
	@GeneratedValue
	@Column(name="eid")
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


	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}

	public Employee() {

	}
	public static void main(String[] args) {
		Configuration config=new Configuration().configure();
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();

		Staff st=new Staff();
		st.setEmpId(101);
		st.setEmpName("Almas");
		st.setSalary(1000);	
		st.setQualifi("ME");
		st.setSubject("java");
		Trainert t=new Trainert();
		t.setEmpId(101);
		t.setEmpName("Almas");
		t.setSalary(1000);
		t.setBatchcode("14Mk");
		t.setLication("Vashi");
		session.save(st);
		session.save(t);
		Transaction tx=session.beginTransaction();
		tx.commit();
		System.out.println("Table per Hirarchi done");



	}

}
