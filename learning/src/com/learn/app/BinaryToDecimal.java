package com.learn.app;

import java.util.Scanner;

public class BinaryToDecimal {
	
	//take a number from the console or scanner
		//1. create scanner object and take the binary input.
		//read next line from scanner object
		//apply integer parse int
	//Convert to the Binary and display
	/*
	 * public static void main(String[] args) { useScanner();
	 * 
	 * }
	 */
	public static void main(String[] args) {
		//useScanner();
		covertDecimalToBinary();
		
	}
	public static void useScanner() {
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the binary no u want to convert");
		String binaryIn = scan.nextLine();
		int decimal = Integer.parseInt(binaryIn,2);
		
		System.out.println("Decimal=="+decimal);
		String binaryNumber = "10011";
		
		System.out.println("Decimal Number="+Integer.parseInt(binaryNumber,2));
		
	}

	//WAP to convert Decimal to Binary
	public static void covertDecimalToBinary() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal no");
		Integer decimalNum= Integer.parseInt(sc.nextLine());
		String binaryNum = Integer.toBinaryString(decimalNum);
		System.out.println("Binary num="+binaryNum);
	
			
	}
	
	/**
	 * Initialization:
		A StringBuilder is used to efficiently build the binary string. quotient is initialized with the decimal number.
	Looping:
		The while loop continues as long as quotient is greater than 0.
	Remainder and Division:
		remainder = quotient % 2; calculates the remainder when quotient is divided by 2 
		(this will be either 0 or 1).
		binaryBuilder.append(remainder); appends this remainder to the StringBuilder.
		quotient /= 2; updates the quotient for the next iteration.
	Reversal:
		After the loop, binaryBuilder.reverse().toString(); reverses the collected remainders and
	 	converts the StringBuilder to a String. This reversal is necessary because the remainders 
	 	are collected in reverse order of their significance in the binary representation.
	 * 
	 * @param n
	 * @return
	 */
	public static String convertDecimalToBinary(int n) {
        if (n == 0) {
            return "0"; // Special case for 0
        }

        StringBuilder binaryBuilder = new StringBuilder();
        int quotient = n;

        while (quotient > 0) {
            int remainder = quotient % 2; // Get the remainder when divided by 2
            binaryBuilder.append(remainder); // Append the remainder
            quotient /= 2; // Divide the quotient by 2
        }

        return binaryBuilder.reverse().toString(); // Reverse the string and return
    }
	
}

