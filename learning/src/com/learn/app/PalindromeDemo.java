package com.learn.app;

public class PalindromeDemo {
	
	public static void main(String[] args) {
		palindrome();
		palindromeStr();
	}
	
	public static void palindrome() {
		int x = 7667;
		int reverse=0, temp=x, remainder;
		
		
		while(x>0) {
			remainder = x%10;
			reverse = reverse*10+remainder;
			x=x/10;			
			
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
