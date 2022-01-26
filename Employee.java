package Model;

public class Employee {
	private int eno;
	private String name;
	private String designation;
	private int sal;
	private int mgr;
	private int deptno;
	
	
	
	public Employee(int eno, String name, String designation, int sal, int mgr, int deptno) {
		super();
		this.eno = eno;
		this.name = name;
		this.designation = designation;
		this.sal = sal;
		this.mgr = mgr;
		this.deptno = deptno;
	}
	
	public int geteno() {
		return eno;
	}
	public void seteno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + ", designation=" + designation + ", sal=" + sal + ", mgr="
				+ mgr + ", deptno=" + deptno + "]";
	}
	
	
	
}