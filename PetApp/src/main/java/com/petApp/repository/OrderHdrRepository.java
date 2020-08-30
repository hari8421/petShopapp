package com.petApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petApp.domain.OrderHdrEntity;

public interface OrderHdrRepository extends JpaRepository<OrderHdrEntity, Long>{

}
