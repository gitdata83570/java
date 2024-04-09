package com.sunbeam;

import java.util.Scanner;

public class HourlyEmployee extends Employee{
	private double wage;
	private int hours;
	
	public HourlyEmployee() {
		
	}

	public HourlyEmployee(double wage, int hours) {
		this.wage = wage;
		this.hours = hours;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		super.accept();
		System.out.println("Enter Wage");
		wage = sc.nextDouble();
		System.out.println("Enter hours");
		hours = sc.nextInt();
		
	}
	
	public void display() {
		super.display();
		System.out.println("Wage - "+wage);
		System.out.println("Hours - "+hours);
		
	}
	
	
	
	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hours=" + hours + ", getfName()=" + getfName() + ", getlName()="
				+ getlName() + ", getSSN()=" + getSSN() + "]";
	}

	public void earnings() {
		double sal=0;
		if(hours <= 40) 
			 sal = wage*hours;
		
		else if(hours>40) 
			sal = wage*40 + wage*(hours - 40)*1.5;
	
			System.out.println("salary is : "+sal);
		}
	
	
}
