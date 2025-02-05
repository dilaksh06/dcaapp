import java.util.*;
import java.io.*;

interface iShape
{
	void calcArea();
	void calcPerimeter();
	
}

class rectangle implements iShape
{
	double length,breadth;
	double area,peri;
	
	rectangle(double leng,double br)
	{
	
		this.length=leng;
		this.breadth=br;
		
	}
	
	public void calcArea()
	{
	
		area=length*breadth;
	}
	
	public void calcPerimeter ()
	{
		peri=2*length+2*breadth;
		
	}
	
	public void printData()
	{
		System.out.printf("length is ; %.2f ",length)	;		
	}

}



class triangle implements iShape
{

	double a,b,c;
	
	double area,peri;
	triangle (double a,double b,double c)
	{
	
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public 	void calcArea()
	{
		double s=(a+b+c)/2;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	
	}
	public void calcPerimeter()
	{
		peri=a+b+c;
		
	}
	 
	public void printData()
	{
		System.out.printf("length is ; %.2f ",length)	;	
	}

}

class main
{

	public static void main(String args[])
	{
		//System.out.println("this is saddle poin detector");
		//matrix mat1=new matrix();
		//Scanner scan=new Scanner (System.in);
		
		//System.out.printf("Enter the number of rows : ");
		//int r=scan.nextInt();
		
		//System.out.printf("Enter the number of cols : ");
		//int c=scan.nextInt();
		
		rectangle rect=new rectangle(10.6f,515.5f);
		rect.calcArea();
		rect.calcPerimeter();
		rect.printData();
		
	
	}
}
