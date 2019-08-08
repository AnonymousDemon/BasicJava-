/******************************************************************************

 *  Purpose: Taking 3 different double values and prints result based on
 *           conditions
 *  @author  Vicky
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class DoubleOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility = new Utility();
	       double a,b,c,result;
	       Scanner scanner = new Scanner(System.in);
	       System.out.println("enter first number");
	       a = scanner.nextDouble();
	       System.out.println("enter second number");
	       b = scanner.nextDouble();
	       System.out.println("Enter third number");
	       c = scanner.nextDouble();
	       result = utility.DoubleOp(a, b, c);
	       System.out.println("Reult" +result);
	       scanner.close();
	}

}
