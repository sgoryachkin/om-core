package com.sego.om.core.dao;

import com.sego.om.core.model.ItemKey;
import com.sego.om.core.model.OrderItem;

public interface SalesOrderDao {
	
	ItemKey createOrderItem(Long salesOrderId);
	
	OrderItem getOrderItem(ItemKey key);
	
	void updateOrderItem(ItemKey key, String attrId, Object value);
	
}
