package com.learn.app.hackerrank;

import java.util.Scanner;

/**
 * 
 * write a java code to Read input from STDIN, Input Format
Every line of input will contain a String followed by an integer. Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .
Output Format
In each line of output there should be two columns: The first column contains the String and is left justified using exactly  characters. The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

 * 
 * 
 * 
 * *****/
public class HackerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("===============");
        
            String text = sc.next();
            int number = sc.nextInt();

            // Left-justify string in 15 characters, pad number to 3 digits
            System.out.printf("%-15s%03d%n", text, number);
        
        System.out.println("===============");

        sc.close();
    }


}
