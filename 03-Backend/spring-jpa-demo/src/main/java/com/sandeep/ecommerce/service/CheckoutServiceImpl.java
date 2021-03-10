package com.sandeep.ecommerce.service;

import java.util.Set;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.sandeep.ecommerce.dto.Purchase;
import com.sandeep.ecommerce.dto.PurchaseResponse;
import com.sandeep.ecommerce.entity.Address;
import com.sandeep.ecommerce.entity.Customer;
import com.sandeep.ecommerce.entity.Order;
import com.sandeep.ecommerce.entity.OrderItem;
import com.sandeep.ecommerce.repository.CustomerRepository;

@Service
public class CheckoutServiceImpl implements CheckoutService {
	
	private CustomerRepository customerRepository;
	
	public CheckoutServiceImpl(CustomerRepository theCustomRepository) {
		customerRepository = theCustomRepository;
	}

	@Override
	@Transactional
	public PurchaseResponse placeOrder(Purchase purchase) {
		
		Order order = purchase.getOrder();
		
		String orderTrackingNumber = generateOrderTrackingNumber();
		order.setOrderTrackingNumber(orderTrackingNumber);
		
		Set<OrderItem> items = purchase.getOrderItems();
		for(OrderItem temp : items) {
			order.add(temp);
		}
		
		Address shippingaddress= purchase.getShippingAddress();
		order.setShippingAddressId(shippingaddress);
		
		Address billingaddress= purchase.getBillingAddress();
		order.setBillingAddressId(billingaddress);
		
		Customer customer = purchase.getCustomer();
		customer.add(order);
		
		customerRepository.save(customer);
		
		
		return new PurchaseResponse(orderTrackingNumber);
	}

	private String generateOrderTrackingNumber() {

		
		return UUID.randomUUID().toString();
	}

}
