/******************************************************************************

 *  Purpose: to find roots of Quadratic equation.
 *           
 *  @author  Vicky
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class Quadratric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility = new Utility();
		int a,b,x,c;
		double delta,root1,root2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter value of a");
		a = scanner.nextInt();
		System.out.println("Enetr value of b");
		b = scanner.nextInt();
		System.out.println("Enter value of c");
		c = scanner.nextInt();
		
        delta=utility.FindDeltaSquarRoot(a,b,c);
        System.out.println("Delta"+delta);
		
		root1=utility.QuadraticEquation1(a,b,delta);
		root2=utility.QuadraticEquation2(a,b,delta);
		
		System.out.println("Root 1 of X is :"+root1);
		System.out.println("Root 2 of X is :"+root2);
		scanner.close();
		
		
		

	}

	
}
