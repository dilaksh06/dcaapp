import java.util.*;
import java.io.*;

class matrix
{
	int r;
	int c;
	int mat [ ][ ];
	
	void setMat(int r,int c)
	{
		this.r=r;
		this.c=c;
		mat=new int [r][c];
		
	}
	
	void setValue()
	{
			Scanner scan=new Scanner (System.in);
			int val;
			for (int i=0;i<r;r++)
			{
				for(int j=0;j<c;j++)
				{
						
					System.out.printf("Enter the value to add in inderx [ %d , %d ]",r,c);
				}
				
			}
	
	}


}

class main
{

	public static void main(String args[])
	{
		System.out.println("this is saddle poin detector");
		matrix mat1=new matrix();
		Scanner scan=new Scanner (System.in);
		
		System.out.printf("Enter the number of rows : ");
		int r=scan.nextInt();
		
		System.out.printf("Enter the number of cols : ");
		int c=scan.nextInt();
		
	
	}
}
