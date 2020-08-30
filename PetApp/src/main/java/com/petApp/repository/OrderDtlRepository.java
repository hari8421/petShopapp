package com.petApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petApp.domain.OrderDtlEntity;

public interface OrderDtlRepository extends JpaRepository<OrderDtlEntity, Long>{

}
