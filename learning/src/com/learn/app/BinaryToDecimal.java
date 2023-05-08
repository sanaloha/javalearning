package com.learn.app;

import java.util.Scanner;

public class BinaryToDecimal {
	
	//take a number from the console or scanner
		//1. create scanner object and take the binary input.
		//read next line from scanner object
		//apply integer parse int
	//Convert to the Binary and display
	public static void main(String[] args) {
		useScanner();
		
	}
	public static void useScanner() {
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter the Binary number");
		String binaryNumber = scObj.nextLine();
		
		System.out.println("Decimal Number="+Integer.parseInt(binaryNumber,2));
		
	}

}

