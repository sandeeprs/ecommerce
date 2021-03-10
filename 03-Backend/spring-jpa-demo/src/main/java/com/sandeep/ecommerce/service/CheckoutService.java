package com.sandeep.ecommerce.service;

import com.sandeep.ecommerce.dto.Purchase;
import com.sandeep.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
	
	public PurchaseResponse placeOrder(Purchase purchase);

}
