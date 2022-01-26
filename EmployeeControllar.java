package Controller;

import java.util.Scanner;
import Model.Employee;

import Adapter.EmployeeServiceAdapter;

public class EmployeeControllar {
	static EmployeeServiceAdapter service = new EmployeeServiceAdapter();

	public static void main(String args[]) throws Exception {
		Scanner sc=new Scanner(System.in);
		boolean systemExit =false;
		while(!systemExit) {
			System.out.println("select opetion for which opration you want to perform");
			System.out.println("1. CREATE EMPLOYEE");
			System.out.println("2. VIEW EMPLOYEE");
			System.out.println("3. UPDATE EMPLOYEE DETAILS");
			System.out.println("4. DELETE EMPLOYEE DETAILS");
			System.out.println("5. EXIT");
			System.out.println("enter the option which you want to perform");
			int action=sc.nextInt();
			switch(action) {
			case 1:
				System.out.println("Create Employee data");
				
				System.out.println("enter the Employee eno");
				int eno=sc.nextInt();
				
				System.out.println("enter the Employee name");
				String name=sc.next();
				System.out.println("enter the Employee Designation");
				String designation=sc.next();
				System.out.println("enter the Employee Salary");
				int sal=sc.nextInt();
				System.out.println("enter the Employee mgr");
				int mgr=sc.nextInt();
				System.out.println("enter the Employee Deptno");
				int deptno=sc.nextInt();
				

				Employee emp=new  Employee(0,name,designation,sal,mgr,deptno);
				service.createEmployee(emp);
				break;

			case 2:
				service.viewEmployee();
				break;

			case 3:
				System.out.println("enter the  Employee eno,name,desination,sal,mgr,deptno to perform update");
				int id=sc.nextInt();
				name=sc.next();
				designation=sc.next();
				sal=sc.nextInt();
				mgr=sc.nextInt();
				deptno=sc.nextInt();
				service.updateEmployee(id,name,designation,sal,mgr,deptno);
				break;

			case 4:
				System.out.println("enter the  Employee eno to perform delete");
				int deleteAcrionid=sc.nextInt();
				service.deleteEmployee(deleteAcrionid);
				break;

			case 5:
				System.exit(0);
				break;

			default:
				System.out.println("wrong input");
				break;
			}
		}

	}
}




