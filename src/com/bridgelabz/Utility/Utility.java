/******************************************************************************

 *  Purpose: This file contains logic for all programs.
 *
 *  @author  Vicky
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.Utility;

public class Utility {
	/**
	 * @param firstNumber inputs first number
	 * @param secondNumber input second number
	 * @return result returns addition of numbers
	 */
	public int SumofInteger(int firstNumber, int secondNumber)
	{
		int result = firstNumber + secondNumber;
		return result;
	}
	
	/**
	 * @param a inputs first number
	 * @param b inputs second number
	 * @param c inputs third number
	 * @return result returns different result based on conditions
	 */
	public int Intop(int a, int b, int c)
	{
		int result;
		result = a+b*c;
		System.out.println("a+b*c = "+result);
		result = a*b+c;
		System.out.println("a*b+c = " +result);
		result = c+a/b;
		System.out.println("c+a/b = " +result);
		result = a%b+c;
		System.out.println("a%b+c = " +result);
		return result;
	}
	
	/**
	 * @param a inputs first double integer
	 * @param b inputs second double integer
	 * @param c inputs third double integer
	 * @return result based on conditions returns result
	 */
	public double DoubleOp(double a, double b, double c)
	{
		double result;
		result = a+b*c;
		System.out.println("a+b*c = "+result);
		result = a*b+c;
		System.out.println("a*b+c = " +result);
		result = c+a/b;
		System.out.println("c+a/b = " +result);
		result = a%b+c;
		System.out.println("a%b+c = " +result);
		return result;
	}
	
	/**
	 * @param year takes input year
	 * @return year check leap year or not
	 */
	public int Leapyea(int year)
	{

		if(year>=1582) {
			if((year%4 == 0 && year%100!=0 ) ||  (year%400==0)) 
			{
				System.out.println("It is leap year");
			}
			else
			{
				System.out.println("It is not leap year");
			}
		}
		else
		{
			System.out.println("We cant determine");
		}
		return year;
	}
	/**
	 * @param m inputs month
	 * @param d inputs day
	 * @return true if condition satisfies else false
	 */
	public boolean SpringSeason(int m , int d)
	{
		
		if(m>=3&&m<=6)
		{
			if(m==3&&d<=20)
			{
				return false;
			}
			else if(m==6 && d>=20)
			{
				return false;		
			}
			else
			{
				return true;
			}
			
		}
		else
		{
			return false;
		}
		
	}
	
	/**
	 * @param a inputs first number
	 * @param b inputs second number
	 * @param c inputs third number
	 * @return delta square root of the equation
	 */
	public double FindDeltaSquarRoot(int a, int b, int c) {
		double delt = ((b * b) - (4 * a * c));
		double delta = Math.abs(delt);
		return delta;
	}
	
	/**
	 * @param a inputs first number
	 * @param b inputs second number
	 * @param delta calculates delta
	 * @return root1 of the equation
	 */
	public double QuadraticEquation1(int a, int b, double delta) {
		
		double root1 ,d;
		d=Math.sqrt(delta);
	    root1 =(-b + d) / (2 * a);
	    return root1;
	}
	

	/**
	 * @param a inputs first number
	 * @param b inputs second number
	 * @param delta calculates delta
	 * @return root2 of the equation
	 */
	public double QuadraticEquation2(int a, int b, double delta) {
		double root2 ,d;
		d=Math.sqrt(delta);
	    root2 =(-b - d) / (2 * a);
	    return root2;
	}
	
	/**
	 * @param x inputs first value
	 * @param y inputs second value
	 * @return distance calculate distance from (x,y) to (0,0).
	 */
	public double Distance(int x, int y) {
		int d = (x*x+y*y);
		double distance = Math.sqrt(d);
		return distance;
		
	}
	
	/**
	 * @param day
	 * @param month
	 * @param year
	 * @return
	 */
	public int DayOfWeek(int day,int month, int year) {
		int y1,x,m,d1;
		y1 = year-(14-month)/12;
		x=y1 + (y1/4) - (y1/100) + (y1/400);
		m = month + 12*((14-month)/12)-2;
		d1 = (day+x+31*m/12)%7;
		return d1;
		
	}
	
	/**
	 * @param degree
	 * @return
	 */
	public double findRadiun(int degree) {
		return Math.toRadians(degree);
	}
	
	public double findSin(double radiun) {
		return Math.sin(radiun);
	}
	
	public double findCos(double radiun) {
		return Math.cos(radiun);
	}
	
	public double findTan(double radiun) {
		return Math.tan(radiun);
	}
	public double findCot(double radiun) {
		double cot;
		cot = 1 / Math.tan(radiun);
		return cot;
	}
	
	public double findSec(double radiun) {
		double sec;
		sec = 1 / Math.cos(radiun);
		return sec;
	}
	
	public double findCosec(double radiun) {
		double csc;
		csc = 1 / Math.sin(radiun);
		return csc;
	}
	
	
	
	/**
	 * @param principalLoanAmount
	 * @param year
	 * @param rOI
	 * @return
	 */
	public double LoanCalculator(int principalLoanAmount, int year, double rOI) {

		double payment, r;
		int n;
		n = 12 * year;
		r = (rOI / (12 * 100));

		payment = (principalLoanAmount * r) / (1 - Math.pow(1 + r, -n));
		return payment;
	}
	
	/**
	 * @param number
	 * @return
	 */
	public int PowerOfTwo(int number,int power) {
		int result;
		result=(int)Math.pow(number, power);
		return result;
	}

	
	
	/**
	 * @param number
	 */
	public void PrintHarmonic(int number)
	{
		System.out.print("H=");
		for(int i=1;i<=number;i++) 
		{
			if(i!=number)
			{
				System.out.print("");	
			}
			else 
			{
				System.out.print("1/"+i);
			}
			
		}
		
	}
}
