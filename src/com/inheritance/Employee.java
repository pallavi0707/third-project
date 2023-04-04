package com.inheritance;

public class Employee {
	int empId;
	String empName;
	int empSalary;
	String empMb;
	public static void main(String[] args) {
		
	}
	
	public Employee(int empId, String empName, int empSalary, String empMb) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empMb = empMb;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empMb=" + empMb
				+ "]";
	}
	

}
class PerEmp extends Employee{
	
	String payRollcompname;

	public PerEmp(int empId, String empName, int empSalary, String empMb, String payRollcompname) {
		super(empId, empName, empSalary, empMb);
		this.payRollcompname = payRollcompname;
	}
	
	
	
	
}

class ConEmp extends Employee{
	
	int duration;

	public ConEmp(int empId, String empName, int empSalary, String empMb, int duration) {
		super(empId, empName, empSalary, empMb);
		this.duration = duration;
	}
	
	
	
	
}
