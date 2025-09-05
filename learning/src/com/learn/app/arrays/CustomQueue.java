package com.learn.app.arrays;

import java.util.PriorityQueue;
import java.util.Queue;

public class CustomQueue {
	
	public static void main(String args[]) {
		Queue<String> priorityQueue = new PriorityQueue<>();
		
		// Adding elements
        priorityQueue.add("ABCD");
        priorityQueue.add("EFGC");
        priorityQueue.add("IJKLMN");

        // Displaying the queue
        //priorityQueue.poll();
        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("top element: " + priorityQueue.peek());
        System.out.println("top element: " + priorityQueue.poll());
        System.out.println("PriorityQueue: " + priorityQueue);
		
	}

}
