package com.learn.app.arrays;

import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;

public class CustomStack<E> {
	
	private int capacity;
	private int top;
	private Object[] stack;
		
	public CustomStack(int capacity) {
		this.capacity=capacity;
		this.top=-1;
		this.stack = new Object[capacity];
	}
	
	public void push(Object element) throws CustomeStackOverflowException{
		
		if(top == capacity-1) {
			throw new CustomeStackOverflowException("Stack Overflow");
		
		}
			
		this.stack[++top] = element;
		
	}
	
	public Object peek() {
		if(top == -1) {
			System.out.println("Stack is empty");
			return -1;
		}
		
		return stack[top];
	}
	
	public Object pop() {
		
		Object obj =  peek();
		this.top--;
		return obj;
	}
}
	
class UseStack{
	
	public static void main(String[] args) {
		
		CustomStack stack = new CustomStack(4);
		try {
		stack.push(5);
		stack.push(7);
		stack.push(7);
		stack.push(7);
		stack.push(9);
		}
		catch(CustomeStackOverflowException e) {
			System.out.println(e.getMessage());
		}
		
		//System.out.println(stack.pop());
		//System.out.println(stack.pop());
		
		
	}
}