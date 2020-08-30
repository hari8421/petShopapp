package com.petApp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petApp.domain.OrderHdrEntity;
import com.petApp.service.OrderService;

@RestController
@RequestMapping("/")
public class OrderController {

	private static final Logger logger=LoggerFactory.getLogger(OrderController.class);
	
	@Autowired OrderService orderService;
	
	@PostMapping("/insertOrder")
	public ResponseEntity<String>  insertOrder(@RequestBody OrderHdrEntity oRequest) {
		logger.info("Insert order started");
		String res=orderService.addOrder(oRequest);
		
		return new ResponseEntity<String>(res,HttpStatus.CREATED);
		
	}
	
	
	@GetMapping("/getAllOrder")
	public ResponseEntity<List<OrderHdrEntity>> getAllOrder(){
		
		logger.info("getAllOrder  started");
		List<OrderHdrEntity> oList=orderService.getAllOrder();
		return new ResponseEntity<List<OrderHdrEntity>>(oList,HttpStatus.OK);
		
	}
	
	@GetMapping("/getAllOrder/{oId}")
	public ResponseEntity<OrderHdrEntity> getOrderById(@PathVariable("oId") String oId){
		
		logger.info("getOrderById  started");
		OrderHdrEntity oList=orderService.getOrderById(Long.parseLong(oId));
		return new ResponseEntity<OrderHdrEntity>(oList,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteOrder/{oId}")
	public ResponseEntity<String> deleteOrder(@PathVariable("oId") String oId){
		
		logger.info("deleteOrder started");
		orderService.deleteOrder(Long.parseLong(oId));
		return new ResponseEntity<String>("Deleted",HttpStatus.OK);
		
	}
}
