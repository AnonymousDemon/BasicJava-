package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int SIDES = 6;
		int n;
		int count6 = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;

		System.out.println("Enter how many times you wan to roll");
		n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			
			int roll = (int) (Math.random() * SIDES) + 1;
			// print result
			System.out.println(roll);
			switch (roll) {
			case 1:

				count1++;
				break;

			case 2:

				count2++;
				break;

			case 3:

				count3++;
				break;
			case 4:

				count4++;
				break;
			case 5:

				count5++;
				break;
			case 6:

				count6++;

				break;
			default:
				System.out.println("invalid");

			}

		}
		
		if(count1>=count2&&count1>=count3&&count1>=count4&&count1>=count5&&count1>=count6) 
			System.out.println("Dice 1 fall maximum times count is : "+count1);
		else if(count2>=count1&&count2>=count3&&count2>=count4&&count2>=count5&&count2>=count6) 
			System.out.println("Dice 2 fall maximum times count is : "+count2);
		else if(count3>=count1&&count3>=count2&&count3>=count4&&count3>=count5&&count3>=count6) 
			System.out.println("Dice 3 fall maximum times count is : "+count3);
		else if(count4>=count1&&count4>=count2&&count4>=count3&&count4>=count5&&count4>=count6) 
			System.out.println("Dice 4 fall maximum times count is : "+count4);
		else if(count5>=count1&&count5>=count2&&count5>=count3&&count5>=count4&&count5>=count6) 
			System.out.println("Dice 5 fall maximum times count is : "+count5);
		else 
			System.out.println("Dice 6 fall maximum times count is : "+count6);

	}

}
