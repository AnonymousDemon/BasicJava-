package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class Trigonometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		int degree;
		double radiun;
		//variable csc is cosec
		double sin,cos,tan,cot,sec,csc;
		
		System.out.println("Enter the degree: ");
		degree=scanner.nextInt();
		radiun=utility.findRadiun(degree);
		
		//for finding sin cos tan
		sin=utility.findSin(radiun);
		cos=utility.findCos(radiun);
		tan=utility.findTan(radiun);
		
		cot=utility.findCot(radiun);
		sec=utility.findSec(radiun);
		csc=utility.findCosec(radiun);
		
		System.out.println(" Sin("+degree+") :"+sin);
		System.out.println(" Cos("+degree+") :"+cos);
		System.out.println(" Tan("+degree+") :"+tan);
		System.out.println(" Cot("+degree+") :"+cot);
		System.out.println(" Sec("+degree+") :"+sec);
		System.out.println(" Cosec("+degree+") :"+csc);
		scanner.close();
	}

}
