package com.learn.app.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConsumerProducer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<Item> bq = new ArrayBlockingQueue<>(10); //handles concurrent thread access
		
		final Runnable producer = ()->{
			while(true) {
				try {
					bq.put(new Item());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		new Thread(producer).start();
		new Thread(producer).start();
		
		final Runnable consumer = ()->{
			while(true) {
				bq.remove();
			}
		};
		
		new Thread(consumer).start();
		new Thread(consumer).start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

class Item{
	private String name;
}
