package com.learn.app;

public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5;
		stairCase(size);
		//stairCaseOpp(size);
		
	}

	private static void stairCaseOpp(int n) {
		// TODO Auto-generated method stub
		for(int i =1;i<=n;i++) {
			
			for(int j=n-1;j>=i;j--)
				System.out.print(" ");
			for(int k=0;k<=1;k++)
				System.out.print("#");
			System.out.println();
			
		}
		
	}

	public static void stairCase(int n) {
		Integer num=0;
		for(int i=1;i<=n;i++) {
			//print spaces
			for(int j=1;j<=n-1;j++)
				System.out.print(" ");
			//print #
			for(int k=1;k<=i;k++)
				System.out.print("#");
			
			//print next line..
			System.out.println();
			
			
		}
	}
}
