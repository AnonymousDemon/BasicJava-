/******************************************************************************

 *  Purpose: to add 2 Integers
 *
 *  @author  Vicky
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;



public class SumOfIntegers {

	public static void main(String[] args) {

		Utility utility = new Utility();
		int firstNumber, secondNumber, result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first Number");
		firstNumber = scanner.nextInt();
		System.out.println("Enter second Number");
		secondNumber = scanner.nextInt();
		result = utility.SumofInteger(firstNumber, secondNumber);
		System.out.println("Result :"+result);
		scanner.close();
				
	}

}
