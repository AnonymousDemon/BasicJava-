package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class TemperatureConvertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility=new Utility();
		double temperatureInFerenheit,temperatureInCelcius;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Temperature in Ferenheit : ");
		temperatureInFerenheit=scanner.nextDouble();
		temperatureInCelcius=utility.FahrenheitToCelsius(temperatureInFerenheit);
		System.out.println("Fahrenheit to Celcius of "+temperatureInFerenheit+" is "+temperatureInCelcius);
		
		System.out.println("Enter Temperature in Celsius : ");
		temperatureInCelcius=scanner.nextDouble();
		temperatureInFerenheit=utility.CelsiusToFahrenheit(temperatureInCelcius);
		System.out.println("Celcius to Fahrenheit of "+temperatureInCelcius+" is "+temperatureInFerenheit);
		
		scanner.close();	
	}

}
