package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class PrintThreeNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		String[] namesArray = new String[3];
		int lengthOfArray = namesArray.length - 1, start = 0;

		// for taking input from user
		for (int i = 0; i < namesArray.length; i++) {
			namesArray[i] = scanner.nextLine();
		}

		// calling method for reversing the array
		namesArray = utility.ReverseStringArray(namesArray, start, lengthOfArray);

		// for printing names
		System.out.print("Hi ");
		for (int i = 0; i < namesArray.length; i++) {
			System.out.print(namesArray[i]);
			if (i == namesArray.length - 2) {
				System.out.print(" and ");
			} else {
				if (i != namesArray.length - 1) {
					System.out.print(", ");
				}

			}

		}
		scanner.close();
		
	}

}
