package com.example.BPS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public Order processOrder(Order order) {
		order.setStatus("PROCESSED");
		return orderRepository.save(order);
	}

	public Order getOrderById(Long id) {
		return orderRepository.findById(id).orElse(null);

	}

}

