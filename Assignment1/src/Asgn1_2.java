//2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
//doubles, supply suitable error message & terminate.
//If numbers are double values, print its average.
//Hint : Check Scanner class for the methods
import java.util.Scanner;
public class Asgn1_2 
{
	public static void main(String[] args) 
	{
		double n1,n2,average;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st double number: ");
		
		
		if(sc.hasNextDouble()) 
		{
			
			n1=sc.nextDouble();
			System.out.println("Enter 2nd double no:");
			if(sc.hasNextDouble())
			{
				
				n2=sc.nextDouble();
				average=(n1+n2)/2;
				System.out.println("Average is: "+average);
			}
			else 
			{
				System.out.println("n2 is not double");
			}
		
		}
		else
		{
			System.out.println("n1 is not double");
		}	
	}
}