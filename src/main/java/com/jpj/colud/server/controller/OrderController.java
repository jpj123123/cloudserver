package com.jpj.colud.server.controller;

import com.jpj.colud.server.service.api.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
 
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value = "/order", method = RequestMethod.POST)
	public String order() {
		return orderService.returnOrder();
	}
	
}
