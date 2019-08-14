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
	 * @param firstNumber  inputs first number
	 * @param secondNumber input second number
	 * @return result returns addition of numbers
	 */
	public int SumofInteger(int firstNumber, int secondNumber) {
		int result = firstNumber + secondNumber;
		return result;
	}

	/**
	 * @param a inputs first number
	 * @param b inputs second number
	 * @param c inputs third number
	 * @return result returns different result based on conditions
	 */
	public int Intop(int a, int b, int c) {
		int result;
		result = a + b * c;
		System.out.println("a+b*c = " + result);
		result = a * b + c;
		System.out.println("a*b+c = " + result);
		result = c + a / b;
		System.out.println("c+a/b = " + result);
		result = a % b + c;
		System.out.println("a%b+c = " + result);
		return result;
	}

	/**
	 * @param a inputs first double integer
	 * @param b inputs second double integer
	 * @param c inputs third double integer
	 * @return result based on conditions returns result
	 */
	public double DoubleOp(double a, double b, double c) {
		double result;
		result = a + b * c;
		System.out.println("a+b*c = " + result);
		result = a * b + c;
		System.out.println("a*b+c = " + result);
		result = c + a / b;
		System.out.println("c+a/b = " + result);
		result = a % b + c;
		System.out.println("a%b+c = " + result);
		return result;
	}

	/**
	 * @param year takes input year
	 * @return year check leap year or not
	 */
	public int Leapyea(int year) {

		if (year >= 1582) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("It is leap year");
			} else {
				System.out.println("It is not leap year");
			}
		} else {
			System.out.println("We cant determine");
		}
		return year;
	}

	/**
	 * @param m inputs month
	 * @param d inputs day
	 * @return true if condition satisfies else false
	 */
	public boolean SpringSeason(int m, int d) {

		if (m >= 3 && m <= 6) {
			if (m == 3 && d <= 20) {
				return false;
			} else if (m == 6 && d >= 20) {
				return false;
			} else {
				return true;
			}

		} else {
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
	 * @param a     inputs first number
	 * @param b     inputs second number
	 * @param delta calculates delta
	 * @return root1 of the equation
	 */
	public double QuadraticEquation1(int a, int b, double delta) {

		double root1, d;
		d = Math.sqrt(delta);
		root1 = (-b + d) / (2 * a);
		return root1;
	}

	/**
	 * @param a     inputs first number
	 * @param b     inputs second number
	 * @param delta calculates delta
	 * @return root2 of the equation
	 */
	public double QuadraticEquation2(int a, int b, double delta) {
		double root2, d;
		d = Math.sqrt(delta);
		root2 = (-b - d) / (2 * a);
		return root2;
	}

	/**
	 * @param x inputs first value
	 * @param y inputs second value
	 * @return distance calculate distance from (x,y) to (0,0).
	 */
	public double Distance(int x, int y) {
		int d = (x * x + y * y);
		double distance = Math.sqrt(d);
		return distance;

	}

	/**
	 * @param day
	 * @param month
	 * @param year
	 * @return
	 */
	public int DayOfWeek(int day, int month, int year) {
		int y1, x, m, d1;
		y1 = year - (14 - month) / 12;
		x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
		m = month + 12 * ((14 - month) / 12) - 2;
		d1 = (day + x + 31 * m / 12) % 7;
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
	 * @param temperatureInFerenheit
	 * @return
	 */
	public double FahrenheitToCelsius(double temperatureInFerenheit) {
		double temperatureInCelcius;
		temperatureInCelcius = ((temperatureInFerenheit - 32) * 5) / 9;
		return temperatureInCelcius;
	}

	/**
	 * @param temperatureInCelsius
	 * @return
	 */
	public double CelsiusToFahrenheit(double temperatureInCelsius) {
		double temperatureInFahrenheit;
		temperatureInFahrenheit = ((temperatureInCelsius * 9) / 5) + 32;
		return temperatureInFahrenheit;
	}

	/**
	 * @param number
	 * @return
	 */
	public int PowerOfTwo(int number, int power) {
		int result;
		result = (int) Math.pow(number, power);
		return result;
	}

	/**
	 * @param number prints nth harmonic number
	 */
	public void PrintHarmonic(int number) {
		System.out.print("H=");
		for (int i = 1; i <= number; i++) {
			if (i != number) {
				System.out.print("");
			} else {
				System.out.print("1/" + i);
			}

		}

	}

	/**
	 * @param stake
	 * @param goal
	 * @param trials
	 */
	public void Gambling(int stake, int goal, int trials) {
		int bets = 0;
		int wins = 0;
		for (int t = 0; t < trials; t++) {

			int cash = stake;
			while (cash > 0 && cash < goal) 
			{
				bets++;
				if (Math.random() < 0.5) 
				{
					cash++;//win
				} 
				else 
				{
					cash--;//lose
				}
			}
			if (cash == goal) 
			{
				wins++;
			}
		}

		System.out.println(wins + " wins of " + trials);
		System.out.println("Percent of games won = " + 100.0 * wins / trials);
		System.out.println("Avg # bets           = " + 1.0 * bets / trials);

	}

	/**
	 * @param number
	 */
	public void Prime(int n) 
	{

		int num;
		String primeNumbers="";
	       for (int i = 1; i <= n; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to "+n+" are :");
	       System.out.println(primeNumbers);
	
	}

	/**
	 * @param arr
	 * @param n
	 */
	public void Repeated(int[] arr, int n)
	{

		for(int i=0;i< arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
				System.out.println("Repeated = "+arr[j]);		
			    }
				
			}
		}		
		
	
	}
	


	/**
	 * @param y
	 * @return
	 */
	public int SwapNibbles(int y)
	{
		 
		
		int  x = (((y & 0x0F) << 4) |((y & 0xF0) >> 4));
		System.out.println(x);	
		return  x; 
		 
	}
	
	

	


	public double CalculateAngleX(int x) {
		
		return x%(2*180);
	}

	/**
	 * @param angleX
	 * @param noOddSeries
	 */
	public void PrintSinXSeries(double angleX, int noOddSeries) {
		
		int count=1;

		System.out.print("Sin("+angleX+") = ");
		System.out.print(angleX +" - ");
		for(int i=3;i<=noOddSeries;) {
			if(count%2!=0) {
				System.out.print(Math.pow(angleX, i)+" / "+CalculateFactorial(i));
				if(i!=noOddSeries) {
					System.out.print(" + ");
				}
				
				count++;
				
			}else {
				System.out.print(Math.pow(angleX, i)+" / "+CalculateFactorial(i));
				if(i!=noOddSeries) {
					System.out.print(" - ");	
				}
				count++;
			}
			i=i+2;
			
		}
		
	}
	/**
	 * @param number
	 * @return
	 */
	public int CalculateFactorial(int number) {
		int fact=1;
		for (int i=1;i<=number;i++) {
			fact*=i;
		}
		return fact;
	}

	/**
	 * @param angleX
	 * @param noEvenSeries
	 */
	public void PrintCosXSeries(double angleX, int noEvenSeries) {
		int count=1;
		
		System.out.print("Sin("+angleX+") = ");
		System.out.print( "1 - ");
		for(int i=2;i<=noEvenSeries;) {
			if(count%2==0) {
				System.out.print(Math.pow(angleX, i)+" / "+CalculateFactorial(i));
				if(i!=noEvenSeries) {
					System.out.print(" + ");
				}
				
				count++;
				
			}else {
				System.out.print(Math.pow(angleX, i)+" / "+CalculateFactorial(i));
				if(i!=noEvenSeries) {
					System.out.print(" - ");	
				}
				count++;
			}
			i=i+2;
			
		}
		
	}
	
	
	/**
	 * @param c
	 * @return
	 */
	public double findSquareRootUsingNewtonsMethod(int c)
	{
		double t, epsilon;
		t = c;
		epsilon=1*(Math.pow(10, -15));
		epsilon = 1e-15;

		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}
		return t;
	}
	
	/**
	 * @return
	 */
	public double mathRandomNumber() {

		return Math.random();
	}
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public double mathMinNumber(double a, double b) {
		return Math.min(a, b);
	}
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public double mathMaxNumber(double a, double b) {
		return Math.max(a, b);
	}
	
	
	/**
	 * @param velocity
	 * @return
	 */
	public double velocityIntoSpeed(int velocity) {
		double speed;
		speed = velocity * 0.609;
		return speed;
	}
	
	/**
	 * @param temperatureInFahrenheit
	 * @param speed
	 * @return
	 */
	public double CalculateWindChill(double temperatureInFahrenheit, double speed) {
		double a, windChill, b, c;
		a = 0.615 * temperatureInFahrenheit;
		b = 0.4275 * temperatureInFahrenheit;
		c = b - 35.75;
		windChill = 35.74 + a + c * speed;
		// windchill cannot be negative
		windChill = Math.abs(windChill);
		return windChill;
	}
	
	public String[] ReverseStringArray(String[] namesArray, int start, int lengthOfArray) {

		// for reversing the nameArray

		String temp;
		while (start < lengthOfArray) {
			temp = namesArray[start];
			namesArray[start] = namesArray[lengthOfArray];
			namesArray[lengthOfArray] = temp;
			start++;
			lengthOfArray--;
		}
		return namesArray;
	}
	

	

}
