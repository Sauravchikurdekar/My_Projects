package com.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDoaIml {
	private JdbcTemplate jdbctemplet;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplet;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplet = jdbctemplate;
	}
	public void addEmployee(Employee emp) {
		
		
		String sql = "insert into empstring (empId,ename,esalary,edeptno) values(?,?,?,?) ";
		int row = jdbctemplet.update(sql, emp.getEmpId(), emp.getEname(), emp.getEsalary(), emp.getEdeptno());
		System.out.println(row);
		
	}

//	public void addempstring() {
//		Employee emp = new Employee(1011, "saurav", 10000, 03);
//		String sql = "insert into empstring (empId,ename,esalary,edeptno) values(?,?,?,?) ";
//		int row = jdbctemplet.update(sql, emp.getEmpId(), emp.getEname(), emp.getEsalary(), emp.getEdeptno());
//		System.out.println(row);
//	}

//	public void updateempstring() {
//		  Employee emp=new Employee (101,"Geeta",70000,03);
//	  String sql="update empstring set ename=?,esalary=?,edeptno=? where empid=?";
//			  int row=jdbctemplet.update(sql,emp.getEname(),emp.getEsalary(),emp.getEdeptno(),emp.getEmpId());
//	   System.out.println(row);
//	}
	  
//	   public void deleteempstring() {
//		   String sql="delete from empstring where empid=?";
//		   int row=jdbctemplet.update(sql,202);
//		   System.out.println(row);
//		   
//	   }
	public List<Employee> getAllEmployee(){
		String sql="select * from empstring";
		List<Employee> empList=jdbctemplet.query(sql, new RowMapper<Employee>() {
			@Override
			
			
			public Employee mapRow(ResultSet rs,int arg) throws SQLException{
			Employee emp=new Employee ();	
			emp.setEmpId(rs.getInt("empId"));
			emp.setEname(rs.getString("ename"));
			emp.setEsalary(rs.getDouble("esalary"));
			emp.setEdeptno(rs.getInt("edeptno"));
			return emp;
		}
		});
		return empList;
		
	}
	
	
//	public void getAllFood() {
//		String sql="select * from empstring";
//		List<Employee> empList=jdbctemplet.query(sql, new RowMapper<Employee>() {
//			@Override
//			
//			
//			public Employee mapRow(ResultSet rs,int arg) throws SQLException{
//			Employee emp=new Employee ();	
//			emp.setEmpId(rs.getInt("empId"));
//			emp.setEname(rs.getString("ename"));
//			emp.setEsalary(rs.getDouble("esalary"));
//			emp.setEdeptno(rs.getInt("edeptno"));
//			return emp;
//		}
//		});
//		System.out.println(empList);
//	}
	
//	public void searchEmployee() {
//		String sql="select * from empstring where id=?";
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the empId");
//		int id=sc.nextInt();
//		Employee emp=jdbctemplet.queryForObject(sql,new Object[] {id},new RowMapper<Employee>(){
//              @Override
//			
//			
//			public Employee mapRow(ResultSet rs,int arg1) throws SQLException{
//			Employee emp=new Employee();	
//			emp.setEmpId(rs.getInt("eid"));
//			emp.setEname(rs.getString("ename"));
//			emp.setEsalary(rs.getDouble("esalary"));
//			emp.setEdeptno(rs.getInt("edeptno"));
//			return emp;
//              }
//		});
//	  System.out.println(emp);
//	
//	}
					  

//	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("connectivity.xml");
//		EmployeeDoaIml emp = context.getBean(EmployeeDoaIml.class);
//		emp.addempstring();
//		//emp.updateempstring();
//	   //emp.deleteempstring();
//		//emp.getAllFood();
//		//emp.searchEmployee();
	//}

}
