package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr how many numbers you wan to print");
		number = scanner.nextInt();
		
		int count = 0;
		 
        System.out.println("A List of the first " + number + " prime numbers");
 
        for (int num = 2; count < number; num++)
        {
 
            boolean isPrime = true;
            for (int i=2; i <= num/2; i++)
            {
                if ( num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
 
            if ( isPrime == true )
            {
                System.out.println(num);
                count++;
            }
	}
		
		
	}

}
