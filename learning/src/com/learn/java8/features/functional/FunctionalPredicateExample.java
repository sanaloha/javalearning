package com.learn.java8.features.functional;

import java.util.function.Predicate;

public class FunctionalPredicateExample {
	
	
	public static void main(String[] args) {
		
		Predicate<Integer> pr = (a)->(a>18);
		System.out.println(pr.test(15));
		
		Predicate<Integer> pred = FunctionalPredicateExample::checkAge;
		//calling pred method
		boolean res = pred.test(20);
		System.out.println(res);
		
		Predicate<Integer> newPred = FunctionalPredicateExample::checkGreater;
		
		System.out.println("new pred"+newPred.test(5));
		
	}
	
	static Boolean checkAge(int age) {
		return age>17;
	}
	
	static Boolean checkGreater(int num) {
		
		return num>10;
		
	}

}
