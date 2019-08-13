package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class Cos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		int x;
		double angleX;
		int noEvenSeries;
		
		System.out.println("Enter angle between 0 to 360");
		x=scanner.nextInt();
		System.out.println("Enter odd number for series");
		noEvenSeries=scanner.nextInt();
		if(noEvenSeries%2==0) {
			if(x>=0&&x<=360) {
				angleX=utility.CalculateAngleX(x);
				utility.PrintCosXSeries(angleX,noEvenSeries);
			}else
				System.out.println("Please enter valid angle");
			
		}else
			System.out.println("Please enter valid even no.");
		
		scanner.close();
	}

}
