package com.learn.app.design.behavioral.strategy;

import java.math.BigDecimal;

public class ShoppingCart {
	private Discounter discounter;
	
	public ShoppingCart(Discounter discounter) {
		this.discounter = discounter;
		
	}
	
	public BigDecimal checkOut(BigDecimal total) {
		return this.discounter.applyDiscount(total);
	}

}
