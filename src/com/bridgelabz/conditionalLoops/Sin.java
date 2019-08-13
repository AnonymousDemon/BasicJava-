package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class Sin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		int x;
		double angleX;
		int noOddSeries;
		
		System.out.println("Enter angle between 0 to 360");
		x=scanner.nextInt();
		System.out.println("Enter odd number for series");
		noOddSeries=scanner.nextInt();
		if(noOddSeries%2!=0) {
			if(x>=0&&x<=360) {
				angleX=utility.CalculateAngleX(x);
				utility.PrintSinXSeries(angleX,noOddSeries);
			}else
				System.out.println("Please enter valid angle");
			
		}else
			System.out.println("Please enter valid odd no.");
		
		scanner.close();
	}

}
