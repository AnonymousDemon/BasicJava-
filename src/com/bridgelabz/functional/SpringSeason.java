/******************************************************************************

 *  Purpose: Prints true if day and month is of Springseason else false.
 *           
 *  @author  Vicky
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, d ;
		boolean res;
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter day");
		d = scanner.nextInt();
		System.out.println("Enter month");
		m = scanner.nextInt();
		
		res = utility.SpringSeason(m, d);
		System.out.println("Result is :" +res);
		
		
	}

}
