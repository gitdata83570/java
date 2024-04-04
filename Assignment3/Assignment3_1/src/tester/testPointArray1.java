package tester;

import java.util.Iterator;
import java.util.Scanner;

import com.app.geometry.Point2D;

public class testPointArray1
{

	public static void main(String[] args)
	{
		
		int p,x,y,choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of points");
		p=sc.nextInt();
		Point2D[] points=new Point2D[p];
		
	    for (int i = 0; i < points.length; i++)
	    {
	    	System.out.println("enter coordinates for "+(i+1)+" nd  point");
	    	System.out.println("enter x coordinate");
	    	x=sc.nextInt();
	    	System.out.println("enter y coordinate");
	    	y=sc.nextInt();
	    	points[i]=new Point2D(x,y);
			
		}
	    
	    do 
	    {
	    	System.out.println("0.EXIT  1.DISPLAY DETAILS OF SPECIFIC OF POINT   2.DISPLAY ALL POINTS   3.");
	       	System.out.println("enter choice");
	    	choice=sc.nextInt();
	    	
	    	switch (choice) {
			case 0:
				System.out.println("Thanks for using");
				break;
			
			case 1:
				{
				int index;	
				System.out.println("Display the specic point");
				System.out.println("Enter the index");
				index=sc.nextInt();
				if(index>=p)
				{
					System.out.println("enter a valid index");
				}
				else
				{
					System.out.println("Point at index "+index+" : "+points[index].getDetails());
				}
				}
				break;
				
			case 2:
				{
					System.out.println("x and y coordinates of all points : ");
					int index=0;
					for(Point2D n:points)
					{
						System.out.println("Point at index "+index+" : "+n.getDetails());
						index++;
					}
				}
				
				break;
				
			case 3:
			{
				int str,end;
				
				System.out.println("Enter the index of start point");
				str=sc.nextInt();
				
				if(str>=0 && str<p)
				{
					System.out.println("Enter the index of end point");
					end=sc.nextInt();
					if(end>=0 && end<p)
					{
					  if(points[str].isEqual(points[end]))	
					  {
						  System.out.println("points are same hence cannot find the distance");
					  }
					  else
					  {
						  System.out.println("points are not same");
						  points[str].calculateDistance(points[end]);
					  }
					}
					else
					{
						System.out.println("enter a valid index");
					}
					
				}
				else
				{
					System.out.println("enter a valid index");
				}
				
				
			}
				
				break;	
				
				
			default:
				System.out.println("enter a valid choice");
				break;
			}
		} while (choice!=0);
	    
		

	}

}
