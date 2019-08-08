/******************************************************************************

 *  Purpose: check whether year is leap or not
 *           
 *  @author  Vicky
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility = new Utility();
		int year;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year ");
		year = scanner.nextInt();
		year = utility.Leapyea(year);
scanner.close();
	}

}
