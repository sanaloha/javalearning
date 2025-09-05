package com.learn.java8.features.functional;

import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

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
		
		Runnable runObj = FunctionalPredicateExample::runMethod;
		Thread th = new Thread(runObj);
		th.start();
		
		//Bicounsumer
		BiConsumer<String, String> nameConcat =  FunctionalPredicateExample::concatName;
		nameConcat.accept("Santosh", "Singh");
	
		
	}
	
	public static void concatName(String s1, String s2) {
		
	System.out.println("String concat Hello="+s1+" "+s2);
		
	}
	
	static void runMethod() {
		System.out.println("welcome to the functional run method");
	}
	
	static Boolean checkAge(int age) {
		return age>17;
	}
	
	static Boolean checkGreater(int num) {
		
		return num>10;
		
	}

}
