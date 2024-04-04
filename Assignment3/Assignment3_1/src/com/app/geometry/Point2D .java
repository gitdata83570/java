package com.app.geometry;

public class Point2D 
{
   private int xaxis;
   private int yaxis;
  
   public Point2D()
   {
    
   }
   public Point2D(int xaxis, int yaxis) 
   {
	super();
	this.xaxis = xaxis;
	this.yaxis = yaxis;
   }
   
   public String getDetails()
   {
	   String a,b;
	   
	   a=Integer.toString(xaxis);
	   b=Integer.toString(yaxis);
	   
	   return "("+a+","+b+")";
	   
   }
   public boolean isEqual(Point2D p2) 
   {
	 if((this.xaxis==p2.xaxis) &&(this.yaxis==p2.yaxis))
		 return true;
	 else 
		 return false;
   }
   public void calculateDistance(Point2D p2)
   {
	
	   double distance=Math.sqrt(Math.pow(( p2.xaxis-this.xaxis),2)+Math.pow(( p2.yaxis-this.yaxis),2));
	   System.out.println("distance between points : "+"("+this.xaxis+","+this.yaxis+")"+"  and "+"("+p2.xaxis+","+p2.yaxis+")"+" = "+distance);
    }
   
}
