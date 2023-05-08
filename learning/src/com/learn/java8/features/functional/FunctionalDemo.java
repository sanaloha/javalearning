package com.learn.java8.features.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalDemo implements Askable{

	public static void main(String[] args) {
		FunctionalDemo demo = new FunctionalDemo();
		
		demo.say("Hello how are you");
		
		Askable demo1 = (a)->System.out.println(a);
		demo.say("Welcome to functional");
		
		Supplier<List> myList = ()->{
			
			List<String> nameL = new ArrayList<>();
			nameL.add("Market");
			nameL.add("TCS");
			nameL.add("ABC");
			
			return nameL;
			
		};
		
		System.out.println("Supplier List="+myList.get());
		
		Predicate<Integer> result = (a)->{
			
			int b= 10;
			 
			return a>b;
			
		};
		
		System.out.println("Is 20 greater than 10?"+result.test(20));
	}

	@Override
	public void say(String msg) {
		System.out.println("Message is "+msg);
		
	}

}

@FunctionalInterface
interface Askable{
	
	void say(String msg);
}
