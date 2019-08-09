package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		int number;
		System.out.println("Enter Number Uptil you want to Find Harmonic");
		number=scanner.nextInt();
		utility.PrintHarmonic(number);
	}

}
