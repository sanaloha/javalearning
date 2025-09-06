package com.learn.app.design.behavioral.strategy;

import java.math.BigDecimal;

public interface Discounter {
	
	BigDecimal applyDiscount(BigDecimal amount);

}
