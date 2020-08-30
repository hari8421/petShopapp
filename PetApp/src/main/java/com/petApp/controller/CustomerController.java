package com.petApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petApp.domain.CustomerDtl;
import com.petApp.repository.CustomerRepository;

@RestController
@RequestMapping("/")
public class CustomerController {
	
	@Autowired
	CustomerRepository cRepository;
	
	@PostMapping("/addCustomer")
	public String addCustomer(@RequestBody CustomerDtl cReqst) {
		
		return cRepository.save(cReqst).getcId()+"";
	}
	
	@GetMapping("/getAllCustomer")
	public List<CustomerDtl> getAllCustomer() {
		List<CustomerDtl> cList=cRepository.findAll();
		return cList;
	}
}