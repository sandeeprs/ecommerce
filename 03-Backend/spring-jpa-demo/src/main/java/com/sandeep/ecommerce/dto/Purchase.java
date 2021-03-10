package com.sandeep.ecommerce.dto;

import java.util.Set;

import com.sandeep.ecommerce.entity.Address;
import com.sandeep.ecommerce.entity.Customer;
import com.sandeep.ecommerce.entity.Order;
import com.sandeep.ecommerce.entity.OrderItem;

import lombok.Data;

@Data
public class Purchase {
	
	private Customer customer;
	
	private Address shippingAddress;
	
	private Address billingAddress;
	
	private Order order;
	
	private Set<OrderItem> orderItems;

}
