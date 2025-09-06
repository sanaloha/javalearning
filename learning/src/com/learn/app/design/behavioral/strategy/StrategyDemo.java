package com.learn.app.design.behavioral.strategy;

import java.math.BigDecimal;

public class StrategyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Discounter diwaliDis = new DiwaliDiscount();
		ShoppingCart sh1 = new ShoppingCart(diwaliDis);
		BigDecimal discount = sh1.checkOut(BigDecimal.valueOf(100));
		System.out.println("Diwali Discount="+discount);
		
		Discounter  XmaDiscount = new ChrismasDiscount();
		ShoppingCart sh2 = new ShoppingCart(XmaDiscount);
		BigDecimal discountX = sh2.checkOut(BigDecimal.valueOf(100));
		System.out.println("discountX Discount="+discountX);
		
		/**
		 * 
		 * Discounter newYearDiscounter = amount -> amount.multiply(BigDecimal.valueOf(0.8));
		ShoppingCart cart = new ShoppingCart(newYearDiscounter);
		System.out.println("New Year Total: " + cart.checkout(BigDecimal.valueOf(100)));
		 * 
		 * 
		 * 
		 * 
		 */
		

	}

}
