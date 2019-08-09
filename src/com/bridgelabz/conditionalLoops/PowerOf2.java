package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		int number, result, powerOfNumber;
		System.out.println("Enter Number For Finding Table of Power of Two: ");
		number = scanner.nextInt();
		powerOfNumber = utility.PowerOfTwo(2, number);// 5 ==32

		for (int i = 1; i <= powerOfNumber; i++) {

			result = utility.PowerOfTwo(i, 2);
			System.out.println(i + " to Power of 2 is : " + result);

		}
		
	}

}
