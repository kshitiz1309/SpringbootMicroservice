package com.dailycodebuffer.OrderService.service;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.OrderService.entity.Order;
import com.dailycodebuffer.OrderService.external.client.ProductService;
import com.dailycodebuffer.OrderService.model.OrderRequest;
import com.dailycodebuffer.OrderService.repository.OrderRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2	
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ProductService productService;

	@Override
	public long placeOrder(OrderRequest orderRequest) {
		log.info("Placing Order Request : {}",orderRequest);
		
		productService.reduceQuantity(orderRequest.getPrductId(), orderRequest.getQuantity());
		
		log.info("Creating Order with Status Created");
		
		
		Order order = Order.builder()
						.amount(orderRequest.getTotalAmount())
						.orderStatus("CREATED").productId(orderRequest.getPrductId())
						.orderDate(Instant.now()).quantity(orderRequest.getQuantity())
						.build();
		order = orderRepository.save(order);
		
		log.info("Order Places Successfully with Order Id : {}",order.getId());
		return order.getId();
	}
	


}
