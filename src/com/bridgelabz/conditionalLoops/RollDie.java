package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner scanner = new Scanner(System.in);
		int SIDES = 6;  
        int n,count=0;
      
        
        System.out.println("Enter how many times you wan to roll");
        n = scanner.nextInt();

        for(int i=0;i< n;i++)
        {
        	int roll = (int) (Math.random() * SIDES) + 1;
        	 // print result
            System.out.println(roll);
            
          
            

        }
        
       
		
	}

}
