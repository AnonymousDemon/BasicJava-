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
	
	public double FindDeltaSquarRoot(int a, int b, int c) {
		int delta = (b * b) - (4 * a * c);
		double sqrtDelta = Math.sqrt(delta);
		return sqrtDelta;
	}
	
	public double QuadraticEquation1(int a, int b, double sqrtDelta) {
		double equation1 = (-b + sqrtDelta) / (2 * a);
		return equation1;
	}
	
	public double QuadraticEquation2(int a, int b, double sqrtDelta) {
		double equation1 = (-b - sqrtDelta) / (2 * a);
		return equation1;
	}
}
