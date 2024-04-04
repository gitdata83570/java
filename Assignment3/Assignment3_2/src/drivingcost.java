//Q2. Create an application that calculates your daily driving cost, so that you can estimate how much
//money could be saved by car pooling, which also has other advantages such as reducing carbon
//emissions and reducing traffic congestion. The application should input the following information
//and display the user’s cost per day of driving to work:
//a) Total miles driven per day.
//b) Cost per gallon of gasoline.
//c) Average miles per gallon.
//d) Parking fees per day.
//e) Tolls per day.

import java.util.Scanner;

class driving
{
	
	
	private int totalmiles;
	private int pricepergallon;
	private int avgmilespergallon;
	private int parkingfeeperday;
	private int tollsperday;
	
	
	
    public void accept()
    {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter total miles per day");
		this.totalmiles=sc.nextInt();
		
		System.out.println("enter price per gallon");
		this.pricepergallon=sc.nextInt();
		
		System.out.println("enter average miles per gallon");
		this.avgmilespergallon=sc.nextInt();
		
		System.out.println("enter parking fees per day");
		this.parkingfeeperday=sc.nextInt();
		
		System.out.println("enter total Rs for tolls per day");
		this.tollsperday=sc.nextInt();
	}
    
    public void calculatetotalcostperday()
    {
	  double totalbill=this.parkingfeeperday+this.tollsperday+(this.totalmiles/this.avgmilespergallon)*this.pricepergallon;
	  System.out.println("Total bill per day is : RS."+totalbill);
	}
    
    
    
}
public class drivingcost
{

	public static void main(String[] args)
	{
		driving d=new driving();
		d.accept();
		d.calculatetotalcostperday();

	}

}