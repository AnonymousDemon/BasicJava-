package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class CarLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		int principalLoanAmount,year;
		double rOI,amountToPayForMonth;
		
		System.out.println("Enter Principal Loan Amount");
		principalLoanAmount=scanner.nextInt();
		System.out.println("Enter Year");
		year=scanner.nextInt();
		System.out.println("Enter Rate Of Interest");
		rOI=scanner.nextDouble();
		amountToPayForMonth=utility.LoanCalculator(principalLoanAmount,year,rOI);
		System.out.println("Amount to Pay :"+amountToPayForMonth+" For Year :"+year);
		scanner.close();
	}

}
