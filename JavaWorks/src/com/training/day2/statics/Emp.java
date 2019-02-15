package com.training.day2.statics;

public class Emp {
	private int empId; 
	private String empName; 
	private double empSal;
	private static int count =100; 
	
	public Emp(String empName, double empSal) {
		this.empId =  count ++; 
		this.empName = empName;
		this.empSal = empSal;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getEmpSal() {
		return empSal;
	}


	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}


	public int getEmpId() {
		return empId;
	}


	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
	
}
