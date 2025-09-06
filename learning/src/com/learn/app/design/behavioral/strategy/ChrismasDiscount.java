package com.learn.app.design.behavioral.strategy;

import java.math.BigDecimal;

public class ChrismasDiscount implements Discounter{

	@Override
	public BigDecimal applyDiscount(BigDecimal amount) {
		// TODO Auto-generated method stub
		return amount.multiply(BigDecimal.valueOf(0.9));
	}

}
