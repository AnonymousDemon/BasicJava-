package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class GamblingSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int stake, goal, trials;

		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter stake");
		stake = scanner.nextInt();
		System.out.println("Enter goal");
		goal = scanner.nextInt();
		System.out.println("Enter trials");
		trials = scanner.nextInt();
		utility.Gambling(stake, goal, trials);

		scanner.close();
	}

}
