package com.sego.om.core.model.value;

import java.math.BigDecimal;

final public class PriceValue {
	
	private Long priceSpecId;
	
	private BigDecimal value;

	public PriceValue(Long priceSpecId, BigDecimal value) {
		super();
		this.priceSpecId = priceSpecId;
		this.value = value;
	}

	public BigDecimal getValue() {
		return value;
	}

	public Long getPriceSpecId() {
		return priceSpecId;
	}
	
}
