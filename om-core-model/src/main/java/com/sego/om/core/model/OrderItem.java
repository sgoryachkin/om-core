package com.sego.om.core.model;

import java.util.Collection;

import com.sego.om.core.model.value.PriceValue;

public interface OrderItem {
	
	Long getId();
	
	Long getOfferId();
	
	Collection<PriceValue> getPrices();
	
	Object getParam(String key);
	
}
