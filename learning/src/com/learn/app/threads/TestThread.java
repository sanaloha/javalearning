package com.learn.app.threads;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside Thread");
			}
		}).start();;
		
		new Thread(()->System.out.println("Inside Thread")).start();
		
		//consumer accept, predicate - test, supplier get, Function apply
		Predicate<Integer> pred = (a)-> a!=null;
		 Integer numb=null;
		 System.out.println("Given Number is Not NULL "+pred.test(numb));
		 
		 Predicate<String> predStr = (b)->b.startsWith("S");
		 
		 List<String> names = Arrays.asList("Amit","Sumit","Santosh","Mahendar");
		 
		 names.forEach((a)->System.out.println("name element"+a));
		 names.forEach((a)->{
			if(predStr.test(a))
			 System.out.println("Names Start with S "+a);
		 });
		 

	}

}
