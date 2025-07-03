package com.learn.app.threads;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddCompl {
	
	public static Object object = new Object();
	public static IntPredicate even = a->a%2==0;
	public static IntPredicate odd = a->a%2!=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompletableFuture.runAsync(()->EvenOddCompl.printName(even));
		CompletableFuture.runAsync(()->EvenOddCompl.printName(odd));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void printName(IntPredicate pred) {
		IntStream.rangeClosed(1, 10).filter(pred).forEach(EvenOddCompl::execute);
		
	}

	public static void execute(int num) {
		synchronized(object) {
			
			try {
				System.out.println(Thread.currentThread().getName()+":"+num);
				object.notify();
				object.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
