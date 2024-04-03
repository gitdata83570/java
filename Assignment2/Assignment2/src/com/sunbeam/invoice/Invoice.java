package com.sunbeam.invoice;

//public class Invoice {
//
//}
//Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
//sold at the store. An Invoice should include four pieces of information as fields—a part number
//(type String), a part description (type String), a quantity of the item being purchased (type int) and a
//price per item (double). Your class should have a constructor
//that initializes the four instance variables. Provide a set and a get method for each instance variable.
//calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
//amount as a double value.
//If the quantity is not positive, it should be set to 0.
//If the price per item is not positive, it should be set to 0.0.
//Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.
//public class Asgn2_1 {
public class Invoice {
	private String partno;
	private String Description;
	private int quantity;
	private double prize;

	public Invoice() {
		partno = "";
		Description = "";
		quantity = 0;
		prize = 0;
	}

	public Invoice(String partno, String Description, int quantity, double prize) 
	{
		// super();
		this.partno = partno;
		this.Description = Description;
		this.quantity = quantity;
		this.prize = prize;
	}

	public String getPartno() {
		return partno;
	}

	public void setPartno(String partno) {
		this.partno = partno;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int item) {
		if (quantity < 0)
			quantity = 0;
		this.quantity = item;
	}

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		if (prize < 0.0)
			prize = 0.0;
		this.prize = prize;
	}

	public double calculateInvoice() {
		return prize * quantity;
	}
}