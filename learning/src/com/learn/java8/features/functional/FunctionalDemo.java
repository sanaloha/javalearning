package com.learn.java8.features.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalDemo implements Askable{

	public static void main(String[] args) {
		
		Function<Integer,Integer> sq = a->a*a;
		
		System.out.println("Square is" +sq.apply(7));
		
		Predicate<Integer> pred = i->i%2 ==0;
		
		System.out.println("Test Even"+pred.test(9));
		
		FunctionalDemo demo = new FunctionalDemo();
		
		demo.say("Hello how are you");
		
		Askable demo1 = (a)->System.out.println(a);
		
		Predicate<Askable> predicate = (d)->d!=null;
		System.out.println("is askable not null"+predicate.test(demo1));
		
		demo.say("Welcome to functional");
		
		Supplier<List> myList = ()->{
			
			List<String> nameL = new ArrayList<>();
			nameL.add("Market");
			nameL.add("TCS");
			nameL.add("ABC");
			
			return nameL;
			
		};
		Consumer<String> consume = (a)->System.out.println(a);
		consume.accept("Welcome to the consumer");
		
		
				
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
