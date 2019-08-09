package com.bridgelabz.conditionalLoops;

//import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  flip;
		int count=0, count1 = 0;
		double percent,percent1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter how many times you want to flip coin");
		flip = scanner.nextInt();
		for (int i = 1; i <= flip; i++) 
		{
			if (Math.random() < 0.5) {
				System.out.println("0");
				count++;
			} else {
				System.out.println("1");
				count1++;
			}

		}
		System.out.println("h=" + count);
		System.out.println("t=" +count1);
		
		percent = count*100/flip;
		percent1 = count1*100/flip;
		System.out.println("Percent of head =" +percent);
		System.out.println("Percent of tail =" +percent1);

	}

}
