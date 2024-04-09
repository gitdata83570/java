package com.sunbeam;

import java.util.Scanner;

public class SalariedEmployees extends Employee {
	private double weeklySalary;
	
	public SalariedEmployees() {
		
	}

	public SalariedEmployees(double weeklySalary) {
		
		this.weeklySalary = weeklySalary;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		super.accept();
		System.out.println("Enter Weekly Salary");
		weeklySalary = sc.nextDouble();
	}
	
	public void display() {
		super.display();
		System.out.println("Weekly Salary - "+weeklySalary);
	}
	
	
	
	
	@Override
	public String toString() {
		return "SalariedEmployees [weeklySalary=" + weeklySalary + ", getfName()=" + getfName() + ", getlName()="
				+ getlName() + ", getSSN()=" + getSSN() + "]";
	}

	public void earnings() {
		System.out.println("Total Salary = "+ weeklySalary);
	}
	


	
	
}
