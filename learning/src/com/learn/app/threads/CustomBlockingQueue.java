package com.learn.app.threads;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 1. Create a Queue
 * 2. Write method to add remove
 * 3. Implement lock
 * 4. Implement Condition
 * 
 * 
 * **/

public class CustomBlockingQueue<E>{
	
	private Queue<E> customQueue = null;	
	private Integer max = 10;
	
	private ReentrantLock lock = new ReentrantLock();
	private Condition notEmpty = lock.newCondition();
	private Condition notFull = lock.newCondition();
	
	public CustomBlockingQueue(Integer size) {
		this.customQueue = new LinkedList();
		//We can also use Array, but we need to track head and tail of the array.
		this.max =  size;		
	
	}
		
	public void put(E element) throws InterruptedException {
		lock.lock();
		try {
			if(customQueue.size() == max)
				notEmpty.await();
			this.customQueue.add(element);
				notFull.signalAll();
			
		} finally {
			lock.unlock();
		}
	}
	
	public void take() throws InterruptedException {
		lock.lock();
		try {
			if(customQueue.size() <=0)
				notFull.await();
			this.customQueue.remove();
			notEmpty.signalAll();
			
		} finally {
			lock.unlock();
		}
		
	}
	
	
	
}
