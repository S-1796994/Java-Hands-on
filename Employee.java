package com.practice;

public class Employee {
	private double salary;
	private double workingHours;
	
	public void getInfo(double salary,double workingHours) {
		this.salary=salary;
		this.workingHours=workingHours;
	}
	
	public void addSalary() {
		if(salary<1500.3) {
			salary=salary+1000;
		}
	}
	
	public void addWork() {
		if(workingHours>6) {
			salary+=500;
		}
	}
	
	public double getFinalSalary() {
		return salary;
	}

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.getInfo(1200, 7);
		emp.addSalary();
		emp.addWork();
		System.out.println("Final Salary: "+emp.getFinalSalary());
	}

}
