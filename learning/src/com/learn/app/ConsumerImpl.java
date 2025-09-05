package com.learn.app;

import java.util.function.Consumer;

public class ConsumerImpl {
	
	private String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> con = (a)->{
			System.out.println("inside consumer");
		};
		con.accept("valid");
		
		Consumer<String> cons = ConsumerImpl::printData;
		cons.accept("Santosh");
		
		//Consumer<String> cons2 = ConsumerImpl::printVal;
	}
	
	public static void printVal() {
		
		System.out.println("Inside printVal");
	}
	
	public static boolean isValid() {
		return false;
	}
	
	public static void printData(String data) {
		System.out.println("data=="+data);
	}


}
