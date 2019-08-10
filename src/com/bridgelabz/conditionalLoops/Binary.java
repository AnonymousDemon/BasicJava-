package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,a;
		String x ="";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		n = scanner.nextInt();
		while(n>0)
		{
			a=n%2;
			x = a + "" + x;
			n=n/2;
		}
		
		System.out.println("Binary of is = " +x);
		
		scanner.close();
	}

}
