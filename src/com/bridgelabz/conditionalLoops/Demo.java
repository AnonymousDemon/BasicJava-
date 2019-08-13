package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter n");
		int n=scanner.nextInt();
		int result=(((n & 0x0F)<<4 )| ((n & 0xF0)>>4 ));
		System.out.println(result);

	}

}
