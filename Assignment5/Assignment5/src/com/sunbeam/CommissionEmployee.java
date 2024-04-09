package com.sunbeam;

import java.util.Scanner;

public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee() {
		
	}

	public CommissionEmployee(double grossSales, double commissionRate) {
		
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	
	
	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		super.accept();
		System.out.println("Enter grossSales");
		grossSales = sc.nextDouble();
		System.out.println("Enter commissionRate");
		commissionRate = sc.nextDouble();
	}
	
	public void display() {
		super.display();
		System.out.println("GrossSales - "+grossSales);
		System.out.println("CommissionRate - "+commissionRate);
		
	}
	
	
	
	@Override
	public String toString() {
		return "CommissionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + ", getfName()="
				+ getfName() + ", getlName()=" + getlName() + ", getSSN()=" + getSSN() + "]";
	}

	public void earnings() {
		System.out.println("Total Earnings - "+ (commissionRate*grossSales));
	}
		
		
}
