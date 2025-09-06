package com.learn.app.design.behavioral.strategy;

import java.math.BigDecimal;

public class DiwaliDiscount implements Discounter{

	@Override
	public BigDecimal applyDiscount(BigDecimal amount) {
		// TODO Auto-generated method stub
		//return amount.multiply(BigDecimal.valueOf(0.5));
		return amount.multiply(BigDecimal.valueOf(5.5));
	}

}
