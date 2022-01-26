package Adapter;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import Model.Employee;
import Servises.EmployeeServises;
import UtilityPkg.ConnectionUtil;


public class EmployeeServiceAdapter {
	public Employee[] EmployeeArray= new Employee[100];


	public void createEmployee(Employee emp)throws Exception {
		try {
			Connection con=ConnectionUtil.getDBconnection();
			PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?,?,?,?)");
			PreparedStatement ps1=con.prepareStatement("select max(eno) from emp");
			ResultSet count = ps1.executeQuery();
			int empCount = count.getInt(1) + 1;
			ps.setInt(1, empCount);
			ps.setString(2, emp.getName());
			ps.setString(3, emp.getDesignation());
			ps.setInt(4, emp.getSal());
			ps.setInt(5, emp.getMgr());
			ps.setInt(6, emp.getDeptno());
			int r=ps.executeUpdate();
			if(r>0) {
				System.out.println("data inserted....!");
			}
			else {
				System.out.println("somthing errro...!");
			}
			empCount++;
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void viewEmployee() throws Exception{

		System.out.println("below are the Employee details");
		try {
			Connection con=ConnectionUtil.getDBconnection();
			Scanner sc=new  Scanner (System.in);
			System.out.println("enter the eno of Employee");
			int id=sc.nextInt();

			PreparedStatement ps=con.prepareStatement("select * from emp where eno=? ");
			ps.setInt(1, id);
			ResultSet r=ps.executeQuery();
			while(r.next()) {
				System.out.println(r.getInt("eno"));
				System.out.println(r.getString("ename"));
				System.out.println(r.getString("designation"));
				System.out.println(r.getInt("sal"));
				System.out.println(r.getInt("mgr"));
				System.out.println(r.getInt("deptno"));
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();

		}
	}


	public void updateEmployee(int eno,String name,String designation,int sal,int mgr,int deptno) {

		try {
			Connection con=ConnectionUtil.getDBconnection();
			
			PreparedStatement ps=con.prepareStatement("update emp set ename=?,designation = ?,sal = ?,mgr = ?,deptno = ? where eno = ? ");

			ps.setString(1, name);
			ps.setInt(6, eno);
			ps.setString(2, designation);
			ps.setInt(3, sal);
			ps.setInt(4, mgr);
			ps.setInt(5, deptno);

			int r=ps.executeUpdate();
			if(r>0) {
				System.out.println("data updated....!");
			}
			else {
				System.out.println("somthing erro...!");
			}
			con.close();

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void deleteEmployee(int eno) {

		try {
			Connection con=ConnectionUtil.getDBconnection();
			PreparedStatement ps=con.prepareStatement("delete from Emp where eno=?");

			ps.setInt(1, eno);


			int r=ps.executeUpdate();
			if(r>0) {

				System.out.println("data deleted....!");
			}
			else {
				System.out.println("somthing error...!");
			}
			con.close();

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}


