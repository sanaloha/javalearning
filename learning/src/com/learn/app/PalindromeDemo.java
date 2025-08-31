package com.learn.app;

public class PalindromeDemo {
	
	public static void main(String[] args) {
		int x =7667;
		palindrome(x);
		palindromeStr();
	}
	
	public static void palindrome(int input) {
		
		if(input ==0)
			return;
		
		int reverse=0, temp=input, remainder;
		
		
		while(input>0) {
			remainder = input%10;
			reverse = reverse*10+remainder;
			input=input/10;			
			
		}
		
		if(temp==reverse) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	
	}
	
	public static void palindromeStr() {
		String name = "ROOR", rev="";
		
		for(int i = name.length()-1;i>=0;i--) {
			rev = rev + name.charAt(i);
		}
		if(rev.toLowerCase().equals(name.toLowerCase()))
			System.out.println("Palindrome");
	}

}
