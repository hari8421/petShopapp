package com.petApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petApp.domain.OrderDtlEntity;
import com.petApp.domain.OrderHdrEntity;
import com.petApp.repository.OrderDtlRepository;
import com.petApp.repository.OrderHdrRepository;

@Service
public class OrderService {
	
	@Autowired OrderHdrRepository ohRepository;
	@Autowired OrderDtlRepository odRepository;

	public String addOrder(OrderHdrEntity oRequest) {
		OrderHdrEntity oh=ohRepository.save(oRequest);
		List<OrderDtlEntity> oList=oRequest.getoDtlEntity();
		for(OrderDtlEntity o:oList) {
			o.setOhId(oh.getOhId());
			odRepository.save(o);
		}
		return oh.getOhId()+"";
	}

	public List<OrderHdrEntity> getAllOrder() {
		
		return ohRepository.findAll();
	}

	public OrderHdrEntity getOrderById(long parseLong) {
		
		return ohRepository.findById(parseLong).get();
	}

	public void deleteOrder(long parseLong) {
		OrderHdrEntity oList=  ohRepository.findById(parseLong).get();
		
		List<OrderDtlEntity> odList=oList.getoDtlEntity();
		for(OrderDtlEntity o:odList) {
			odRepository.deleteById(o.getOdId());
		}
		ohRepository.deleteById(parseLong);
	}

}
