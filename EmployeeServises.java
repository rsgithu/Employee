package Servises;

public class EmployeeServises {
	private int eno;
	private String name;
	private String designation;
	private int sal;
	private int mgr;
	private int deptno;
	public int getId() {
		return eno;
	}
	public void seteno() {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation() {
		this.designation = designation;
	}
	public int getSal() {
		return sal;
	}
	public void setSal() {
		this.sal= sal;
	}

	public int getMgr() {
		return mgr;
	}
	public void setMgr() {
		this.mgr = mgr;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno() {
		this.deptno= deptno;
	}



		public EmployeeServises(int eno, String name, String desingnation,int sal,int mgr,int Deptno) {

			this.eno=eno;
			this.name=name;
			this.designation = designation;
			this.sal= sal;
			this.mgr = mgr;
			this.deptno= deptno;
		}
		public String toString() {
return "Employee eno : " + this.eno +" " +"Employee name : " +  this.name +" " + "Employee designation: " + this.designation
		+"Employee sal : "+ this.sal +" " +"Employee mgr : " +  this.mgr +" "+"Employee deptno : " +  this.deptno +" "  ;
		}
		}


