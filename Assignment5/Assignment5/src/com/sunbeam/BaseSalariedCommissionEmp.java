package com.sunbeam;

import java.util.Scanner;

public class BaseSalariedCommissionEmp extends CommissionEmployee{
	
	private double baseSalary;
	double tot ;
	public BaseSalariedCommissionEmp() {
		
	}
	
	public BaseSalariedCommissionEmp(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		super.accept();
		System.out.println("Enter Base Salary");
		baseSalary = sc.nextDouble();
	}
	
	public void display() {
		super.display();
		System.out.println("Base Salary - "+ baseSalary);
	}
	
	
	
	@Override
	public String toString() {
		return "BaseSalariedCommissionEmp [baseSalary=" + baseSalary + ", tot=" + tot + ", getGrossSales()="
				+ getGrossSales() + ", getCommissionRate()=" + getCommissionRate() + ", getfName()=" + getfName()
				+ ", getlName()=" + getlName() + ", getSSN()=" + getSSN() + "]";
	}

	public void earnings() {
		tot = getCommissionRate()*getGrossSales()+baseSalary;
		System.out.println("Total Salary - "+tot);
	}
	public void reward() {
		double reward = baseSalary*0.1 + tot;
		System.out.println("Reward = "+reward);
	}
	
}
