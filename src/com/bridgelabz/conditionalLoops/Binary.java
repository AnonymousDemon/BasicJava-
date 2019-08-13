package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,a;
		String x ="";
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		n = scanner.nextInt();
		int b = n;
		if(n>255)
		{
			System.out.println("Invalid input");
		}
		else
		{
			
		while(n>0)
		{
			a=n%2;
			x = a + "" + x;
			n=n/2;
		}
		
		
		System.out.println("Binary is = " +x);
		
		
		int s = utility.SwapNibbles(b);
				
		}
		scanner.close();
	}

}
