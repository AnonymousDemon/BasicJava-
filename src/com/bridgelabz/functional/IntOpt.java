/******************************************************************************

 *  Purpose: Taking 3 different integer values and prints result based on
 *           conditions.
 *  @author  Vicky
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class IntOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility = new Utility();
       int a,b,c,result;
       Scanner scanner = new Scanner(System.in);
       System.out.println("enter first number");
       a = scanner.nextInt();
       System.out.println("enter second number");
       b = scanner.nextInt();
       System.out.println("Enter third number");
       c = scanner.nextInt();
       result = utility.Intop(a, b, c);
       System.out.println("Reult" +result);
       scanner.close();
	}

}
