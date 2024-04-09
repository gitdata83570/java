package com.sunbeam;

import java.util.Scanner;

public abstract class Employee {
	private String fName;
	private String lName;
	private int SSN;
	
	public Employee() {
		
	}

	public Employee(String fName, String lName, int sSN) {
		
		this.fName = fName;
		this.lName = lName;
		SSN = sSN;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name");
		fName = sc.next();
		System.out.println("Enter last name");
		lName = sc.next();
		System.out.println("Enter SSN");
		SSN = sc.nextInt();
		
		
	}
	
	public void display() {
		System.out.println("first name - "+fName);
		System.out.println("lirst name - "+lName);
		System.out.println("SSN - "+SSN);
	}
	
	
	
	
	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", SSN=" + SSN + "]";
	}

	public abstract void earnings();

}
