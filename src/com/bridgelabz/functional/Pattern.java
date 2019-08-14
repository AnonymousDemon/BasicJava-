package com.bridgelabz.functional;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for( i=0;i<=9;i++)
		   {
		    for( j=0;j<2;j++)
		    {
		    System.out.print("*");
		       
		    }
		    for( k = 5;k<=9;k++)
		    {
		    if(k==i||k==9-i)
		    {
		    System.out.print("*");
		    }
		    else
		    {
		    System.out.print(" ");
		    }
		    }
		    System.out.println("");
		   }
		
		//Pattern D
		for( i= 0;i<=4;i++)
		{
		for( j=0;j<2;j++)
		{
		System.out.print("*");
		}
		for( k=0;k<=4;k++)
		{
		if(k==4||i==0||i==4)
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println("");
		}
		
		//Pattern W
		for(i=0;i<=4;i++)
		{
		for(j=0;j<1;j++)
		{
		System.out.print("*");
		}
		for(k=0;k<=5;k++)
		{
		if(k==i&&k>=2)
		{
		System.out.print("*");
		}
		else if(k==5)
		{
		System.out.print("*");
		}
		else if(k==4-i&&k<3)
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}

		System.out.println("");
		}
		
	}

}
