package com.learn.app.threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<T> {
	
	private Queue<T> queue;
	private int max=16;
	private ReentrantLock lock = new ReentrantLock(true);
	private Condition notEmpty = lock.newCondition();
	private Condition notFull = lock.newCondition();
	
	public MyBlockingQueue(int size) {
		queue = new LinkedList<>();
		this.max = size;
	}
	public void put(T t) {
		lock.lock();
		try {
			if(queue.size() == max) {
				try {
					notFull.await();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			queue.add(t);
			notEmpty.signalAll();
		
		}finally {
			lock.unlock();
		}
		
	}
	
	public T take() {
		lock.lock();
		
		try {
			if(queue.size()==0) {
				try {
					notEmpty.await();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		T item = queue.remove();
		notFull.signalAll();
		return item;
			
		}finally {
			lock.unlock();
		}
	}
	
}
