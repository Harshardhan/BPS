package com.example.BPS;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

	private OrderService orderProcessingService;
	
	@PostMapping
	public ResponseEntity<Order> createOrder(@RequestBody Order order){
		Order processedOrder = orderProcessingService.processOrder(order);
		return  ResponseEntity.ok(processedOrder);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Order> getOrder(@PathVariable Order order, Long id){
		Order orders = orderProcessingService.getOrderById(id);
		if(orders !=null)
		{
			return ResponseEntity.ok(order);
		}
		else
		{
			return ResponseEntity.notFound().build();
		}
	}
}
