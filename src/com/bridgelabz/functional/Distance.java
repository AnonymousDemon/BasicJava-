/******************************************************************************

 *  Purpose: to find Euclidea distram from (x,y) to origin.
 *           
 *  @author  Vicky
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility = new Utility();
		double distance;
		int x,y,a=0,b=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		x=scanner.nextInt();
		System.out.println("Enter second number");
		y=scanner.nextInt();
		
		distance = utility.Distance(x, y);
		System.out.println("The euclidean distance for"+x+"&"+y+"is = " +distance);
		scanner.close();
		
		
		
		

	}

}
