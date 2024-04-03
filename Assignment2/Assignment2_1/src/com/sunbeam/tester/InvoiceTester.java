package com.sunbeam.tester;

import com.sunbeam.invoice.Invoice;

public class InvoiceTester 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Invoice i1=new Invoice("101","Pratik",10,1500);
		System.out.println("Part no:"+i1.getPartno());
		System.out.println("Description:"+i1.getDescription());
		System.out.println("Quantity:"+i1.getQuantity());
		System.out.println("Prize:"+i1.getPrize());
		
		System.out.println("Invoice Calculation:"+i1.calculateInvoice());
		
	}

}
