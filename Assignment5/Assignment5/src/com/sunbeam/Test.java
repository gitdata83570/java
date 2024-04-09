package com.sunbeam;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		System.out.println("1. Salaried Employees");
		System.out.println("2. Hourly Employee");
		System.out.println("3. Commission Employee");
		System.out.println("4. BaseSalariedCommissionEmp");
		System.out.println(" Enter your choice ");
		
		choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			Employee e1 = new SalariedEmployees();
			e1.accept();
			e1.display();
			e1.earnings();
			break;	
			
        case 2:
        	Employee e2 = new HourlyEmployee();
        	e2.accept();
        	e2.display();
        	e2.earnings();
			break;	
			
        case 3:
        	Employee e3 = new CommissionEmployee();
        	e3.accept();
        	e3.display();
        	e3.earnings();
			break;	
			
        case 4:
        	Employee e4 = new BaseSalariedCommissionEmp();
        	e4.accept();
        	e4.display();
        	e4.earnings();
        	BaseSalariedCommissionEmp b1 = null;
        	
       	if(e4 instanceof BaseSalariedCommissionEmp)
        		 b1 = (BaseSalariedCommissionEmp)e4;
        		b1.reward();
        	break;
//        case 5:
//			
//			break;
		
		default:
			System.out.println("Wrong choice ");
			break;
			
		}
		
	}

}
