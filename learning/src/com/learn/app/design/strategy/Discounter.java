package com.learn.app.design.strategy;

import java.math.BigDecimal;

public interface Discounter {
	
	BigDecimal applyDiscount(BigDecimal amount);

}
