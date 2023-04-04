package com.encapsulation;   //encapsulation -means binding the data members and member method in single unit
                             //declare the class variable as pivate 
class Employee1{             //declare the class methode as public bcoz to access the variable
	
	private int empId;          //data hiding
	private String empName;
	
	
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
/*	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + "]";
	}*/
	
	
	
}


public class Employee {
public static void main(String[] args) {
	Employee1 emp=new Employee1();
	emp.setEmpId(101);
	emp.setEmpName("pallavi");
//	System.out.println(emp);
	System.out.println("employee="+emp.getEmpId()+" "+emp.getEmpName());
}


}
