package com.demo;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeTest {
	

	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {

		System.out.println("project strated");
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		
		Session session=factory.openSession();
		Employee emp=new Employee(104,"RIYA",43000);
		//Employee emp=session.get(Employee.class,101);
		//session.delete(emp);
		session.save(emp);
		Transaction txn=(Transaction) session.beginTransaction();
		txn.commit();
		//session.close();
		System.out.println("row inserted");
		System.out.println("Row Delete");
		
	}

}
